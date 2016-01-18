/**
 * DxfCIRCLE.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 *
 * Este codigo se distribuye bajo licencia GPL
 * de GNU. Para obtener una c�pia integra de esta
 * licencia acude a www.gnu.org.
 * 
 * Este software se distribuye "como es". AGIL
 * solo  pretende desarrollar herramientas para
 * la promoci�n del GIS Libre.
 * AGIL no se responsabiliza de las perdidas econ�micas o de 
 * informaci�n derivadas del uso de este software.
 */

package com.geopista.ui.plugin.io.dxf.reader;

import com.geopista.ui.plugin.io.dxf.math.Point3D;

/**
 *  Representing a DXF CIRCLE.
 *
 *  @version 1.00beta0
 */
public class DxfCIRCLE extends DxfEntity {
  protected Point3D          center = new Point3D();   /* position of center [#10,20,30] */
  protected double            radius;    /* radius [#40] */


  /**
   *  Take a double value for a given group code.
   *  Accepted for group codes
   *  10, 20, 30, 40
   *  and anything DxfEntity accepts.
   *  @param  grpNr  group code
   *  @param  fval   the double value
   *  @return <code>true</code> group code is accepted for this entity<br>
   *          <code>false</code> unknown group code for this entity
   */
  public boolean setGroup(short grpNr, double fval) {
    switch (grpNr) {
    case 10:
    case 20:
    case 30:
      setCoord(center, grpNr/10, fval);
      return true;

    case 40:
      radius = fval;
      return true;

    default:
      return super.setGroup(grpNr, fval);
    }
  }


  /**
   *  Convert this CIRCLE using the given DxfConverter.
   *  @param  converter  the DXF converter
   *  @param  dxf        DXF file for references
   *  @param  collector  collector for results
   */
  public void convert(DxfConverter converter, DxfFile dxf, Object collector) {
    converter.convert(this, dxf, collector);
  }

  /**
   *  Get the radius.
   *  @return radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   *  Get the center. Not cloned for effeciency reasons!
   *  @return center point
   */
  public Point3D getCenter() {
    return center;
  }
}

