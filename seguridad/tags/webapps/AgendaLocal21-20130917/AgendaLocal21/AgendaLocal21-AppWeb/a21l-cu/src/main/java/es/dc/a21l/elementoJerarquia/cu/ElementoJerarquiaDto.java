/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.cu.DtoBase;

@SuppressWarnings("restriction")
@XmlRootElement(name="elementoJerarquiaDto")
public class ElementoJerarquiaDto extends DtoBase implements Comparable<ElementoJerarquiaDto>{

	private String nombre;
	private String descripcion;
	
	
	@XmlAttribute(name="nombre")
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlAttribute(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int compareTo(ElementoJerarquiaDto o) {
		return nombre.compareTo(o.getNombre());
	}
	
	
}
