/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.usuario.cu;

import java.util.List;

import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;


public interface GestorCUUsuarioPermiso {
	public EncapsuladorListSW<UsuarioElementoJerarquiaDto> cargarPermisosPorUsuario(Long idUsuario);
	public void actualizarListaPermisosUsuario(Long idUsuario, List<Long> listaEltosJerarquia);
	public Boolean cargaEsUsuarioConPermisosVerCategoria(Long idCategoria, UsuarioDto usuarioDto);
	public Boolean cargaEsUsuarioConPermisosEdicionIndicador(Long idCategoria, UsuarioDto usuarioDto);
	public Boolean cargaUsuarioConPermisosVerIndicador(Long idIndicador,UsuarioDto usuarioDto);
	public Boolean guardaPermisoUsuario(Long idUsuario, Long idIndicador);
	public Boolean esUsuarioConPermisosSobreIndicador(Long idIndicador,UsuarioDto usuarioDto);
}
