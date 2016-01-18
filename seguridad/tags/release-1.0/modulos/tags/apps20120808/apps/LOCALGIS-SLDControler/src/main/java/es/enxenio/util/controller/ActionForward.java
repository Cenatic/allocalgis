/*
 * Created on 09-jun-2004
 *
 */
package es.enxenio.util.controller;

import java.awt.Component;

import es.enxenio.util.ui.PanelContainer;

/**
 * @author enxenio s.l.
 *
 */
public interface ActionForward {
	
	/**Este m�todo configura la action forward bas�ndose en los par�metros almacenados en un objeto Request
	 * @param request Instancia que contendr� los par�metros necesarios para llevar a cabo la operaci�n
     */
	public void configure(Request request);
	
	public String getTitle();
	public Component getComponent();
	public void setContainer(PanelContainer container);
	public boolean windowClosing();
}
