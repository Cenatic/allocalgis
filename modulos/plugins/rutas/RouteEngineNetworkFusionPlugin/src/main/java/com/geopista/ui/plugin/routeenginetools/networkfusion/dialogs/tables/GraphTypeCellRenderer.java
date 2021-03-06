/**
 * GraphTypeCellRenderer.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.ui.plugin.routeenginetools.networkfusion.dialogs.tables;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import com.localgis.route.graph.structure.basic.GraphType;
import com.vividsolutions.jump.I18N;

public class GraphTypeCellRenderer  implements TableCellRenderer{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		GraphType gType = (GraphType) value;
		JLabel aux = null;
		String desc = "";
		if(gType.equals(GraphType.GENERIC))
			desc = I18N.get("networkFusion","routeengine.networkfusion.graphType.generic");
		if(gType.equals(GraphType.STREET))
			desc = I18N.get("networkFusion","routeengine.networkfusion.graphType.street");
		aux = new JLabel(desc);
		 if (isSelected)
	        {
	             aux.setBorder(BorderFactory.createLineBorder(Color.RED));
	         }
        return aux;
	}

}
