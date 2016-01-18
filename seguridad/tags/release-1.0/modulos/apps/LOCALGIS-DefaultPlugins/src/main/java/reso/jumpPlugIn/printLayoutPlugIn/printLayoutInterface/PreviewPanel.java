/*
 * Package reso.JumpPlugIn.PrintLayoutPlugIn.PrintLayoutInterface pour JUMP
 *
 * Copyright (C) 2004
 * Olivier Bedel, ing�nieur informaticien laboratoire Reso UMR ESO 6590, Bassin versant du Jaudy-Guindy-Bizien.
 * C�line Foureau, stagiaire MIAGE, laboratoire Reso UMR ESO 6590.
 * Erwan Bocher, doctorant en g�ographie, laboratoire Reso UMR ESO 6590, Bassin versant du Jaudy-Guindy-Bizien
 *
 * Date de cr�ation : 3 sept. 2004
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

package reso.jumpPlugIn.printLayoutPlugIn.printLayoutInterface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.print.PageFormat;

import javax.swing.JPanel;
 


import reso.jumpPlugIn.printLayoutPlugIn.Conversion;

/**
 * @author FOUREAU_C
 */
public class PreviewPanel extends JPanel {
	private Page page = null;
	private int unit, cm, inch;

	public PreviewPanel(PrintLayoutFrame parent) {
		page = new Page(parent);
		setUnits(parent);
		setLayout(new GridBagLayout());
		add(
			page.getPageDrawOnScreen(),
			new GridBagConstraints(
				1,
				1,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.NONE,
				new Insets(unit, unit, unit, unit),
				0,
				0));
	}
	
	public PreviewPanel(PrintLayoutFrame parent, Page page) {
		this.page = page;
		setUnits(parent);
		setLayout(new GridBagLayout());
		add(
			page.getPageDrawOnScreen(),
			new GridBagConstraints(
				1,
				1,
				1,
				1,
				0.0,
				0.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.NONE,
				new Insets(unit, unit, unit, unit),
				0,
				0));
	}

	public Page getPage() {
		return page;
	}

	public int getCmUnit() {
		return cm;
	}

	public int getInchUnit() {
		return inch;
	}

	public void setUnits(PrintLayoutFrame parent) {
		if (parent.getZoomActif() == PrintLayoutFrame.PAGE_ENTIERE) {
			switch (parent.getPageFormat().getOrientation()) {
				case PageFormat.LANDSCAPE :
					cm =
						Math.round(
							(float) (page.getPageDrawOnScreen().getWidth()
								/ Conversion.SoixanteDouxi�me_Inch_To_cm(
									parent.getPageFormat().getWidth())));
					inch =
						Math.round(
							(float) (page.getPageDrawOnScreen().getWidth()
								/ Conversion.SoixanteDouxi�me_Inch_To_Inch(
									parent.getPageFormat().getWidth())));
					break;
				case PageFormat.PORTRAIT :
					cm =
						Math.round(
							(float) (page.getPageDrawOnScreen().getHeight()
								/ Conversion.SoixanteDouxi�me_Inch_To_cm(
									parent.getPageFormat().getHeight())));
					inch =
						Math.round(
							(float) (page.getPageDrawOnScreen().getHeight()
								/ Conversion.SoixanteDouxi�me_Inch_To_Inch(
									parent.getPageFormat().getHeight())));
					break;
			}
		} else {
			//inch = Toolkit.getDefaultToolkit().getScreenResolution();
		    //on ne prend pas la r�solution de l'�cran mais la r�solution du papier.
		    inch = 72;
			cm = Math.round((float) (inch / 2.54));
		}
		if (parent.getPrintLayoutPreviewPanel().isMetric()) {
			unit = cm;
		} else {
			unit = inch;
		}
	}

	public boolean isOptimizedDrawingEnabled()
	{
	
	return false;
	}
}
