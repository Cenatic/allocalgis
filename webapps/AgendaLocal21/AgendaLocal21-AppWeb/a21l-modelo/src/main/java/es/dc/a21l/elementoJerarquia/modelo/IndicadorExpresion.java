/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import es.dc.a21l.base.modelo.EntidadBase;
import es.dc.a21l.expresion.modelo.Expresion;
import es.dc.a21l.fuente.modelo.Atributo;

@Entity
@Table(name="Tb_A21l_Indicador_Expresion",uniqueConstraints={@UniqueConstraint(columnNames={"Id_A21l_Indicador","Id_A21l_Expresion"})})
public class IndicadorExpresion extends EntidadBase {
	
	@ManyToOne
	@JoinColumn(name="Id_A21l_Indicador",nullable=false)
	private Indicador indicador;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Id_A21l_Expresion",nullable=false)
	private Expresion expresion;

	@Column(name="ExpresionLiteral",nullable=false)
	private String expresionLiteral;
	
	@Column(name="ExpresionTransformada",nullable=false)
	private String expresionTransformada;
	
	public Indicador getIndicador() {
		return indicador;
	}

	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}

	public Expresion getExpresion() {
		return expresion;
	}

	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	public String getExpresionLiteral() {
		return expresionLiteral;
	}

	public void setExpresionLiteral(String expresionLiteral) {
		this.expresionLiteral = expresionLiteral;
	}

	public String getExpresionTransformada() {
		return expresionTransformada;
	}

	public void setExpresionTransformada(String expresionTransformada) {
		this.expresionTransformada = expresionTransformada;
	}
}
