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

package com.actelion.research.orbit.imageAnalysis.components;

import com.actelion.research.orbit.beans.RawMeta;
import com.actelion.research.orbit.imageAnalysis.dal.DALConfig;
import com.actelion.research.orbit.imageAnalysis.utils.OrbitUtils;
import com.actelion.research.orbit.utils.RawMetaFactoryFile;
import com.actelion.research.orbit.utils.RawUtilsCommon;
import imageJ.Colour_Deconvolution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;


public class AdjustPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private final static Logger logger = LoggerFactory.getLogger(AdjustPanel.class);
    private final DoubleClickSlider brightnessSlider = new DoubleClickSlider(-100, 100, 0);
    private final DoubleClickSlider gammaSlider = new DoubleClickSlider(0, 320, 100);
    private final DoubleClickSlider contrastSlider = new DoubleClickSlider(0, 800, 100);
    private final DoubleClickSlider blurSlider = new DoubleClickSlider(0, 50, 0);

    private final DoubleClickSlider redSlider = new DoubleClickSlider(-100, 100, 0);
    private final DoubleClickSlider greenSlider = new DoubleClickSlider(-100, 100, 0);
    private final DoubleClickSlider blueSlider = new DoubleClickSlider(-100, 100, 0);
    private final JCheckBox redCb = new JCheckBox("red    ", true);
    private final JCheckBox greenCb = new JCheckBox("green", true);
    private final JCheckBox blueCb = new JCheckBox("blue  ", true);

    private final JComboBox deconvCb = new JComboBox(Colour_Deconvolution.stainings);
    private final JRadioButton deconvChannel0 = new JRadioButton("Disable", true);
    private final JRadioButton deconvChannel1 = new JRadioButton("Stain 1", false);
    private final JRadioButton deconvChannel2 = new JRadioButton("Stain 2", false);
    private final JRadioButton deconvChannel3 = new JRadioButton("Comp", false);

    private final JButton saveBtn = new JButton("save adjustments");
    private final JButton resetBtn = new JButton("reset values");

    public AdjustPanel() {

        brightnessSlider.setPaintLabels(true);
        brightnessSlider.setPaintTicks(true);

        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveAdjustments();
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetValues();
            }
        });

        brightnessSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    int b = brightnessSlider.getValue();
                    iFrame.recognitionFrame.bimg.setBrightness(b);
                    updateIFrame(iFrame);
                }
            }
        });

        contrastSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    int b = contrastSlider.getValue();
                    iFrame.recognitionFrame.bimg.setContrast(b);
                    updateIFrame(iFrame);
                }
            }
        });

        gammaSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    int b = gammaSlider.getValue();
                    iFrame.recognitionFrame.bimg.setGamma(b);
                    updateIFrame(iFrame);
                }
            }
        });


        blurSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    int b = blurSlider.getValue();
                    iFrame.recognitionFrame.bimg.setBlur(b);
                    updateIFrame(iFrame);
                }
            }
        });


        ChangeListener rgbChangeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    int r = redSlider.getValue();
                    int g = greenSlider.getValue();
                    int b = blueSlider.getValue();
                    iFrame.recognitionFrame.bimg.setRedAdjust(r);
                    iFrame.recognitionFrame.bimg.setGreenAdjust(g);
                    iFrame.recognitionFrame.bimg.setBlueAdjust(b);
                    iFrame.recognitionFrame.bimg.setRedActive(redCb.isSelected());
                    iFrame.recognitionFrame.bimg.setGreenActive(greenCb.isSelected());
                    iFrame.recognitionFrame.bimg.setBlueActive(blueCb.isSelected());
                    updateIFrame(iFrame);
                }
            }
        };

        redSlider.addChangeListener(rgbChangeListener);
        greenSlider.addChangeListener(rgbChangeListener);
        blueSlider.addChangeListener(rgbChangeListener);

        redCb.addChangeListener(rgbChangeListener);
        greenCb.addChangeListener(rgbChangeListener);
        blueCb.addChangeListener(rgbChangeListener);

        deconvChannel0.setToolTipText("disable color deconvolution");
        deconvChannel0.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    if (deconvChannel0.isSelected()) {
                        iFrame.recognitionFrame.bimg.setDeconvChannel(0);
                        updateIFrame(iFrame);
                    }
                }
            }
        });
        deconvChannel1.setToolTipText("select primary staining");
        deconvChannel1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    if (deconvChannel1.isSelected() && deconvCb.getSelectedItem() != null && (!deconvCb.getSelectedItem().equals(Colour_Deconvolution.DECONV_NONE))) {
                        iFrame.recognitionFrame.bimg.setDeconvName((String) deconvCb.getSelectedItem());
                        iFrame.recognitionFrame.bimg.setDeconvChannel(1);
                        updateIFrame(iFrame);
                    }
                }
            }
        });
        deconvChannel2.setToolTipText("select secondary staining");
        deconvChannel2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    if (deconvChannel2.isSelected() && deconvCb.getSelectedItem() != null && (!deconvCb.getSelectedItem().equals(Colour_Deconvolution.DECONV_NONE))) {
                        iFrame.recognitionFrame.bimg.setDeconvName((String) deconvCb.getSelectedItem());
                        iFrame.recognitionFrame.bimg.setDeconvChannel(2);
                        updateIFrame(iFrame);
                    }
                }
            }
        });
        deconvChannel3.setToolTipText("select complementary color to staining 1 + staining 2");
        deconvChannel3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    if (deconvChannel3.isSelected() && deconvCb.getSelectedItem() != null && (!deconvCb.getSelectedItem().equals(Colour_Deconvolution.DECONV_NONE))) {
                        iFrame.recognitionFrame.bimg.setDeconvName((String) deconvCb.getSelectedItem());
                        iFrame.recognitionFrame.bimg.setDeconvChannel(3);
                        updateIFrame(iFrame);
                    }
                }
            }
        });
        deconvCb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
                if (iFrame != null) {
                    if (deconvCb.getSelectedItem() != null) {
                        String name = (String) deconvCb.getSelectedItem();
                        iFrame.recognitionFrame.bimg.setDeconvName(name);
                        if (name.equals(Colour_Deconvolution.DECONV_NONE)) {
                            iFrame.recognitionFrame.bimg.setDeconvChannel(0);
                        } else {
                            if (iFrame.recognitionFrame.bimg.getDeconvChannel() < 1) {
                                if (deconvChannel0.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(0);
                                if (deconvChannel1.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(1);
                                if (deconvChannel2.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(2);
                                if (deconvChannel3.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(3);
                            }
                        }
                        updateIFrame(iFrame);
                    }
                }
            }
        });


        JLabel gammaLabel = new JLabel("Gamma:");
        JLabel brightnessLabel = new JLabel("Brightness:");
        JLabel contrastLabel = new JLabel("Contrast:");
        JLabel channelsLabel = new JLabel("Channels:");
        JLabel blurLabel = new JLabel("Blur:");

        // layout
        redCb.setForeground(Color.red);
        JPanel redPanel = new JPanel(new BorderLayout());
        redPanel.add(redCb, BorderLayout.WEST);
        redPanel.add(DoubleClickSlider.wrapToPanelWithValue(redSlider, 0, 1), BorderLayout.CENTER);

        greenCb.setForeground(new Color(20, 200, 20));
        JPanel greenPanel = new JPanel(new BorderLayout());
        greenPanel.add(greenCb, BorderLayout.WEST);
        greenPanel.add(DoubleClickSlider.wrapToPanelWithValue(greenSlider, 0, 1), BorderLayout.CENTER);

        blueCb.setForeground(Color.blue);
        JPanel bluePanel = new JPanel(new BorderLayout());
        bluePanel.add(blueCb, BorderLayout.WEST);
        bluePanel.add(DoubleClickSlider.wrapToPanelWithValue(blueSlider, 0, 1), BorderLayout.CENTER);

        JPanel radioBtnPanel = new JPanel();
        radioBtnPanel.add(deconvChannel0);
        radioBtnPanel.add(deconvChannel1);
        radioBtnPanel.add(deconvChannel2);
        radioBtnPanel.add(deconvChannel3);
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(deconvChannel0);
        btnGroup.add(deconvChannel1);
        btnGroup.add(deconvChannel2);
        btnGroup.add(deconvChannel3);

        setLayout(new GridBagLayout());
        Insets insetsL = new Insets(5, 5, 0, 5);
        Insets insets = new Insets(0, 5, 0, 5);
        int y = 0;

        add(gammaLabel, new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, insetsL, 0, 0));
        add(DoubleClickSlider.wrapToPanelWithValue(gammaSlider, 0, 0.01), new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));

        add(contrastLabel, new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, insetsL, 0, 0));
        add(DoubleClickSlider.wrapToPanelWithValue(contrastSlider, 0, 1), new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));

        add(brightnessLabel, new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, insetsL, 0, 0));
        add(DoubleClickSlider.wrapToPanelWithValue(brightnessSlider, 0, 1), new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));

