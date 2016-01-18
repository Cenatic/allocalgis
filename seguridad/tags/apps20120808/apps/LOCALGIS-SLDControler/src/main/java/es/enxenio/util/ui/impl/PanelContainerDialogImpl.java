/*
 * Created on 16-jun-2004
 */
package es.enxenio.util.ui.impl;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import es.enxenio.util.controller.ActionForward;
import es.enxenio.util.controller.Request;
import es.enxenio.util.ui.PanelContainer;

/**
 * @author luaces
 */
public class PanelContainerDialogImpl extends JDialog implements PanelContainer {

	public PanelContainerDialogImpl(Frame frame, boolean modal) {
		super(frame, modal);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				if (_forward.windowClosing()) dispose();
			}
		});
	}
	
	public void forward(ActionForward forward, Request request) {
		if (forward != null) {
			_forward = forward; 
			forward.configure(request);
			forward.setContainer(this);
			getContentPane().removeAll();
			getContentPane().add(forward.getComponent(), BorderLayout.CENTER);
			setSize(forward.getComponent().getPreferredSize());
			centreOnScreen(this);
			setTitle(forward.getTitle());
			//pack();
			show();
		}
		else {
			hide();
		}
	}
	
	public static void centreOnScreen(Component componentToMove) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		componentToMove.setLocation((screenSize.width -
			componentToMove.getWidth()) / 2,
			(screenSize.height - componentToMove.getHeight()) / 2);
	}

	private ActionForward _forward;		
}
