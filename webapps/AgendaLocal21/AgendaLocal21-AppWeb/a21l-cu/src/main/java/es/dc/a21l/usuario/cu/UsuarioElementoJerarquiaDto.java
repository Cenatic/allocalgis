/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.usuario.cu;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.cu.DtoBase;
import es.dc.a21l.elementoJerarquia.cu.ElementoJerarquiaDto;

@SuppressWarnings("restriction")
@XmlRootElement(name="usuarioElementoJerarquiaDto")
public class UsuarioElementoJerarquiaDto extends DtoBase {

	private Long idUsuario;
	private ElementoJerarquiaDto elementoJerarquiaDto;
	
	@XmlAttribute(name="idUsuario")
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@XmlElement(name="elementoJerarquiaDto")
	public ElementoJerarquiaDto getElementoJerarquiaDto() {
		return elementoJerarquiaDto;
	}

	public void setElementoJerarquiaDto(ElementoJerarquiaDto elementoJerarquiaDto) {
		this.elementoJerarquiaDto = elementoJerarquiaDto;
	}
}
