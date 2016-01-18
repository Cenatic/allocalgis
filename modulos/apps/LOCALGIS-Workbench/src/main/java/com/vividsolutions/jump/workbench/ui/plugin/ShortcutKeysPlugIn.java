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
package com.vividsolutions.jump.workbench.ui.plugin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import com.vividsolutions.jts.util.Assert;
import com.vividsolutions.jump.util.FileUtil;
import com.vividsolutions.jump.util.StringUtil;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.HTMLFrame;


//In the HTML file (generated by FrontPage I think), there were <TBODY> tags.
//These were causing the following exception (also JTextArea#setText was unnecessarily
//being called a second time; plus, this is happening in J2SE 1.4 -- I don't think
//it happens in 1.3).
//
//java.lang.ArrayIndexOutOfBoundsException: 0
//    at javax.swing.text.BoxView.getOffset(BoxView.java:1079)
//    at javax.swing.text.BoxView.childAllocation(BoxView.java:669)
//    at javax.swing.text.CompositeView.getChildAllocation(CompositeView.java:215)
//    at javax.swing.text.BoxView.getChildAllocation(BoxView.java:427)
//    at javax.swing.plaf.basic.BasicTextUI$UpdateHandler.calculateViewPosition(BasicTextUI.java:1850)
//    at javax.swing.plaf.basic.BasicTextUI$UpdateHandler.layoutContainer(BasicTextUI.java:1826)
//    at java.awt.Container.layout(Container.java:1017)
//    at java.awt.Container.doLayout(Container.java:1007)
//    at java.awt.Container.validateTree(Container.java:1089)
//
//[Jon Aquino]
public class ShortcutKeysPlugIn extends AbstractPlugIn {
    private static String html = null;

    private HTMLFrame frame(WorkbenchContext context) {
        String key = getClass().getName() + " - Frame";

        if (context.getIWorkbench().getBlackboard().get(key) == null) {
            HTMLFrame frame = new HTMLFrame(context.getIWorkbench().getGuiComponent());
            frame.setRecordNavigationControlVisible(false);
            frame.createNewDocument();

            try {
                append(frame);
            } catch (IOException e) {
                Assert.shouldNeverReachHere();
            }

            frame.setTitle("Shortcut Keys");
            frame.setSize(420, 290);
            context.getIWorkbench().getBlackboard().put(key, frame);
        }

        return (HTMLFrame) context.getIWorkbench().getBlackboard().get(key);
    }

    public static String html() throws IOException {
        if (html == null) {
            html = "";

            InputStream inputStream = ShortcutKeysPlugIn.class.getResourceAsStream(
                    "KeyboardPlugIn.html");

            try {
                for (Iterator i = FileUtil.getContents(inputStream).iterator();
                        i.hasNext();) {
                    String line = (String) i.next();
                    html += line;
                }
            } finally {
                inputStream.close();
            }
        }

        return html;
    }

    private void append(HTMLFrame frame) throws IOException {
        //I get ArrayIndexOutOfBoundsExceptions when I tried calling #append
        //on each line separately. So #append all the HTML at once. [Jon Aquino]
        //Remove <HTML> and </HTML> tags because #append adds them. [Jon Aquino]
        frame.append(removeHTMLTags(html()));
    }

    private String removeHTMLTags(String s) {
        return StringUtil.replaceAll(StringUtil.replaceAll(s, "<html>", ""),
            "</html>", "");
    }

    public boolean execute(PlugInContext context) throws Exception {
        frame(context.getWorkbenchContext()).surface();

        return true;
    }
}
