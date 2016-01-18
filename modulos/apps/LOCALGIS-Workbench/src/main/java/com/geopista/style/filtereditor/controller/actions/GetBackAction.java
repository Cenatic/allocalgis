/**
 * GetBackAction.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 17-sep-2004
 *
 */
package com.geopista.style.filtereditor.controller.actions;

import java.util.ArrayList;

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
public class GetBackAction implements Action {

	/* (non-Javadoc)
	 * @see es.enxenio.util.controller.Action#doExecute(es.enxenio.util.controller.Request)
	 */
	public ActionForward doExecute(Request request) {

		/*Recuperamos las instancias del FrontController y de la Session*/
		FrontController frontController = FrontControllerImpl.getInstance();
		Session session = SessionImpl.getInstance();
		/*Obtenemos el nombre de la lista de p�ginas visitadas en la Session*/
		String pagesVisitedList = (String)session.getAttribute("PagesVisitedListName");
		/*Actualizamos el par�metro PagesVisited en la Session*/
		ArrayList pagesVisited = (ArrayList)session.getAttribute(pagesVisitedList);
		int size = pagesVisited.size();
		if (size != 0) {
			String lastPageVisited = (String)pagesVisited.remove(size-1);
			session.setAttribute("PagesVisited",pagesVisited);
			/*Redirigimos a otra acci�n*/
			ActionForward forward = frontController.getForward(lastPageVisited);
			return forward;
		}
		else { 
		/* Si la lista est� vacia, es que no hay a donde redirigir, por lo que devolvemos null */
			return null;
		}		
	}
}
