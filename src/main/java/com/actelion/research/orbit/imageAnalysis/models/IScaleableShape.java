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

package com.actelion.research.orbit.imageAnalysis.models;

import java.awt.*;
import java.awt.geom.Point2D;
import java.io.Serializable;

public interface IScaleableShape extends Serializable, Shape, Cloneable {

    Shape getScaledInstance(double currentScale, Point currentOffset);

    double getScale();

    void setScale(double scale);

    void move(double dx, double dy);

    void rotate(double angle, Point2D rotCenter);

    IScaleableShape clone();

    int getRdfId();

    void setRdfId(int rdfId);

}
