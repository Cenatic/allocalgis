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
 * Define el aspecto de una lista de estructuras (patron - descripcion)
 * mostrando o bien �nicamente la descripci�n para cada patr�n o el patr�n y 
 * la descripci�n separados por dos espacios
 * 
 * @author cotesa
 *
 */
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.geopista.app.catastro.model.beans.EstructuraDB;

public class EstructuraDBListCellRenderer extends JLabel implements ListCellRenderer {
    
    private boolean printPatron = false;
    
    /**
     * Constructor por defecto
     *
     */
   
    public EstructuraDBListCellRenderer() {
       this (true);
    }
    public EstructuraDBListCellRenderer(boolean printPatron) {
        super();
        setOpaque(true);
        this.printPatron = printPatron;
    }
    /**
     * Obtiene el componente a pintar
     * 
     * @param list La lista en la que est� el componente
     * @param value Atributo a pintar
     * @param index Posici�n del componente en la lista
     * @param isSelected Verdadero si el componente est� seleccionado
     * @param cellHasFocus Verdadero si el componente tiene el foco
     */
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus)
    {                   
        if (value instanceof EstructuraDB)
        {
            StringBuffer sb = new StringBuffer();
            if (printPatron)
            {
                sb.append(((EstructuraDB)value).getPatron()).append("  "); 
            }
            sb.append(((EstructuraDB)value).getDescripcion());
            setText(sb.toString());    
        }
        
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }        
        return this;
    }
}
