/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorStringSW;

@SuppressWarnings("restriction")
@XmlRootElement(name="valorFDDto")
public class ValorFDDto {
	private List<EncapsuladorStringSW> valores = new ArrayList<EncapsuladorStringSW>();

	@XmlElement(name="valores")
	public List<EncapsuladorStringSW> getValores() {
		return valores;
	}

	public void setValores(List<EncapsuladorStringSW> valores) {
		this.valores = valores;
	}
	
	public void addValor(EncapsuladorStringSW nuevoValor){
		valores.add(nuevoValor);
	}
}
