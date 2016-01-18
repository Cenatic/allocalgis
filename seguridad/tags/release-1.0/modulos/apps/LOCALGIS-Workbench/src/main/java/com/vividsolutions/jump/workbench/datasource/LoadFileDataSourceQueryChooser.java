/*
 * The Unified Mapping Platform (JUMP) is an extensible, interactive GUI
 * for visualizing and manipulating spatial features with geometry and attributes.
 *
 * Copyright (C) 2003 Vivid Solutions
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * For more information, contact:
 *
 * Vivid Solutions
 * Suite #1A
 * 2328 Government Street
 * Victoria BC  V8T 5G5
 * Canada
 *
 * (250)385-6040
 * www.vividsolutions.com
 */
package com.vividsolutions.jump.workbench.datasource;

import com.vividsolutions.jump.coordsys.CoordinateSystem;
import com.vividsolutions.jump.coordsys.CoordinateSystemSupport;
import com.vividsolutions.jump.util.Blackboard;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.ui.GUIUtil;
import com.vividsolutions.jump.workbench.ui.plugin.PersistentBlackboardPlugIn;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.File;

import java.util.Collection;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/**
 * UI for picking a file-based dataset to load.
 */
public class LoadFileDataSourceQueryChooser extends FileDataSourceQueryChooser {
    public static final String FILE_CHOOSER_DIRECTORY_KEY = LoadFileDataSourceQueryChooser.class.getName() +
        " - FILE CHOOSER DIRECTORY";
    public static final String FILE_CHOOSER_COORDINATE_SYSTEM_KEY = LoadFileDataSourceQueryChooser.class.getName() +
        " - FILE CHOOSER COORDINATE SYSTEM";
    public static final String FILE_CHOOSER_PANEL_KEY = LoadFileDataSourceQueryChooser.class.getName() +
    " - FILE CHOOSER PANEL";
    public static final String FILE_CHOOSER_KEY = LoadFileDataSourceQueryChooser.class.getName() +
    " - FILE CHOOSER";
    
    protected WorkbenchContext context;

    /**
     * @param extensions e.g. txt
     */
    public LoadFileDataSourceQueryChooser(Class dataSourceClass,
        String description, String[] extensions, WorkbenchContext context) {
        super(dataSourceClass, description, extensions,context);
        this.context = context;
    }

    private Blackboard blackboard() {
        return context.getBlackboard();
    }

    protected FileChooserPanel getFileChooserPanel() {
        final String FILE_CHOOSER_PANEL_KEY = LoadFileDataSourceQueryChooser.class.getName() +
            " - FILE CHOOSER PANEL";

        //LoadFileDataSourceQueryChoosers share the same JFileChooser so that the user's
        //work is not lost when he switches data-source types. Also, the JFileChooser options
        //are set once because setting them is slow (freezes the GUI for a few seconds). 
        //[Jon Aquino]
        if (blackboard().get(FILE_CHOOSER_PANEL_KEY) == null) {
            final JFileChooser fileChooser = GUIUtil.createJFileChooserWithExistenceChecking();
            fileChooser.setMultiSelectionEnabled(true);
            fileChooser.setControlButtonsAreShown(false);
            fileChooser.addPropertyChangeListener(new PropertyChangeListener() {

                public void propertyChange(PropertyChangeEvent evt)
                {
                   fileChooser.ensureFileIsVisible(fileChooser.getSelectedFile());
                }
            });
          
            blackboard().put(FILE_CHOOSER_PANEL_KEY,
                new FileChooserPanel(fileChooser, blackboard()));

            if (PersistentBlackboardPlugIn.get(context).get(FILE_CHOOSER_DIRECTORY_KEY) != null) {
                fileChooser.setCurrentDirectory(new File(
                        (String) PersistentBlackboardPlugIn.get(context).get(FILE_CHOOSER_DIRECTORY_KEY)));
                ((FileChooserPanel) blackboard().get(FILE_CHOOSER_PANEL_KEY)).setSelectedCoordinateSystem((String) PersistentBlackboardPlugIn.get(
                        context).get(FILE_CHOOSER_COORDINATE_SYSTEM_KEY));
            }

            if (CoordinateSystemSupport.isEnabled(blackboard())) {
                ((FileChooserPanel) blackboard().get(FILE_CHOOSER_PANEL_KEY)).setCoordinateSystemComboBoxVisible(true);
            }
        }

        return (FileChooserPanel) blackboard().get(FILE_CHOOSER_PANEL_KEY);
    }

    public Collection getDataSourceQueries() {
        //User has pressed OK, so persist the directory. [Jon Aquino]
        PersistentBlackboardPlugIn.get(context).put(FILE_CHOOSER_DIRECTORY_KEY,
            getFileChooserPanel().getChooser().getCurrentDirectory().toString());
        
        //Si el sistema de coordenadas no esta especificado fijamos al fichero el sistema de coordenadas del mapa
        //Incidencia: Al recuperar un mapa con formato no especificado ya no se pueden a�adir mas capas.
        if (getFileChooserPanel().getSelectedCoordinateSystem().getName().equals(CoordinateSystem.UNSPECIFIED.getName())){
            PersistentBlackboardPlugIn.get(context).put(FILE_CHOOSER_COORDINATE_SYSTEM_KEY,
            		context.getLayerManager().getCoordinateSystem().getName());
        }
        else{
        	PersistentBlackboardPlugIn.get(context).put(FILE_CHOOSER_COORDINATE_SYSTEM_KEY,
                    getFileChooserPanel().getSelectedCoordinateSystem().getName());                
        }

        return super.getDataSourceQueries();
    }
}