//		 add(blurLabel,new GridBagConstraints(0, y++, 1, 1,  1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, insetsL, 0, 0));
//		 add(DoubleClickSlider.wrapToPanelWithValue(blurSlider,0,1),new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));

        add(channelsLabel, new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, insetsL, 0, 0));
        add(redPanel, new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));
        add(greenPanel, new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));
        add(bluePanel, new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));

        add(new JLabel("Color Deconvolution"), new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, insetsL, 0, 0));
        add(deconvCb, new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));
        add(radioBtnPanel, new GridBagConstraints(0, y++, GridBagConstraints.REMAINDER, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, insets, 0, 0));

        add(resetBtn, new GridBagConstraints(0, y, 1, 1, 0.5, 1, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, insetsL, 0, 0));
        add(saveBtn, new GridBagConstraints(1, y, 1, 1, 0.5, 1, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL, insetsL, 0, 0));
    }

    private synchronized void updateIFrame(ImageFrame iFrame) {
        if (iFrame != null) {
            if (iFrame.recognitionFrame.getRenderThreadOriginal() != null && iFrame.recognitionFrame.getRenderThreadOriginal().isBufferReady()) {
                iFrame.recognitionFrame.getRenderThreadOriginal().setValuesDirty(true);
                iFrame.recognitionFrame.getRenderThreadOriginal().setScheduleUpdate(true);
                iFrame.recognitionFrame.repaint();
            }
            //iFrame.adjustViewport();
            else iFrame.recognitionFrame.repaint();
        }
    }

    public void resetValues() {
        brightnessSlider.setValue(brightnessSlider.getDefValue());
        contrastSlider.setValue(contrastSlider.getDefValue());
        gammaSlider.setValue(contrastSlider.getDefValue());
        redSlider.setValue(redSlider.getDefValue());
        greenSlider.setValue(greenSlider.getDefValue());
        blueSlider.setValue(blueSlider.getDefValue());
        redCb.setSelected(true);
        greenCb.setSelected(true);
        blueCb.setSelected(true);
        blurSlider.setValue(0);
        deconvCb.setSelectedIndex(0);
        deconvChannel0.setSelected(true);
        deconvChannel1.setSelected(false);
        deconvChannel2.setSelected(false);
        deconvChannel3.setSelected(false);
    }

    public void setAdjustmentValues(int brightness, int contrast, int red, int green, int blue, int gamma, boolean redSelected, boolean greenSelected, boolean blueSelected, int deconvChannel, String deconvName) {
        gammaSlider.setValue(gamma);
        brightnessSlider.setValue(brightness);
        contrastSlider.setValue(contrast);
        redSlider.setValue(red);
        greenSlider.setValue(green);
        blueSlider.setValue(blue);
        redCb.setSelected(redSelected);
        greenCb.setSelected(greenSelected);
        blueCb.setSelected(blueSelected);
        deconvChannel0.setSelected(true);
        if (deconvChannel == 1) deconvChannel1.setSelected(true);
        if (deconvChannel == 2) deconvChannel2.setSelected(true);
        if (deconvChannel == 3) deconvChannel3.setSelected(true);
        deconvCb.setSelectedItem(deconvName);
    }

    /**
     * imports the adjustments from a string in the format bri:<brightness>;con:<contrast>;r:<red>;g<green>;b<blue>;gamma:<gamma>;deconvChan:<deconvolution channel>;deconvName:<deconvolution name>
     *
     * @param vals
     */
    public void setAdjustmentValues(String vals) {
        OrbitUtils.ImageAdjustments ia = OrbitUtils.parseImageAdjustments(vals);

        brightnessSlider.setValue(ia.getBrightness());
        contrastSlider.setValue(ia.getContrast());
        redSlider.setValue(ia.getRed());
        greenSlider.setValue(ia.getGreen());
        blueSlider.setValue(ia.getBlue());
        gammaSlider.setValue(ia.getGamma());
        redCb.setSelected(true);
        greenCb.setSelected(true);
        blueCb.setSelected(true);
        deconvCb.setSelectedItem(ia.getDeconvName());
        deconvChannel0.setSelected(true);
        if (ia.getDeconvChannel() == 1) deconvChannel1.setSelected(true);
        if (ia.getDeconvChannel() == 2) deconvChannel2.setSelected(true);
        if (ia.getDeconvChannel() == 3) deconvChannel3.setSelected(true);
    }

    /**
     * returns bri:<brightness>;con:<contrast>;r:<red>;g<green>;b<blue>
     * for storing the string as a meta value
     *
     * @return
     */
    private String adjustmentsToString() {
        String deconvName = Colour_Deconvolution.DECONV_NONE;
        if (deconvCb.getSelectedItem() != null) deconvName = (String) deconvCb.getSelectedItem();
        int deconvChannel = 0;
        if (deconvChannel1.isSelected()) deconvChannel = 1;
        if (deconvChannel2.isSelected()) deconvChannel = 2;
        if (deconvChannel3.isSelected()) deconvChannel = 3;
        return "bri:" + brightnessSlider.getValue() + ";con:" + contrastSlider.getValue() + ";r:" + redSlider.getValue() + ";g:" + greenSlider.getValue() + ";b:" + blueSlider.getValue() + ";gamma:" + gammaSlider.getValue() + ";deconvChan:" + deconvChannel + ";deconvName:" + deconvName;
    }


    private boolean saveAdjustments() {
        OrbitImageAnalysis.getInstance().forceLogin();
        if (OrbitImageAnalysis.loginOk) {
            ImageFrame iFrame = OrbitImageAnalysis.getInstance().getIFrame();
            if (iFrame != null && iFrame.getRdf() != null) {
                try {
                    String vals = adjustmentsToString();
                    List<RawMeta> rms = DALConfig.getImageProvider().LoadRawMetasByRawDataFileAndName(iFrame.getRdf().getRawDataFileId(), RawUtilsCommon.STR_META_IMAGEADJUSTMENTS);
                    if (rms != null && rms.size() > 0) { // update
                        RawMeta rm = rms.get(0);
                        rm.setModifyDate(new Date());
                        rm.setUserId(OrbitImageAnalysis.loginUser);
                        rm.setValue(vals);
                        DALConfig.getImageProvider().UpdateRawMeta(rm);
                        logger.debug("Image adjustments updated in database. RawMeta: " + rm);
                    } else { // insert
                        RawMetaFactoryFile rmff = new RawMetaFactoryFile(iFrame.getRdf().getRawDataFileId(), new Date(), OrbitImageAnalysis.loginUser);
                        RawMeta rm = rmff.createMetaStr(RawUtilsCommon.STR_META_IMAGEADJUSTMENTS, vals);
                        DALConfig.getImageProvider().InsertRawMeta(rm);
                        logger.debug("Image adjustments saved to database. RawMeta: " + rm);
                    }
                    JOptionPane.showMessageDialog(this, "Image adjustments successfully saved.", "Image Adjustments Saved", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } catch (Exception e) {
                    logger.error("cannot insert or update raw meta into database", e);
                    return false;
                }
            } else {
                logger.error("Cannot save image adjustment data because image is not stored in the Orbit database or no image is selected.");
                return false;
            }
        } else {
            logger.debug("Image adjustments not saved because Orbit login is not ok or canceled.");
            return false;
        }
    }

    public boolean loadAdjustments(ImageFrame iFrame) {
        if (iFrame != null && iFrame.getRdf() != null) {
            try {
                List<RawMeta> rms = DALConfig.getImageProvider().LoadRawMetasByRawDataFileAndName(iFrame.getRdf().getRawDataFileId(), RawUtilsCommon.STR_META_IMAGEADJUSTMENTS);
                if (rms != null && rms.size() > 0) {
                    RawMeta rm = rms.get(0);
                    setAdjustmentValues(rm.getValue());
                    logger.debug("Image adjustments loaded. RawMeta: " + rm);
                    iFrame.recognitionFrame.bimg.setBrightness(brightnessSlider.getValue());
                    iFrame.recognitionFrame.bimg.setContrast(contrastSlider.getValue());
                    iFrame.recognitionFrame.bimg.setRedAdjust(redSlider.getValue());
                    iFrame.recognitionFrame.bimg.setGreenAdjust(greenSlider.getValue());
                    iFrame.recognitionFrame.bimg.setBlueAdjust(blueSlider.getValue());
                    iFrame.recognitionFrame.bimg.setGamma(gammaSlider.getValue());
                    if (deconvCb.getSelectedItem() != null)
                        iFrame.recognitionFrame.bimg.setDeconvName((String) deconvCb.getSelectedItem());
                    if (deconvChannel0.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(0);
                    if (deconvChannel1.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(1);
                    if (deconvChannel2.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(2);
                    if (deconvChannel3.isSelected()) iFrame.recognitionFrame.bimg.setDeconvChannel(3);
                } else return false;
                return true;
            } catch (Exception e) {
                logger.error("Cannot load image adjustment meta data from database", e);
            }
        }
        return false;
    }

    public JCheckBox getRedCb() {
        return redCb;
    }

    public JCheckBox getBlueCb() {
        return blueCb;
    }

    public JCheckBox getGreenCb() {
        return greenCb;
    }
}
