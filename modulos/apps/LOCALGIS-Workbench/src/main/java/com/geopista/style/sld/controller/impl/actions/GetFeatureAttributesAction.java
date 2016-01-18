/**
 * GetFeatureAttributesAction.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 29-jul-2004
 *
 */
package com.geopista.style.sld.controller.impl.actions;

import java.util.HashMap;

import com.geopista.style.sld.model.SLDFacade;
import com.geopista.style.sld.model.SLDFactory;
import com.vividsolutions.jump.workbench.model.Layer;

import es.enxenio.util.controller.Action;
import es.enxenio.util.controller.ActionForward;
import es.enxenio.util.controller.FrontController;
import es.enxenio.util.controller.Request;
import es.enxenio.util.controller.Session;
import es.enxenio.util.controller.impl.FrontControllerImpl;
import es.enxenio.util.controller.impl.SessionImpl;
/**
 * @author enxenio s.l.
 *
 */
public class GetFeatureAttributesAction implements Action {

	/* (non-Javadoc)
	 * @see com.geopista.style.sld.controller.Action#doExecute(com.geopista.style.sld.controller.Request)
	 */
	public ActionForward doExecute(Request request) {

		HashMap featureAttributes = new HashMap();
		/*Recuperamos las instancias del FrontController y de la Session*/
		FrontController frontController = FrontControllerImpl.getInstance();	
		Session session = SessionImpl.getInstance();
		Layer layer = (Layer)session.getAttribute("Layer");	
		SLDFacade sldFacade = null;
		try {
			sldFacade = SLDFactory.getDelegate();
			featureAttributes = sldFacade.getFeatureAttributes(layer);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
		session.setAttribute("FeatureAttributes", featureAttributes);
		/*Redirigimos a otra acci�n*/
		ActionForward forward = null;
		return forward;
	}
}
