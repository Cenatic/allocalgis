/**
 * NumberListener.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.utilidades.event;

/**
 * @(#) NumberListener.java	1.0	99/06/17
 *
 * This code is designed for JDK1.2 and JDK1.1.5
 * Use tab spacing 4. Follow JavaDoc convention while coding.
 * Mail any suggestions or bugs to unicman@iname.com
 */

/**
 * This interface is used for number filters. All the events generated by the
 * filter can be listen to using this listener.
 *
 * @version	1.0 06/17/99
 * @author	UnicMan
 */
public interface NumberListener
{
	/**
	 * Event is generated when invalid number is entered by the user.
	 *
	 * @param	neEvt	number event object
	 */
	public void gotInvalidNumber( NumberEvent neEvt );
}
