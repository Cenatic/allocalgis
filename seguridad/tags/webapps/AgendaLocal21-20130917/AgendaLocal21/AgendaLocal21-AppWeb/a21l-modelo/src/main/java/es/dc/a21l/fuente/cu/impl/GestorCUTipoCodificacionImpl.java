/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.fuente.cu.GestorCUTipoCodificacion;
import es.dc.a21l.fuente.cu.TipoCodificacionDto;
import es.dc.a21l.fuente.modelo.TipoCodificacion;
import es.dc.a21l.fuente.modelo.TipoCodificacionRepositorio;

public class GestorCUTipoCodificacionImpl implements GestorCUTipoCodificacion{
	TipoCodificacionRepositorio tipoCodificacionRepositorio;
	private Mapper mapper;
	
	@Autowired
	public void setTipoCodificacionRepositorio(
			TipoCodificacionRepositorio tipoCodificacionRepositorio) {
		this.tipoCodificacionRepositorio = tipoCodificacionRepositorio;
	}

	@Autowired
	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}


	public EncapsuladorListSW<TipoCodificacionDto> cargaTiposCodificacion() {
		EncapsuladorListSW<TipoCodificacionDto>result=new EncapsuladorListSW<TipoCodificacionDto>();
		TipoCodificacionToTipoCodificacionDtoTransformer transformer=new TipoCodificacionToTipoCodificacionDtoTransformer(mapper);
		for(TipoCodificacion temp:tipoCodificacionRepositorio.cargaTodos()){
			result.add(transformer.transform(temp));
		}
		return result;
	}

}
