package com.geopista.ui.plugin.searchplot.dialogs;
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



import javax.swing.JDialog;
import javax.swing.JFrame;

import com.geopista.app.AppContext;
import com.geopista.ui.plugin.searchplot.panels.SearchPlotPanel;
import com.geopista.util.ApplicationContext;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;


public class SearchPlotDialog extends JDialog
{
  ApplicationContext appContext=AppContext.getApplicationContext();
  public SearchPlotDialog(PlugInContext context, JFrame owner)
  {
          super(owner);
       this.setTitle(appContext.getI18nString("SearchPlotPlugInDescription"));
           
	     this.setResizable(false);
         SearchPlotPanel searchPlotPanel = new SearchPlotPanel(context);
	     this.setResizable(false);
	     this.getContentPane().add(searchPlotPanel);
	     this.setSize(550, 180);
	     this.setModal(true);
	     this.setVisible(true);
    this.setLocation(200, 200);
  }
}