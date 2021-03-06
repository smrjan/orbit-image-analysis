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

package com.actelion.research.orbit.imageAnalysis.components.icons;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;
import static java.awt.MultipleGradientPaint.CycleMethod.REFLECT;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class Slidepreview2 implements org.pushingpixels.flamingo.api.common.icon.ResizableIcon {

    /**
     * Paints the transcoded SVG image on the specified graphics context. You
     * can install a custom transformation on the graphics context to scale the
     * image.
     *
     * @param g Graphics context.
     */
    public static void paint(Graphics2D g) {
        Shape shape = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = (AlphaComposite) origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }

        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();


        // 
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.0666667f, 0, 0, 1.0666667f, 0, 0));

        // _0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -308.26773f));

        // _0_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0, 5.690731f, -5.0931206f, 0, 1039.3538f, 316.82016f));

        // _0_0_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 104.2738f, -312.07608f));

        // _0_0_0_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7385876f, 0, 0, 1, -100.57259f, 311.8842f));

        // _0_0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));

        // _0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.861845, 10.266208);
        ((GeneralPath) shape).lineTo(11.893095, 102.297455);
        ((GeneralPath) shape).lineTo(11.861845, 194.29745);
        ((GeneralPath) shape).lineTo(111.86184, 194.29745);
        ((GeneralPath) shape).lineTo(111.86184, 117.766205);
        ((GeneralPath) shape).lineTo(111.86184, 86.766205);
        ((GeneralPath) shape).lineTo(111.86184, 10.266205);
        ((GeneralPath) shape).lineTo(11.861847, 10.266205);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.556394, 11.359958);
        ((GeneralPath) shape).lineTo(13.556394, 49.626534);
        ((GeneralPath) shape).lineTo(13.556394, 154.22183);
        ((GeneralPath) shape).lineTo(13.556394, 192.4884);
        ((GeneralPath) shape).lineTo(109.5564, 192.4884);
        ((GeneralPath) shape).lineTo(109.5564, 109.81665);
        ((GeneralPath) shape).lineTo(109.5564, 94.031685);
        ((GeneralPath) shape).lineTo(109.5564, 11.35994);
        ((GeneralPath) shape).lineTo(13.556404, 11.35994);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(15.5, 98.5642318725586), new Point2D.Double(112.5, 98.5642318725586), new float[]{0, 1}, new Color[]{BLACK, new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 1, -2.443606f, 3.359958f)));
        g.setStroke(new BasicStroke(1, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.702982, 10.452039);
        ((GeneralPath) shape).lineTo(15.702982, 49.077156);
        ((GeneralPath) shape).lineTo(15.702982, 154.6525);
        ((GeneralPath) shape).lineTo(15.702982, 193.27762);
        ((GeneralPath) shape).lineTo(112.60247, 193.27762);
        ((GeneralPath) shape).lineTo(112.60247, 109.83127);
        ((GeneralPath) shape).lineTo(112.60247, 93.8984);
        ((GeneralPath) shape).lineTo(112.60247, 10.452049);
        ((GeneralPath) shape).lineTo(15.70298, 10.452049);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(103.09768676757812, 56.26235580444336), 48.9f, new Point2D.Double(103.09768676757812, 56.26235580444336), new float[]{0, 1}, new Color[]{new Color(0xD2F2FF), new Color(0xC9F3F3F3, true)}, NO_CYCLE, SRGB, new AffineTransform(-1.2288922f, 2.1689074f, -1.6426172f, -0.9306988f, 323.0385f, -153.85886f)));
        g.fill(shape);
        g.setPaint(new RadialGradientPaint(new Point2D.Double(18.182392120361328, 147.37173461914062), 48.5f, new Point2D.Double(18.182392120361328, 147.37173461914062), new float[]{0, 1}, new Color[]{BLACK, new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform(1.8929876f, -0.01271393f, 0.01272854f, 1.895163f, -18.080732f, -89.32833f)));
        g.setStroke(new BasicStroke(1.8168653f, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_0_3

        // _0_0_0_0_0_3_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(47.032032, 42.984238);
        ((GeneralPath) shape).curveTo(46.9115, 42.99054, 46.80502, 43.013386, 46.688282, 43.046738);
        ((GeneralPath) shape).curveTo(46.100063, 43.214798, 43.872826, 44.405834, 43.563282, 44.921738);
        ((GeneralPath) shape).curveTo(43.072773, 45.739254, 44.14471, 50.572273, 44.407032, 51.359238);
        ((GeneralPath) shape).curveTo(44.734028, 52.340225, 46.004692, 55.445168, 45.438282, 56.577988);
        ((GeneralPath) shape).curveTo(45.17401, 57.10653, 40.59938, 56.534706, 39.813282, 56.796738);
        ((GeneralPath) shape).curveTo(39.566742, 56.878918, 39.422318, 57.304718, 39.188282, 57.421738);
        ((GeneralPath) shape).curveTo(36.475513, 58.778122, 36.06012, 60.656464, 38.157032, 63.015488);
        ((GeneralPath) shape).curveTo(38.92808, 63.88292, 39.53362, 64.36906, 40.438282, 65.10924);
        ((GeneralPath) shape).curveTo(41.237274, 65.76296, 42.07063, 66.42646, 42.938282, 66.98424);
        ((GeneralPath) shape).curveTo(42.946682, 66.98964, 43.06471, 67.07576, 43.157032, 67.14049);
        ((GeneralPath) shape).curveTo(42.28938, 67.698265, 41.456024, 68.36176, 40.657032, 69.01549);
        ((GeneralPath) shape).curveTo(39.75237, 69.75567, 39.14683, 70.241806, 38.375782, 71.10924);
        ((GeneralPath) shape).curveTo(36.27887, 73.46826, 36.694263, 75.3466, 39.407032, 76.70299);
        ((GeneralPath) shape).curveTo(39.641068, 76.82001, 39.785492, 77.245804, 40.032032, 77.32799);
        ((GeneralPath) shape).curveTo(40.81813, 77.59002, 45.39276, 77.018196, 45.657032, 77.54674);
        ((GeneralPath) shape).curveTo(46.223442, 78.67956, 44.952778, 81.7845, 44.625782, 82.76549);
        ((GeneralPath) shape).curveTo(44.36346, 83.55245, 43.291523, 88.385475, 43.782032, 89.20299);
        ((GeneralPath) shape).curveTo(44.091576, 89.718895, 46.318813, 90.90993, 46.907032, 91.07799);
        ((GeneralPath) shape).curveTo(47.02377, 91.111336, 47.13025, 91.134186, 47.250782, 91.14049);
        ((GeneralPath) shape).curveTo(47.61238, 91.15925, 48.011555, 91.07799, 48.375782, 91.07799);
        ((GeneralPath) shape).curveTo(48.92628, 91.07799, 49.687508, 91.21099, 50.219532, 91.07799);
        ((GeneralPath) shape).curveTo(53.542244, 90.24731, 58.220936, 85.76991, 60.219532, 83.17174);
        ((GeneralPath) shape).curveTo(60.934242, 82.242615, 63.451977, 78.60538, 62.719532, 77.14049);
        ((GeneralPath) shape).curveTo(62.50649, 76.7144, 62.354935, 77.09534, 62.094532, 76.92174);
        ((GeneralPath) shape).curveTo(61.93126, 76.81289, 61.85155, 76.62434, 61.688282, 76.51549);
        ((GeneralPath) shape).curveTo(61.19082, 76.183846, 60.625782, 76.70833, 60.625782, 75.89049);
        ((GeneralPath) shape).curveTo(60.625782, 75.75173, 60.52767, 75.551094, 60.625782, 75.45299);
        ((GeneralPath) shape).curveTo(60.63689, 75.44188, 63.133064, 75.195, 63.344532, 75.26549);
        ((GeneralPath) shape).curveTo(63.53069, 75.32754, 63.57527, 75.58398, 63.750782, 75.67174);
        ((GeneralPath) shape).curveTo(63.90936, 75.75103, 64.13993, 75.598045, 64.18828, 75.45299);
        ((GeneralPath) shape).curveTo(64.41218, 74.781296, 64.30156, 71.902214, 64.18828, 71.10924);
        ((GeneralPath) shape).curveTo(64.09428, 70.45124, 63.775757, 69.65293, 63.56328, 69.01549);
        ((GeneralPath) shape).curveTo(63.376507, 68.45517, 63.440308, 67.657486, 63.50078, 66.92174);
        ((GeneralPath) shape).lineTo(63.25078, 66.92174);
        ((GeneralPath) shape).curveTo(63.20065, 66.268776, 63.181168, 65.599304, 63.34453, 65.10924);
        ((GeneralPath) shape).curveTo(63.557007, 64.471794, 63.875526, 63.673485, 63.96953, 63.015488);
        ((GeneralPath) shape).curveTo(64.08281, 62.22251, 64.19343, 59.34343, 63.96953, 58.671738);
        ((GeneralPath) shape).curveTo(63.921177, 58.526676, 63.690605, 58.3737, 63.53203, 58.452988);
        ((GeneralPath) shape).curveTo(63.356518, 58.54075, 63.311935, 58.797188, 63.12578, 58.859238);
        ((GeneralPath) shape).curveTo(62.91431, 58.92973, 60.418137, 58.682846, 60.40703, 58.671738);
        ((GeneralPath) shape).curveTo(60.308918, 58.573627, 60.40703, 58.37299, 60.40703, 58.234238);
        ((GeneralPath) shape).curveTo(60.40703, 57.4164, 60.972065, 57.94088, 61.46953, 57.609238);
        ((GeneralPath) shape).curveTo(61.632797, 57.50039, 61.712505, 57.311836, 61.87578, 57.202988);
        ((GeneralPath) shape).curveTo(62.13618, 57.02939, 62.287735, 57.410324, 62.50078, 56.984238);
        ((GeneralPath) shape).curveTo(63.233223, 55.519352, 60.71549, 51.88211, 60.00078, 50.952988);
        ((GeneralPath) shape).curveTo(58.002182, 48.354813, 53.323486, 43.877415, 50.00078, 43.046738);
        ((GeneralPath) shape).curveTo(49.468754, 42.91373, 48.707527, 43.046738, 48.15703, 43.046738);
        ((GeneralPath) shape).curveTo(47.7928, 43.046738, 47.393627, 42.965477, 47.03203, 42.984238);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x895D85));
        g.fill(shape);

        // _0_0_0_0_0_3_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(47.190765, 48.610233);
        ((GeneralPath) shape).curveTo(50.827255, 55.345543, 42.249077, 59.38905, 41.946007, 63.784218);
        ((GeneralPath) shape).curveTo(46.886986, 66.969444, 44.94861, 71.00371, 40.306477, 72.10051);
        ((GeneralPath) shape).curveTo(41.156918, 78.598434, 51.59971, 71.89883, 48.006218, 80.65884);
        ((GeneralPath) shape).curveTo(42.208946, 90.73026, 56.789257, 87.16943, 60.114906, 82.24595);
        ((GeneralPath) shape).curveTo(64.40873, 78.312614, 58.117657, 75.49999, 63.698467, 74.13813);
        ((GeneralPath) shape).curveTo(61.926117, 66.74273, 62.0934, 59.405373, 57.65365, 52.4432);
        ((GeneralPath) shape).curveTo(55.63117, 48.13479, 51.024147, 47.654594, 47.36599, 46.784595);

        g.setPaint(new Color(0xAA66B7));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.7876106f * origAlpha));

        // _0_0_0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.937944, 136.85808);
        ((GeneralPath) shape).lineTo(107.82411, 136.85808);
        ((GeneralPath) shape).lineTo(107.82411, 187.86835);
        ((GeneralPath) shape).lineTo(18.937943, 187.86835);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(new LinearGradientPaint(new Point2D.Double(57.019283294677734, 132.4290313720703), new Point2D.Double(55.3865852355957, 189.85377502441406), new float[]{0, 1}, new Color[]{BLACK, new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.2f, 1, 1, 4));
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.2418439f, 0, 0, 1, -5.451369f, 0));

        // _0_0_0_0_0_5

        // _0_0_0_0_0_5_0
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 0.38382488f, 221.75723f, 165.20058f));

        // _0_0_0_0_0_5_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.7876106f * origAlpha));

        // _0_0_0_0_0_5_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-186.73897, 11.896513);
        ((GeneralPath) shape).lineTo(-185.7582, 11.896513);
        ((GeneralPath) shape).lineTo(-185.7582, 48.92048);
        ((GeneralPath) shape).lineTo(-186.73897, 48.92048);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.1355733f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-189.53217, 11.928726);
        ((GeneralPath) shape).lineTo(-187.39401, 11.928726);
        ((GeneralPath) shape).lineTo(-187.39401, 48.888264);
        ((GeneralPath) shape).lineTo(-189.53217, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.2f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-196.32845, 11.928726);
        ((GeneralPath) shape).lineTo(-194.19029, 11.928726);
        ((GeneralPath) shape).lineTo(-194.19029, 48.888264);
        ((GeneralPath) shape).lineTo(-196.32845, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-199.15387, 11.928726);
        ((GeneralPath) shape).lineTo(-197.01572, 11.928726);
        ((GeneralPath) shape).lineTo(-197.01572, 48.888264);
        ((GeneralPath) shape).lineTo(-199.15387, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-178.72089, 11.896513);
        ((GeneralPath) shape).lineTo(-177.74011, 11.896513);
        ((GeneralPath) shape).lineTo(-177.74011, 48.92048);
        ((GeneralPath) shape).lineTo(-178.72089, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.1355733f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-172.99368, 11.896513);
        ((GeneralPath) shape).lineTo(-172.01291, 11.896513);
        ((GeneralPath) shape).lineTo(-172.01291, 48.92048);
        ((GeneralPath) shape).lineTo(-172.99368, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-175.78688, 11.928726);
        ((GeneralPath) shape).lineTo(-173.64873, 11.928726);
        ((GeneralPath) shape).lineTo(-173.64873, 48.888264);
        ((GeneralPath) shape).lineTo(-175.78688, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.2f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-182.58316, 11.928726);
        ((GeneralPath) shape).lineTo(-180.445, 11.928726);
        ((GeneralPath) shape).lineTo(-180.445, 48.888264);
        ((GeneralPath) shape).lineTo(-182.58316, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.40858, 11.928726);
        ((GeneralPath) shape).lineTo(-183.27043, 11.928726);
        ((GeneralPath) shape).lineTo(-183.27043, 48.888264);
        ((GeneralPath) shape).lineTo(-185.40858, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-164.9756, 11.896513);
        ((GeneralPath) shape).lineTo(-163.99483, 11.896513);
        ((GeneralPath) shape).lineTo(-163.99483, 48.92048);
        ((GeneralPath) shape).lineTo(-164.9756, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.1355733f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_0_5_0_0
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-1, 0, 0, 0.38382488f, -112.37364f, 165.20058f));

        // _0_0_0_0_0_5_0_1
        g.setComposite(AlphaComposite.getInstance(3, 0.7876106f * origAlpha));

        // _0_0_0_0_0_5_0_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-186.73897, 11.896513);
        ((GeneralPath) shape).lineTo(-185.7582, 11.896513);
        ((GeneralPath) shape).lineTo(-185.7582, 48.92048);
        ((GeneralPath) shape).lineTo(-186.73897, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-189.53217, 11.928726);
        ((GeneralPath) shape).lineTo(-187.39401, 11.928726);
        ((GeneralPath) shape).lineTo(-187.39401, 48.888264);
        ((GeneralPath) shape).lineTo(-189.53217, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.2f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-196.32845, 11.928726);
        ((GeneralPath) shape).lineTo(-194.19029, 11.928726);
        ((GeneralPath) shape).lineTo(-194.19029, 48.888264);
        ((GeneralPath) shape).lineTo(-196.32845, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-199.15387, 11.928726);
        ((GeneralPath) shape).lineTo(-197.01572, 11.928726);
        ((GeneralPath) shape).lineTo(-197.01572, 48.888264);
        ((GeneralPath) shape).lineTo(-199.15387, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-178.72089, 11.896513);
        ((GeneralPath) shape).lineTo(-177.74011, 11.896513);
        ((GeneralPath) shape).lineTo(-177.74011, 48.92048);
        ((GeneralPath) shape).lineTo(-178.72089, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.1355733f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-172.99368, 11.896513);
        ((GeneralPath) shape).lineTo(-172.01291, 11.896513);
        ((GeneralPath) shape).lineTo(-172.01291, 48.92048);
        ((GeneralPath) shape).lineTo(-172.99368, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-175.78688, 11.928726);
        ((GeneralPath) shape).lineTo(-173.64873, 11.928726);
        ((GeneralPath) shape).lineTo(-173.64873, 48.888264);
        ((GeneralPath) shape).lineTo(-175.78688, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.2f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-182.58316, 11.928726);
        ((GeneralPath) shape).lineTo(-180.445, 11.928726);
        ((GeneralPath) shape).lineTo(-180.445, 48.888264);
        ((GeneralPath) shape).lineTo(-182.58316, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.40858, 11.928726);
        ((GeneralPath) shape).lineTo(-183.27043, 11.928726);
        ((GeneralPath) shape).lineTo(-183.27043, 48.888264);
        ((GeneralPath) shape).lineTo(-185.40858, 48.888264);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_0_0_0_5_0_1_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-164.9756, 11.896513);
        ((GeneralPath) shape).lineTo(-163.99483, 11.896513);
        ((GeneralPath) shape).lineTo(-163.99483, 48.92048);
        ((GeneralPath) shape).lineTo(-164.9756, 48.92048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.1355733f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_0_5_0_1

        g.setTransform(transformations.poll()); // _0_0_0_0_0_5
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.9343073f, 0, 0, 1.0703117f, 0, 0));

        // _0_0_0_0_0_6

        // _0_0_0_0_0_6_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.112732, 146.07475);
        ((GeneralPath) shape).lineTo(24.112732, 136.71161);
        ((GeneralPath) shape).lineTo(30.88281, 136.71161);
        ((GeneralPath) shape).lineTo(30.88281, 137.81654);
        ((GeneralPath) shape).lineTo(25.351784, 137.81654);
        ((GeneralPath) shape).lineTo(25.351784, 140.68425);
        ((GeneralPath) shape).lineTo(30.531532, 140.68425);
        ((GeneralPath) shape).lineTo(30.531532, 141.78279);
        ((GeneralPath) shape).lineTo(25.351784, 141.78279);
        ((GeneralPath) shape).lineTo(25.351784, 144.96985);
        ((GeneralPath) shape).lineTo(31.099962, 144.96985);
        ((GeneralPath) shape).lineTo(31.099962, 146.07477);
        ((GeneralPath) shape).lineTo(24.112732, 146.07477);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.77332, 146.07475);
        ((GeneralPath) shape).lineTo(32.77332, 136.71161);
        ((GeneralPath) shape).lineTo(34.01237, 136.71161);
        ((GeneralPath) shape).lineTo(34.01237, 144.96983);
        ((GeneralPath) shape).lineTo(38.623688, 144.96983);
        ((GeneralPath) shape).lineTo(38.623688, 146.07475);
        ((GeneralPath) shape).lineTo(32.77332, 146.07475);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(40.054348, 146.07475);
        ((GeneralPath) shape).lineTo(40.054348, 136.71161);
        ((GeneralPath) shape).lineTo(43.567123, 136.71161);
        ((GeneralPath) shape).quadTo(44.640118, 136.71161, 45.28519, 136.99902);
        ((GeneralPath) shape).quadTo(45.93665, 137.28004, 46.3007, 137.87402);
        ((GeneralPath) shape).quadTo(46.67114, 138.46161, 46.67114, 139.10669);
        ((GeneralPath) shape).quadTo(46.67114, 139.70706, 46.34541, 140.23717);
        ((GeneralPath) shape).quadTo(46.01968, 140.76727, 45.36183, 141.093);
        ((GeneralPath) shape).quadTo(46.211285, 141.34209, 46.664753, 141.94246);
        ((GeneralPath) shape).quadTo(47.124607, 142.54283, 47.124607, 143.36034);
        ((GeneralPath) shape).quadTo(47.124607, 144.01819, 46.843586, 144.58661);
        ((GeneralPath) shape).quadTo(46.56895, 145.14867, 46.16019, 145.45523);
        ((GeneralPath) shape).quadTo(45.75143, 145.7618, 45.131905, 145.92148);
        ((GeneralPath) shape).quadTo(44.518764, 146.07475, 43.624603, 146.07475);
        ((GeneralPath) shape).lineTo(40.054344, 146.07475);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(41.2934, 140.64592);
        ((GeneralPath) shape).lineTo(43.318035, 140.64592);
        ((GeneralPath) shape).quadTo(44.14194, 140.64592, 44.499603, 140.53734);
        ((GeneralPath) shape).quadTo(44.972233, 140.39684, 45.208546, 140.07109);
        ((GeneralPath) shape).quadTo(45.45125, 139.74536, 45.45125, 139.25357);
        ((GeneralPath) shape).quadTo(45.45125, 138.78732, 45.227707, 138.43605);
        ((GeneralPath) shape).quadTo(45.004166, 138.07838, 44.58902, 137.95065);
        ((GeneralPath) shape).quadTo(44.173874, 137.81653, 43.16475, 137.81653);
        ((GeneralPath) shape).lineTo(41.2934, 137.81653);
        ((GeneralPath) shape).lineTo(41.2934, 140.6459);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(41.2934, 144.96983);
        ((GeneralPath) shape).lineTo(43.624607, 144.96983);
        ((GeneralPath) shape).quadTo(44.22497, 144.96983, 44.467674, 144.92514);
        ((GeneralPath) shape).quadTo(44.895596, 144.84843, 45.183002, 144.66966);
        ((GeneralPath) shape).quadTo(45.470413, 144.49083, 45.655632, 144.15233);
        ((GeneralPath) shape).quadTo(45.84085, 143.80743, 45.84085, 143.36035);
        ((GeneralPath) shape).quadTo(45.84085, 142.83662, 45.5726, 142.45341);
        ((GeneralPath) shape).quadTo(45.30435, 142.06381, 44.825336, 141.91054);
        ((GeneralPath) shape).quadTo(44.352707, 141.75085, 43.458546, 141.75085);
        ((GeneralPath) shape).lineTo(41.2934, 141.75085);
        ((GeneralPath) shape).lineTo(41.2934, 144.96985);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(48.376434, 141.45705);
        ((GeneralPath) shape).quadTo(48.376434, 139.79646, 48.71494, 138.78734);
        ((GeneralPath) shape).quadTo(49.05983, 137.77184, 49.73045, 137.22256);
        ((GeneralPath) shape).quadTo(50.40746, 136.6733, 51.429356, 136.6733);
        ((GeneralPath) shape).quadTo(52.183006, 136.6733, 52.75144, 136.97986);
        ((GeneralPath) shape).quadTo(53.31987, 137.28004, 53.690308, 137.85486);
        ((GeneralPath) shape).quadTo(54.060745, 138.4233, 54.27151, 139.2472);
        ((GeneralPath) shape).quadTo(54.482277, 140.06471, 54.482277, 141.45705);
        ((GeneralPath) shape).quadTo(54.482277, 143.10486, 54.143772, 144.12036);
        ((GeneralPath) shape).quadTo(53.805267, 145.12949, 53.12826, 145.68513);
        ((GeneralPath) shape).quadTo(52.45764, 146.2344, 51.429356, 146.2344);
        ((GeneralPath) shape).quadTo(50.07534, 146.2344, 49.30253, 145.26361);
        ((GeneralPath) shape).quadTo(48.376434, 144.09482, 48.376434, 141.45705);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(49.558006, 141.45705);
        ((GeneralPath) shape).quadTo(49.558006, 143.76271, 50.0945, 144.52913);
        ((GeneralPath) shape).quadTo(50.637386, 145.28917, 51.429356, 145.28917);
        ((GeneralPath) shape).quadTo(52.22133, 145.28917, 52.757824, 144.52274);
        ((GeneralPath) shape).quadTo(53.30071, 143.75632, 53.30071, 141.45705);
        ((GeneralPath) shape).quadTo(53.30071, 139.14499, 52.757824, 138.38496);
        ((GeneralPath) shape).quadTo(52.22133, 137.62492, 51.41658, 137.62492);
        ((GeneralPath) shape).quadTo(50.624607, 137.62492, 50.15198, 138.29555);
        ((GeneralPath) shape).quadTo(49.558002, 139.15138, 49.558002, 141.45705);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.65746, 141.45705);
        ((GeneralPath) shape).quadTo(55.65746, 139.79646, 55.995964, 138.78734);
        ((GeneralPath) shape).quadTo(56.340855, 137.77184, 57.011475, 137.22256);
        ((GeneralPath) shape).quadTo(57.688484, 136.6733, 58.71038, 136.6733);
        ((GeneralPath) shape).quadTo(59.46403, 136.6733, 60.032463, 136.97986);
        ((GeneralPath) shape).quadTo(60.600895, 137.28004, 60.971333, 137.85486);
        ((GeneralPath) shape).quadTo(61.34177, 138.4233, 61.552536, 139.2472);
        ((GeneralPath) shape).quadTo(61.7633, 140.06471, 61.7633, 141.45705);
        ((GeneralPath) shape).quadTo(61.7633, 143.10486, 61.424797, 144.12036);
        ((GeneralPath) shape).quadTo(61.086292, 145.12949, 60.409286, 145.68513);
        ((GeneralPath) shape).quadTo(59.738667, 146.2344, 58.71038, 146.2344);
        ((GeneralPath) shape).quadTo(57.356365, 146.2344, 56.583553, 145.26361);
        ((GeneralPath) shape).quadTo(55.657455, 144.09482, 55.657455, 141.45705);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(56.83903, 141.45705);
        ((GeneralPath) shape).quadTo(56.83903, 143.76271, 57.375526, 144.52913);
        ((GeneralPath) shape).quadTo(57.91841, 145.28917, 58.71038, 145.28917);
        ((GeneralPath) shape).quadTo(59.502354, 145.28917, 60.03885, 144.52274);
        ((GeneralPath) shape).quadTo(60.581734, 143.75632, 60.581734, 141.45705);
        ((GeneralPath) shape).quadTo(60.581734, 139.14499, 60.03885, 138.38496);
        ((GeneralPath) shape).quadTo(59.502354, 137.62492, 58.69761, 137.62492);
        ((GeneralPath) shape).quadTo(57.905636, 137.62492, 57.43301, 138.29555);
        ((GeneralPath) shape).quadTo(56.83903, 139.15138, 56.83903, 141.45705);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.110935, 143.9096);
        ((GeneralPath) shape).lineTo(64.21586, 143.80742);
        ((GeneralPath) shape).quadTo(64.35637, 144.58661, 64.75236, 144.93788);
        ((GeneralPath) shape).quadTo(65.148346, 145.28915, 65.76787, 145.28915);
        ((GeneralPath) shape).quadTo(66.29798, 145.28915, 66.69396, 145.04645);
        ((GeneralPath) shape).quadTo(67.09634, 144.80374, 67.35181, 144.40137);
        ((GeneralPath) shape).quadTo(67.607285, 143.99261, 67.779724, 143.30283);
        ((GeneralPath) shape).quadTo(67.95217, 142.61305, 67.95217, 141.89772);
        ((GeneralPath) shape).quadTo(67.95217, 141.82112, 67.94577, 141.6678);
        ((GeneralPath) shape).quadTo(67.600876, 142.21707, 67.00051, 142.56197);
        ((GeneralPath) shape).quadTo(66.40653, 142.90047, 65.710365, 142.90047);
        ((GeneralPath) shape).quadTo(64.54796, 142.90047, 63.74321, 142.0574);
        ((GeneralPath) shape).quadTo(62.938465, 141.21434, 62.938465, 139.83478);
        ((GeneralPath) shape).quadTo(62.938465, 138.4105, 63.775146, 137.5419);
        ((GeneralPath) shape).quadTo(64.61821, 136.6733, 65.88281, 136.6733);
        ((GeneralPath) shape).quadTo(66.796135, 136.6733, 67.54978, 137.16507);
        ((GeneralPath) shape).quadTo(68.30982, 137.65686, 68.69942, 138.57019);
        ((GeneralPath) shape).quadTo(69.095406, 139.47713, 69.095406, 141.20157);
        ((GeneralPath) shape).quadTo(69.095406, 142.99628, 68.7058, 144.06288);
        ((GeneralPath) shape).quadTo(68.3162, 145.12311, 67.543396, 145.67876);
        ((GeneralPath) shape).quadTo(66.77697, 146.2344, 65.7423, 146.2344);
        ((GeneralPath) shape).quadTo(64.64376, 146.2344, 63.947594, 145.62766);
        ((GeneralPath) shape).quadTo(63.251427, 145.01451, 63.110916, 143.90959);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(67.818054, 139.7773);
        ((GeneralPath) shape).quadTo(67.818054, 138.78734, 67.28794, 138.20613);
        ((GeneralPath) shape).quadTo(66.76422, 137.62492, 66.02334, 137.62492);
        ((GeneralPath) shape).quadTo(65.25691, 137.62492, 64.688484, 138.25084);
        ((GeneralPath) shape).quadTo(64.120056, 138.87675, 64.120056, 139.87311);
        ((GeneralPath) shape).quadTo(64.120056, 140.76727, 64.656555, 141.32932);
        ((GeneralPath) shape).quadTo(65.19944, 141.88498, 65.99141, 141.88498);
        ((GeneralPath) shape).quadTo(66.789764, 141.88498, 67.30072, 141.32932);
        ((GeneralPath) shape).quadTo(67.818054, 140.76727, 67.818054, 139.7773);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.21951, 141.45705);
        ((GeneralPath) shape).quadTo(70.21951, 139.79646, 70.558014, 138.78734);
        ((GeneralPath) shape).quadTo(70.90291, 137.77184, 71.573524, 137.22256);
        ((GeneralPath) shape).quadTo(72.250534, 136.6733, 73.27243, 136.6733);
        ((GeneralPath) shape).quadTo(74.02608, 136.6733, 74.59451, 136.97986);
        ((GeneralPath) shape).quadTo(75.16294, 137.28004, 75.53338, 137.85486);
        ((GeneralPath) shape).quadTo(75.90382, 138.4233, 76.114586, 139.2472);
        ((GeneralPath) shape).quadTo(76.325356, 140.06471, 76.325356, 141.45705);
        ((GeneralPath) shape).quadTo(76.325356, 143.10486, 75.986855, 144.12036);
        ((GeneralPath) shape).quadTo(75.64835, 145.12949, 74.971344, 145.68513);
        ((GeneralPath) shape).quadTo(74.30072, 146.2344, 73.27244, 146.2344);
        ((GeneralPath) shape).quadTo(71.91842, 146.2344, 71.145615, 145.26361);
        ((GeneralPath) shape).quadTo(70.21952, 144.09482, 70.21952, 141.45705);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(71.401085, 141.45705);
        ((GeneralPath) shape).quadTo(71.401085, 143.76271, 71.937584, 144.52913);
        ((GeneralPath) shape).quadTo(72.48047, 145.28917, 73.27244, 145.28917);
        ((GeneralPath) shape).quadTo(74.06441, 145.28917, 74.60091, 144.52274);
        ((GeneralPath) shape).quadTo(75.14379, 143.75632, 75.14379, 141.45705);
        ((GeneralPath) shape).quadTo(75.14379, 139.14499, 74.60091, 138.38496);
        ((GeneralPath) shape).quadTo(74.06441, 137.62492, 73.25967, 137.62492);
        ((GeneralPath) shape).quadTo(72.4677, 137.62492, 71.99506, 138.29555);
        ((GeneralPath) shape).quadTo(71.401085, 139.15138, 71.401085, 141.45705);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.37281, 143.26453);
        ((GeneralPath) shape).lineTo(77.37281, 142.1085);
        ((GeneralPath) shape).lineTo(80.90475, 142.1085);
        ((GeneralPath) shape).lineTo(80.90475, 143.26453);
        ((GeneralPath) shape).lineTo(77.37281, 143.26453);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(81.86916, 141.45705);
        ((GeneralPath) shape).quadTo(81.86916, 139.79646, 82.207664, 138.78734);
        ((GeneralPath) shape).quadTo(82.55255, 137.77184, 83.223175, 137.22256);
        ((GeneralPath) shape).quadTo(83.900185, 136.6733, 84.92208, 136.6733);
        ((GeneralPath) shape).quadTo(85.67573, 136.6733, 86.24416, 136.97986);
        ((GeneralPath) shape).quadTo(86.81259, 137.28004, 87.18303, 137.85486);
        ((GeneralPath) shape).quadTo(87.55347, 138.4233, 87.76424, 139.2472);
        ((GeneralPath) shape).quadTo(87.975006, 140.06471, 87.975006, 141.45705);
        ((GeneralPath) shape).quadTo(87.975006, 143.10486, 87.636505, 144.12036);
        ((GeneralPath) shape).quadTo(87.298004, 145.12949, 86.620995, 145.68513);
        ((GeneralPath) shape).quadTo(85.95037, 146.2344, 84.92209, 146.2344);
        ((GeneralPath) shape).quadTo(83.56807, 146.2344, 82.795265, 145.26361);
        ((GeneralPath) shape).quadTo(81.86917, 144.09482, 81.86917, 141.45705);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(83.050735, 141.45705);
        ((GeneralPath) shape).quadTo(83.050735, 143.76271, 83.587234, 144.52913);
        ((GeneralPath) shape).quadTo(84.13012, 145.28917, 84.92209, 145.28917);
        ((GeneralPath) shape).quadTo(85.71406, 145.28917, 86.25056, 144.52274);
        ((GeneralPath) shape).quadTo(86.79344, 143.75632, 86.79344, 141.45705);
        ((GeneralPath) shape).quadTo(86.79344, 139.14499, 86.25056, 138.38496);
        ((GeneralPath) shape).quadTo(85.71406, 137.62492, 84.90932, 137.62492);
        ((GeneralPath) shape).quadTo(84.11735, 137.62492, 83.644714, 138.29555);
        ((GeneralPath) shape).quadTo(83.050735, 139.15138, 83.050735, 141.45705);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(89.150185, 141.45705);
        ((GeneralPath) shape).quadTo(89.150185, 139.79646, 89.488686, 138.78734);
        ((GeneralPath) shape).quadTo(89.83357, 137.77184, 90.504196, 137.22256);
        ((GeneralPath) shape).quadTo(91.181206, 136.6733, 92.2031, 136.6733);
        ((GeneralPath) shape).quadTo(92.95675, 136.6733, 93.525185, 136.97986);
        ((GeneralPath) shape).quadTo(94.09361, 137.28004, 94.46405, 137.85486);
        ((GeneralPath) shape).quadTo(94.83449, 138.4233, 95.04526, 139.2472);
        ((GeneralPath) shape).quadTo(95.25603, 140.06471, 95.25603, 141.45705);
        ((GeneralPath) shape).quadTo(95.25603, 143.10486, 94.91753, 144.12036);
        ((GeneralPath) shape).quadTo(94.579025, 145.12949, 93.902016, 145.68513);
        ((GeneralPath) shape).quadTo(93.23139, 146.2344, 92.20311, 146.2344);
        ((GeneralPath) shape).quadTo(90.84909, 146.2344, 90.07629, 145.26361);
        ((GeneralPath) shape).quadTo(89.15019, 144.09482, 89.15019, 141.45705);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(90.33176, 141.45705);
        ((GeneralPath) shape).quadTo(90.33176, 143.76271, 90.868256, 144.52913);
        ((GeneralPath) shape).quadTo(91.41114, 145.28917, 92.20311, 145.28917);
        ((GeneralPath) shape).quadTo(92.99508, 145.28917, 93.53158, 144.52274);
        ((GeneralPath) shape).quadTo(94.07446, 143.75632, 94.07446, 141.45705);
        ((GeneralPath) shape).quadTo(94.07446, 139.14499, 93.53158, 138.38496);
        ((GeneralPath) shape).quadTo(92.99508, 137.62492, 92.19034, 137.62492);
        ((GeneralPath) shape).quadTo(91.39837, 137.62492, 90.925735, 138.29555);
        ((GeneralPath) shape).quadTo(90.33176, 139.15138, 90.33176, 141.45705);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(96.43121, 141.45705);
        ((GeneralPath) shape).quadTo(96.43121, 139.79646, 96.769714, 138.78734);
        ((GeneralPath) shape).quadTo(97.11461, 137.77184, 97.785225, 137.22256);
        ((GeneralPath) shape).quadTo(98.462234, 136.6733, 99.48413, 136.6733);
        ((GeneralPath) shape).quadTo(100.237785, 136.6733, 100.80621, 136.97986);
        ((GeneralPath) shape).quadTo(101.37464, 137.28004, 101.74509, 137.85486);
        ((GeneralPath) shape).quadTo(102.115524, 138.4233, 102.32629, 139.2472);
        ((GeneralPath) shape).quadTo(102.537056, 140.06471, 102.537056, 141.45705);
        ((GeneralPath) shape).quadTo(102.537056, 143.10486, 102.19855, 144.12036);
        ((GeneralPath) shape).quadTo(101.86005, 145.12949, 101.18304, 145.68513);
        ((GeneralPath) shape).quadTo(100.51241, 146.2344, 99.48413, 146.2344);
        ((GeneralPath) shape).quadTo(98.13012, 146.2344, 97.35731, 145.26361);
        ((GeneralPath) shape).quadTo(96.43121, 144.09482, 96.43121, 141.45705);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(97.612785, 141.45705);
        ((GeneralPath) shape).quadTo(97.612785, 143.76271, 98.149284, 144.52913);
        ((GeneralPath) shape).quadTo(98.69217, 145.28917, 99.48414, 145.28917);
        ((GeneralPath) shape).quadTo(100.276115, 145.28917, 100.8126, 144.52274);
        ((GeneralPath) shape).quadTo(101.35549, 143.75632, 101.35549, 141.45705);
        ((GeneralPath) shape).quadTo(101.35549, 139.14499, 100.8126, 138.38496);
        ((GeneralPath) shape).quadTo(100.27611, 137.62492, 99.47136, 137.62492);
        ((GeneralPath) shape).quadTo(98.67939, 137.62492, 98.20676, 138.29555);
        ((GeneralPath) shape).quadTo(97.61278, 139.15138, 97.61278, 141.45705);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_0_0_6_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(103.88469, 143.9096);
        ((GeneralPath) shape).lineTo(104.98962, 143.80742);
        ((GeneralPath) shape).quadTo(105.13013, 144.58661, 105.52611, 144.93788);
        ((GeneralPath) shape).quadTo(105.9221, 145.28915, 106.54162, 145.28915);
        ((GeneralPath) shape).quadTo(107.07173, 145.28915, 107.46772, 145.04645);
        ((GeneralPath) shape).quadTo(107.87009, 144.80374, 108.12557, 144.40137);
        ((GeneralPath) shape).quadTo(108.38104, 143.99261, 108.55349, 143.30283);
        ((GeneralPath) shape).quadTo(108.72593, 142.61305, 108.72593, 141.89772);
        ((GeneralPath) shape).quadTo(108.72593, 141.82112, 108.71993, 141.6678);
        ((GeneralPath) shape).quadTo(108.375046, 142.21707, 107.77467, 142.56197);
        ((GeneralPath) shape).quadTo(107.180695, 142.90047, 106.48452, 142.90047);
        ((GeneralPath) shape).quadTo(105.32211, 142.90047, 104.51737, 142.0574);
        ((GeneralPath) shape).quadTo(103.71262, 141.21434, 103.71262, 139.83478);
        ((GeneralPath) shape).quadTo(103.71262, 138.4105, 104.5493, 137.5419);
        ((GeneralPath) shape).quadTo(105.39237, 136.6733, 106.656975, 136.6733);
        ((GeneralPath) shape).quadTo(107.5703, 136.6733, 108.323944, 137.16507);
        ((GeneralPath) shape).quadTo(109.083984, 137.65686, 109.47359, 138.57019);
        ((GeneralPath) shape).quadTo(109.86957, 139.47713, 109.86957, 141.20157);
        ((GeneralPath) shape).quadTo(109.86957, 142.99628, 109.479965, 144.06288);
        ((GeneralPath) shape).quadTo(109.09036, 145.12311, 108.31756, 145.67876);
        ((GeneralPath) shape).quadTo(107.55114, 146.2344, 106.51647, 146.2344);
        ((GeneralPath) shape).quadTo(105.41793, 146.2344, 104.72176, 145.62766);
        ((GeneralPath) shape).quadTo(104.0256, 145.01451, 103.885086, 143.90959);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(108.59181, 139.7773);
        ((GeneralPath) shape).quadTo(108.59181, 138.78734, 108.0617, 138.20613);
        ((GeneralPath) shape).quadTo(107.53798, 137.62492, 106.7971, 137.62492);
        ((GeneralPath) shape).quadTo(106.03068, 137.62492, 105.462234, 138.25084);
        ((GeneralPath) shape).quadTo(104.89381, 138.87675, 104.89381, 139.87311);
        ((GeneralPath) shape).quadTo(104.89381, 140.76727, 105.430305, 141.32932);
        ((GeneralPath) shape).quadTo(105.97318, 141.88498, 106.76517, 141.88498);
        ((GeneralPath) shape).quadTo(107.563515, 141.88498, 108.07447, 141.32932);
        ((GeneralPath) shape).quadTo(108.59181, 140.76727, 108.59181, 139.7773);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_0_6
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-0.7411137f, 0, 0, 0.70401704f, 97.239876f, 68.878204f));

        // _0_0_0_0_0_7

        // _0_0_0_0_0_7_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(47.032032, 42.984238);
        ((GeneralPath) shape).curveTo(46.9115, 42.99054, 46.80502, 43.013386, 46.688282, 43.046738);
        ((GeneralPath) shape).curveTo(46.100063, 43.214798, 43.872826, 44.405834, 43.563282, 44.921738);
        ((GeneralPath) shape).curveTo(43.072773, 45.739254, 44.14471, 50.572273, 44.407032, 51.359238);
        ((GeneralPath) shape).curveTo(44.734028, 52.340225, 46.004692, 55.445168, 45.438282, 56.577988);
        ((GeneralPath) shape).curveTo(45.17401, 57.10653, 40.59938, 56.534706, 39.813282, 56.796738);
        ((GeneralPath) shape).curveTo(39.566742, 56.878918, 39.422318, 57.304718, 39.188282, 57.421738);
        ((GeneralPath) shape).curveTo(36.475513, 58.778122, 36.06012, 60.656464, 38.157032, 63.015488);
        ((GeneralPath) shape).curveTo(38.92808, 63.88292, 39.53362, 64.36906, 40.438282, 65.10924);
        ((GeneralPath) shape).curveTo(41.237274, 65.76296, 42.07063, 66.42646, 42.938282, 66.98424);
        ((GeneralPath) shape).curveTo(42.946682, 66.98964, 43.06471, 67.07576, 43.157032, 67.14049);
        ((GeneralPath) shape).curveTo(42.28938, 67.698265, 41.456024, 68.36176, 40.657032, 69.01549);
        ((GeneralPath) shape).curveTo(39.75237, 69.75567, 39.14683, 70.241806, 38.375782, 71.10924);
        ((GeneralPath) shape).curveTo(36.27887, 73.46826, 36.694263, 75.3466, 39.407032, 76.70299);
        ((GeneralPath) shape).curveTo(39.641068, 76.82001, 39.785492, 77.245804, 40.032032, 77.32799);
        ((GeneralPath) shape).curveTo(40.81813, 77.59002, 45.39276, 77.018196, 45.657032, 77.54674);
        ((GeneralPath) shape).curveTo(46.223442, 78.67956, 44.952778, 81.7845, 44.625782, 82.76549);
        ((GeneralPath) shape).curveTo(44.36346, 83.55245, 43.291523, 88.385475, 43.782032, 89.20299);
        ((GeneralPath) shape).curveTo(44.091576, 89.718895, 46.318813, 90.90993, 46.907032, 91.07799);
        ((GeneralPath) shape).curveTo(47.02377, 91.111336, 47.13025, 91.134186, 47.250782, 91.14049);
        ((GeneralPath) shape).curveTo(47.61238, 91.15925, 48.011555, 91.07799, 48.375782, 91.07799);
        ((GeneralPath) shape).curveTo(48.92628, 91.07799, 49.687508, 91.21099, 50.219532, 91.07799);
        ((GeneralPath) shape).curveTo(53.542244, 90.24731, 58.220936, 85.76991, 60.219532, 83.17174);
        ((GeneralPath) shape).curveTo(60.934242, 82.242615, 63.451977, 78.60538, 62.719532, 77.14049);
        ((GeneralPath) shape).curveTo(62.50649, 76.7144, 62.354935, 77.09534, 62.094532, 76.92174);
        ((GeneralPath) shape).curveTo(61.93126, 76.81289, 61.85155, 76.62434, 61.688282, 76.51549);
        ((GeneralPath) shape).curveTo(61.19082, 76.183846, 60.625782, 76.70833, 60.625782, 75.89049);
        ((GeneralPath) shape).curveTo(60.625782, 75.75173, 60.52767, 75.551094, 60.625782, 75.45299);
        ((GeneralPath) shape).curveTo(60.63689, 75.44188, 63.133064, 75.195, 63.344532, 75.26549);
        ((GeneralPath) shape).curveTo(63.53069, 75.32754, 63.57527, 75.58398, 63.750782, 75.67174);
        ((GeneralPath) shape).curveTo(63.90936, 75.75103, 64.13993, 75.598045, 64.18828, 75.45299);
        ((GeneralPath) shape).curveTo(64.41218, 74.781296, 64.30156, 71.902214, 64.18828, 71.10924);
        ((GeneralPath) shape).curveTo(64.09428, 70.45124, 63.775757, 69.65293, 63.56328, 69.01549);
        ((GeneralPath) shape).curveTo(63.376507, 68.45517, 63.440308, 67.657486, 63.50078, 66.92174);
        ((GeneralPath) shape).lineTo(63.25078, 66.92174);
        ((GeneralPath) shape).curveTo(63.20065, 66.268776, 63.181168, 65.599304, 63.34453, 65.10924);
        ((GeneralPath) shape).curveTo(63.557007, 64.471794, 63.875526, 63.673485, 63.96953, 63.015488);
        ((GeneralPath) shape).curveTo(64.08281, 62.22251, 64.19343, 59.34343, 63.96953, 58.671738);
        ((GeneralPath) shape).curveTo(63.921177, 58.526676, 63.690605, 58.3737, 63.53203, 58.452988);
        ((GeneralPath) shape).curveTo(63.356518, 58.54075, 63.311935, 58.797188, 63.12578, 58.859238);
        ((GeneralPath) shape).curveTo(62.91431, 58.92973, 60.418137, 58.682846, 60.40703, 58.671738);
        ((GeneralPath) shape).curveTo(60.308918, 58.573627, 60.40703, 58.37299, 60.40703, 58.234238);
        ((GeneralPath) shape).curveTo(60.40703, 57.4164, 60.972065, 57.94088, 61.46953, 57.609238);
        ((GeneralPath) shape).curveTo(61.632797, 57.50039, 61.712505, 57.311836, 61.87578, 57.202988);
        ((GeneralPath) shape).curveTo(62.13618, 57.02939, 62.287735, 57.410324, 62.50078, 56.984238);
        ((GeneralPath) shape).curveTo(63.233223, 55.519352, 60.71549, 51.88211, 60.00078, 50.952988);
        ((GeneralPath) shape).curveTo(58.002182, 48.354813, 53.323486, 43.877415, 50.00078, 43.046738);
        ((GeneralPath) shape).curveTo(49.468754, 42.91373, 48.707527, 43.046738, 48.15703, 43.046738);
        ((GeneralPath) shape).curveTo(47.7928, 43.046738, 47.393627, 42.965477, 47.03203, 42.984238);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x895D85));
        g.fill(shape);

        // _0_0_0_0_0_7_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(47.190765, 48.610233);
        ((GeneralPath) shape).curveTo(50.827255, 55.345543, 42.249077, 59.38905, 41.946007, 63.784218);
        ((GeneralPath) shape).curveTo(46.886986, 66.969444, 44.94861, 71.00371, 40.306477, 72.10051);
        ((GeneralPath) shape).curveTo(41.156918, 78.598434, 51.59971, 71.89883, 48.006218, 80.65884);
        ((GeneralPath) shape).curveTo(42.208946, 90.73026, 56.789257, 87.16943, 60.114906, 82.24595);
        ((GeneralPath) shape).curveTo(64.40873, 78.312614, 58.117657, 75.49999, 63.698467, 74.13813);
        ((GeneralPath) shape).curveTo(61.926117, 66.74273, 62.0934, 59.405373, 57.65365, 52.4432);
        ((GeneralPath) shape).curveTo(55.63117, 48.13479, 51.024147, 47.654594, 47.36599, 46.784595);

        g.setPaint(new Color(0xAA66B7));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_0_7

        g.setTransform(transformations.poll()); // _0_0_0_0_0
        g.setComposite(AlphaComposite.getInstance(3, 0.8317757f * origAlpha));

        // _0_0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-82.23669, 384.0046);
        ((GeneralPath) shape).curveTo(-74.02697, 387.35513, -71.22149, 388.13153, -62.839336, 388.44983);
        ((GeneralPath) shape).curveTo(-59.60807, 388.57254, -45.05807, 383.0772, -41.82554, 382.99432);
        ((GeneralPath) shape).curveTo(-41.82554, 382.99432, -35.251312, 392.28873, -22.248293, 408.0675);
        ((GeneralPath) shape).curveTo(-21.674574, 408.7637, -17.653267, 406.43466, -18.47026, 409.76712);
        ((GeneralPath) shape).curveTo(-21.5482, 422.32187, 0.39063454, 435.32227, 8.688396, 442.19666);
        ((GeneralPath) shape).curveTo(8.9680605, 442.0848, 9.34165, 442.05084, 9.496619, 441.79254);
        ((GeneralPath) shape).curveTo(11.55141, 438.3679, 9.318036, 441.31802, 9.900731, 439.56995);
        ((GeneralPath) shape).curveTo(10.177815, 438.7387, 11.39909, 435.96024, 11.921289, 435.12473);
        ((GeneralPath) shape).curveTo(14.00197, 431.79562, 18.791183, 424.41577, 18.791183, 424.41577);
        ((GeneralPath) shape).curveTo(18.791183, 424.41577, -2.5305882, 401.37628, -13.739792, 395.11768);
        ((GeneralPath) shape).curveTo(-15.983011, 393.84976, -18.270996, 390.93686, -20.40763, 389.25806);
        ((GeneralPath) shape).curveTo(-27.763058, 383.4788, -25.405857, 385.22177, -35.763866, 379.5594);
        ((GeneralPath) shape).curveTo(-37.429123, 378.64905, -39.01481, 377.5328, -40.815258, 376.93265);
        ((GeneralPath) shape).curveTo(-41.342155, 376.75702, -41.885265, 377.2374, -42.431705, 377.33676);
        ((GeneralPath) shape).curveTo(-44.353188, 377.68613, -40.827423, 375.88684, -45.46254, 377.74088);
        ((GeneralPath) shape).curveTo(-47.61613, 378.60233, -49.651653, 379.7344, -51.72627, 380.77173);
        ((GeneralPath) shape).curveTo(-52.209805, 381.0135, -52.789875, 381.422, -53.342716, 381.57996);
        ((GeneralPath) shape).curveTo(-60.52495, 383.63202, -73.77479, 385.41495, -82.23669, 384.00464);
        ((GeneralPath) shape).closePath();

        g.setPaint(GRAY);
        g.fill(shape);
        g.setPaint(new Color(0x4D4D4D));
        g.setStroke(new BasicStroke(1, 0, 0, 4));
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_0_2
        g.setComposite(AlphaComposite.getInstance(3, 0.75543475f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.9869871f, 0, 0, 0.9786287f, -104.57089f, 310.82358f));

        // _0_0_0_0_2_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.4074473, 40.999996);
        ((GeneralPath) shape).curveTo(5.4074473, 60.095108, 20.90493, 75.59259, 40.000042, 75.59259);
        ((GeneralPath) shape).curveTo(59.095154, 75.59259, 74.592636, 60.095108, 74.592636, 41.0);
        ((GeneralPath) shape).curveTo(74.592636, 21.90489, 59.09515, 6.4074097, 40.000042, 6.4074097);
        ((GeneralPath) shape).curveTo(20.904932, 6.4074097, 5.407448, 21.904892, 5.407448, 41.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.964609f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_0
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-1.031111f, -0.03792996f, 0.04966593f, -1.343636f, -27.29818f, 385.25446f));

        // _0_0_0_0_2_1

        // _0_0_0_0_2_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.622763, 14.273311);
        ((GeneralPath) shape).curveTo(16.52386, 6.082676, 26.348398, 1.7526093, 37.11637, 1.7526093);
        ((GeneralPath) shape).curveTo(47.884342, 1.7526093, 58.408875, 7.2008324, 64.4136, 14.980124);
        ((GeneralPath) shape).curveTo(64.4136, 14.980124, 64.4136, 14.980124, 64.4136, 14.980124);

        g.setPaint(new LinearGradientPaint(new Point2D.Double(34.84189224243164, -7.142457962036133), new Point2D.Double(35.56138610839844, 11.415727615356445), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.414f, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_2_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.622763, 14.573311);
        ((GeneralPath) shape).curveTo(16.52386, 6.382676, 26.348398, 2.0526092, 37.11637, 2.0526092);
        ((GeneralPath) shape).curveTo(47.884342, 2.0526092, 58.408875, 7.5008326, 64.4136, 15.280125);
        ((GeneralPath) shape).curveTo(64.4136, 15.280125, 64.4136, 15.280125, 64.4136, 15.280125);

        g.setStroke(new BasicStroke(0.914f, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_0_2_1_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.622763, 14.473311);
        ((GeneralPath) shape).curveTo(16.52386, 6.282676, 26.348398, 1.9526092, 37.11637, 1.9526092);
        ((GeneralPath) shape).curveTo(47.884342, 1.9526092, 58.408875, 7.400832, 64.4136, 15.180124);
        ((GeneralPath) shape).curveTo(64.4136, 15.180124, 64.4136, 15.180124, 64.4136, 15.180124);

        g.setStroke(new BasicStroke(0.614f, 0, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_1

        // _0_0_0_0_2_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-38.2843, 385.23026);
        ((GeneralPath) shape).curveTo(-34.345966, 381.9329, -31.123833, 378.31146, -28.512672, 374.2585);
        ((GeneralPath) shape).curveTo(-7.1107903, 392.80756, 5.342369, 404.57028, 22.90857, 419.94122);
        ((GeneralPath) shape).curveTo(19.608889, 424.5353, 15.776389, 428.30542, 12.043579, 431.88416);
        ((GeneralPath) shape).curveTo(-4.7963295, 415.69806, -11.756073, 410.95172, -38.284306, 385.23026);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(91.89352416992188, 98.32296752929688), new Point2D.Double(102.63838958740234, 87.5781021118164), new float[]{0, 1}, new Color[]{new Color(0x363636), new Color(0xB3B3B3)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 1, -105.09141f, 309.8842f)));
        g.fill(shape);
        g.setPaint(new Color(0x71171717, true));
        g.setStroke(new BasicStroke(1, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_2_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-30.827559, 377.5197);
        ((GeneralPath) shape).lineTo(-34.463352, 381.63705);
        ((GeneralPath) shape).curveTo(-30.663486, 387.89774, -22.198402, 397.3374, -10.278845, 408.55);
        ((GeneralPath) shape).curveTo(-0.52246857, 417.72772, 8.38508, 424.7371, 14.8961315, 428.9411);
        ((GeneralPath) shape).curveTo(17.178822, 426.89944, 18.52341, 425.34534, 20.087252, 423.5461);
        ((GeneralPath) shape).curveTo(15.396162, 417.18594, 7.3181915, 408.5616, -2.5162487, 399.3105);
        ((GeneralPath) shape).curveTo(-14.355937, 388.173, -24.484581, 380.82962, -30.827557, 377.51974);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(3.953125, 74.83329772949219), 6.93199f, new Point2D.Double(0.9055841565132141, 73.29568481445312), new float[]{0, 0.6637168f, 1}, new Color[]{BLACK, new Color(0x3D000000, true), new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform(0.435966f, -0.566102f, 5.67091f, 5.233696f, -433.7315f, 13.38698f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.73260075f * origAlpha));

        // _0_0_0_0_2_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-37.65858, 384.95584);
        ((GeneralPath) shape).curveTo(-34.430492, 381.98334, -31.318977, 378.4455, -28.632576, 374.8213);
        ((GeneralPath) shape).curveTo(-11.816116, 389.1909, 5.7356186, 405.6877, 21.71447, 419.74612);
        ((GeneralPath) shape).curveTo(18.28639, 424.27548, 17.08702, 426.46112, 12.20214, 430.82944);
        ((GeneralPath) shape).curveTo(-4.4081793, 414.8627, -21.69749, 400.2854, -37.65858, 384.95584);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(49.15742874145508, 62.38064193725586), 8.333237f, new Point2D.Double(45.900455474853516, 62.298255920410156), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(0.626846f, -0.703832f, 7.605719f, 6.891555f, -534.4471f, -18.26657f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.74418604f * origAlpha));

        // _0_0_0_0_2_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-36.59702, 385.39948);
        ((GeneralPath) shape).lineTo(-28.7268, 381.386);
        ((GeneralPath) shape).curveTo(-11.910339, 395.7556, 2.7850418, 407.30753, 20.05102, 420.7474);
        ((GeneralPath) shape).curveTo(17.50045, 425.96844, 15.79105, 426.24246, 11.36409, 430.5501);
        ((GeneralPath) shape).curveTo(-4.985319, 414.7262, -20.63593, 400.72903, -36.59702, 385.39948);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(39.03649139404297, 69.15291595458984), 8.333237f, new Point2D.Double(36.28557586669922, 69.15291595458984), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(0.626846f, -0.703832f, 7.605719f, 6.891555f, -535.28516f, -18.54592f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_0_2_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-28.665571, 374.1309);
        ((GeneralPath) shape).curveTo(-32.603905, 377.42825, -35.833332, 381.05786, -38.444496, 385.11084);
        ((GeneralPath) shape).lineTo(-38.268547, 385.27026);
        ((GeneralPath) shape).curveTo(-34.33021, 381.9729, -31.100784, 378.3433, -28.489622, 374.2903);
        ((GeneralPath) shape).lineTo(-28.665571, 374.1309);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5C5C5C));
        g.fill(shape);
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.683678f, -0.792054f, 0.188958f, 0.164061f, -78.21372f, 412.69104f));

        // _0_0_0_0_2_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.107132, 51.796238);
        ((GeneralPath) shape).curveTo(59.107132, 52.81994, 56.74122, 53.64981, 53.82272, 53.64981);
        ((GeneralPath) shape).curveTo(50.90422, 53.64981, 48.538307, 52.81994, 48.538307, 51.796238);
        ((GeneralPath) shape).curveTo(48.538307, 50.772537, 50.90422, 49.942665, 53.82272, 49.942665);
        ((GeneralPath) shape).curveTo(56.74122, 49.942665, 59.107132, 50.772537, 59.107132, 51.796238);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(53.82271957397461, 51.79623794555664), 5.284413f, new Point2D.Double(53.363365173339844, 53.70447540283203), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 0.350763f, 0, 33.62806f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_7
        g.setComposite(AlphaComposite.getInstance(3, 0.6511628f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.67225f, -0.801782f, 0.192135f, 0.160328f, -27.10364f, 458.25497f));

        // _0_0_0_0_2_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.107132, 51.796238);
        ((GeneralPath) shape).curveTo(59.107132, 52.81994, 56.74122, 53.64981, 53.82272, 53.64981);
        ((GeneralPath) shape).curveTo(50.90422, 53.64981, 48.538307, 52.81994, 48.538307, 51.796238);
        ((GeneralPath) shape).curveTo(48.538307, 50.772537, 50.90422, 49.942665, 53.82272, 49.942665);
        ((GeneralPath) shape).curveTo(56.74122, 49.942665, 59.107132, 50.772537, 59.107132, 51.796238);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_8
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_0_2_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-37.010513, 370.06705);
        ((GeneralPath) shape).curveTo(-39.16476, 372.68866, -41.147564, 374.93372, -43.091423, 376.93008);
        ((GeneralPath) shape).lineTo(-36.558304, 382.94043);
        ((GeneralPath) shape).curveTo(-34.13988, 380.69055, -31.928997, 378.5423, -30.2915, 376.19675);
        ((GeneralPath) shape).lineTo(-37.01051, 370.06705);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(28.07171058654785, 20.204627990722656), new Point2D.Double(40.19868850708008, 20.20462989807129), new float[]{0, 1}, new Color[]{WHITE, new Color(0xAEAEAE)}, REFLECT, SRGB, new AffineTransform(-0.358188f, 0.402179f, 0.396825f, 0.359565f, -33.8896f, 356.5932f)));
        g.fill(shape);

        // _0_0_0_0_2_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-36.767323, 371.21866);
        ((GeneralPath) shape).curveTo(-38.921574, 373.84027, -40.773865, 375.363, -42.717728, 377.35938);
        ((GeneralPath) shape).lineTo(-36.558308, 382.94043);
        ((GeneralPath) shape).curveTo(-34.139885, 380.69055, -31.929, 378.5423, -30.291504, 376.19675);
        ((GeneralPath) shape).lineTo(-36.767326, 371.21866);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(67.51517486572266, 86.70606231689453), new Point2D.Double(63.40166473388672, 61.357200622558594), new float[]{0, 1}, new Color[]{BLACK, new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform(1.005204f, 0.03706644f, -0.03709647f, 1.006018f, -101.08016f, 311.43176f)));
        g.fill(shape);

        // _0_0_0_0_2_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.39697, 419.8477);
        ((GeneralPath) shape).curveTo(16.29105, 414.10757, 6.445571, 405.9943, -4.982708, 395.66214);
        ((GeneralPath) shape).curveTo(-13.81944, 387.67297, -22.22175, 380.30264, -28.65713, 375.54318);
        ((GeneralPath) shape).lineTo(-33.42672, 380.1455);
        ((GeneralPath) shape).curveTo(-28.044659, 386.07004, -19.90372, 394.40274, -11.06699, 402.3919);
        ((GeneralPath) shape).curveTo(0.3612814, 412.72406, 10.994041, 421.21906, 17.705801, 425.63583);
        ((GeneralPath) shape).lineTo(22.39697, 419.8477);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(-22.1875, 69.921875), 3.3125f, new Point2D.Double(-24.22588539123535, 69.91436767578125), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(-0.8920684f, 1.0389973f, -21.23323f, -18.230581f, 1459.1827f, 1698.9056f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.8f * origAlpha));

        // _0_0_0_0_2_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-36.872658, 370.16544);
        ((GeneralPath) shape).curveTo(-37.842094, 371.45654, -38.902435, 372.69522, -40.060158, 373.85294);
        ((GeneralPath) shape).curveTo(-40.47283, 374.26562, -40.90709, 374.67908, -41.341408, 375.0717);
        ((GeneralPath) shape).curveTo(-41.36311, 375.09128, -41.38215, 375.1146, -41.403908, 375.1342);
        ((GeneralPath) shape).curveTo(-41.97167, 375.7515, -42.533207, 376.34216, -43.091408, 376.91544);
        ((GeneralPath) shape).lineTo(-40.810158, 379.04044);
        ((GeneralPath) shape).curveTo(-38.665886, 377.68497, -36.813198, 375.8738, -35.435158, 373.6342);
        ((GeneralPath) shape).curveTo(-35.143433, 373.16006, -34.888844, 372.68515, -34.653908, 372.1967);
        ((GeneralPath) shape).lineTo(-36.872658, 370.16544);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(56.256771087646484, 56.998897552490234), 9.725522f, new Point2D.Double(56.256771087646484, 56.998897552490234), new float[]{0, 0.6637168f, 1}, new Color[]{BLACK, new Color(0x3D000000, true), new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 0.925287f, -99.09141f, 320.14276f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.1875f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.6643393f, -0.7474311f, 0.74743116f, 0.6643393f, 0, 0));

        // _0_0_0_0_2_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-305.6112, 218.8499);
        ((GeneralPath) shape).lineTo(-303.95917, 218.8499);
        ((GeneralPath) shape).lineTo(-303.95917, 227.23187);
        ((GeneralPath) shape).lineTo(-305.6112, 227.23187);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(113.91755676269531, 47.035709381103516), new Point2D.Double(108.60655975341797, 69.3776626586914), new float[]{0, 1}, new Color[]{new Color(0xAF56E4FD, true), new Color(0xB5FFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 1, -420.28748f, 160.38698f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_13
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(-5.327775f, 0, 0, 7.786748f, 87.01389f, 392.53424f));

        // _0_0_0_0_2_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.93114, -5.477264);
        ((GeneralPath) shape).curveTo(34.93114, -4.319225, 34.25879, -3.2086155, 33.062, -2.389758);
        ((GeneralPath) shape).curveTo(31.865208, -1.5709007, 30.242008, -1.1108713, 28.54949, -1.1108713);
        ((GeneralPath) shape).curveTo(26.856972, -1.1108713, 25.233772, -1.5709007, 24.036982, -2.389758);
        ((GeneralPath) shape).curveTo(22.840189, -3.2086155, 22.16784, -4.319225, 22.16784, -5.477264);
        ((GeneralPath) shape).curveTo(22.16784, -6.635303, 22.840189, -7.745912, 24.036982, -8.56477);
        ((GeneralPath) shape).curveTo(25.233772, -9.383627, 26.856972, -9.843657, 28.54949, -9.843657);
        ((GeneralPath) shape).curveTo(30.242008, -9.843657, 31.865208, -9.383627, 33.062, -8.56477);
        ((GeneralPath) shape).curveTo(34.25879, -7.745912, 34.93114, -6.635303, 34.93114, -5.477264);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(28.549489974975586, -10.100502967834473), new Point2D.Double(28.549489974975586, -0.8540247082710266), new float[]{0, 1}, new Color[]{new Color(0xC9CACC), new Color(0xACAEB1)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(0.62102485f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_14

        // _0_0_0_0_2_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-99.09137, 349.8842);
        ((GeneralPath) shape).curveTo(-99.09137, 368.6522, -83.85937, 383.8842, -65.09137, 383.8842);
        ((GeneralPath) shape).curveTo(-46.32337, 383.8842, -31.09137, 368.6522, -31.09137, 349.8842);
        ((GeneralPath) shape).curveTo(-31.09137, 331.11618, -46.32337, 315.8842, -65.09137, 315.8842);
        ((GeneralPath) shape).curveTo(-83.85937, 315.8842, -99.09137, 331.11618, -99.09137, 349.8842);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(28.549489974975586, -5.477263927459717), 6.6921635f, new Point2D.Double(28.549489974975586, -5.477263927459717), new float[]{0, 1}, new Color[]{new Color(0xFFFFFF, true), new Color(0x818181)}, NO_CYCLE, SRGB, new AffineTransform(-5.379428f, -1.09753E-6f, -5.982266E-6f, 29.32146f, 88.48849f, 510.48557f)));
        g.setStroke(new BasicStroke(4, 1, 1, 4));
        g.draw(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.71f * origAlpha));

        // _0_0_0_0_2_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-65.24766, 317.8842);
        ((GeneralPath) shape).curveTo(-65.79348, 317.87518, -66.35233, 317.89627, -66.90391, 317.91537);
        ((GeneralPath) shape).curveTo(-84.554214, 318.5297, -98.31232, 333.35602, -97.62266, 351.00912);
        ((GeneralPath) shape).curveTo(-97.39854, 356.74594, -95.671486, 362.06955, -92.84141, 366.63412);
        ((GeneralPath) shape).curveTo(-92.85905, 366.3605, -92.8619, 366.09717, -92.87266, 365.82162);
        ((GeneralPath) shape).curveTo(-93.56232, 348.16852, -79.80421, 333.3422, -62.153908, 332.72787);
        ((GeneralPath) shape).curveTo(-50.239502, 332.3132, -39.594955, 338.4652, -33.716408, 347.94662);
        ((GeneralPath) shape).curveTo(-34.793434, 331.23694, -48.599804, 318.1491, -65.24766, 317.88412);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(39.40945816040039, 9.579120635986328), 31.965544f, new Point2D.Double(33.4835319519043, 10.615250587463379), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 0.7625717f, -105.09141f, 317.57068f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.03847249f, 1.105377f, 1.138262f, -0.04446891f, -110.40129f, 304.5464f));

        // _0_0_0_0_2_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.60957, 38.36776);
        ((GeneralPath) shape).curveTo(70.60957, 45.593407, 67.654274, 52.52311, 62.393806, 57.632412);
        ((GeneralPath) shape).curveTo(57.13334, 62.741714, 49.998615, 65.61209, 42.559193, 65.61209);
        ((GeneralPath) shape).curveTo(27.067398, 65.61209, 14.508817, 53.41439, 14.508816, 38.36776);
        ((GeneralPath) shape).curveTo(14.508816, 23.32113, 27.067398, 11.123426, 42.559193, 11.123426);
        ((GeneralPath) shape).curveTo(49.998615, 11.1234255, 57.13334, 13.993802, 62.393806, 19.103106);
        ((GeneralPath) shape).curveTo(67.654274, 24.21241, 70.60957, 31.142113, 70.60957, 38.36776);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(13.644913673400879, 38.367759704589844), new Point2D.Double(71.47347259521484, 38.367759704589844), new float[]{0, 1}, new Color[]{new Color(0xA3A5A8), WHITE}, NO_CYCLE, SRGB, new AffineTransform()));
        g.setStroke(new BasicStroke(1.7278044f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_17
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(1.2724655f, 0, 0, 1.2724655f, -100.71121f, 321.27896f));

        // _0_0_0_0_2_18
        g.setComposite(AlphaComposite.getInstance(3, 0.40625f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.9136751f, 0, 0, 0.6306345f, -393.98727f, 40.72113f));

        // _0_0_0_0_2_18_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(483.3296, -50.078033);
        ((GeneralPath) shape).curveTo(483.3296, -38.994793, 473.77277, -30.010052, 461.98383, -30.01004);
        ((GeneralPath) shape).curveTo(456.32257, -30.010038, 450.8932, -32.124336, 446.89008, -35.887817);
        ((GeneralPath) shape).curveTo(442.88696, -39.651295, 440.63803, -44.75567, 440.63803, -50.078033);
        ((GeneralPath) shape).curveTo(440.63803, -55.4004, 442.88696, -60.504772, 446.89008, -64.26825);
        ((GeneralPath) shape).curveTo(450.8932, -68.03173, 456.32257, -70.14603, 461.98383, -70.14603);
        ((GeneralPath) shape).curveTo(473.77277, -70.14602, 483.3296, -61.161274, 483.3296, -50.078033);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(461.9837951660156, -50.078033447265625), 21.345785f, new Point2D.Double(461.5453186035156, -62.78385925292969), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(1.9245079f, 0, 0, 0.9889928f, -427.1077f, -0.5516314f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_0
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_0_0_2_18_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.332724, -1.7688984);
        ((GeneralPath) shape).curveTo(14.895174, -1.7688984, 3.9821777, 9.144091, 3.9821777, 22.581644);
        ((GeneralPath) shape).curveTo(3.9821777, 36.019196, 14.895174, 46.910767, 28.332724, 46.910767);
        ((GeneralPath) shape).curveTo(41.770275, 46.910767, 52.661846, 36.019196, 52.661846, 22.581644);
        ((GeneralPath) shape).curveTo(52.661846, 9.144091, 41.770256, -1.768898, 28.332724, -1.768898);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(654.5357055664062, -20.356201171875), 38.29028f, new Point2D.Double(653.7733764648438, 3.2766332626342773), new float[]{0, 0.57963896f, 0.8822989f, 1}, new Color[]{new Color(0x4FA2F3FF, true), new Color(0x7751D2F4, true), new Color(0xA9388BC9, true), new Color(0xDC1F449E, true)}, NO_CYCLE, SRGB, new AffineTransform(0.6356659f, 0, 0, 0.6356659f, -387.74408f, 35.51068f)));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.390625f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7026384f, 0, 0, 0.7026384f, -333.2755f, 26.424467f));

        // _0_0_0_0_2_18_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(514.84375, -41.875);
        ((GeneralPath) shape).curveTo(495.23627, -41.875, 479.3125, -25.95124, 479.3125, -6.34375);
        ((GeneralPath) shape).curveTo(479.3125, -2.9406471, 479.79214, 0.35313177, 480.6875, 3.46875);
        ((GeneralPath) shape).curveTo(480.00345, 0.73960924, 479.625, -2.122239, 479.625, -5.0625);
        ((GeneralPath) shape).curveTo(479.625, -24.377249, 495.31024, -40.0625, 514.625, -40.0625);
        ((GeneralPath) shape).curveTo(533.93976, -40.0625, 549.625, -24.377247, 549.625, -5.0625);
        ((GeneralPath) shape).curveTo(549.625, 1.5769448, 547.7782, 7.7719746, 544.5625, 13.0625);
        ((GeneralPath) shape).curveTo(548.2146, 7.482852, 550.34375, 0.82337, 550.34375, -6.34375);
        ((GeneralPath) shape).curveTo(550.34375, -25.95124, 534.45123, -41.875, 514.84375, -41.875);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(529.51708984375, -49.40803527832031), new Point2D.Double(529.1305541992188, -2.031881332397461), new float[]{0, 1}, new Color[]{BLACK, new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_2
        g.setComposite(AlphaComposite.getInstance(3, 0.5703125f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7026384f, 0, 0, 0.7026384f, -266.59097f, 26.424467f));

        // _0_0_0_0_2_18_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(385.9375, -16.09375);
        ((GeneralPath) shape).curveTo(384.79688, -12.592159, 384.1875, -8.880613, 384.1875, -5.0);
        ((GeneralPath) shape).curveTo(384.1875, 14.819393, 400.27435, 30.90625, 420.09375, 30.90625);
        ((GeneralPath) shape).curveTo(439.91315, 30.90625, 455.96875, 14.819393, 455.96875, -5.0);
        ((GeneralPath) shape).curveTo(455.96875, -8.880612, 455.35938, -12.592159, 454.21875, -16.09375);
        ((GeneralPath) shape).curveTo(455.10294, -12.994237, 455.59375, -9.725784, 455.59375, -6.34375);
        ((GeneralPath) shape).curveTo(455.59375, 13.263741, 439.70123, 29.15625, 420.09375, 29.15625);
        ((GeneralPath) shape).curveTo(400.48627, 29.156248, 384.5625, 13.263741, 384.5625, -6.34375);
        ((GeneralPath) shape).curveTo(384.5625, -9.725784, 385.0533, -12.994237, 385.9375, -16.09375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(425.90679931640625, 7.40625), new Point2D.Double(426.270263671875, -21.585128784179688), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_3
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7026384f, 0, 0, 0.7026384f, -266.59097f, 26.424467f));

        // _0_0_0_0_2_18_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(385.9375, -16.09375);
        ((GeneralPath) shape).curveTo(384.79688, -12.592159, 384.1875, -8.880613, 384.1875, -5.0);
        ((GeneralPath) shape).curveTo(384.1875, 14.819393, 400.27435, 29.90625, 420.09375, 29.90625);
        ((GeneralPath) shape).curveTo(439.91315, 29.90625, 455.96875, 14.819394, 455.96875, -5.0);
        ((GeneralPath) shape).curveTo(455.96875, -8.880612, 455.35938, -12.592159, 454.21875, -16.09375);
        ((GeneralPath) shape).curveTo(455.10294, -12.994237, 455.59375, -9.725784, 455.59375, -6.34375);
        ((GeneralPath) shape).curveTo(455.59375, 13.263741, 439.70123, 29.15625, 420.09375, 29.15625);
        ((GeneralPath) shape).curveTo(400.48627, 29.156248, 384.5625, 13.263741, 384.5625, -6.34375);
        ((GeneralPath) shape).curveTo(384.5625, -9.725784, 385.0533, -12.994237, 385.9375, -16.09375);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(425.19970703125, 35.690521240234375), new Point2D.Double(424.8560485839844, 12.002443313598633), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_4
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7026384f, 0, 0, 0.7026384f, -333.2755f, 26.424467f));

        // _0_0_0_0_2_18_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(514.84375, -40.875);
        ((GeneralPath) shape).curveTo(495.23627, -40.875, 479.3125, -25.95124, 479.3125, -6.34375);
        ((GeneralPath) shape).curveTo(479.3125, -2.9406471, 479.79214, 0.35313177, 480.6875, 3.46875);
        ((GeneralPath) shape).curveTo(480.00345, 0.73960924, 479.625, -2.122239, 479.625, -5.0625);
        ((GeneralPath) shape).curveTo(479.625, -24.377249, 495.31024, -40.0625, 514.625, -40.0625);
        ((GeneralPath) shape).curveTo(533.93976, -40.0625, 549.625, -24.377247, 549.625, -5.0625);
        ((GeneralPath) shape).curveTo(549.625, 1.5769448, 547.7782, 7.7719746, 544.5625, 13.0625);
        ((GeneralPath) shape).curveTo(548.2146, 7.482852, 550.34375, 0.82337, 550.34375, -6.34375);
        ((GeneralPath) shape).curveTo(550.34375, -25.95124, 534.45123, -40.875, 514.84375, -40.875);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(529.51708984375, -49.40803527832031), new Point2D.Double(529.6305541992188, -22.28188133239746), new float[]{0, 1}, new Color[]{BLACK, new Color(0x0, true)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_5

        // _0_0_0_0_2_18_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.429342, -3.5254953);
        ((GeneralPath) shape).curveTo(14.458402, -3.5254953, 3.112383, 7.70249, 3.112402, 21.527956);
        ((GeneralPath) shape).curveTo(3.112402, 26.886229, 4.822624, 31.838602, 7.7234535, 35.910084);
        ((GeneralPath) shape).curveTo(5.030179, 31.929077, 3.4637074, 27.133469, 3.4637074, 21.967102);
        ((GeneralPath) shape).curveTo(3.4637074, 8.190124, 14.652351, -2.998518, 28.429342, -2.998518);
        ((GeneralPath) shape).curveTo(42.206295, -2.998518, 53.373024, 8.1901245, 53.37299, 21.967102);
        ((GeneralPath) shape).curveTo(53.37299, 27.133467, 51.80267, 31.929077, 49.113243, 35.910084);
        ((GeneralPath) shape).curveTo(52.009983, 31.8386, 53.724304, 26.886227, 53.724304, 21.527954);
        ((GeneralPath) shape).curveTo(53.72432, 7.70249, 42.400246, -3.5254953, 28.429342, -3.5254953);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(455.33935546875, -91.4619140625), new Point2D.Double(452.660888671875, -34.0517578125), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(0.6517223f, 0, 0, 0.6517223f, -266.59097f, 35.22272f)));
        g.fill(shape);
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.7026384f, 0, 0, 0.7026384f, -357.76114f, 26.424467f));

        // _0_0_0_0_2_18_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(549.125, -40.125);
        ((GeneralPath) shape).curveTo(530.00055, -40.125, 514.46875, -24.593172, 514.46875, -5.46875);
        ((GeneralPath) shape).curveTo(514.46875, 12.079336, 527.5698, 26.541828, 544.5, 28.8125);
        ((GeneralPath) shape).curveTo(529.9104, 26.584162, 518.71875, 13.990063, 518.71875, -1.21875);
        ((GeneralPath) shape).curveTo(518.71875, -18.000893, 532.3429, -31.625002, 549.125, -31.625);
        ((GeneralPath) shape).curveTo(565.9071, -31.625, 579.53125, -18.000893, 579.53125, -1.21875);
        ((GeneralPath) shape).curveTo(579.53125, 14.514505, 567.57245, 27.44413, 552.25, 29.0);
        ((GeneralPath) shape).curveTo(569.9163, 27.426971, 583.75, 12.606974, 583.75, -5.46875);
        ((GeneralPath) shape).curveTo(583.75, -24.593172, 568.2494, -40.125, 549.125, -40.125);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(552.25, 29.0);
        ((GeneralPath) shape).curveTo(551.73926, 29.05186, 551.2054, 29.09875, 550.6875, 29.125);
        ((GeneralPath) shape).curveTo(551.20624, 29.10194, 551.7374, 29.04564, 552.25, 29.0);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(544.5, 28.8125);
        ((GeneralPath) shape).curveTo(545.01154, 28.88111, 545.51294, 28.953968, 546.03125, 29.0);
        ((GeneralPath) shape).curveTo(545.5204, 28.94814, 545.0031, 28.88934, 544.5, 28.8125);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(546.03125, 29.0);
        ((GeneralPath) shape).curveTo(546.5414, 29.0453, 547.04626, 29.102055, 547.5625, 29.125);
        ((GeneralPath) shape).curveTo(547.04456, 29.09875, 546.5421, 29.05186, 546.03125, 29.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(549.109375, -5.5), 34.640625f, new Point2D.Double(549.109375, 15.369064331054688), new float[]{0, 0.795f, 1}, new Color[]{new Color(0x16367A, true), new Color(0x16367A, true), new Color(0x16367A)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 0.9995489f, 0, -0.00248083f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_7
        g.setComposite(AlphaComposite.getInstance(3, 0.40625f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.737306f, 0, 0, 0.6411355f, -307.5619f, 33.860287f));

        // _0_0_0_0_2_18_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(469.60727, -34.831043);
        ((GeneralPath) shape).curveTo(469.60727, -30.180723, 468.12137, -25.720867, 465.47644, -22.432598);
        ((GeneralPath) shape).curveTo(462.83154, -19.144327, 459.24426, -17.296999, 455.50378, -17.297005);
        ((GeneralPath) shape).curveTo(447.71466, -17.297012, 441.40033, -25.147266, 441.40033, -34.831043);
        ((GeneralPath) shape).curveTo(441.40033, -44.51482, 447.71466, -52.365074, 455.50378, -52.36508);
        ((GeneralPath) shape).curveTo(463.2929, -52.365074, 469.60724, -44.51482, 469.60724, -34.831043);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(455.5038146972656, -40.34979248046875), 14.103466f, new Point2D.Double(455.5038146972656, -32.88325119018555), new float[]{0, 1}, new Color[]{new Color(0xAF56E4FD, true), new Color(0xB5FFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(1.4864866f, 0, 1.0406811E-6f, 1.8378378f, -221.5964f, 32.464565f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18_8
        g.setComposite(AlphaComposite.getInstance(3, 0.58984375f * origAlpha));

        // _0_0_0_0_2_18_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.44629, 0.21256398);
        ((GeneralPath) shape).lineTo(29.648642, 4.439237);
        ((GeneralPath) shape).curveTo(31.324497, 4.469328, 32.957016, 4.62683, 34.52795, 4.874713);
        ((GeneralPath) shape).curveTo(34.201626, 3.499492, 33.87911, 2.1244318, 33.53858, 0.75050807);
        ((GeneralPath) shape).curveTo(32.228886, 0.45357358, 30.86117, 0.2843541, 29.44629, 0.21256398);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(26.343327, 0.23818238);
        ((GeneralPath) shape).curveTo(24.984999, 0.34143147, 23.662796, 0.5656826, 22.4084, 0.87858707);
        ((GeneralPath) shape).curveTo(22.04677, 2.335656, 21.6967, 3.7993238, 21.351604, 5.2589564);
        ((GeneralPath) shape).curveTo(22.968073, 4.895446, 24.65706, 4.6671686, 26.41077, 4.5417023);
        ((GeneralPath) shape).lineTo(26.613146, 0.23818207);
        ((GeneralPath) shape).curveTo(26.520786, 0.24415207, 26.435284, 0.23119207, 26.343328, 0.23818207);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(36.011967, 1.4677594);
        ((GeneralPath) shape).curveTo(36.428314, 2.779594, 36.83896, 4.0950537, 37.24864, 5.412652);
        ((GeneralPath) shape).curveTo(40.20459, 6.137951, 42.88738, 7.2236633, 45.14096, 8.614676);
        ((GeneralPath) shape).curveTo(43.389896, 5.4700694, 40.122684, 2.9145107, 36.01197, 1.4677593);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(19.575256, 1.7751533);
        ((GeneralPath) shape).curveTo(15.17321, 3.5408685, 11.842925, 6.6214757, 10.513713, 10.305347);
        ((GeneralPath) shape).curveTo(12.572208, 8.597153, 15.186, 7.1941733, 18.158703, 6.1811385);
        ((GeneralPath) shape).curveTo(18.628277, 4.7133965, 19.097061, 3.2452433, 19.575256, 1.7751533);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(29.716108, 5.848128);
        ((GeneralPath) shape).lineTo(30.030891, 12.021631);
        ((GeneralPath) shape).curveTo(32.18577, 12.077671, 34.290455, 12.271145, 36.281784, 12.636419);
        ((GeneralPath) shape).curveTo(35.830017, 10.538348, 35.355488, 8.435743, 34.865215, 6.3348365);
        ((GeneralPath) shape).curveTo(33.210037, 6.056418, 31.49036, 5.883179, 29.716108, 5.8481283);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(26.343328, 5.924977);
        ((GeneralPath) shape).curveTo(24.480545, 6.0616336, 22.697088, 6.3659706, 20.991827, 6.770313);
        ((GeneralPath) shape).curveTo(20.50415, 8.869917, 20.048494, 10.968524, 19.59775, 13.0718975);
        ((GeneralPath) shape).curveTo(21.643957, 12.578826, 23.797682, 12.25429, 26.051016, 12.09848);
        ((GeneralPath) shape).lineTo(26.343328, 5.9249773);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(37.720856, 6.949625);
        ((GeneralPath) shape).curveTo(38.386837, 9.108831, 39.05327, 11.28702, 39.699535, 13.4561405);
        ((GeneralPath) shape).curveTo(42.113613, 14.140901, 44.32391, 15.030043, 46.28772, 16.120226);
        ((GeneralPath) shape).curveTo(46.451393, 15.38192, 46.535053, 14.638714, 46.535053, 13.866);
        ((GeneralPath) shape).curveTo(46.535053, 12.736368, 46.340015, 11.662572, 45.995403, 10.612742);
        ((GeneralPath) shape).curveTo(43.685352, 9.031858, 40.877403, 7.775354, 37.72085, 6.9496255);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(17.641542, 7.743727);
        ((GeneralPath) shape).curveTo(14.657038, 8.824017, 12.051964, 10.311432, 10.041523, 12.098481);
        ((GeneralPath) shape).curveTo(9.940949, 12.678941, 9.884139, 13.265328, 9.884139, 13.866);
        ((GeneralPath) shape).curveTo(9.884139, 14.898075, 10.042107, 15.895623, 10.333835, 16.863098);
        ((GeneralPath) shape).curveTo(11.905232, 15.868199, 13.669479, 14.9949045, 15.595377, 14.275862);
        ((GeneralPath) shape).curveTo(16.264887, 12.1018715, 16.9497, 9.92042, 17.641542, 7.743729);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(419.6562805175781, -24.165376663208008), 27.472944f, new Point2D.Double(419.6562805175781, -24.165376663208008), new float[]{0, 1}, new Color[]{WHITE, new Color(0xFFFFFF, true)}, NO_CYCLE, SRGB, new AffineTransform(0.7195272f, 0, 0, 0.6485209f, -273.7445f, 28.176702f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_18
        g.setComposite(AlphaComposite.getInstance(3, 0.45652172f * origAlpha));
        transformations.offer(g.getTransform());
        g.transform(new AffineTransform(0.6643393f, -0.7474311f, 0.74743116f, 0.6643393f, 0, 0));

        // _0_0_0_0_2_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-304.2993, 228.78679);
        ((GeneralPath) shape).lineTo(-303.54343, 228.78679);
        ((GeneralPath) shape).lineTo(-303.54343, 295.08072);
        ((GeneralPath) shape).lineTo(-304.2993, 295.08072);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(113.4251708984375, 55.401756286621094), new Point2D.Double(114.41651916503906, 118.73043823242188), new float[]{0, 1}, new Color[]{new Color(0xFBCAECF3, true), new Color(0xE5268, true)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 1, -420.009f, 170.05318f)));
        g.fill(shape);

        g.setTransform(transformations.poll()); // _0_0_0_0_2_19

        g.setTransform(transformations.poll()); // _0_0_0_0

        g.setTransform(transformations.poll()); // _0_0_0

        g.setTransform(transformations.poll()); // _0_0

        g.setTransform(transformations.poll()); // _0

    }

    /**
     * Returns the X of the bounding box of the original SVG image.
     *
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     *
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 0;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     *
     * @return The width of the bounding box of the original SVG image.
     */
    public static int getOrigWidth() {
        return 1123;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     *
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 794;
    }

    /**
     * The current width of this resizable icon.
     */
    int width;

    /**
     * The current height of this resizable icon.
     */
    int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public Slidepreview2() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.flamingo.api.common.icon.ResizableIcon#setDimension(java.awt.Dimension)
     */
    @Override
    public void setDimension(Dimension dimension) {
        this.width = dimension.width;
        this.height = dimension.height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.translate(x, y);

        double coef1 = (double) this.width / (double) getOrigWidth();
        double coef2 = (double) this.height / (double) getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.scale(coef, coef);
        paint(g2d);
        g2d.dispose();
    }
}

