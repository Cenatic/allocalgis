/**
 * GeopistaTaskFrame.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JPopupMenu;

import com.geopista.model.GeopistaMap;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.model.LayerTreeModel;
import com.vividsolutions.jump.workbench.model.Task;
import com.vividsolutions.jump.workbench.ui.LayerNamePanel;
import com.vividsolutions.jump.workbench.ui.TaskFrame;

public class GeopistaTaskFrame     extends TaskFrame {
 
 


    public GeopistaTaskFrame(Task task, WorkbenchContext workbenchContext) {
        this(task, 0, workbenchContext);
       
        if (task instanceof GeopistaMap)
        	((GeopistaMap)task).setTaskFrame(this);
    }

    
    

    protected GeopistaTaskFrame(Task task, int cloneIndex, final WorkbenchContext workbenchContext) 
    {
        super(task, cloneIndex, workbenchContext);
    }

    protected LayerNamePanel createLayerNamePanel() {
        GeopistaTreeLayerNamePanel treeLayerNamePanel =  new GeopistaTreeLayerNamePanel(
                this,
                new LayerTreeModel(this),
                this.getLayerViewPanel().getRenderingManager(),
                new HashMap());
        
        Map nodeClassToPopupMenuMap =
            this.workbenchContext.getIWorkbench().getGuiComponent().getNodeClassToPopupMenuMap();
        for (Iterator i = nodeClassToPopupMenuMap.keySet().iterator(); i.hasNext();) {
            Class nodeClass = (Class) i.next();
            treeLayerNamePanel.addPopupMenu(nodeClass, (JPopupMenu) nodeClassToPopupMenuMap.get(nodeClass));
        }

//        SplitLayerNamePanel splitLayerNamePanel = new SplitLayerNamePanel((TreeLayerNamePanel) treeLayerNamePanel);
        LayerNameTabbedPanel layerNamePanel = new LayerNameTabbedPanel((GeopistaTreeLayerNamePanel) treeLayerNamePanel);
        
        return layerNamePanel;
    }

    
    

    
   
}
