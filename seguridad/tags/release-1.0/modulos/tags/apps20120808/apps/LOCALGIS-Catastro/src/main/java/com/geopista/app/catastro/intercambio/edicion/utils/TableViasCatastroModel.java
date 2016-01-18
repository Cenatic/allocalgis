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


package com.geopista.app.catastro.intercambio.edicion.utils;


/**
 * Modelo para mostrar las v�as en las tablas de v�as
 * 
 * @author cotesa
 *
 */

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import com.geopista.protocol.catastro.Via;
import com.vividsolutions.jump.I18N;


public class TableViasCatastroModel extends AbstractTableModel {
    
    private String[] columnNames = {I18N.get("Expedientes","busqueda.vias.columna.tipo"),
            I18N.get("Expedientes","busqueda.vias.columna.nombre"), I18N.get("Expedientes","busqueda.vias.columna.municipio")};
    
    private ArrayList lstVias = new ArrayList();
    
    
    public TableViasCatastroModel() {
        new DefaultTableModel(columnNames, 0);
    }
    
    public TableViasCatastroModel(String[] colNames) {
        columnNames= colNames;
        new DefaultTableModel(columnNames, 0);
    }
    
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
        return lstVias.size();
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
        
        if (lstVias.get(row)==null)
            return null;
        
        switch (col)
        {
        case 0: 
            return ((Via)lstVias.get(row)).getTipoViaNormalizadoCatastro();
        case 1: 
            return ((Via)lstVias.get(row)).getNombreCatastro();
        case 2: 
            return ((Via)lstVias.get(row)).getMunicipio();
       
        default: 
            return null;
        
        }        
    }
    
    /**
     * Devuelve la Via completa de la fila seleccionada
     * @param row �ndice de la fila cuyo objeto Via se solicita
     * @return Via completa
     */
    public Via getValueAt(int row) {
        
        return (Via)lstVias.get(row);
        
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
    
    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col) {        
       
        if (lstVias.get(row) !=null)
        {    	
            switch (col)
            {
            case 0: 
                ((Via)lstVias.get(row)).setTipoViaNormalizadoCatastro(value.toString());
                break;
            case 1: 
                ((Via)lstVias.get(row)).setNombreCatastro(value.toString());
                break;
            case 2: 
                ((Via)lstVias.get(row)).setMunicipio(value.toString());
                break;
            default: 
                break;
            }            
            
            fireTableCellUpdated(row, col);
        }        
    }  
    
    /**
     * Establece los datos mostrados en el modelo
     * @param datos Datos a mostrar en el modelo
     */
    public void setData (ArrayList datos)
    {
        this.lstVias = datos;
    }
    
    /**
     * Recupera los datos del modelo
     * @return Datos del modelo
     */
    public ArrayList getData (){
        return lstVias;
    }    
}