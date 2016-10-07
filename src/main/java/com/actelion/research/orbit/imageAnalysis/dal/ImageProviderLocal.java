/*
 *     Orbit, a versatile image analysis software for biological image-based quantification.
 *     Copyright (C) 2009 - 2016 Actelion Pharmaceuticals Ltd., Gewerbestrasse 16, CH-4123 Allschwil, Switzerland.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.actelion.research.orbit.imageAnalysis.dal;

import com.actelion.research.orbit.beans.RawDataFile;
import com.actelion.research.orbit.dal.IOrbitImage;
import com.actelion.research.orbit.imageAnalysis.utils.OrbitImagePlanar;
import com.actelion.research.orbit.imageAnalysis.utils.OrbitUtils;
import com.actelion.research.orbit.imageAnalysis.utils.TiffConverter;
import com.actelion.research.orbit.utils.Logger;
import com.actelion.research.orbit.utils.RawUtilsCommon;
import io.scif.SCIFIO;
import org.scijava.Context;

import javax.media.jai.PlanarImage;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;

public class ImageProviderLocal extends ImageProviderNoop {

    private static final Logger logger = Logger.getLogger(ImageProviderLocal.class);
    private final Map<Integer, String> int2file = new ConcurrentHashMap<>();
    private final Map<String, Integer> file2int = new ConcurrentHashMap<>();
    private final AtomicInteger index = new AtomicInteger(0);
    private Context context;

    @Override
    public List<RawDataFile> browseImages(Object parentObj) throws Exception {
        List<RawDataFile> rdfList = new ArrayList<>();
        JFileChooser fileChooser = OrbitUtils.buildOpenFileFileChooser();
        SCIFIO scifio = new SCIFIO();
        context = scifio.getContext();
//        Format[] formats = new Format[]{new TIFFFormat() {
//            @Override
//            public String getFormatName() {
//                return "TIFF";
//            }
//        }};
//        JFileChooser fileChooser = scifio.gui().buildFileChooser(scifio.gui().buildFileFilters(Arrays.asList(formats)));

        Preferences prefs = Preferences.userNodeForPackage(this.getClass());
        String dir = prefs.get("ImageProviderLocal.OpenFileCurrentDir", null);
        if (dir != null) {
            File cd = new File(dir);
            fileChooser.setCurrentDirectory(cd);
        }
        Component parent = null;
        if (parentObj != null && parentObj instanceof Component) {
            parent = (Component) parentObj;
        }
        int returnVal = fileChooser.showOpenDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            prefs.put("ImageProviderLocal.OpenFileCurrentDir", fileChooser.getCurrentDirectory().getAbsolutePath());
            File[] files = fileChooser.getSelectedFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    String fn = file.getAbsolutePath();
                    int fileId;
                    if (file2int.containsKey(fn)) {
                        fileId = file2int.get(fn);
                    } else {
                        fileId = index.incrementAndGet();
                        int2file.put(fileId, fn);
                        file2int.put(fn, fileId);
                    }

                    RawDataFile rdf = createRDF(file.getAbsolutePath(), fileId);
                    rdfList.add(rdf);
                }
            }
        } else {
            logger.trace("browse images canceled.");
        }
        return rdfList;
    }

    @Override
    public boolean useCustomBrowseImagesDialog() {
        return true;
    }

    private RawDataFile createRDF(String fn, int rdfId) {
        File file = new File(fn);
        RawDataFile rdf = new RawDataFile();
        rdf.setDataPath(file.getParentFile().getAbsolutePath());
        rdf.setFileName(file.getName());
        rdf.setFileSize(file.length());
        rdf.setModifyDate(new Date(file.lastModified()));
        rdf.setReferenceDate(new Date(file.lastModified()));
        rdf.setRawDataFileId(rdfId);
        return rdf;
    }

    @Override
    public RawDataFile LoadRawDataFile(int rdfId) throws Exception {
        if (!int2file.containsKey(rdfId))
            throw new IllegalArgumentException("rdf with id " + rdfId + " does not exist");
        return createRDF(int2file.get(rdfId), rdfId);
    }

    @Override
    public IOrbitImage createOrbitImage(RawDataFile rdf, int level) throws Exception {
        String ending = RawUtilsCommon.getExtension(rdf.getFileName());
        if (ending.equals("bmp")||ending.equals("png")||ending.equals("dcm")||ending.equals("lif")||ending.equals("ziv")) {
            PlanarImage pi = TiffConverter.loadFromFile(rdf.getDataPath() + File.separator + rdf.getFileName());
            return new OrbitImagePlanar(pi, rdf.getFileName());
        } else if (ending.equals("tif")||ending.equals("tiff"))  {
            return new OrbitImageTiff(rdf.getDataPath() + File.separator + rdf.getFileName(), level);
        }
        else {
            return new OrbitImageScifio(rdf.getDataPath() + File.separator + rdf.getFileName(), level);
        }
    }

    public BufferedImage getThumbnail(String filename) throws Exception {
        File file = new File(filename);
        String ending = RawUtilsCommon.getExtension(file.getName()) ;
        BufferedImage bi = null;
        if (ending.equals("bmp")||ending.equals("png")||ending.equals("dcm")||ending.equals("lif")||ending.equals("ziv")) {
            bi = TiffConverter.getDownsampledImage(file.getPath(), 300, -1, 1, false);
        } else {
            try {
                if (ending.equals("tif") || ending.equals(".tiff")) {
                    OrbitImageTiff oi = new OrbitImageTiff(file.getAbsolutePath(), 0);
                    bi = oi.getThumbnail();
                    oi.close();
                }  else {
                    OrbitImageScifio oi = new OrbitImageScifio(file.getAbsolutePath(), 0);
                    bi = oi.getThumbnail();
                    oi.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bi;
    }

    @Override
    public BufferedImage getThumbnail(RawDataFile rdf) throws Exception {
        return getThumbnail(rdf.getDataPath() + File.separator + rdf.getFileName());
    }

    @Override
    public void close() throws IOException {
        context.dispose();
    }

    public static void main(String[] args) throws Exception {
        ImageProviderLocal ipl = new ImageProviderLocal();
        ipl.browseImages(null);
    }
}
