/*
 * Package reso.JumpPlugIn.PrintLayoutPlugIn.PrintLayoutInterface.Elements.Options pour JUMP
 *
 * Copyright (C) 2004
 * Olivier Bedel, ing�nieur informaticien laboratoire Reso UMR ESO 6590, Bassin versant du Jaudy-Guindy-Bizien.
 * C�line Foureau, stagiaire MIAGE, laboratoire Reso UMR ESO 6590.
 * Erwan Bocher, doctorant en g�ographie, laboratoire Reso UMR ESO 6590, Bassin versant du Jaudy-Guindy-Bizien
 *
 * Date de cr�ation : 8 sept. 2004
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

package reso.jumpPlugIn.printLayoutPlugIn.printLayoutInterface.elements.graphicText;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.vividsolutions.jump.workbench.ui.OKCancelPanel;

/**
 * @author FOUREAU_C
 */
public class ColorChooserDialog extends JDialog {
	private JColorChooser colorChooser;
	private JPanel colorChooserPanel = new JPanel();
	private OKCancelPanel okCancelPanel = new OKCancelPanel();
	private Color selectedColor;
	
	public ColorChooserDialog(String title, final Component component){
		setModal(true);
		setTitle(title);
		colorChooser = new JColorChooser(component.getBackground());
		colorChooser.getSelectionModel().addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e) {
				selectedColor = colorChooser.getColor();
			}});
		colorChooserPanel.add(colorChooser);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(colorChooserPanel, BorderLayout.NORTH);
		getContentPane().add(okCancelPanel, BorderLayout.SOUTH);
		okCancelPanel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(okCancelPanel.wasOKPressed()){
					component.setBackground(selectedColor);
					termine();
				}
				else{
					termine();
				}
			}});
		pack();
		show();
	}
	
	private void termine(){
		dispose();
	}
}
