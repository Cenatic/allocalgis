/*
 * Copyright (C) 2005 - 2007 JasperSoft Corporation.  All rights reserved. 
 * http://www.jaspersoft.com.
 *
 * Unless you have purchased a commercial license agreement from JasperSoft,
 * the following license terms apply:
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; and without the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses/gpl.txt
 * or write to:
 *
 * Free Software Foundation, Inc.,
 * 59 Temple Place - Suite 330,
 * Boston, MA  USA  02111-1307
 *
 *
 *
 *
 * PageSize.java
 * 
 * Created on 8 febbraio 2003, 18.20
 *
 */

package it.businesslogic.ireport.util;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class PageSize
{
    private PageSize()
    {
        
        // This class can not be instantiated
    }
    
    /**
     * To hold pageFormats required to deduct the pageFormat based on given
     * Size It is also used for the method getFormatSize()
     */
    public static HashMap pageFormats;
    
    /** This is the letter format */
    public static final Point LETTER = new Point(612, 792);
    
    /** This is the note format */
    public static final Point NOTE = new Point(540, 720);
    
    /** This is the legal format */
    public static final Point LEGAL = new Point(612, 1008);
    
    /** This is the a0 format */
    public static final Point A0 = new Point(2380, 3368);
    
    /** This is the a1 format */
    public static final Point A1 = new Point(1684, 2380);
    
    /** This is the a2 format */
    public static final Point A2 = new Point(1190, 1684);
    
    /** This is the a3 format */
    public static final Point A3 = new Point(842, 1190);
    
    /** This is the a4 format */
    public static final Point A4 = new Point(595, 842);
    
    /** This is the a5 format */
    public static final Point A5 = new Point(421, 595);
    
    /** This is the a6 format */
    public static final Point A6 = new Point(297, 421);
    
    /** This is the a7 format */
    public static final Point A7 = new Point(210, 297);
    
    /** This is the a8 format */
    public static final Point A8 = new Point(148, 210);
    
    /** This is the a9 format */
    public static final Point A9 = new Point(105, 148);
    
    /** This is the a10 format */
    public static final Point A10 = new Point(74, 105);
    
    /** This is the b0 format */
    public static final Point B0 = new Point(2836, 4008);
    
    /** This is the b1 format */
    public static final Point B1 = new Point(2004, 2836);
    
    /** This is the b2 format */
    public static final Point B2 = new Point(1418, 2004);
    
    /** This is the b3 format */
    public static final Point B3 = new Point(1002, 1418);
    
    /** This is the b4 format */
    public static final Point B4 = new Point(709, 1002);
    
    /** This is the b5 format */
    public static final Point B5 = new Point(501, 709);
    
    /** This is the archE format */
    public static final Point ARCH_E = new Point(2592, 3456);
    
    /** This is the archD format */
    public static final Point ARCH_D = new Point(1728, 2592);
    
    /** This is the archC format */
    public static final Point ARCH_C = new Point(1296, 1728);
    
    /** This is the archB format */
    public static final Point ARCH_B = new Point(864, 1296);
    
    /** This is the archA format */
    public static final Point ARCH_A = new Point(648, 864);
    
    /** This is the flsa format */
    public static final Point FLSA = new Point(612, 936);
    
    /** This is the flse format */
    public static final Point FLSE = new Point(612, 936);
    
    /** This is the halfletter format */
    public static final Point HALFLETTER = new Point(396, 612);
    
    /** This is the 11x17 format */
    public static final Point _11X17 = new Point(792, 1224);
    
    /** This is the ledger format */
    public static final Point LEDGER = new Point(1224, 792);
    
    /**
     * Class constructor: Initialize pageFormats
     */
    static
    {
        
        HashMap pageFormats = new HashMap();
        
        pageFormats.put("LETTER", LETTER);
        pageFormats.put("NOTE", NOTE);
        pageFormats.put("LEGAL", LEGAL);
        pageFormats.put("A0", A0);
        pageFormats.put("A1", A1);
        pageFormats.put("A2", A2);
        pageFormats.put("A3", A3);
        pageFormats.put("A4", A4);
        pageFormats.put("A5", A5);
        pageFormats.put("A6", A6);
        pageFormats.put("A7", A7);
        pageFormats.put("A8", A8);
        pageFormats.put("A9", A9);
        pageFormats.put("A10", A10);
        
        pageFormats.put("B0", B0);
        pageFormats.put("B1", B1);
        pageFormats.put("B2", B2);
        pageFormats.put("B3", B3);
        pageFormats.put("B4", B4);
        pageFormats.put("B5", B5);
        
        pageFormats.put("ARCHE_E", ARCH_E);
        pageFormats.put("ARCHE_D", ARCH_D);
        pageFormats.put("ARCHE_C", ARCH_C);
        pageFormats.put("ARCHE_B", ARCH_B);
        pageFormats.put("ARCHE_A", ARCH_A);
        
        pageFormats.put("FLSA", FLSA);
        pageFormats.put("FLSE", FLSE);
        
        pageFormats.put("HALFLETTER", HALFLETTER);
        pageFormats.put("11x17", _11X17);
        pageFormats.put("LEDGER", LEDGER);
        
        PageSize.pageFormats = pageFormats;
        
    }
    
    /**
     * DOCUMENT ME!
     *
     * @param format DOCUMENT ME!
     * @return DOCUMENT ME!
     */
    public static Point getFormatSize(String format)
    {
        
        Point point = (Point) pageFormats.get(format);
        
        if (point == null)
        {
            point = A4; // A european default... :-)
        }
        
        return point;
    }
    
    /**
     * Try to find the PageFormat based on the width and height.
     *
     * @param pageWidth DOCUMENT ME!
     * @param pageHeight DOCUMENT ME!
     * @return DOCUMENT ME!
     * @since July 3, 2004
     */
    public static String deductPageFormat(int pageWidth, int pageHeight)
    {
        
        // Set width and height according to PORTRAIT orientation.
        // All the page format defined in this class are in this format.
        int width = pageWidth < pageHeight
                ? pageWidth
                : pageHeight; // minimum
        int height = pageWidth > pageHeight
                ? pageWidth
                : pageHeight; // maximum
        String format = "Custom";
        
        // Go through the hashmap and compare width and height with the point pair.
        // If found, return the hashmap key.
        // else return empty string.
        for (Iterator i = pageFormats.entrySet().iterator(); i.hasNext();)
        {
            
            Map.Entry entry = (Map.Entry) i.next();
            
            if (((Point) entry.getValue()).x == width)
            {
                
                if (((Point) entry.getValue()).y == height)
                {
                    
                    //correct pageFormat found.
                    format = (String) entry.getKey();
                }
            }
        }
        
        return format;
    }
    
    public static String findOneDown(int pageWidth, int pageHeight)
    {
        /** variable height: the width of the current page is the height
         * of the pageformat we are looking for
         */
        int height = pageWidth < pageHeight
                ? pageWidth
                : pageHeight; // minimum
        /**
         * variable width: the width we are looking for is the height of
         * the current page divided by 2
         */
        int width = (pageWidth > pageHeight
                ? pageWidth
                : pageHeight) / 2 ;
        String format = "Custom";
        
        // Go through the hashmap and compare width and height with the point pair.
        // If found, return the hashmap key.
        // else return empty string.
        for (Iterator i = pageFormats.entrySet().iterator(); i.hasNext();)
        {
            
            Map.Entry entry = (Map.Entry) i.next();
            
            if (((Point) entry.getValue()).x == width)
            {
                
                if (((Point) entry.getValue()).y == height)
                {
                    
                    //correct pageFormat found.
                    format = (String) entry.getKey();
                }
            }
        }
        return format;
        
        
        
        
    }
    
    
}
