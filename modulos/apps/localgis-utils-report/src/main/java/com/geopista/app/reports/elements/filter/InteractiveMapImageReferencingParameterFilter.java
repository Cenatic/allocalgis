/**
 * InteractiveMapImageReferencingParameterFilter.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.reports.elements.filter;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRImage;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.base.JRBaseImage;

import com.geopista.app.reports.maps.MapImageConstants;
import com.geopista.app.reports.maps.MapImageExpressionManager;
import com.geopista.app.reports.maps.MapImageSettings;

public class InteractiveMapImageReferencingParameterFilter implements JasperElementFilter {

	private JRParameter parameter;
	
	private String scaleType;

	/**
     * Construye un filtro de parametro mapImage interactivo a partir de un
     * parametro y de un tipo de escala. Si el tipo de escala es null no se
     * tiene en cuenta a la hora de filtrar
     * 
     * @param parameter
     * @param scaleType
     */
	public InteractiveMapImageReferencingParameterFilter(JRParameter parameter, String scaleType){
		this.parameter = parameter;
		this.scaleType = scaleType; 
	}
	
	public boolean matches(JRElement element) {
		if (element instanceof JRImage || element instanceof JRBaseImage ){
			JRImage image = (JRImage) element;
			if (MapImageExpressionManager.isMapImageExpression(image.getExpression().getText())){
				MapImageSettings mapImageSettings =
					MapImageExpressionManager.parseExpression(image.getExpression().getText());
				
				if (mapImageSettings != null &&
						mapImageSettings.getMapSelectionIdName().equals(parameter.getName())
						&& (scaleType == null || mapImageSettings.getScale().equals(MapImageConstants.SCALE_TYPE_INTERACTIVE))){
					return true;
				}
			}
		}
		return false;
	}
}