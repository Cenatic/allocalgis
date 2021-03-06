/**
 * NumberEvent.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.utilidades.event;
import java.util.EventObject;

/**
 * This class is to support NumberListener. All the details of the events
 * generated by this listener are stored in the object of this class.
 * 
 * @version	1.0 06/17/99
 * @author	UnicMan
 */
public class NumberEvent
	extends		EventObject
{
	private String	mszText;

	public NumberEvent( Object oSource, String szText )
	{
		super( oSource );
		mszText = szText;
	}

	/**
	 * Returns the invalid text that was entered by the user in the textfield.
	 *
	 * @return	text entered by the user
	 */
	public String getInvalidText()
	{
		return	mszText;
	}
}
