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

package com.actelion.research.orbit.imageAnalysis.utils;

import com.actelion.research.orbit.exceptions.OrbitImageServletException;
import com.actelion.research.orbit.imageAnalysis.dal.DALConfig;
import com.actelion.research.orbit.imageAnalysis.imaging.GBlur;
import com.actelion.research.orbit.imageAnalysis.imaging.ManipulationUtils;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import imageJ.Colour_Deconvolution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.media.jai.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.*;
import java.awt.image.renderable.ParameterBlock;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;


@SuppressWarnings("unchecked")
public abstract class OrbitTiledImage2 extends PlanarImage implements RenderedImage, Closeable {
    public final static int PHOTOMETRIC_YCbCr = 6;
    public final static int PHOTOMETRIC_RGB = 2;
    protected final static Logger logger = LoggerFactory.getLogger(OrbitTiledImage2.class);
    protected int numBands = 0;
    protected String filename = "";
    public static Cache<PointAndName, Raster> tileCache = null;
    public static AtomicInteger cacheTileWidth = new AtomicInteger(OrbitUtils.TILE_SIZE);
    public static AtomicInteger cacheTileHeight = new AtomicInteger(OrbitUtils.TILE_SIZE);
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final boolean doCacheLock = false;
    private boolean useCache = !ScaleoutMode.SCALEOUTMODE.get();
    protected int photometric = PHOTOMETRIC_YCbCr;
    //protected static final ColorModel rgbColorModel = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.TYPE_YCbCr), new int[]{8,8,8}, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
    protected static final ColorModel rgbColorModel = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[]{8, 8, 8}, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
    protected static final ColorModel grayColorModel = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY), new int[]{8}, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
    protected boolean initialized = false; // sampleModel and colorModel initialized (don't use cache the first time, even if the image has been loaded before!)
    private OrbitUtils.ImageAdjustCachedParams cachedParams = new OrbitUtils.ImageAdjustCachedParams();
    private PlanarImage nullImage = null;
    protected boolean originalWasGrayScale = false;
    protected int originalBitsPerSample = 8;
    protected int rawDataFileId = -1; // not known
    protected TiledImagePainter tiledImagePainter = null; // optional: can be set for computing extreme stats based on low res image
    private static LookupTableJAI defaultLookuptable = null;

    protected abstract String readInfoString(String filename) throws Exception;

    protected abstract Raster getTileData(int tileX, int tileY);


    private static void initCache(int tileWidth, int tileHeight) {
        logger.info("(re-)creating tile cache ["+tileWidth+"x"+tileHeight+"]");
        if (doCacheLock) OrbitTiledImage2.cacheLock.writeLock().lock();
        try {
            cacheTileWidth.set(tileWidth);
            cacheTileHeight.set(tileHeight);

            long mem = Runtime.getRuntime().maxMemory();
            int tileX = cacheTileWidth.get();
            int tileY = cacheTileHeight.get();
            int maxSize = (int) ((mem * 0.5d) / (tileX * tileY * 3L * 4L)); // 3 bands, each a 32bit int

            //System.out.println("OrbitTiledImage2.tileCache: maxObjects="+maxSize+"  freeMem: "+RawUtils.formatFileSize(memFree));
            tileCache = CacheBuilder.
                    newBuilder().
                    maximumSize(maxSize).
                    expireAfterWrite(5, TimeUnit.MINUTES).
                    build();

        } finally {
            if (doCacheLock) OrbitTiledImage2.cacheLock.writeLock().unlock();
        }
    }

    public OrbitTiledImage2() {

    }

    public OrbitTiledImage2(String filename) throws Exception {
        if (logger.isDebugEnabled()) {
            if (OrbitTiledImage2.tileCache != null)
                logger.trace("cachesize: " + OrbitTiledImage2.tileCache.size());
        }

        this.filename = filename.replaceAll("/data/orbit", "");

        // try to parse rdfId for special files which are names like /path/to/server/rdfId.tif
        try {
            int idx1 = this.filename.lastIndexOf("/") + 1;
            int idx2 = this.filename.indexOf(".");
            String rdfIdStr = this.filename.substring(idx1, idx2);
            rawDataFileId = Integer.parseInt(rdfIdStr);
        } catch (Exception e) {
            rawDataFileId = -1;
        }

        readInfo(this.filename);

        try { // must try-catch because this fails for TiledImageWriter
            getTile(0, 0); // the first getTile() call initializes the sampleModel (which is used in e.g. PlanarImage.getExtendedData() )
        } catch (Exception ex) {
            if (!(this instanceof OrbitTiledImagePlanarImage))
                throw new OrbitImageServletException("Error reading image tile data");
        }
    }

    @Override
    public Raster getTile(int tileX, int tileY) {
        return getTile(tileX, tileY, 100, 100, 0, 0, 0, 0, 0, null, null, null, null, true, true, true, 0, Colour_Deconvolution.DECONV_NONE);
    }

    public Raster getTile(int tileX, int tileY, double gamma, double contrast, double brightness, int blur, double redAdjust, double greenAdjust, double blueAdjust, OrbitTiledImage2 redChannel, OrbitTiledImage2 greenChannel, OrbitTiledImage2 blueChannel, OrbitTiledImage2 overlayChannel, boolean redActive, boolean greenActive, boolean blueActive, int deconvChannel, String deconvName) {
        PointAndName tileP = new PointAndName(tileX, tileY, filename, gamma, contrast, brightness, blur, redAdjust, greenAdjust, blueAdjust, redChannel, greenChannel, blueChannel, overlayChannel, redActive, greenActive, blueActive, deconvChannel, deconvName);
        if (doCacheLock) OrbitTiledImage2.cacheLock.readLock().lock();
        try {
            if (useCache && OrbitTiledImage2.tileCache != null) {
                Raster cachedRaster = OrbitTiledImage2.tileCache.getIfPresent(tileP);
                if (initialized && cachedRaster != null) return cachedRaster;
            }
        } finally {
            if (doCacheLock) OrbitTiledImage2.cacheLock.readLock().unlock();
        }

        // not in cache
        Raster tile = getTileData(tileX, tileY);

        if (tile.getNumBands() == 1) {
            BufferedImage bi = createImage(tile, null, grayColorModel.createCompatibleSampleModel(this.getWidth(), this.getHeight()), grayColorModel);
            PlanarImage pi = PlanarImage.wrapRenderedImage(bi);
            ParameterBlock pb = new ParameterBlock();
            pb.addSource(pi); // r
            pb.addSource(pi); // g
            pb.addSource(pi); // b
            pi = JAI.create("bandmerge", pb);
            tile = pi.getData();
        }

        BufferedImage bi = null;

        // color deconvolution
        if (deconvChannel > 0) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = Colour_Deconvolution.getProcessedImage(bi, deconvName, deconvChannel - 1, bi);
        }

        if (redChannel != null || greenChannel != null || blueChannel != null) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = mergeChannels(redChannel, greenChannel, blueChannel, tileX, tileY, redActive, greenActive, blueActive).getAsBufferedImage();
            bi = correctSamplemodel(PlanarImage.wrapRenderedImage(bi)).getAsBufferedImage();
        }

        if (overlayChannel != null) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = mergeOverlay(PlanarImage.wrapRenderedImage(bi), overlayChannel, tileX, tileY).getAsBufferedImage();
        }

        if (blur > 0) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = GBlur.adjustBlur(PlanarImage.wrapRenderedImage(bi), blur).getAsBufferedImage();
        }

        if (Math.abs(brightness) > 0.01d) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = adjustBrightness(PlanarImage.wrapRenderedImage(bi), brightness).getAsBufferedImage();
        }

        if (gamma != 100) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = adjustGamma(PlanarImage.wrapRenderedImage(bi), gamma, cachedParams, tiledImagePainter).getAsBufferedImage();
        }


        if ((redAdjust != 0) || (greenAdjust != 0) || (blueAdjust != 0) || contrast != 100) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = adjustContrast(PlanarImage.wrapRenderedImage(bi), redAdjust, greenAdjust, blueAdjust, (float) contrast / 100f, brightness, cachedParams, tiledImagePainter).getAsBufferedImage();
        }

        if (((redActive == false) && (redChannel == null)) || ((greenActive == false) && (greenChannel == null)) || ((blueActive == false) && (blueChannel == null))) {
            bi = createImage(tile, bi, getSampleModel(), getColorModel());
            bi = activeChannels(PlanarImage.wrapRenderedImage(bi), redActive, greenActive, blueActive).getAsBufferedImage();
        }


        if (bi != null) {
            tile = bi.getData();
        }

        // cache write lock will be set in initCache

        // re-init cache disabled. Too many problems due to different tile sizes (e.g. overview vs normal)
        //  -> only init once...
        if (useCache && (OrbitTiledImage2.tileCache == null /*|| tileSizeChanged(tile.getWidth(),tile.getHeight())*/)) {
//            System.out.println("reason for init: useCache="+useCache+"; cache="+OrbitTiledImage2.tileCache);
//            if (OrbitTiledImage2.tileCache!=null) {
//                System.out.println("width="+OrbitTiledImage2.cacheTileWidth.get()+":"+tile.getWidth());
//                System.out.println("height="+OrbitTiledImage2.cacheTileHeight.get()+":"+tile.getHeight());
//            }

               initCache(tile.getWidth(), tile.getHeight());
        }

        // the put is a "read" method because the cache is not rebuild (and put/get is threadsafe)
        if (doCacheLock) OrbitTiledImage2.cacheLock.readLock().lock();
        try {
            if (useCache && OrbitTiledImage2.tileCache != null) {
                OrbitTiledImage2.tileCache.put(tileP, tile);
            }
        } finally {
            if (doCacheLock) OrbitTiledImage2.cacheLock.readLock().unlock();
        }
        initialized = true;
        return tile;
    }

    /**
     * Checks if the tilesize is different than the cache assumes (for max cache size computation).
     * Workaround for LocalImageProvider: here TILE_SIZE_DEFAULT is assumed for tileSize, even if certain levels (e.g. overview plane) will have a different size.
     * This is to avoid unnecessary cache-recreations.
     * @param tileWidth
     * @param tileHeight
     * @return
     */
    private boolean tileSizeChanged(int tileWidth, int tileHeight) {
        if (DALConfig.isLocalImageProvider()) {
            tileWidth = OrbitUtils.TILE_SIZE_DEFAULT;
            tileHeight = OrbitUtils.TILE_SIZE_DEFAULT;
        }
        boolean sizeChanged =  OrbitTiledImage2.cacheTileWidth.get() != tileWidth || OrbitTiledImage2.cacheTileHeight.get() != tileHeight;
        return sizeChanged;
    }


    public static BufferedImage createImage(Raster r, BufferedImage bi, SampleModel sampleModel, ColorModel colorModel) {
        if (bi != null) return bi;
        try {
            DataBuffer dataBuffer = r.getDataBuffer();
            WritableRaster wr = Raster.createWritableRaster(sampleModel, dataBuffer, new Point(0, 0));
            BufferedImage bb = new BufferedImage(colorModel, wr, colorModel.isAlphaPremultiplied(), null);
            return bb;
        } catch (Throwable t) {
            t.printStackTrace();
            return null;
        }


    }


    private PlanarImage mergeOverlay(PlanarImage source, OrbitTiledImage2 overlayChannel2, int tileX, int tileY) {

        PlanarImage overlayChannel = PlanarImage.wrapRenderedImage(createImage(overlayChannel2.getTile(tileX, tileY), null, overlayChannel2.getSampleModel(), overlayChannel2.getColorModel()));
        PlanarImage overlayFixed = PlanarImage.wrapRenderedImage(createImage(overlayChannel2.getTile(tileX, tileY), null, overlayChannel2.getSampleModel(), overlayChannel2.getColorModel()));

        if (overlayFixed.getSampleModel().getNumBands() > 1)
            overlayFixed = convertColorToGray(overlayFixed);

        if (source.getSampleModel().getNumBands() > 1) {
            ParameterBlock pb = new ParameterBlock();
            pb.addSource(overlayFixed); // r
            pb.addSource(overlayFixed); // g
            pb.addSource(overlayFixed); // b
            overlayFixed = JAI.create("bandmerge", pb);
        }


        ParameterBlock pb = new ParameterBlock();
        pb.addSource(source);
        pb.addSource(overlayFixed);
        pb.add(overlayChannel);
        pb.add(overlayChannel);
        pb.add(false);
        pb.add(javax.media.jai.operator.CompositeDescriptor.NO_DESTINATION_ALPHA);
        return JAI.create("Composite", pb);
    }

    private PlanarImage activeChannels(PlanarImage source, boolean redActive, boolean greenActive, boolean blueActive) {
        final double[][] matrix = {
                {redActive ? 1D : 0D, 0D, 0D, 0d},
                {0D, greenActive ? 1D : 0D, 0D, 0d},
                {0D, 0D, blueActive ? 1D : 0D, 0d}
        };
        ParameterBlock pb = new ParameterBlock();
        pb.addSource(source);
        pb.add(matrix);
        return JAI.create("bandcombine", pb, null);
    }


    private PlanarImage convertColorModel(PlanarImage pi) {
        int numComponents = pi.getColorModel().getNumComponents();
        boolean isGrey = numComponents == 1;
        ColorModel colorModel = rgbColorModel;
        if (isGrey) colorModel = grayColorModel;
        try {
            ParameterBlock pb = new ParameterBlock();
            pb.addSource(pi).add(colorModel);
            RenderedOp dst = JAI.create("ColorConvert", pb);
            return dst.getRendering();
        } catch (IllegalArgumentException ex) {
            logger.info("Error: Cannot convert color model. Original color model: " + pi.getColorModel());
            return null;
        }

    }

    private PlanarImage mergeChannels(final OrbitTiledImage2 redChannel, final OrbitTiledImage2 greenChannel, final PlanarImage blueChannel, int tileX, int tileY, boolean redActive, boolean greenActive, boolean blueActive) {

        PlanarImage red = redChannel == null ? null : PlanarImage.wrapRenderedImage(createImage(redChannel.getTile(tileX, tileY), null, redChannel.getSampleModel(), redChannel.getColorModel()));
        PlanarImage green = greenChannel == null ? null : PlanarImage.wrapRenderedImage(createImage(greenChannel.getTile(tileX, tileY), null, greenChannel.getSampleModel(), greenChannel.getColorModel()));
        PlanarImage blue = blueChannel == null ? null : PlanarImage.wrapRenderedImage(createImage(blueChannel.getTile(tileX, tileY), null, blueChannel.getSampleModel(), blueChannel.getColorModel()));

        PlanarImage nullImage = null;
        if (red != null) nullImage = getNullImage(red);
        else if (green != null) nullImage = getNullImage(green);
        else if (blue != null) nullImage = getNullImage(blue);

        red = red == null ? nullImage : red;
        green = green == null ? nullImage : green;
        blue = blue == null ? nullImage : blue;

        red = redActive ? red : nullImage;
        green = greenActive ? green : nullImage;
        blue = blueActive ? blue : nullImage;

        if (red.getSampleModel().getNumBands() > 1)
            red = convertColorToGray(red, 1, 0, 0);
        if (green.getSampleModel().getNumBands() > 1)
            green = convertColorToGray(green, 0, 1, 0);
        if (blue.getSampleModel().getNumBands() > 1)
            blue = convertColorToGray(blue, 0, 0, 1);


        try {

            ParameterBlock pb = new ParameterBlock();
            if (originalWasGrayScale) {  // bgr fix
                pb.addSource(blue); // b
                pb.addSource(green); // g
                pb.addSource(red); // r
            } else { // rgb
                pb.addSource(red); // r
                pb.addSource(green); // g
                pb.addSource(blue); // b
            }
            PlanarImage merged = JAI.create("bandmerge", pb);

            return merged;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }


    }

    private RenderedOp convertColorToGray(PlanarImage src, double r, double g, double b) {
        final double[][] matrix = {
                {r, g, b, 0d} // .114D, 0.587D, 0.299D
        };
        ParameterBlock pb = new ParameterBlock();
        pb.addSource(src);
        pb.add(matrix);
        return JAI.create("bandcombine", pb, /*ManipulationUtils.getRenderingHints(image)*/null);
    }

    private RenderedOp convertColorToGray(PlanarImage src) {
        final double[][] matrix = {
                //  { 0.114D, 0.587D, 0.299D, 0d } // .114D, 0.587D, 0.299D
                {0.333D, 0.333D, 0.333D, 0d} // .114D, 0.587D, 0.299D
        };
        ParameterBlock pb = new ParameterBlock();
        pb.addSource(src);
        pb.add(matrix);
        return JAI.create("bandcombine", pb, /*ManipulationUtils.getRenderingHints(image)*/null);
    }


    private PlanarImage getNullImage(PlanarImage img) {
        if (nullImage == null) {
            nullImage = new TiledImage(img.getMinX(), img.getMinY(), img.getWidth(), img.getHeight(), img.getTileGridXOffset(), img.getTileGridYOffset(), img.getSampleModel(), img.getColorModel());
        }
        return nullImage;
    }

    /**
     * make sure that a PixelInterleavedSampleModel is returned
     */
    private static PlanarImage makeCompatibleSamplemodel(PlanarImage source, PlanarImage result) {
        if (!(source.getSampleModel() instanceof PixelInterleavedSampleModel)) {
            BufferedImage img = new BufferedImage(result.getWidth(), result.getHeight(), BufferedImage.TYPE_INT_RGB);
            img.createGraphics().drawImage(result.getAsBufferedImage(), 0, 0, null);
            result = PlanarImage.wrapRenderedImage(img);
        }
        return result;
    }



    public static PlanarImage adjustBrightness(PlanarImage src, final double b) {
        final double[][] matrixRGB = {
                {1d, 0D, 0D, b},
                {0D, 1d, 0D, b},
                {0, 0D, 1d, b}

        };


        final double[][] matrixGrey = {
                {1d, b}
        };

        double[][] matrix;
        if (src.getSampleModel().getNumBands() > 1)
            matrix = matrixRGB;
        else matrix = matrixGrey;


        ParameterBlock pb = new ParameterBlock();
        pb.addSource(src);
        pb.add(matrix);
        return JAI.create("bandcombine", pb);
    }


    /**
     * Gamma correction.
     * imageForStats should be a low resolution image for computing the extrema - or null, then the smallest layer will be loaded automatically.
     *
     * @param source
     * @param gammaValueOrig [100..350 -> will be converted to 1..3,5]
     * @return
     */
    public static PlanarImage adjustGamma(PlanarImage source, double gammaValueOrig, OrbitUtils.ImageAdjustCachedParams cachedParams, TiledImagePainter tipForStats) {
        ParameterBlock pb;
        if (!cachedParams.isGammaExtremaSet()) {
            PlanarImage statImg = loadImageForStats(source, tipForStats);

            final int numScan = 200;
            int skipW = Math.max(1, source.getWidth() / numScan);
            int skipH = Math.max(1, source.getHeight() / numScan);
            //	System.out.println("gamma extreme calc "+skipW+" / "+skipH);
            // TODO: use low res image for extreme calculation (otherwise all tiles are loaded...)

            pb = new ParameterBlock();
            pb.addSource(statImg);   // The source image
            pb.add(null);        // The region of the image to scan
            pb.add(skipW);         // The horizontal sampling rate
            pb.add(skipH);         // The vertical sampling rate
            RenderedOp op = JAI.create("extrema", pb);
            double[][] extrema = (double[][]) op.getProperty("extrema"); // [0][r,g,b] minimum, [1][r,g,b] maximum
            cachedParams.setGammaMin(Math.min(Math.min(extrema[0][0], extrema[0][1]), extrema[0][2]));
            cachedParams.setGammaMax(Math.max(Math.max(extrema[1][0], extrema[1][1]), extrema[1][2]));
            cachedParams.setGammaExtremaSet(true);
        }

        double minValue = cachedParams.getGammaMin();
        double maxValue = cachedParams.getGammaMax();
        //double gammaValue = (gammaValueOrig+1d)*1.75d; // scale 0-3.5
        double gammaValue = gammaValueOrig / 100d; // scale 0-3.5

        // get min and max value from ndpi meta data?

        // gamma per channel?
        byte[] lut = new byte[256];
        double scale = 255.0 / (maxValue - minValue);
        double gammaPower = 1.0 / gammaValue;
        for (int i = (int) minValue; i < (int) maxValue; i++) {
            if (gammaValue == 1.0f) {
                lut[i] = (byte) ((i - minValue) * scale);
            } else {
                double val = (Math.pow(i / 255.0d, gammaPower) * 255.0d - minValue) * scale;
                if (val < 0) val = 0;
                if (val > 255) val = 255;
                lut[i] = (byte) val;

            }
        }
        for (int i = 0; i < minValue; i++) {
            lut[i] = 0;
        }
        for (int i = (int) maxValue; i < 256; i++) {
            lut[i] = (byte) 255;
        }


        LookupTableJAI lookup = new LookupTableJAI(lut);
        PlanarImage result = JAI.create("lookup", source, lookup);
        result = makeCompatibleSamplemodel(source, result);
        return result;
    }


    public static PlanarImage adjustContrast(PlanarImage src, double red, double green, double blue, double contrast, double brightness, OrbitUtils.ImageAdjustCachedParams cachedParams, TiledImagePainter tipForStats) {

        if (!cachedParams.isContrastAverageSet()) {

            PlanarImage statImg = loadImageForStats(src, tipForStats);

            final int numScan = 200;
            int skipW = Math.max(1, src.getWidth() / numScan);
            int skipH = Math.max(1, src.getHeight() / numScan);

            ParameterBlock mpb = new ParameterBlock();
            mpb.addSource(statImg); // The source image
            mpb.add(null); // null ROI means whole image
            mpb.add(skipW); // 1 check every pixel horizontally
            mpb.add(skipH); // 1 check every pixel vertically

            // Perform the mean operation on the source image
            PlanarImage meanImage = JAI.create("mean", mpb, null);
            // Retrieve the mean pixel value
            double[] mean = (double[]) meanImage.getProperty("mean");
            // Average the mean of all bands
            double sum = 0.0D;
            for (int i = 0; i < mean.length; i++) {
                sum += mean[i];
            }
            cachedParams.setContrastAverage(sum / (double) mean.length);
            cachedParams.setContrastAverageSet(true);
        }
        double average = cachedParams.getContrastAverage();

        // Create the lookup table based on the average mean
        byte[][] lut = new byte[3][256];
        for (int i = 0; i < 256; i++) {
            lut[0][i] = ManipulationUtils.clamp((int) ((average + (i - average) * contrast) + red + brightness));
            lut[1][i] = ManipulationUtils.clamp((int) ((average + (i - average) * contrast) + green + brightness));
            lut[2][i] = ManipulationUtils.clamp((int) ((average + (i - average) * contrast) + blue + brightness));
        }


        LookupTableJAI lookup = new LookupTableJAI(lut);
        PlanarImage result = JAI.create("lookup", src, lookup);
        result = makeCompatibleSamplemodel(src, result);
        return result;

    }


    /**
     * Corrects the sample model, e.g. after channel merge.
     * @param src
     * @return
     */
    public static PlanarImage correctSamplemodel(PlanarImage src) {
        PlanarImage result = JAI.create("lookup", src, getDefaultLookuptable());
        result = makeCompatibleSamplemodel(src, result);
        return result;
    }

    private static synchronized LookupTableJAI getDefaultLookuptable() {
        if (defaultLookuptable==null) {
            byte[][] lut = new byte[3][256];
            for (int i = 0; i < 256; i++) {
                lut[0][i] = ManipulationUtils.clamp(i);
                lut[1][i] = ManipulationUtils.clamp(i);
                lut[2][i] = ManipulationUtils.clamp(i);
            }
            defaultLookuptable = new LookupTableJAI(lut);
        }
        return defaultLookuptable;
    }

    private static PlanarImage loadImageForStats(PlanarImage source, TiledImagePainter tip) {
        PlanarImage res = source;
        if (tip != null && tip.hasMipMaps()) {
            res = tip.getMipMaps()[tip.getMipMaps().length - 1].getImage();
            logger.trace("stat image loaded via tiledImagePainter");
        }
        return res;
    }


    protected synchronized boolean readInfo(String filename) throws Exception {
        String sb = readInfoString(filename);
        if (logger.isDebugEnabled()) {
            String[] split = filename.split("\\.");
            if (split != null && split.length == 2)
                logger.debug("info: " + sb);
        }
        if (sb == null) return false;
        if (sb.length() > 0) {
            minX = 0;
            minY = 0;
            String[] kv = sb.toString().split(",");
            if (kv != null && kv.length > 0) {
                for (String s : kv) {
                    String[] sa = s.split("=");
                    if (sa != null && sa.length == 2) {
                        String key = sa[0];
                        String val = sa[1];
                        try {
                            if (key.equalsIgnoreCase("width")) {
                                this.width = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("height")) {
                                this.height = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("numBands")) {
                                this.numBands = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("minX")) {
                                this.minX = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("minY")) {
                                this.minY = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("tileGridXOffset")) {
                                this.tileGridXOffset = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("tileGridYOffset")) {
                                this.tileGridYOffset = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("tileWidth")) {
                                this.tileWidth = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("tileHeight")) {
                                this.tileHeight = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("photometric")) {
                                this.photometric = Integer.parseInt(val);
                            } else if (key.equalsIgnoreCase("bitsPerSample")) {
                                this.originalBitsPerSample = Integer.parseInt(val);
                            }

                        } catch (Exception e) {
                            logger.error("error setting property: " + key + "", e);
                        }
                    }
                }

                // tileWidth and tileHeight now based on AparUtils.TILE_SIZE
                //this.tileWidth = AparUtils.TILE_SIZE;
                //this.tileHeight = AparUtils.TILE_SIZE;

                numBands = 3; // always RGB!!!
                if (numBands == 1) this.colorModel = grayColorModel;
                else {
                    this.colorModel = rgbColorModel;
                }
                this.sampleModel = colorModel.createCompatibleSampleModel(tileWidth, tileHeight);
            }
        }

        return true;
    }


    public int getSample(int x, int y, int b) {
        int tileX = this.XToTileX(x);
        int tileY = this.YToTileY(y);
        Raster t = this.getTile(tileX, tileY);
        return t.getSample(x, y, b);
    }


    @Override
    public String toString() {
        String s = "filename=" + filename + "; width=" + width + "; height=" + height + "; numBands=" + numBands + "; tileWidth=" + tileWidth + "; tileHeight=" + tileHeight + "; maxTileX=" + getMaxTileX() + "; maxTileY=" + getMaxTileY() + "; colorModel=" + colorModel.getColorSpace().getType() + "; sampleModel=" + sampleModel + "; OriginalBitePerSample=" + originalBitsPerSample;
        return s;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof OrbitTiledImage2))
            return false;
        OrbitTiledImage2 other = (OrbitTiledImage2) obj;
        if (filename == null) {
            if (other.filename != null)
                return false;
        } else if (!filename.equals(other.filename))
            return false;
        return true;
    }

    public boolean isUseCache() {
        return useCache;
    }

    public void setUseCache(boolean useCache) {
        this.useCache = useCache;
    }

    public void close() throws IOException {

    }

}
