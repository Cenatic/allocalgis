/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.EstrategiaCreacionEntidadRepositorio;
import es.dc.a21l.base.cu.impl.TransformadorDtoBase2EntidadBase;
import es.dc.a21l.elementoJerarquia.cu.IndicadorExpresionDto;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorExpresion;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorExpresionRepositorio;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorRepositorio;
import es.dc.a21l.expresion.modelo.ExpresionRepositorio;

public class IndicadorExpresionDto2IndicadorExpresionTransformer extends TransformadorDtoBase2EntidadBase<IndicadorExpresionDto, IndicadorExpresion> {

	private ExpresionRepositorio expresionRepositorio;
	private IndicadorRepositorio indicadorRepositorio;
	
	public IndicadorExpresionDto2IndicadorExpresionTransformer(Mapper mapper,IndicadorExpresionRepositorio indicadorExpresionRepositorio,ExpresionRepositorio expresionRepositorio,IndicadorRepositorio indicadorRepositorio) {
		super(mapper);
		this.expresionRepositorio=expresionRepositorio;
		this.indicadorRepositorio=indicadorRepositorio;
		setEstrategiaCreacion(new EstrategiaCreacionEntidadRepositorio<IndicadorExpresionDto, IndicadorExpresion>(indicadorExpresionRepositorio, this));
	}
	
	@Override
	protected void aplicaPropiedadesEstendidas(IndicadorExpresionDto origen,IndicadorExpresion destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
		destino.setExpresion(expresionRepositorio.carga(origen.getIdExpresion()));
		destino.setIndicador(indicadorRepositorio.carga(origen.getIdIndicador()));
	}

}
