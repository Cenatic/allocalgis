/**
 * GeoMarketingTextDataPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.app.gestionciudad.plugins.geomarketing.dialogs.panels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.geopista.model.GeopistaLayer;
import com.geopista.webservices.geomarketing.client.protocol.GeoMarketingWSStub.GeoMarketingOT2;

public class GeoMarketingTextDataPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1765201597799645055L;
	
	private TextArea populationDataTextArea = null;
	private TextArea layerDataTextArea = null;
	
	private static Font fuenteMonoSpaced = new Font(Font.DIALOG_INPUT, 0, 12);
	
	public GeoMarketingTextDataPanel(GeoMarketingOT2 geoMarketingOT2, GeopistaLayer layer){
		super(new GridBagLayout());
		
		this.initialize();
		loadGeomarketingData(geoMarketingOT2,layer);
	}
	
	public GeoMarketingTextDataPanel(){
		super(new GridBagLayout());
		this.initialize();
	}
	
	private void initialize() {
		this.add(getLayerDataPanel(), 
				new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
						GridBagConstraints.HORIZONTAL, 
						new Insets(0, 5, 0, 5), 0, 0));
		this.add(getPopulationDataPanel(), 
				new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
						GridBagConstraints.HORIZONTAL, 
						new Insets(0, 5, 0, 5), 0, 0));
	}

	private JPanel getLayerDataPanel(){
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder(
				null,
				"Datos de la Capa Seleccionada",
				TitledBorder.LEADING, 
				TitledBorder.TOP, 
				new Font(null, Font.BOLD, 12)));
		panel.add(getLayerDataTextArea(), 
				new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
						GridBagConstraints.HORIZONTAL, 
						new Insets(0, 5, 0, 5), 0, 0));
		return panel;
	}
	
	private JPanel getPopulationDataPanel(){
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder(
				null,
				"Datos de poblaci�n",
				TitledBorder.LEADING, 
				TitledBorder.TOP, 
				new Font(null, Font.BOLD, 12)));
		panel.add(getPopulationDataTextArea(), 
				new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
						GridBagConstraints.HORIZONTAL, 
						new Insets(0, 5, 0, 5), 0, 0));
		return panel;
	}
	
	private TextArea getLayerDataTextArea(){
		if (layerDataTextArea == null){
			layerDataTextArea =  new TextArea("",4,10,
					TextArea.SCROLLBARS_VERTICAL_ONLY );
			layerDataTextArea.setEditable(false);
		}
		return layerDataTextArea;
	}
	
	private TextArea getPopulationDataTextArea(){
		if (populationDataTextArea == null){
			populationDataTextArea =  new TextArea("",20,57,
					TextArea.SCROLLBARS_VERTICAL_ONLY );
			populationDataTextArea.setEditable(false);
			populationDataTextArea.setEnabled(true);
		}
		return populationDataTextArea;
	}
	
	public void loadGeomarketingData(GeoMarketingOT2 geoMarketingData2, GeopistaLayer layer){
		
		// initialize Text Areas.
		this.getLayerDataTextArea().setText("");
		this.getPopulationDataTextArea().setText("");
		
		//Load neew geomarketing info into text areas.
		if (geoMarketingData2 != null){
			this.getLayerDataTextArea().setText("texto de la layer");
			try{
				this.getLayerDataTextArea().setText(this.getLayerDataParsedText(geoMarketingData2,layer));
			} catch (Exception ex){
				ex.printStackTrace();
			}

			this.getPopulationDataTextArea().setText("Texto de la poblacion");
			try{
				this.getPopulationDataTextArea().setText(this.getPopulationParsedtext(geoMarketingData2));
				this.getPopulationDataTextArea().setFont(fuenteMonoSpaced);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private String getLayerDataParsedText(GeoMarketingOT2 geoMarketingData2, GeopistaLayer layer) {
		String resultado = "";
		if (layer != null){
			resultado = resultado + "- Nombre de la Capa: " + layer.getName() + "\n";
			resultado = resultado + "    Descripcion: "+ layer.getDescription() + "\n";
		}
		if (geoMarketingData2 != null){
			resultado = resultado + "    N�mero de elementos: " + geoMarketingData2.getExternalValue()+ "\n";
		}
		
		return resultado;
	}
	

	private String getPopulationParsedtext(GeoMarketingOT2 geoMarketingData2) {
		String resultado = "";
		if (geoMarketingData2 != null){
			resultado = resultado + "N�mero de Habitantes en la Zona: " + geoMarketingData2.getNumHabitants() + "\n";
			resultado = resultado + "N�mero de Mujeres en la Zona:    " + geoMarketingData2.getNumFemales() + "\n";
			resultado = resultado + "N�mero de Hombres en la Zona:    " + geoMarketingData2.getNumMales() + "\n";
			resultado = resultado + "N�mero de Extranjeros:           " + geoMarketingData2.getForeignHabitants() + "\n";
			resultado = resultado + "N�mero de Habitantes espa�oles:  " + geoMarketingData2.getSpanishHabitants() + "\n\n";

			resultado = resultado + "Nivel de Estudios: " + "\n";
			resultado = resultado + "    -No saben Leer/Escribir:                 " + geoMarketingData2.getS10() + "\n";
			resultado = resultado + "    -Con Titulo Inferior a Graduado Escolar: " + geoMarketingData2.getS20() + "\n";
			resultado = resultado + "    -Graduado Escolar o Equivalente:         " + geoMarketingData2.getS30() + "\n";
			resultado = resultado + "    -Bachiller, FP 2 o Equivalente:          " + geoMarketingData2.getS40() + "\n\n";		

			resultado = resultado + "Habitantes por Rango de Edad: " + geoMarketingData2.getNumHabitants() + "\n";
			String[] ranges = geoMarketingData2.getRanges().split(";");
			
			for (int i = 0; i < ranges.length; i ++){				
//				if (ranges[i].getValue()>0)
//					numEdades = ranges[i].getValue();		 
				resultado = resultado + "    -    " + getRangeDataLabelString(ranges[i]) + "\n";
			}

		}
		return resultado;
	}

	
	private String getRangeDataLabelString (String rangeData){
		String rangeString = "";
		if (rangeData!=null && !rangeData.equals("")){
			String[] values = rangeData.split(":");
			if(values.length == 3){
				int startRange = 0;
				int endRange = 0;
				int value = 0;
				if (values[0]!=null && !values[0].equals("") && !values[0].equals("null")){
					try{
						startRange = Integer.parseInt(values[0]);
					}catch (NumberFormatException e) {
						e.printStackTrace();
						startRange = -1;
					}
				}
				if (values[1]!=null && !values[1].equals("") && !values[1].equals("null")){
					try{
						endRange = Integer.parseInt(values[1]);
					}catch (NumberFormatException e) {
						e.printStackTrace();
						endRange = -1;
					}
				}
				if (values[2]!=null && !values[2].equals("") && !values[2].equals("null")){
					try{
						value = Integer.parseInt(values[2]);
					}catch (NumberFormatException e) {
						e.printStackTrace();
						value = -1;
					}
				}

				if (startRange>0){
					if (endRange>0){
						rangeString = "Entre " + startRange + " y " + endRange + " a�os: ";
					} else{
						rangeString = "Mayores de " +  startRange +" a�os: ";
					}
				} else{
					if (endRange >0){
						rangeString = "Menores de " +  endRange +" a�os: ";
					} else{
						rangeString = "Rango de edad erroneo: ";
					}
				}
				rangeString = rangeString + value;
			} else{
				rangeString = values[0];
			}
		}
		
		return rangeString;
	}

}
