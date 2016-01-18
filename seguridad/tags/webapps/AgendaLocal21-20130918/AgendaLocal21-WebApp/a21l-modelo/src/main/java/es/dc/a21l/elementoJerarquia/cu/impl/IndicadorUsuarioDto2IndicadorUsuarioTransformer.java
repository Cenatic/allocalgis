/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.EstrategiaCreacionEntidadRepositorio;
import es.dc.a21l.base.cu.impl.TransformadorDtoBase2EntidadBase;
import es.dc.a21l.elementoJerarquia.cu.IndicadorUsuarioDto;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorRepositorio;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorUsuario;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorUsuarioRepositorio;
import es.dc.a21l.usuario.modelo.UsuarioRepositorio;

public class IndicadorUsuarioDto2IndicadorUsuarioTransformer extends TransformadorDtoBase2EntidadBase<IndicadorUsuarioDto, IndicadorUsuario> {

	private IndicadorRepositorio indicadorRepositorio;
	private UsuarioRepositorio usuarioRepositorio;
	
	public IndicadorUsuarioDto2IndicadorUsuarioTransformer(Mapper mapper,IndicadorUsuarioRepositorio indicadorUsuarioRepositorio,IndicadorRepositorio indicadorRepositorio,UsuarioRepositorio usuarioRepositorio) {
		super(mapper);
		this.indicadorRepositorio=indicadorRepositorio;
		this.usuarioRepositorio=usuarioRepositorio;
		setEstrategiaCreacion(new EstrategiaCreacionEntidadRepositorio<IndicadorUsuarioDto, IndicadorUsuario>(indicadorUsuarioRepositorio, this));
	}
	
	@Override
	protected void aplicaPropiedadesEstendidas(IndicadorUsuarioDto origen,IndicadorUsuario destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
		destino.setIndicador(indicadorRepositorio.carga(origen.getIdIndicador()));
		destino.setUsuario(usuarioRepositorio.carga(origen.getIdUsuario()));
	}

}
