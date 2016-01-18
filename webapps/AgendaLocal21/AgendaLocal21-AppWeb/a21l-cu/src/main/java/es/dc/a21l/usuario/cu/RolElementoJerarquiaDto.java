/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.usuario.cu;

import javax.xml.bind.annotation.XmlRootElement;

import es.dc.a21l.base.cu.DtoBase;
import es.dc.a21l.elementoJerarquia.cu.ElementoJerarquiaDto;

@SuppressWarnings("restriction")
@XmlRootElement(name="rolElementoJerarquiaDto")
public class RolElementoJerarquiaDto extends DtoBase {
	
	private RolDto rolDto;
	private Long idElementoJerarquia;
	
	public RolElementoJerarquiaDto(){
		this.rolDto = new RolDto();
	}
	
	
	public RolDto getRolDto() {
		return rolDto;
	}

	public void setRolDto(RolDto rolDto) {
		this.rolDto = rolDto;
	}

	public Long getIdElementoJerarquia() {
		return idElementoJerarquia;
	}

	public void setIdElementoJerarquia(Long idElementoJerarquia) {
		this.idElementoJerarquia = idElementoJerarquia;
	}
	
}
