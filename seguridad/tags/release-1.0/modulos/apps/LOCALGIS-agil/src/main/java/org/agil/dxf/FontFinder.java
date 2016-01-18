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

package org.agil.dxf;

import org.agil.dxf.reader.DxfException;

/**
 *  Interface for classes which know how to find fonts.
 *  
 *  @version 1.02
 */
public interface FontFinder {
  /**
   *  Get the font for a given name. Maybe a similar or default font
   *  if the correct font cannot be determined.
   *  @param   fontName  font's name
   *  @return  font
   *  @exception DxfException if no suitable font is found
   */
  public DxfFont getFont(String fontName) throws DxfException;

  /**
   *  Are there any fonts available?
   *  @return  fonts available?
   */
  public boolean fontsAvailable();

}
  
