package com.geopista.reports.gui;

import java.awt.Frame;

import javax.swing.JLabel;

public class MapImageParametricHelpDialog extends javax.swing.JDialog {

    public MapImageParametricHelpDialog() {
        initComponents();
    }
    
	public MapImageParametricHelpDialog(Frame owner){
        super(owner);
        initComponents();
    }

	private void initComponents() {
        setTitle("Informes param�tricos");
        setModal(true);
        setResizable(false);
        setLocationRelativeTo(null);        

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15));

        JLabel jLabelHelp = new JLabel();
        String text = "<html><h2>Informes param�tricos</h2>" +
        	"<p>Son informes que presentan datos e imagenes de mapas de elementos que cumplan una<br/>" +
        	"condici�n espec�fica expresada en la consulta a la base de datos.</p>" +
        	"<p>Previamente a configurar las im�genes de mapas param�tricos, se debe  haber definido la<br/>" +
        	"consulta del informe. Una vez hecho esto, se deben completar los siguientes pasos:</p>" +
        	"<ol><li>Seleccione el mapa. Debe ser un mapa previamente publicado con car�cter<br/>" +
        	"privado en el servidor de mapas de LocalGIS.</li>" +
        	"<li>Seleccione una capa de la lista sobre la cual desea ejecutar el informe.</li>" + 
        	"<li>Seleccione el atributo <b>identificador</b> de la capa. Debe tener valor �nico<br/>" +
        	"para cada elemento de la capa.</li>" +
        	"<li>Aseg�rese que este atributo identificador de la capa es uno de los<br/>" +
        	"atributos seleccionados en la consulta del informe. De no ser asi, el campo<br/>" +
        	"<i>Campo identificador en la consulta</i> se mostrar� vac�o y no se podr� <br/>" +
        	"ejecutar correctamente el informe.</li>" +
        	"<li>Elija las capas a visualizar en el informe.</li></ol></html>" +
        	"<li>Si selecciona la capa lcg_point_reports se mostrara una marca como un punto en la ubicacion</li></ol></html>" +
        	"<li>Elija la escala de visualizaci�n del mapa en el informe.</li></ol></html>";
    	jLabelHelp.setText(text);

    	add(jLabelHelp);

    	pack();
	}

}
