/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu.impl;

import org.apache.commons.lang3.StringUtils;

import es.dc.a21l.base.modelo.GestionErrores.EncapsuladorErroresSW;
import es.dc.a21l.base.modelo.validadores.ValidadorDtoBase;
import es.dc.a21l.elementoJerarquia.cu.CategoriaDto;

public class CategoriaDtoValidador extends ValidadorDtoBase<CategoriaDto> {
	
	@Override
	protected void aplicaValidacion(CategoriaDto dto,EncapsuladorErroresSW erros) {
		super.aplicaValidacion(dto, erros);
		if(StringUtils.isBlank(dto.getNombre())){
			erros.addError(CategoriaDtoFormErrorsEmun.NOMBRE_VACIO);
		}
		if(StringUtils.length(dto.getDescripcion())>255){
			erros.addError(CategoriaDtoFormErrorsEmun.ERROR_TAMANHO_DESC);
		}
	}

}
