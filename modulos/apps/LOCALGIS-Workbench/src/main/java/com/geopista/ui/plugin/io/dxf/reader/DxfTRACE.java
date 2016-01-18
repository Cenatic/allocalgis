/**
 * DxfTRACE.java
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


/**
 *  Representing a DXF TRACE. There's no real difference between TRACE and 
 *  SOLID.
 *  
 *  @version 1.00beta0 (January 1999)
 */
public class DxfTRACE extends DxfSOLID {
  /**
   *  Convert this TRACE.
   *  Because TRACE and SOLID are essentially the same the typical
   *  TRACE convert method in the DxfConverter class should loke like:<br>
   *  <code>
   *  public void convert(DxfTRACE trace, DxfFile geopistadxf, Object collector) {
   *    convert((DxfSOLID)trace, geopistadxf, collector);
   *  }
   *  </code>
   *  @param  converter  the DXF converter
   *  @param  dxf        DXF file for references
   *  @param  collector  collector for results
   */
  public void convert(DxfConverter converter, DxfFile dxf, Object collector) {
    preConvert();		// work around for erroneaous DXF files
    converter.convert(this, dxf, collector);
  }
}


