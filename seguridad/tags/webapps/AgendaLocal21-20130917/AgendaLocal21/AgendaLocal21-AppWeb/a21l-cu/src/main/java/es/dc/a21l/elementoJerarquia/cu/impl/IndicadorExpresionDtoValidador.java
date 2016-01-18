/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu.impl;

import org.apache.commons.lang3.StringUtils;

import es.dc.a21l.base.modelo.GestionErrores.EncapsuladorErroresSW;
import es.dc.a21l.base.modelo.validadores.ValidadorDtoBase;
import es.dc.a21l.elementoJerarquia.cu.IndicadorExpresionDto;

public class IndicadorExpresionDtoValidador extends ValidadorDtoBase<IndicadorExpresionDto>{

	
	protected void aplicaValidacion(IndicadorExpresionDto dto, EncapsuladorErroresSW erros) {
		if(StringUtils.isBlank(dto.getExpresionLiteral())){
			erros.addError(IndicadorExpresionDtoFormErrorsEmun.EXPRESION_LITERAL_VACIA);
		}
		if(StringUtils.isBlank(dto.getExpresionTransformada())){
			erros.addError(IndicadorExpresionDtoFormErrorsEmun.EXPRESION_TRANSFORMADA_VACIA);
		}
		
		if(dto.getIdIndicador()==null || dto.getIdIndicador()<1 ){
			erros.addError(IndicadorExpresionDtoFormErrorsEmun.INDICADOR_VACIO);
		}
//		if(dto.getIdExpresion()==null || dto.getIdExpresion()<1){
//			erros.addError(IndicadorExpresionDtoFormErrorsEmun.EXPRESION_VACIA);
//		}
	};
}
