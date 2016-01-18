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


package org.agil.dxf.reader;


/**
 *  Representing a DXF ENDBLK.
 *  
 *  @version 1.00beta0
 */
public class DxfENDBLK extends DxfEntity {

  /**
   *  This is terminating.
   *  @return <code>true</code>
   */
  public boolean isTerm() {
    return true;
  }
}

