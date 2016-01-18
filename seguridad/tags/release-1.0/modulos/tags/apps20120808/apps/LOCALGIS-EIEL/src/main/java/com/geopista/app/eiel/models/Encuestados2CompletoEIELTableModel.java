package com.geopista.app.eiel.models;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.geopista.app.eiel.beans.CaptacionesEIEL;
import com.geopista.app.eiel.beans.CementeriosEIEL;
import com.geopista.app.eiel.beans.Encuestados2EIEL;
import com.geopista.app.eiel.utils.LocalGISEIELUtils;
import com.geopista.app.utilidades.estructuras.Estructuras;
import com.vividsolutions.jump.I18N;

/**
 * Clase que implementa el modelo de datos de la tabla del panel BienesJPanel
 */

public class Encuestados2CompletoEIELTableModel  extends EIELCompletoTableModel {
	
	private static String[] columnNames = {
			I18N.get("LocalGISEIEL","localgiseiel.tabla.generico.columna.estado"),
//            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.codprov"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.codmunic"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.codentidad"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.codnucleo"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_caudal"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_restri"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_contad"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_tasa"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_instal"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_hidran"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_est_hi"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_valvul"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_est_va"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_bocasr"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.aag_est_bo"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.cisterna"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.fecha_revision"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.observ"),
            I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.estado_revision"),
    I18N.get("LocalGISEIEL","localgiseiel.tabla.p2.columna.bloqueado")};

    public Encuestados2CompletoEIELTableModel() {        
    	
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
        	return ((Encuestados2EIEL)lstElementos.get(row)).getEstadoValidacion();
        case 1: 
            return ((Encuestados2EIEL)lstElementos.get(row)).getCodINEProvincia() + ((Encuestados2EIEL)lstElementos.get(row)).getCodINEMunicipio();
        case 2: 
            return getNombreNucleo( ((Encuestados2EIEL)lstElementos.get(row)).getCodINEEntidad(),((Encuestados2EIEL)lstElementos.get(row)).getCodINEPoblamiento());
        case 3: 
            return ((Encuestados2EIEL)lstElementos.get(row)).getCodINEPoblamiento();
        case 4: 
            Estructuras.cargarEstructura("eiel_Suficiencia de caudal para el abastecimiento aut�nomo");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getDisponibilidadCaudal());
        case 5: 
            Estructuras.cargarEstructura("eiel_Restricciones de agua");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getRestriccionesAgua());
        case 6: 
            Estructuras.cargarEstructura("eiel_Contador Abast");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getContadores());
        case 7: 
            Estructuras.cargarEstructura("eiel_Tasa");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getTasa());            
        case 8: 
            return ((Encuestados2EIEL)lstElementos.get(row)).getAnnoInstalacion();
        case 9: 
            Estructuras.cargarEstructura("eiel_Suficiencia de caudal para el abastecimiento aut�nomo");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getHidrantes());
        case 10: 
            Estructuras.cargarEstructura("eiel_Estado de conservaci�n");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getEstadoHidrantes());
        case 11: 
            Estructuras.cargarEstructura("eiel_Suficiencia de caudal para el abastecimiento aut�nomo");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getValvulas());
        case 12: 
            Estructuras.cargarEstructura("eiel_Estado de conservaci�n");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getEstadoValvulas());
        case 13: 
            Estructuras.cargarEstructura("eiel_Suficiencia de caudal para el abastecimiento aut�nomo");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getBocasRiego());
        case 14: 
            Estructuras.cargarEstructura("eiel_Estado de conservaci�n");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getEstadoBocasRiego());
        case 15: 
            Estructuras.cargarEstructura("eiel_Cisterna");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL)lstElementos.get(row)).getCisterna());
        case 16: 
            return ((Encuestados2EIEL) lstElementos.get(row)).getFechaRevision() != null ? ((Encuestados2EIEL) lstElementos
                    .get(row)).getFechaRevision().toString()
                    : "";
        case 17: 
            return ((Encuestados2EIEL)lstElementos.get(row)).getObservaciones();
        case 18: 
    		Estructuras.cargarEstructura("eiel_Estado de revisi�n");
            return LocalGISEIELUtils.getNameFromEstructura(((Encuestados2EIEL) lstElementos.get(row)).getEstadoRevision().toString());
       default: 
            return null;
        
        }        
    }
    
    /**
     * Devuelve la Depuradora1EIEL completa de la fila seleccionada
     * @param row �ndice de la fila cuyo objeto FincaCatastro se solicita
     * @return FincaCatastro completa
     */
    public Encuestados2EIEL getValueAt(int row) {
        
        return (Encuestados2EIEL)lstElementos.get(row);
        
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
