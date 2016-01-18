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
 *  Common interface for classes which can collect DXF entities.
 *  
 *  @vesrion    1.00beta0
 */
public interface DxfEntityCollector {

  /**
   *  Add an entity to the collector.
   *  @param  entity  entity to add
   *  @return <code>true</code> if entity is added successfully <br>
   *          <code>false</code> if entity is terminating for this collection
   *  @exception DxfException if entity cannot be added to this collection
   */
  public boolean addEntity(DxfEntity entity) throws DxfException;
}

