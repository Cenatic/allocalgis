/**
 * 
 */
package com.geopista.app.eiel.models.versionados;



import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.geopista.app.eiel.beans.EntidadesSingularesEIEL;
import com.geopista.app.eiel.beans.NucleoEncuestado7EIEL;
import com.geopista.app.eiel.beans.VersionEiel;
import com.geopista.app.eiel.utils.LocalGISEIELUtils;
import com.geopista.app.utilidades.estructuras.Estructuras;
import com.vividsolutions.jump.I18N;


/**
 * @author seilagamo
 *
 */
public class InfoTerminosMunicipalesVersionadoCompletoEIELTableModel extends DefaultTableModel {
    
    private static String[] columnNames = {    
		I18N.get("LocalGISEIEL","localgiseiel.version.CampoVersion"),
		I18N.get("LocalGISEIEL","localgiseiel.version.CampoAccion"),
		I18N.get("LocalGISEIEL","localgiseiel.version.CampoUsuario"),
		I18N.get("LocalGISEIEL","localgiseiel.version.CampoFecha"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.codprov"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.codmunic"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.codentidad"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.codnucleo"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.tv_ant"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.tv_ca"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.tm_gsm"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.tm_umts"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.tm_gprs"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.correo"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.ba_rd"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.ba_xd"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.ba_wi"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.ba_ca"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.ba_rb"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.ba_st"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.capi"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.electric"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.gas"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.alu_v_sin"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.alu_l_sin"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.observ"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.fecha_revision"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.estado_revision"),
        I18N.get("LocalGISEIEL","localgiseiel.tabla.tm.columna.bloqueado")};

    private ArrayList lstElementos = new ArrayList();
    
    public InfoTerminosMunicipalesVersionadoCompletoEIELTableModel() {
    }

    /**
     * Devuelve el objeto que contiene la celda en la posici�n indicada
     * @param row �ndice de la fila
     * @param col �ndice de la columna
     * 
     * @return Objeto contenido en la posici�n seleccionada
     */
    public Object getValueAt(int row, int col) {
        
        if (lstElementos.get(row) == null)
            return null;
        Object[] fila = (Object[]) lstElementos.get(row);
		switch (col) {
			case 0:
			case 1:
			case 2:
			case 4:
			case 5:
			case 6:
			case 7:
			case 25:
				return	 fila[col];
			case 8:
	            Estructuras.cargarEstructura("eiel_Cobertura del servicio TV por antena");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	       
			case 9:
	            Estructuras.cargarEstructura("eiel_Cobertura del servicio TV por cable");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	  
			case 10:
	            Estructuras.cargarEstructura("eiel_Calidad de cobertura en telefon�a con sistema GSM");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	       
			case 11:
	            Estructuras.cargarEstructura("eiel_Calidad de cobertura en telefon�a con sistema UMTS");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);

			case 12:
	            Estructuras.cargarEstructura("eiel_Calidad de cobertura en telefon�a con sistema GPRS");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	  
			case 13:
	            Estructuras.cargarEstructura("eiel_Existencia de oficina de Correos");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	 
			case 14:
	            Estructuras.cargarEstructura("eiel_Acceso RDSI");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	      
			case 15:
	            Estructuras.cargarEstructura("eiel_Acceso XDSL");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	     
			case 16:
	            Estructuras.cargarEstructura("eiel_Acceso Inal�mbrico");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	   
			case 17:
	            Estructuras.cargarEstructura("eiel_Acceso tv_cable");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	  
			case 18:
	            Estructuras.cargarEstructura("eiel_Acceso red electrica");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	       
			case 19:
	            Estructuras.cargarEstructura("eiel_Acceso Sat�lite");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	        
			case 20:
	            Estructuras.cargarEstructura("eiel_Acceso P�blico");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	       
			case 21:
	            Estructuras.cargarEstructura("eiel_Calidad del servicio o suministro");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
	       
			case 22:
	            Estructuras.cargarEstructura("eiel_Calidad del servicio o suministro");
	            return LocalGISEIELUtils.getNameFromEstructura((String) fila[col]);
			case 27:
				Estructuras.cargarEstructura("eiel_Estado de revisi�n");
            	return fila[col]!=null? LocalGISEIELUtils.getNameFromEstructura(Integer.toString((Integer)fila[col])):"";
	            
			case 23:
			case 24:
			case 26:

			case 28:
				return fila[col] != null ? fila[col].toString() : "";
			case 3:	
        		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        		return fila[col] != null ? formatter.format(fila[col]):"";
			default:
				return null;
		}  
        
    }
    
    /**
     * Devuelve la InfoTerminosMunicipalesEIEL completa de la fila seleccionada
     * @param row �ndice de la fila cuyo objeto InfoTerminosMunicipalesEIEL se solicita
     * @return InfoTerminosMunicipalesEIEL completa
     */
    public NucleoEncuestado7EIEL getValueAt(int row) {
    	
    	Object[] fila = (Object[]) lstElementos.get(row);
    	NucleoEncuestado7EIEL obj = new NucleoEncuestado7EIEL();
    	 
    	VersionEiel version = new VersionEiel();
		version.setIdVersion((Integer) fila[0]);
		version.setAccion((String) fila[1]);
		version.setUsuario((String) fila[2]);
		version.setFecha((Date) fila[3]); 
		
		obj.setVersion(version);
		
		obj.setCodINEProvincia((String) fila[4]);
		obj.setCodINEMunicipio((String) fila[5]); 
		obj.setCodINEEntidad((String) fila[6]);
		obj.setCodINEPoblamiento((String) fila[7]); 
		obj.setTvAntena((String) fila[8]);
		obj.setTvCable((String) fila[9]); 
		obj.setCalidadGSM((String) fila[10]);
		obj.setCalidadUMTS((String) fila[11]);
		obj.setCalidadGPRS((String) fila[12]);
		obj.setCorreos((String) fila[13]);
		obj.setRdsi((String) fila[14]);
		obj.setAdsl((String) fila[15]);
		obj.setWifi((String) fila[16]);
		obj.setInternetTV((String) fila[17]);
		obj.setInternetRed((String) fila[18]);
		obj.setInternetSatelite((String) fila[19]);
		obj.setInternetPublico((String) fila[20]);
		obj.setCalidadElectricidad((String) fila[21]);
		obj.setCalidadGas((String) fila[22]);
		obj.setViviendasDeficitariasAlumbrado((Integer) fila[23]);
		obj.setLongitudDeficitariaAlumbrado((Integer) fila[24]);
		obj.setObservaciones((String) fila[25]);
		obj.setFechaRevision((Date) fila[26]);
		obj.setEstadoRevision((Integer) fila[27]);
		obj.setBloqueado((String) fila[28]);
    	
        return obj;
    }
    
    
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
     * 
     * @param datos Datos a mostrar en el modelo
     */
    public void setData(ArrayList datos) {
        this.lstElementos = datos;
    }

    /**
     * Recupera los datos del modelo
     * 
     * @return Datos del modelo
     */
    public ArrayList getData() {
        return lstElementos;
    }    

}
