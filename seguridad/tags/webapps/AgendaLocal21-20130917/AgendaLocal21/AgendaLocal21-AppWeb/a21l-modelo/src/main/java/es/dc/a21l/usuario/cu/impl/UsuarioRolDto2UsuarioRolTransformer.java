/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.usuario.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.EstrategiaCreacionEntidadRepositorio;
import es.dc.a21l.base.cu.impl.TransformadorDtoBase2EntidadBase;
import es.dc.a21l.usuario.cu.UsuarioRolDto;
import es.dc.a21l.usuario.modelo.RolRepositorio;
import es.dc.a21l.usuario.modelo.UsuarioRepositorio;
import es.dc.a21l.usuario.modelo.UsuarioRol;
import es.dc.a21l.usuario.modelo.UsuarioRolRepositorio;

public class UsuarioRolDto2UsuarioRolTransformer extends TransformadorDtoBase2EntidadBase<UsuarioRolDto, UsuarioRol> {

	private UsuarioRepositorio usuarioRepositorio;
	private RolRepositorio rolRepositorio;
	
	public UsuarioRolDto2UsuarioRolTransformer(Mapper mapper, UsuarioRolRepositorio usuarioRolRepositorio,UsuarioRepositorio usuarioRepositorio, RolRepositorio rolRepositorio) {
		super(mapper);
		this.usuarioRepositorio=usuarioRepositorio;
		this.rolRepositorio=rolRepositorio;
		setEstrategiaCreacion(new EstrategiaCreacionEntidadRepositorio<UsuarioRolDto, UsuarioRol>(usuarioRolRepositorio, this));
	}
	
	@Override
	protected void aplicaPropiedadesEstendidas(UsuarioRolDto origen,UsuarioRol destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
		destino.setRol(rolRepositorio.carga(origen.getRolDto().getId()));
		destino.setUsuario(usuarioRepositorio.carga(origen.getIdUsuario()));
	}

}
