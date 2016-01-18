/**
 * OperacionesTableModel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.administrador.usuarios;

import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

import com.geopista.protocol.administrador.Operacion;

public class OperacionesTableModel extends DefaultTableModel {
		
	    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(OperacionesTableModel.class);
	   
	    private static String[] tableModelNames = new String[] { "", "ELEM_AFECTADO", "OPERACION", "NOMBRE", "FECHA", };

	    public void setModelData(Hashtable listaOperaciones) {
	        try  {
	            if (listaOperaciones != null){
	       
		            for (Iterator it= listaOperaciones.keySet().iterator(); it.hasNext(); ) {		            	
		            	String opCount = (String) it.next();
		            	Operacion op = (Operacion) listaOperaciones.get(opCount);
		            	
		                SimpleDateFormat formatter = new SimpleDateFormat ("dd-MM-yyyy HH:mm:ss");
		                String fecha =(op.getFechaOperacion()==null?"":formatter.format(op.getFechaOperacion()));                  
		                
		                Object row[] = new Object[] {opCount, op.getTipoOperacion(), op.getOperacionRealizada(), op.getCapaAfectada(), fecha};
					    this.addRow(row);
		            }
	            }

		    	fireTableDataChanged();


	        }
	        catch(Exception e) {
	            logger.error("Error al poner la lista de operaciones: "+ e.toString());
	        }
		}

		public int getColumnCount() {
			return tableModelNames.length;
		}

		public String getColumnName(int c) {
			return tableModelNames[c];
		}
	    public String setColumnName(int c, String sName) {
	        return tableModelNames[c]=sName;
	    }

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return false;
		}
		
}
