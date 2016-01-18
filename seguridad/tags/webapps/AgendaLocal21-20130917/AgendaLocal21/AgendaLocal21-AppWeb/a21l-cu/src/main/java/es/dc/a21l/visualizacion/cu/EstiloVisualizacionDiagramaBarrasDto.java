/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.visualizacion.cu;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.utils.enumerados.TipoFecha;

/**
 *
 * @author Balidea Consulting & Programming
 */

@SuppressWarnings("restriction")
@XmlRootElement(name="estiloVisualizacionDiagramaBarrasDto")
public class EstiloVisualizacionDiagramaBarrasDto extends EstiloVisualizacionDto{

    private Integer tamanho;
    private String color;
    @XmlAttribute(name="tamanho")
    public Integer getTamanho() {
		return tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	@XmlAttribute(name="color")
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}