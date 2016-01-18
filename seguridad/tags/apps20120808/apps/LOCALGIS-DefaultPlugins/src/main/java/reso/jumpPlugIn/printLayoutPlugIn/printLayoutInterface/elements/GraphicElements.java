/*
 * Package reso.jumpPlugIn.printLayoutPlugIn.printLayoutInterface.elements pour JUMP
 *
 * Copyright (C) 2004
 * Olivier Bedel, ing�nieur informaticien laboratoire Reso UMR ESO 6590, Bassin versant du Jaudy-Guindy-Bizien.
 * C�line Foureau, stagiaire MIAGE, laboratoire Reso UMR ESO 6590.
 * Erwan Bocher, doctorant en g�ographie, laboratoire Reso UMR ESO 6590, Bassin versant du Jaudy-Guindy-Bizien
 *
 * Date de cr�ation : 19 oct. 2004
 *
 * D�velopp� dans le cadre du Projet APARAD 
 *  (Laboratoire Reso UMR ESO 6590 CNRS / Bassin Versant du Jaudy-Guindy-Bizien)
 *    Responsable : Erwan BOCHER
 *    D�veloppeurs : C�line FOUREAU, Olivier BEDEL
 *
 * olivier.bedel@uhb.fr ou olivier.bedel@yahoo.fr
 * erwan.bocher@uhb.fr ou erwan.bocher@free.fr
 * celine.foureau@uhb.fr ou celine.foureau@wanadoo.fr
 * 
 * Ce package h�rite de la licence GPL de JUMP. Il est r�gi par la licence CeCILL soumise au droit fran�ais et
 * respectant les principes de diffusion des logiciels libres. (http://www.cecill.info)
 * 
 */

package reso.jumpPlugIn.printLayoutPlugIn.printLayoutInterface.elements;

import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.Border;

import reso.jumpPlugIn.printLayoutPlugIn.printLayoutInterface.PrintLayoutFrame;


/**
 * @author FOUREAU_C
 */
public abstract class GraphicElements{
	public static Border selectedBorder = BorderFactory.createLineBorder(Color.RED, 1);
	public abstract boolean isSelected();
	public abstract void setSelected(boolean select);
	public abstract JComponent getGraphicElementsOnScreen();
	public abstract JComponent getGraphicElementsForPrint();
	public abstract void initCornerPoint();
	public abstract Point[] getCornerPoint();
	public abstract void fixerDimensions(int x, int y, int w, int h, int facteur1, int facteur2);
	public abstract void repaint();
	public abstract void refreshForPrintBounds();
	public abstract void resize(int newForPrintWidth, int oldForPrintWidth, int newForPrintHeight, int oldForPrintHeight, int widthOnScreen, int heightOnScreen);
	public abstract void setBorder(Border border);
	public abstract void setValeursSpec();
	public abstract void initValeursSpec(PrintLayoutFrame plf);
	protected PrintLayoutFrame parent;
	private boolean select = false;
	public static final int _RESIZE_HANDLER_SIZE = 10;


	public PrintLayoutFrame getParent()
	{

		return parent;
	}
	public void setSelect(boolean sel)
	{
		select = sel;
	}
	public boolean getSelect()
	{
		return(select);
	}
	public void setParent(PrintLayoutFrame plf)
	{
		parent = plf;

	};
}