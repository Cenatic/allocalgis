/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.metadatos.cu.impl;


import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.EstrategiaCreacionEntidadRepositorio;
import es.dc.a21l.base.cu.impl.TransformadorDtoBase2EntidadBase;
import es.dc.a21l.metadatos.cu.MetadatosDto;
import es.dc.a21l.metadatos.modelo.Metadatos;
import es.dc.a21l.metadatos.modelo.MetadatosRepositorio;


public class MetadatosDto2MetadatosTransformer extends  TransformadorDtoBase2EntidadBase<MetadatosDto, Metadatos>  {
    
	public MetadatosDto2MetadatosTransformer(Mapper mapper, MetadatosRepositorio metadatosRepositorio) {
        super(mapper);
        setEstrategiaCreacion(new EstrategiaCreacionEntidadRepositorio<MetadatosDto, Metadatos>(metadatosRepositorio, this));
    }
	
	@Override
	protected void aplicaPropiedadesEstendidas(MetadatosDto dto, Metadatos vo) {
		super.aplicaPropiedadesEstendidas(dto, vo);
	}

}