/**
 * Action.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 09-jun-2004
 *
 */
package es.enxenio.util.controller;

/**
 * @author enxenio s.l.
 *
 */
public interface Action {
	
	/**Este m�todo realizar� una operaci�n determinada bas�ndose en los par�metros almacenados en un objeto Request
	 * @param request Instancia que contendr� los par�metros necesarios para llevar a cabo la operaci�n
	 * @return Un ActionForward que nos indica la siguiente acci�n a realizar*/
	public ActionForward doExecute(Request request);

}
