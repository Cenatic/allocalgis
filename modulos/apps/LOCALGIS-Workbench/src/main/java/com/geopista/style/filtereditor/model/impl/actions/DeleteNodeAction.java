/**
 * DeleteNodeAction.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 17-sep-2004
 *
 */
package com.geopista.style.filtereditor.model.impl.actions;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/**
 * @author enxenio s.l.
 *
 */
public class DeleteNodeAction {

	private DefaultTreeModel _filterTree;
	private MutableTreeNode _node;
	
	public DeleteNodeAction(DefaultTreeModel filterTree,MutableTreeNode node) {
		
		_filterTree = filterTree;
		_node = node;
	}
	
	public void execute() {
		
		MutableTreeNode parentNode = (MutableTreeNode)_node.getParent();
		if (parentNode == null) {
			_filterTree.removeNodeFromParent(_node);
		}
		else {
			parentNode.remove(_node);
		}
	}
}
