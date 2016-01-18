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

import javax.swing.JFileChooser;

import com.vividsolutions.jts.util.Assert;
import com.vividsolutions.jump.io.FMEGMLReader;
import com.vividsolutions.jump.io.FMEGMLWriter;
import com.vividsolutions.jump.io.JMLReader;
import com.vividsolutions.jump.io.JMLWriter;
import com.vividsolutions.jump.io.JUMPReader;
import com.vividsolutions.jump.io.JUMPWriter;
import com.vividsolutions.jump.io.ShapefileReader;
import com.vividsolutions.jump.io.ShapefileWriter;
import com.vividsolutions.jump.io.WKTReader;
import com.vividsolutions.jump.io.WKTWriter;
import com.vividsolutions.jump.io.datasource.StandardReaderWriterFileDataSource;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.GUIUtil;

/**
 * Adds to the JUMP Workbench the UIs for opening and saving files with the
 * basic file formats.
 */
public class InstallStandardDataSourceQueryChoosersPlugIn extends AbstractPlugIn {
    private void addFileDataSourceQueryChoosers(JUMPReader reader,
        JUMPWriter writer, final String description, WorkbenchContext context,
        Class readerWriterDataSourceClass) {
        DataSourceQueryChooserManager.get(context.getBlackboard())
                                     .addLoadDataSourceQueryChooser(new LoadFileDataSourceQueryChooser(
                readerWriterDataSourceClass, description,
                extensions(readerWriterDataSourceClass), context) {
                protected void addFileFilters(JFileChooser chooser) {
                    super.addFileFilters(chooser);
                    InstallStandardDataSourceQueryChoosersPlugIn.addCompressedFileFilter(description,
                        chooser);
                }
            }).addSaveDataSourceQueryChooser(new SaveFileDataSourceQueryChooser(
                readerWriterDataSourceClass, description,
                extensions(readerWriterDataSourceClass), context));
    }

    public static String[] extensions(Class readerWriterDataSourceClass) {
        try {
            return ((StandardReaderWriterFileDataSource) readerWriterDataSourceClass.newInstance()).getExtensions();
        } catch (Exception e) {
            Assert.shouldNeverReachHere(e.toString());

            return null;
        }
    }

    public void initialize(final PlugInContext context)
        throws Exception {
        addFileDataSourceQueryChoosers(new JMLReader(), new JMLWriter(),
            "JUMP GML", context.getWorkbenchContext(),
            StandardReaderWriterFileDataSource.JML.class);
        new GMLDataSourceQueryChooserInstaller().addLoadGMLFileDataSourceQueryChooser(context);
        new GMLDataSourceQueryChooserInstaller().addSaveGMLFileDataSourceQueryChooser(context);
        addFileDataSourceQueryChoosers(new WKTReader(), new WKTWriter(), "WKT",
            context.getWorkbenchContext(),
            StandardReaderWriterFileDataSource.WKT.class);
        addFileDataSourceQueryChoosers(new ShapefileReader(),
            new ShapefileWriter(), "ESRI Shapefile",
            context.getWorkbenchContext(),
            StandardReaderWriterFileDataSource.Shapefile.class);
        addFileDataSourceQueryChoosers(new FMEGMLReader(), new FMEGMLWriter(),
            "FME GML", context.getWorkbenchContext(),
            StandardReaderWriterFileDataSource.FMEGML.class);
    }

    public static void addCompressedFileFilter(final String description,
        JFileChooser chooser) {
        chooser.addChoosableFileFilter(GUIUtil.createFileFilter("Compressed " +
                description, new String[] { "zip", "gz" }));
    }
}
