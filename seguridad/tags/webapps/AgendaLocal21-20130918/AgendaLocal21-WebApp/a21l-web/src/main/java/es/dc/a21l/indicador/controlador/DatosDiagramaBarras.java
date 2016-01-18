/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.indicador.controlador;

import java.util.Map.Entry;
import java.util.Set;

import es.dc.a21l.fuente.cu.ValorFDDto;

public class DatosDiagramaBarras {

	private double numPaginasDiagramas;
	private int numFilas;
	private Set<Entry<String, ValorFDDto>> datos;
	private String parametro;
	private Integer elementosPagina;

	public void setNumPaginasDiagramas(double numPaginasDiagramas) {
		this.numPaginasDiagramas = numPaginasDiagramas;
	}

	public void setNumFilas(int numFilas) {
		this.numFilas = numFilas;
	}

	public void setDatos(Set<Entry<String, ValorFDDto>> datos) {
		this.datos = datos;
	}

	public double getNumPaginasDiagramas() {
		return numPaginasDiagramas;
	}

	public int getNumFilas() {
		return numFilas;
	}

	public Set<Entry<String, ValorFDDto>> getDatos() {
		return datos;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getParametro() {
		return parametro;
	}

	public void setElementosPagina(Integer elementosPagina) {
		this.elementosPagina = elementosPagina;
	}

	public Integer getElementosPagina() {
		return elementosPagina;
	}

}