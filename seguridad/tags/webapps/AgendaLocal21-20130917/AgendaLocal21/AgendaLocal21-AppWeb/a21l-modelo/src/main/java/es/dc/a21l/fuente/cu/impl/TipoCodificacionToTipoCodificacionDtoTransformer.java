/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.TransformadorEntidadBase2DtoBase;
import es.dc.a21l.fuente.cu.TipoCodificacionDto;
import es.dc.a21l.fuente.modelo.TipoCodificacion;

public class TipoCodificacionToTipoCodificacionDtoTransformer extends TransformadorEntidadBase2DtoBase<TipoCodificacion, TipoCodificacionDto>{

	public TipoCodificacionToTipoCodificacionDtoTransformer(Mapper mapper) {
		super(mapper);
	}

	@Override
	protected void aplicaPropiedadesEstendidas(TipoCodificacion origen,TipoCodificacionDto destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
		destino.setNombre(origen.getNombre());
	}
}
