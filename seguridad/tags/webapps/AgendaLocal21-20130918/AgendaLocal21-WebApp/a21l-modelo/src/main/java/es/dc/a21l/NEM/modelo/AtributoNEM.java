/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.NEM.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import es.dc.a21l.base.modelo.EntidadBase;

@Entity
@Table(name="Tb_A21l_AtributoNEM",uniqueConstraints={@UniqueConstraint(columnNames={"Expresion"}),@UniqueConstraint(columnNames={"ExpresionXpath"})})
public class AtributoNEM extends EntidadBase {
	
	@Column(name="Expresion",nullable=false, length=4000)
	private String expresion;
	
	@Column(name="ExpresionXpath",nullable=false, length=4000)
	private String expresionXpath;

	public String getExpresion() {
		return expresion;
	}

	public void setExpresion(String expresion) {
		this.expresion = expresion;
	}

	public String getExpresionXpath() {
		return expresionXpath;
	}

	public void setExpresionXpath(String expresionXpath) {
		this.expresionXpath = expresionXpath;
	}

}
