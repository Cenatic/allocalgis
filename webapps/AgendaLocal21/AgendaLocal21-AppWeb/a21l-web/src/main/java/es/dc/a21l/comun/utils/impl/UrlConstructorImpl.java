/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.comun.utils.impl;

import es.dc.a21l.comun.utils.UrlConstructor;
public class UrlConstructorImpl implements UrlConstructor{
	
	private String url;
	
	public UrlConstructorImpl(String direccionBase){
		url=direccionBase;
	}

	public String getUrl() {
		return url;
	}

	public void setParametro(String nombre, Object parametro) {
		if(url.endsWith("?")){
			url=url+nombre+"="+parametro.toString();
			return;
		}
		url=url+"&"+nombre+"="+parametro.toString();
	}

	public void setDireccionControlador(String direccionControlador) {
		url=url+direccionControlador+"?";
		
	}

	public void setAccion(String accion) {
		if(url.endsWith("?")){
			url=url+"accion="+accion;
			return;
		}
		url=url+"&accion="+accion;
	}

}
