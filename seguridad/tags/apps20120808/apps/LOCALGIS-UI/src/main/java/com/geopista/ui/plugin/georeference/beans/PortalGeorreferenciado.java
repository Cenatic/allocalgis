package com.geopista.ui.plugin.georeference.beans;

import com.vividsolutions.jts.geom.Point;

/**
 * @author rubengomez
 * Bean con la informaci�n de portal y geometr�a del mismo.
 * Se almacena junto con PoliciaCoincidencias para completar la georreferenciaci�n
 */
public class PortalGeorreferenciado {
	private String portal;
	private Point geometria;
	
	public PortalGeorreferenciado(String portal, Point geometria){
		
		this.portal = portal;
		this.geometria = geometria;
	
	}
	public String getPortal(){
		return this.portal;
	}
	public Point getGeometria(){
		return this.geometria;
	}
}
