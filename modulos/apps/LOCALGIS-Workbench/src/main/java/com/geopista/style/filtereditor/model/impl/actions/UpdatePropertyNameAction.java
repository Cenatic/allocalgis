/**
 * UpdatePropertyNameAction.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 20-sep-2004
 *
 */
package com.geopista.style.filtereditor.model.impl.actions;

import javax.swing.tree.MutableTreeNode;

import com.geopista.style.filtereditor.model.impl.PropertyName;

/**
 * @author enxenio s.l.
 *
 */
public class UpdatePropertyNameAction {
	
	private PropertyName _propertyName;
	private MutableTreeNode _parentNode;
	private Integer _insert;
	private String _value;
	
	public UpdatePropertyNameAction(PropertyName propertyName,MutableTreeNode parentNode,Integer insert,String value) {
		
		_propertyName  = propertyName;
		_parentNode = parentNode;
		_insert = insert;
		_value = value;
	}
	
	public Object execute() {
		
		_propertyName.setValue(_value);
		if (_insert.intValue() == 1) {
			int numChildren = _parentNode.getChildCount();
			_parentNode.insert(_propertyName,numChildren);	
		}
		return _propertyName;
	}
}
