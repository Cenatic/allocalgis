/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.usuario.cu.impl;

import es.dc.a21l.base.modelo.GestionErrores.enumerados.FormErrorEmun;

public enum RolDtoFormErrorsEmun implements FormErrorEmun {
	
	PERMISOVACIO("eltosJerarquia","validacion.rol.permiso.vacio"),
	NOMBREVACIO("nombre","validacion.rol.nombre.vacio"),
	ERROR_PERMISOS("eltosJerarquia","validacion.rol.eltosJerarquia.error"),
	NOMBRE_EN_USO("nombre","validacion.rol.eltosJerarquia.nombre.uso");

	private String atributo;
	private String cadenaCodigoError;

	
	RolDtoFormErrorsEmun(String atributo,String cadenaCodigoError){
		this.atributo=atributo;
		this.cadenaCodigoError=cadenaCodigoError;
	}
	
	public String getAtributo() {
		return atributo;
	}

	public String getCadenaCodigoError() {
		return cadenaCodigoError;
	}

}
