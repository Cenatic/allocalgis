/**
 * HistoricoAmortizacionTableModel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.inventario;

/**
 * Created by IntelliJ IDEA.
 * User: charo
 * Date: 07-jul-2006
 * Time: 10:11:55
 * To change this template use File | Settings | File Templates.
 */

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.table.DefaultTableModel;

import com.geopista.protocol.inventario.HistoricoAmortizacionesBean;
import com.geopista.protocol.inventario.ListaHistoricoAmortizaciones;
import com.vividsolutions.jump.I18N;

/**
 * Clase que implementa el modelo de datos de la tabla del panel BienesJPanel
 */

public class HistoricoAmortizacionTableModel  extends DefaultTableModel {
    public static final int idIndex=7;
    public static final int idNombre=1;
    private String locale;
    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HistoricoAmortizacionTableModel.class);
    private static String[] historicoAmortizaModelNames = new String[] {
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.numinventario"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.nombre"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.tipo"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.fecha"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.coste"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.cuentaAmortizacion"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.valorAmorAnio"),
			    I18N.get("LocalGISInventario","inventario.historicoamortizacion.tabla.columna.valorAmorPorc")};

   /* public ListaRoles getModelListaRoles() {
        return modelListaRoles;
    }*/


	public HistoricoAmortizacionTableModel(String locale) {
		this.locale = locale;
	}
	
    public void setModelData(ListaHistoricoAmortizaciones listaHA) {
        try
        {
          //   modelListaRoles=listaRoles;
            Hashtable auxListaHA= listaHA.getHistoricoAmortizaciones();
            for (Enumeration e=auxListaHA.elements();e.hasMoreElements();) {
            	HistoricoAmortizacionesBean auxHA =(HistoricoAmortizacionesBean) e.nextElement();	    
			    
			    Object row[] = new Object[] { auxHA.getNumInventario(),auxHA.getNombre(), auxHA.getTipoBienDenominacion(), 
			    							auxHA.getFechaAdquisicion(), auxHA.getCoste(),
			    							auxHA.getCuentaAmortizacion().getCuenta()+" - "+auxHA.getCuentaAmortizacion().getDescripcion(),
			    							auxHA.getValorAmorAnio(),auxHA.getValorAmorPorc()};
			    this.addRow(row);
		    }

	    	fireTableDataChanged();


        }catch(Exception e)
        {
            logger.error("Error al poner la lista de elementos Historicos Amortizables: "+ e.toString());
        }
	}

	public int getColumnCount() {
		return historicoAmortizaModelNames.length;
	}

	public String getColumnName(int c) {
		return historicoAmortizaModelNames[c];
	}
    public String setColumnName(int c, String sName) {
        return historicoAmortizaModelNames[c]=sName;
    }

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

}
