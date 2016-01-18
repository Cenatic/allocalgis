/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu;


@SuppressWarnings("serial")
public class IndicadorExpresionHistoricoDto extends DtoBaseHistorico {

	private Long idIndicador;
	private Long idExpresion;
	private String expresionLiteral;
	private String expresionTransformada;

	public Long getIdIndicador() {
		return idIndicador;
	}

	public void setIdIndicador(Long idIndicador) {
		this.idIndicador = idIndicador;
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

	public Long getIdExpresion() {
		return idExpresion;
	}

	public void setIdExpresion(Long idExpresion) {
		this.idExpresion = idExpresion;
	}
	
}

