/**
 * AuthenticationFilter.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package es.satec.localgismobile.server.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {
    
	private static final String HEADER_NAME = "X-Validation";
	private static final String HEADER_VALUE_LOGIN_REQUIRED = "login_required";

	/**
     * Constante que indica el nombre del atributo donde guardamos si se ha
     * hecho login o no. El valor del atributo ser� el nombre del usuario con el
     * que se hizo login
     */
	public static final String LOGIN_ATTRIBUTE = "LoginAttribute";
	public static final String SM_ATTRIBUTE = "SecurityManagerAttribute";

    /**
     * P�gina de login
     */
    private String loginAction;

    /*
     * (non-Javadoc)
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig config) throws ServletException {
        loginAction = config.getInitParameter("loginAction");
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		 * Si no se ha hecho login enviamos la cabecera login_required
		 */
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpSession session = httpServletRequest.getSession();
		String loginActionWithContext = httpServletRequest.getContextPath()+loginAction;
		if (!httpServletRequest.getRequestURI().equals(loginActionWithContext) && session.getAttribute(LOGIN_ATTRIBUTE) == null) {
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			httpServletResponse.addHeader(HEADER_NAME, HEADER_VALUE_LOGIN_REQUIRED);
			return;
		}
		chain.doFilter(request, response);
	}

	public void destroy() {
	}
}
