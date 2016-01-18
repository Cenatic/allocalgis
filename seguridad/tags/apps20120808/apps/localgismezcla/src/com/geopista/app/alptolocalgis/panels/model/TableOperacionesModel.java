/**
 * The GEOPISTA project is a set of tools and applications to manage
 * geographical data for local administrations.
 *
 * Copyright (C) 2004 INZAMAC-SATEC UTE
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * For more information, contact:
 *
 * 
 * www.geopista.com
 *
 */


package com.geopista.app.alptolocalgis.panels.model;


/**
 * Modelo para mostrar las v�as en las tablas de v�as
 * 
 * @author cotesa
 *
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import com.geopista.app.alptolocalgis.beans.ConstantesAlp;
import com.geopista.app.alptolocalgis.beans.OperacionAlp;
import com.vividsolutions.jump.I18N;


public class TableOperacionesModel extends AbstractTableModel {
    
    private String[] columnNames = {
            I18N.get("AlpToLocalGIS","alptolocalgis.table.column.operationtype"),
            I18N.get("AlpToLocalGIS","alptolocalgis.table.column.featuretype"),
            I18N.get("AlpToLocalGIS","alptolocalgis.table.column.date")};
    
    private ArrayList lstElementos = new ArrayList();
    
    /**
     * @return n�mero de columnas de la tabla
     */
    public int getColumnCount() {
        return columnNames.length;
    }
    
    /**
     * @return n�mero de filas de la tabla
     */
    public int getRowCount() {
        return lstElementos.size();
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
        
        String tipoOperacion = null;
        String respuesta = "";
        
        switch (col)
        {
        case 0: 
        	
        	tipoOperacion = ((OperacionAlp)lstElementos.get(row)).getTipoOperacion();
        	
        	if (tipoOperacion.equals(ConstantesAlp.ACTION_ADD_NUMERO_POLICIA) || 
        			tipoOperacion.equals(ConstantesAlp.ACTION_ADD_VIA)){
        		respuesta = ConstantesAlp.ADD;
        	}
        	else if (tipoOperacion.equals(ConstantesAlp.ACTION_DEL_NUMERO_POLICIA) || 
        			tipoOperacion.equals(ConstantesAlp.ACTION_DEL_VIA)){
        		respuesta = ConstantesAlp.DEL;
        	}
        	else if (tipoOperacion.equals(ConstantesAlp.ACTION_MOD_NUMERO_POLICIA) || 
        			tipoOperacion.equals(ConstantesAlp.ACTION_MOD_VIA)){
        		respuesta = ConstantesAlp.MOD;
        	}
            return respuesta;
            
        case 1: 
        	
        	tipoOperacion = ((OperacionAlp)lstElementos.get(row)).getTipoOperacion();
        	
        	if (tipoOperacion.equals(ConstantesAlp.ACTION_ADD_NUMERO_POLICIA) || 
        			tipoOperacion.equals(ConstantesAlp.ACTION_MOD_NUMERO_POLICIA) ||
        			tipoOperacion.equals(ConstantesAlp.ACTION_DEL_NUMERO_POLICIA)){
        		respuesta = ConstantesAlp.NUMBER;
        	}
        	else if (tipoOperacion.equals(ConstantesAlp.ACTION_ADD_VIA) || 
        			tipoOperacion.equals(ConstantesAlp.ACTION_MOD_VIA) ||
        			tipoOperacion.equals(ConstantesAlp.ACTION_DEL_VIA)){
        		respuesta = ConstantesAlp.VIA;
        	}        	
            return respuesta;
            
        case 2: 
            return ((OperacionAlp)lstElementos.get(row)).getFechaOperacion();        
        default: 
            return null;
        
        }        
    }
    
    /**
     * Devuelve la FincaCatastro completa de la fila seleccionada
     * @param row �ndice de la fila cuyo objeto FincaCatastro se solicita
     * @return FincaCatastro completa
     */
    public OperacionAlp getValueAt(int row) {
        
        return (OperacionAlp)lstElementos.get(row);
        
    }
    /**
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  
     */
    public Class getColumnClass(int c) {
        //System.out.println("clase: " +getValueAt(0, c).getClass());
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