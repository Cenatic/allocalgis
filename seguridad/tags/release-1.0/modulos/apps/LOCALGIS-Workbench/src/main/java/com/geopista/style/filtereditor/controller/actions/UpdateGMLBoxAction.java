/*
 * Created on 21-sep-2004
 *
 */
package com.geopista.style.filtereditor.controller.actions;

import java.util.List;

import org.deegree.gml.GMLBox;

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
public class UpdateGMLBoxAction implements Action {

	/* (non-Javadoc)
	 * @see es.enxenio.util.controller.Action#doExecute(es.enxenio.util.controller.Request)
	 */
	public ActionForward doExecute(Request request) {

		/*Recuperamos las instancias del FrontController y de la Session*/
		FrontController frontController = FrontControllerImpl.getInstance();
		Session session = SessionImpl.getInstance();
		String srs = (String)request.getAttribute("SRS");
		double minx = ((Double)request.getAttribute("MinX")).doubleValue();
		double miny = ((Double)request.getAttribute("MinY")).doubleValue();
		double maxx = ((Double)request.getAttribute("MaxX")).doubleValue();
		double maxy = ((Double)request.getAttribute("MaxY")).doubleValue();
		GMLBox gmlBox = (GMLBox)session.getAttribute("GMLBox");
		FilterFacade filterFacade = null;
		try {
			filterFacade = FilterFacadeFactory.getDelegate();
		} catch(InternalErrorException e) {
			System.err.println(e);
		}
		gmlBox = filterFacade.updateGMLBox(gmlBox,minx,miny,maxx,maxy,srs);
		/*A�adimos el BoundingBox creado en la Session*/
		session.setAttribute("GMLBox",gmlBox);
		/*Redirigimos a otro panel*/
		String pagesVisitedName = (String)session.getAttribute("PagesVisitedListName");
		List pagesVisited = (List)session.getAttribute(pagesVisitedName);
		int size = pagesVisited.size();
		String lastPageVisited = (String) pagesVisited.remove(size-1);
		session.setAttribute(pagesVisitedName,pagesVisited);
		/*Redirecci�n a una nueva interfaz*/
		ActionForward forward = frontController.getForward(lastPageVisited);
		return forward;
	}
}
