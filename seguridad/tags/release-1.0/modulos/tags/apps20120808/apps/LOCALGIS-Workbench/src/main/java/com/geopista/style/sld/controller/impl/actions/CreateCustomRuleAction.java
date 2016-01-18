/*
 * Created on 27-jul-2004
 *
 */
package com.geopista.style.sld.controller.impl.actions;

import java.util.HashMap;
import java.util.List;

import org.deegree.graphics.sld.Rule;
import org.deegree.services.wfs.filterencoding.Filter;

import com.geopista.style.sld.model.SLDFacade;
import com.geopista.style.sld.model.SLDFactory;
import com.geopista.style.sld.model.ScaleRange;

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
public class CreateCustomRuleAction implements Action {

	/* (non-Javadoc)
	 * @see com.geopista.style.sld.controller.Action#doExecute(com.geopista.style.sld.controller.Request)
	 */
	public ActionForward doExecute(Request request) {

		/*Recuperamos las instancias del FrontController y de la Session*/
		FrontController frontController = FrontControllerImpl.getInstance();
		Session session = SessionImpl.getInstance();
		List pagesVisited = (List)session.getAttribute("PagesVisited");
		/*Recogemos los par�metros de la Request*/
		String ruleName = (String) request.getAttribute("RuleName");
		HashMap style = (HashMap)request.getAttribute("Style");
		Filter filter = (Filter)session.getAttribute("RuleFilter");
		/*Recogemos los par�metros necesarios de la Session*/
		ScaleRange scaleRange = (ScaleRange)session.getAttribute("ScaleRange");
		List inserts = (List)session.getAttribute("Insert");
		Integer insert = (Integer)inserts.get(2);
		Rule rule = (Rule) session.getAttribute("Rule");
		SLDFacade sldFacade = null;
		try {
			sldFacade = SLDFactory.getDelegate();
		} catch(InternalErrorException e) {
			System.err.println(e);
		}
		/*Llamamos al caso de uso del modelo*/
		rule = sldFacade.updateCustomRule(ruleName,scaleRange,
			style,filter,insert,rule);
		session.setAttribute("Rule",rule);
		session.setAttribute("ScaleRange",scaleRange);
		/*Actualizamos el par�metro PagesVisited en la Session*/
		int size = pagesVisited.size();
		String lastPageVisited = (String) pagesVisited.remove(size-1);
		session.setAttribute("PagesVisited",pagesVisited);
		/*Redirigimos a otra acci�n*/
		ActionForward forward = frontController.getForward(lastPageVisited);
		return forward;
		
	}
}
