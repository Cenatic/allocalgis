package com.geopista.app.eiel.models;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.geopista.app.eiel.beans.CaptacionesEIEL;
import com.geopista.app.eiel.beans.PuntosVertidoEIEL;
import com.geopista.app.eiel.utils.LocalGISEIELUtils;
import com.geopista.app.utilidades.estructuras.Estructuras;
import com.vividsolutions.jump.I18N;

/**
 * Clase que implementa el modelo de datos de la tabla del panel BienesJPanel
 */

public class PuntosVertidoCompletoEIELTableModel  extends DefaultTableModel {
	
	private static String[] columnNames = {
			I18N.get("LocalGISEIEL","localgiseiel.tabla.generico.columna.estado"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.clave"),
//            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.codprov"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.codmunic"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.orden"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.tipo_pv"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.zona_pv"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.distancia_nucleo"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.fecha_ini_vertido"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.observ"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.fecha_revision"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.estado_revision"),
			I18N.get("LocalGISEIEL","localgiseiel.tabla.pv.columna.bloqueado")};

    public PuntosVertidoCompletoEIELTableModel() {        
    	
    }

    private ArrayList lstElementos = new ArrayList();

    /**
     * @return n�mero de columnas de la tabla
     */
    public int getColumnCount() {
    	if (columnNames!=null){
    		return columnNames.length;
    	}
    	else
    		return 0;
    }
    
    /**
     * @return n�mero de filas de la tabla
     */
    public int getRowCount() {
    	if (lstElementos != null)
    		return lstElementos.size();
    	else
    		return 0;
    }
    
    
    /**
     * Devuelve el nombre de la columna solicitada
     * @param col �ndice de la columna
     * @return nombre de la columna
     */
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    /**
     * Devuelve el objeto que contiene la celda en la posici�n indicada
     * @param row �ndice de la fila
     * @param col �ndice de la columna
     * 
     * @return Objeto contenido en la posici�n seleccionada
     */
    public Object getValueAt(int row, int col) {
        
        if (lstElementos.get(row)==null)
            return null;
        
        switch (col)
        {
        case 0: 
            return ((PuntosVertidoEIEL)lstElementos.get(row)).getEstadoValidacion();
        case 1: 
        	return ((PuntosVertidoEIEL)lstElementos.get(row)).getClave();
        case 2: 
            return ((PuntosVertidoEIEL)lstElementos.get(row)).getCodINEProvincia() + ((PuntosVertidoEIEL)lstElementos.get(row)).getCodINEMunicipio();
        case 3: 
            return ((PuntosVertidoEIEL)lstElementos.get(row)).getOrden();
        case 4: 
            Estructuras.cargarEstructura("eiel_Tipo Vertido");
            return LocalGISEIELUtils.getNameFromEstructura(((PuntosVertidoEIEL)lstElementos.get(row)).getTipo());
        case 5: 
            Estructuras.cargarEstructura("eiel_Zona del punto de vertido");
            return LocalGISEIELUtils.getNameFromEstructura(((PuntosVertidoEIEL)lstElementos.get(row)).getZona());
        case 6: 
            return ((PuntosVertidoEIEL) lstElementos.get(row)).getDistanciaNucleo() != null ? ((PuntosVertidoEIEL) lstElementos
                    .get(row)).getDistanciaNucleo().toString()
                    : "";
        case 7: 
            return ((PuntosVertidoEIEL)lstElementos.get(row)).getFechaInicio() != null ? ((PuntosVertidoEIEL) lstElementos
                    .get(row)).getFechaInicio().toString()
                    : "";
        case 8: 
            return ((PuntosVertidoEIEL)lstElementos.get(row)).getObservaciones();
        case 9: 
            return ((PuntosVertidoEIEL)lstElementos.get(row)).getFechaRevision() != null ? ((PuntosVertidoEIEL) lstElementos
                    .get(row)).getFechaRevision().toString()
                    : "";
        case 10: 
			Estructuras.cargarEstructura("eiel_Estado de revisi�n");
            return LocalGISEIELUtils.getNameFromEstructura(((PuntosVertidoEIEL) lstElementos.get(row)).getEstadoRevision().toString());
       
        default: 
            return null;        
        }        
    }
    
    /**
     * Devuelve la Depuradora1EIEL completa de la fila seleccionada
     * @param row �ndice de la fila cuyo objeto FincaCatastro se solicita
     * @return FincaCatastro completa
     */
    public PuntosVertidoEIEL getValueAt(int row) {
        
        return (PuntosVertidoEIEL)lstElementos.get(row);
        
    }
    /**
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  
     */
    public Class getColumnClass(int c) {
        
        if (getValueAt(0, c)!=null)        
            return getValueAt(0, c).getClass();
        else
            return String.class;
    }
    
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    
    
    /**
     * Establece los datos mostrados en el modelo
     * @param datos Datos a mostrar en el modelo
     */
    public void setData (ArrayList datos)
    {
        this.lstElementos = datos;
    }
    
    /**
     * Recupera los datos del modelo
     * @return Datos del modelo
     */
    public ArrayList getData (){
        return lstElementos;
    }    

}
