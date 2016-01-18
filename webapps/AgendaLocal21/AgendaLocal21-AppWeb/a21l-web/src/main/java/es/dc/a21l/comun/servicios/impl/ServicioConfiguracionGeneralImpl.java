/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.comun.servicios.impl;

import es.dc.a21l.comun.servicios.ServicioConfiguracionGeneral;

public class ServicioConfiguracionGeneralImpl implements ServicioConfiguracionGeneral {

	private Integer tamanhoPagina;
	private String urlBaseSW;
	private String urlBase;
	private String caracterSeparadorCSV;
	
	public String getCaracterSeparadorCSV() {
		return caracterSeparadorCSV;
	}

	public void setCaracterSeparadorCSV(String caracterSeparadorCSV) {
		this.caracterSeparadorCSV = caracterSeparadorCSV;
	}

	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}

	public String getUrlBaseSW() {
		return urlBaseSW;
	}

	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina=tamanhoPagina;
		
	}

	public void setUrlBaseSW(String urlBaseSW) {
		this.urlBaseSW=urlBaseSW;
	}

	public String getUrlBase() {
		return urlBase;
	}

	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}
}
