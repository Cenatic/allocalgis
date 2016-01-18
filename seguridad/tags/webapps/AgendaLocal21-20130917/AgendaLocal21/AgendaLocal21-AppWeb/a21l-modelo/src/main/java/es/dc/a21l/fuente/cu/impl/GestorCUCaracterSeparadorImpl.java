/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.fuente.cu.CaracterSeparadorDto;
import es.dc.a21l.fuente.cu.GestorCUCaracterSeparador;
import es.dc.a21l.fuente.modelo.CaracterSeparador;
import es.dc.a21l.fuente.modelo.CaracterSeparadorRepositorio;

public class GestorCUCaracterSeparadorImpl implements GestorCUCaracterSeparador{
	CaracterSeparadorRepositorio caracterSeparadorRepositorio;
	private Mapper mapper;

	@Autowired
	public void setCaracterSeparadorRepositorio(
			CaracterSeparadorRepositorio caracterSeparadorRepositorio) {
		this.caracterSeparadorRepositorio = caracterSeparadorRepositorio;
	}

	@Autowired
	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	public EncapsuladorListSW<CaracterSeparadorDto> cargaCaracteresSeparadores() {
		EncapsuladorListSW<CaracterSeparadorDto>lista=new EncapsuladorListSW<CaracterSeparadorDto>();
		CaracterSeparador2CaracterSeparadorDtoTransformer transformer=new CaracterSeparador2CaracterSeparadorDtoTransformer(mapper);
		for(CaracterSeparador temp:caracterSeparadorRepositorio.cargaTodos()){
			lista.add(transformer.transform(temp));
		}
		return lista;
	}

}
