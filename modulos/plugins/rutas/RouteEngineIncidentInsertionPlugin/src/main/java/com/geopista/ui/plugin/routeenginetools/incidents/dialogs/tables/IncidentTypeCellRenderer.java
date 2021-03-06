/**
 * IncidentTypeCellRenderer.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.ui.plugin.routeenginetools.incidents.dialogs.tables;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import com.localgis.route.graph.structure.basic.LocalGISIncident;

public class IncidentTypeCellRenderer implements TableCellRenderer{

	
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		LocalGISIncident incident = (LocalGISIncident) value;
		String incidentType = "";
		if(incident.getIncidentType() == LocalGISIncident.PATH_CLOSED_TO_VEHICLES)
			incidentType = "Cerrado a Vehiculos";
		if(incident.getIncidentType() == LocalGISIncident.PATH_DISABLED)
			incidentType = "Cerrado";
		JLabel aux = new JLabel(incidentType);
        if (isSelected)
        {
             aux.setBorder(BorderFactory.createLineBorder(Color.RED));
         }
        return aux;
	}

}
