/*
 * Created on 20-sep-2004
 *
 */
package com.geopista.style.filtereditor.controller.actions;

import java.util.List;

import org.deegree.gml.GMLException;
import org.deegree.gml.GMLGeometry;

import com.geopista.style.filtereditor.model.FilterFacade;
import com.geopista.style.filtereditor.model.FilterFacadeFactory;

import es.enxenio.util.controller.Action;
import es.enxenio.util.controller.ActionForward;
import es.enxenio.util.controller.FrontController;
import es.enxenio.util.controller.Request;
import es.enxenio.util.controller.Session;
import es.enxenio.util.controller.impl.FrontControllerImpl;
import es.enxenio.util.controller.impl.SessionImpl;
import es.enxenio.util.exceptions.InternalErrorException;

/**
 * @author enxenio s.l.
 *
 */
public class AddGMLGeometryAction implements Action {

	/* (non-Javadoc)
	 * @see es.enxenio.util.controller.Action#doExecute(es.enxenio.util.controller.Request)
	 */
	public ActionForward doExecute(Request request) {

		/*Recuperamos las instancias del FrontController y de la Session*/
		FrontController frontController = FrontControllerImpl.getInstance();
		Session session = SessionImpl.getInstance();
		FilterFacade filterFacade = null;
		GMLGeometry geometry = null;
		try {
			filterFacade = FilterFacadeFactory.getDelegate();
			geometry = filterFacade.addGMLGeometry();
		} catch(InternalErrorException e) {
			System.err.println(e);
		} catch (GMLException e) {
			System.err.println(e);
		}
		/*A�adimos la geometria creada en la Session*/
		session.setAttribute("GMLGeometry",geometry);
		/*Redirigimos a otro panel*/
		String pagesVisitedName = (String)session.getAttribute("PagesVisitedListName");
		List pagesVisited = (List)session.getAttribute(pagesVisitedName);
		pagesVisited.add("InsertUpdateDistanceBufferOp");
		session.setAttribute(pagesVisitedName,pagesVisited);
		/*Redirecci�n a una nueva interfaz*/
		ActionForward forward = frontController.getForward("InsertUpdateGMLGeometry");
		return forward;
	}
}
