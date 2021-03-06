/**
 * UMNumberFormat.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.utilidades.filteredText;

import java.text.ParseException;

/**
 * @(#) UMNumberFormat.java	1.0	99/07/19
 *
 * This code is designed for JDK1.1 & JDK1.2
 * Use tab spacing 4. Follow JavaDoc convention while coding.
 * Mail any suggestions or bugs to unicman@iname.com
 */

/**
 * This interface is a skeleton for creating number formats. Using this skeleton
 * you can display and parse numbers in your own formats. Only methods in this
 * interface has to be implemented.
 *
 * @version	1.0	07/19/99
 * @author	UnicMan
 */
public interface UMNumberFormat
{
	/**
	 * All the number adapters use this method for parsing the texual number.
	 *
	 * NOTE: This method should NOT return 'null' unless ParseException occurs,
	 * because it is assumed when using this method.
	 *
	 * @param	szText	date in string format
	 * @return	Number object with converted date
	 */
	public Number parseNumber( String szText )
		throws	ParseException;

	/**
	 * All the number adapters use this method for showing the formatted number
	 * in the text-field. This method should return a string which is valid
	 * when sent to parseNumber method.
	 *
	 * @param	nNumber	date to convert
	 * @return	number in string format
	 */
	public String formatNumber( Number nNumber );
}
