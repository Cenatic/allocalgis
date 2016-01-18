package com.geopista.server.contaminantes.web;

import com.geopista.protocol.CResultadoOperacion;
import com.geopista.protocol.net.EnviarSeguro;
import com.geopista.protocol.contaminantes.Vertedero;
import com.geopista.protocol.contaminantes.Contaminante;
import com.geopista.server.LoggerHttpServlet;
import com.geopista.server.database.COperacionesContaminantes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.Writer;
import java.io.StringReader;

import org.exolab.castor.xml.Unmarshaller;

/**
 * The GEOPISTA project is a set of tools and applications to manage
 * geographical data for local administrations.
 *
 * Copyright (C) 2004 INZAMAC-SATEC UTE
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,
 USA.
 *
 * For more information, contact:
 *
 *
 * www.geopista.com
 *
 *
 */


/**
 * Created by IntelliJ IDEA.
 * User: angeles
 * Date: 20-oct-2004
 * Time: 9:43:15
 */
public class DeleteActividad extends LoggerHttpServlet {
	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DeleteActividad.class);

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    super.doPost(request);
		CResultadoOperacion resultado;
		try {
			Contaminante contaminante = (Contaminante) Unmarshaller.unmarshal(Contaminante.class, new StringReader(request.getParameter(EnviarSeguro.mensajeXML)));
			resultado = COperacionesContaminantes.deleteActividad(contaminante);
		} catch (Exception e) {
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter(sw);
			e.printStackTrace(pw);
			logger.error("Excepci�n al actualizar el vertedero:" + sw.toString());
			resultado = new CResultadoOperacion(false, "Excepci�n al borrar el vertedero:" + e.toString());
		}
		Writer writer = response.getWriter();
		writer.write(resultado.buildResponse());
		writer.flush();
		writer.close();
	}
}
