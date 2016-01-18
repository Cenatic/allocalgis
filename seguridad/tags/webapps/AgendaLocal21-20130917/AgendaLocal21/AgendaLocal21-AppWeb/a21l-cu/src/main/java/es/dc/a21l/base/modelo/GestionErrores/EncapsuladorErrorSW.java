/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.base.modelo.GestionErrores;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.modelo.GestionErrores.enumerados.FormErrorEmun;

@SuppressWarnings("restriction")
@XmlRootElement(name="encapsuladorErrorSW")
public class EncapsuladorErrorSW {
	
	private String atributo;
	private String cadenaCodigoError;
	
	public EncapsuladorErrorSW(){
		
	}
	public EncapsuladorErrorSW(FormErrorEmun errorEmun){
		this.atributo=errorEmun.getAtributo();
		this.cadenaCodigoError=errorEmun.getCadenaCodigoError();
	}
	
	
    @XmlAttribute(name="atributo")
	public String getAtributo() {
		return atributo;
	}
    
    @XmlAttribute(name="cadenaCodigoError")
	public String getCadenaCodigoError() {
		return cadenaCodigoError;
	}
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	public void setCadenaCodigoError(String cadenaCodigoError) {
		this.cadenaCodigoError = cadenaCodigoError;
	}	

}
