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
 *  Unsupported features exception class.
 *  
 *  @version   1.00beta0
 */
public class DxfUnsupportedException extends DxfException {
  /**
   *  Create a exception with the given resource tag.
   *  @param tag   resource tag for exception message
   */
  public DxfUnsupportedException(String tag) {
    super(tag);
  }

  /**
   *  Create a exception with the given resource tag and some
   *  extra parameters.
   *  @param tag   resource tag for exception message
   *  @param args  additional arguments
   */
  public DxfUnsupportedException(String tag, String[] args) {
    super(tag, args);
  }
}


