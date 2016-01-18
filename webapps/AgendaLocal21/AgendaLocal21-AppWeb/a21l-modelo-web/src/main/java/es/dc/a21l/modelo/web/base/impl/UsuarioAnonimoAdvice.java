/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.modelo.web.base.impl;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import es.dc.a21l.modelo.web.base.UsuarioDetalles;

public class UsuarioAnonimoAdvice implements MethodBeforeAdvice {
	private UsuarioDetalles usuarioAnonimo;

	@Autowired
	public void setUsuarioAnonimo(UsuarioDetalles usuarioAnonimo) {
		this.usuarioAnonimo = usuarioAnonimo;
	}

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		if (SecurityContextHolder.getContext().getAuthentication() == null)
			SecurityContextHolder.getContext().setAuthentication(
					new UsernamePasswordAuthenticationToken(
							this.usuarioAnonimo, this.usuarioAnonimo
									.getPassword(), this.usuarioAnonimo
									.getAuthorities()));
	}
}
