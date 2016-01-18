/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name="categoriaDto")
public class CategoriaDto extends ElementoJerarquiaDto {

	private Long idCategoriaPadre;
	
	//Atributos JSP
	private Boolean permisoUserNoAdmin;

	@XmlAttribute(name="idCategoriaPadre")
	public Long getIdCategoriaPadre() {
		return idCategoriaPadre;
	}

	public void setIdCategoriaPadre(Long idCategoriaPadre) {
		this.idCategoriaPadre = idCategoriaPadre;
	}

	@XmlAttribute(name="permisoUserNoAdmin")
	public Boolean getPermisoUserNoAdmin() {
		return permisoUserNoAdmin;
	}

	public void setPermisoUserNoAdmin(Boolean permisoUserNoAdmin) {
		this.permisoUserNoAdmin = permisoUserNoAdmin;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CategoriaDto)
			return this.getId()==((CategoriaDto)obj).getId();
		return super.equals(obj);
	}
}
