/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.visualizacion.cu;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.cu.DtoBase;

/**
 *
 * @author Balidea Consulting & Programming
 */

@SuppressWarnings("restriction")
@XmlRootElement(name="rangosVisualizacionMapaDto")
public class RangosVisualizacionMapaDto extends DtoBase{
	private Double inicio;
	private Double fin;
	private String color;
	private EstiloVisualizacionMapaDto estiloMapa;
	
	public EstiloVisualizacionMapaDto getEstiloMapa() {
		return estiloMapa;
	}
	public void setEstiloMapa(EstiloVisualizacionMapaDto estiloMapa) {
		this.estiloMapa = estiloMapa;
	}
	@XmlAttribute(name="inicio")
	public Double getInicio() {
		return inicio;
	}
	public void setInicio(Double inicio) {
		this.inicio = inicio;
	}
	@XmlAttribute(name="fin")
	public Double getFin() {
		return fin;
	}
	public void setFin(Double fin) {
		this.fin = fin;
	}
	@XmlAttribute(name="color")
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
