package com.localgis.app.gestionciudad.dialogs.interventions.dialogs;

import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import pirolPlugIns.dialogs.get2NumbersAndABooleanDialog;

import com.geopista.app.AppContext;
import com.geopista.editor.GeopistaEditor;
import com.geopista.feature.GeopistaFeature;
import com.geopista.feature.GeopistaSchema;
import com.geopista.model.GeopistaLayer;
import com.geopista.protocol.administrador.dominios.DomainNode;
import com.localgis.app.gestionciudad.beans.LayerFeatureBean;
import com.localgis.app.gestionciudad.beans.LocalGISIntervention;
import com.localgis.app.gestionciudad.dialogs.documents.panels.AsociatedDocumentsPanel;
import com.localgis.app.gestionciudad.dialogs.interventions.panels.AvisosFieldsPanel;
import com.localgis.app.gestionciudad.dialogs.interventions.utils.NotesInterventionsEditionTypes;
import com.localgis.app.gestionciudad.dialogs.interventions.utils.UtilidadesAvisosPanels;
import com.localgis.app.gestionciudad.dialogs.main.GeopistaEditorPanel;
import com.localgis.app.gestionciudad.utils.GestionCiudadOperaciones;
import com.localgis.app.gestionciudad.utils.LocalGISObraCivilUtils;
import com.localgis.app.gestionciudad.webservicesclient.wrapper.WSInterventionsWrapper;
import com.localgis.webservices.geomarketing.client.GeoMarketingWSStub.GetPostalDataFromIdTramosAndIdViaResponse;
import com.localgis.webservices.geomarketing.client.GeoMarketingWSStub.PostalDataOT;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.workbench.ui.OKCancelPanel;

/**
 * @author javieraragon
 *
 */
public class AvisosEdicionDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8103959152474028116L;

	private NotesInterventionsEditionTypes tipoDialogo = null;

	private JPanel rootPanel = null;
	private OKCancelPanel okCancelPanel = null;
	private AvisosFieldsPanel avisoFieldsPanel = null;
	private AsociatedDocumentsPanel docuemntsPanel = null;
	private JButton informeCiudadanosButton = null;

	private LocalGISIntervention aviso = null;

	public static AvisosEdicionDialog createAvisosEdicionDialog(Component parentComponent, NotesInterventionsEditionTypes tipo, LocalGISIntervention aviso){
		Window window = LocalGISObraCivilUtils.getWindowForComponent(parentComponent);
		if (window instanceof Frame) {
			return new AvisosEdicionDialog((Frame)window, tipo, aviso);
		} else {
			return new AvisosEdicionDialog((Dialog)window, tipo, aviso);
		}			
	}

	private AvisosEdicionDialog(Frame parentComponent, NotesInterventionsEditionTypes tipo, LocalGISIntervention aviso){
		super(parentComponent, "", true);
		this.tipoDialogo = tipo;
		this.aviso = aviso;
		UtilidadesAvisosPanels.inicializarIdiomaAvisosPanels();
		this.setSize(500, 500);
		this.setLocationRelativeTo(AppContext.getApplicationContext().getMainFrame());
		this.initialize();
		this.pack();
		this.setVisible(true);
	}

	private AvisosEdicionDialog(Dialog parentComponent, NotesInterventionsEditionTypes tipo, LocalGISIntervention aviso){
		super(parentComponent, "", true);	
		this.tipoDialogo = tipo;
		this.aviso = aviso;
		UtilidadesAvisosPanels.inicializarIdiomaAvisosPanels();
		this.setSize(500, 500);
		this.setLocationRelativeTo(AppContext.getApplicationContext().getMainFrame());
		this.initialize();
		this.pack();
		this.setVisible(true);
	}
	private void initialize() {
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				this_componentShown(e);
			}
		});

		this.setLayout(new GridBagLayout());

		this.add(this.getRootPanel(), 
				new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
						GridBagConstraints.HORIZONTAL, 
						new Insets(0, 5, 0, 5), 0, 10));


		this.add(this.getOkCancelPanel(), 
				new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
						GridBagConstraints.HORIZONTAL, 
						new Insets(0, 5, 0, 5), 0, 0));
	}

	private JPanel getRootPanel(){
		if (rootPanel == null){
			rootPanel = new JPanel(new GridBagLayout());

			rootPanel.add(this.getAvisoFieldsPanel(), 
					new GridBagConstraints(0, 0, 2, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
							GridBagConstraints.HORIZONTAL, 
							new Insets(0, 5, 0, 5), 0, 10));

			rootPanel.add(this.getDocumentsPanel(), 
					new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1, GridBagConstraints.NORTH, 
							GridBagConstraints.NONE, 
							new Insets(0, 5, 0, 5), 0, 10));

			rootPanel.add(this.getInformeCiudadanosButton(), 
					new GridBagConstraints(1, 1, 1, 1, 0.1, 0.1, GridBagConstraints.FIRST_LINE_START, 
							GridBagConstraints.NONE, 
							new Insets(0, 5, 0, 5), 0, 0));
		}
		return rootPanel;
	}
	
	public boolean getIsIncidentToRoutesModified(){
		return getAvisoFieldsPanel().getIsIncidentToRoutesModified();
	}

	private AvisosFieldsPanel getAvisoFieldsPanel(){
		if (avisoFieldsPanel == null){
			avisoFieldsPanel = new AvisosFieldsPanel(this.tipoDialogo, this.aviso);
		}
		return avisoFieldsPanel;
	}

	private OKCancelPanel getOkCancelPanel(){
		if (this.okCancelPanel == null){ 
			this.okCancelPanel = new OKCancelPanel();
			this.okCancelPanel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					okCancelPanel_actionPerformed(e);
				}
			});
		} 
		return this.okCancelPanel;
	}

	void okCancelPanel_actionPerformed(ActionEvent e) {
		if (!okCancelPanel.wasOKPressed() || isInputValid()) {
			setVisible(false);
			return;
		}
	}

	protected boolean isInputValid() {
		if (!allDataIscorrect()){
			return false;
		}
		return setDataToAdvise(); 
	}


	private boolean setDataToAdvise() {
		this.aviso = this.getAvisoFieldsPanel().getAvisoData();
		return true;
	}


	public boolean wasOKPressed() {
		return okCancelPanel.wasOKPressed();
	}

	void this_componentShown(ComponentEvent e) {
		okCancelPanel.setOKPressed(false);
	}

	private boolean allDataIscorrect() {
		return true;
	}

	public LocalGISIntervention getAviso(){
		return this.aviso;
	}

	public void setAviso(LocalGISIntervention aviso){
		this.aviso = aviso;
	}

	private AsociatedDocumentsPanel getDocumentsPanel(){
		if (docuemntsPanel == null){
			docuemntsPanel = new AsociatedDocumentsPanel(this.aviso,this.tipoDialogo);
		}
		return docuemntsPanel;
	}

	private JButton getInformeCiudadanosButton(){
		if (this.informeCiudadanosButton == null){
			informeCiudadanosButton = new JButton(
					I18N.get("avisospanels","localgisgestionciudad.interfaces.avisos.panel.informeciudadanos.button"));

			if (!interventionHasViaOrTramoVia()) {
				this.informeCiudadanosButton.setEnabled(false);
			}

			informeCiudadanosButton.addActionListener(new ActionListener(){
				@Override public void actionPerformed(ActionEvent e) {
					onInformeCiudadanosButtonDo();
				}
			});
		}
		return informeCiudadanosButton;
	}

	

	private HashMap<Integer, ArrayList<Integer>> isStreetWithIdTramos = null;
	private LayerFeatureBean[] getInterventionHasViaOrTramoVia(LocalGISIntervention intervention){

		if (intervention != null && intervention.getFeatureRelation()!=null && intervention.getFeatureRelation().length>0){

			GeopistaEditor geopistaEditor =  null;
			try{
				geopistaEditor = ((GeopistaEditorPanel) AppContext.getApplicationContext().getBlackboard().get("GeopistaEditor")).getEditor();
			}catch (Exception e) {
				e.printStackTrace();
			}

			if (geopistaEditor != null && geopistaEditor.getLayerManager()!= null &&
					geopistaEditor.getLayerManager().getLayers()!= null && !geopistaEditor.getLayerManager().getLayers().isEmpty()){

				LayerFeatureBean[] layersFeatures = intervention.getFeatureRelation();
				Iterator layers = geopistaEditor.getLayerManager().getLayers().iterator();
				ArrayList<LayerFeatureBean> viasAndTramosViasLayerFeatureBeans = new ArrayList<LayerFeatureBean>();

				while(layers.hasNext()){
					Object next = layers.next();
					if (next!= null && next instanceof GeopistaLayer){
						GeopistaLayer geopistaLayer = (GeopistaLayer) next;
//						if (geopistaLayer.getId_LayerDataBase()==11 || geopistaLayer.getId_LayerDataBase()==16){
						if (geopistaLayer.getId_LayerDataBase()==11){
							for(int i=0; i < layersFeatures.length; i++){
								if (layersFeatures[i]!=null){
									LayerFeatureBean layerFeatuerBean = layersFeatures[i];
									if (geopistaLayer.getId_LayerDataBase() == layerFeatuerBean.getIdLayer()){
										if (geopistaLayer.getFeatureCollectionWrapper()!=null &&
												geopistaLayer.getFeatureCollectionWrapper().getFeatures()!=null &&
												!geopistaLayer.getFeatureCollectionWrapper().getFeatures().isEmpty()){
											List features = geopistaLayer.getFeatureCollectionWrapper().getFeatures();
											for(int n=0; n < features.size(); n++){
												if (features.get(n)!=null && features.get(n) instanceof GeopistaFeature){
													GeopistaFeature geoFeature = (GeopistaFeature) features.get(n);
													int dataBaseFeatureId = -1;

													try{
														dataBaseFeatureId = Integer.parseInt(geoFeature.getSystemId());
													}catch (NumberFormatException e) {
														e.printStackTrace();
													}

													if (layerFeatuerBean.getIdFeature() == dataBaseFeatureId){
														viasAndTramosViasLayerFeatureBeans.add(layerFeatuerBean);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (viasAndTramosViasLayerFeatureBeans!=null && !viasAndTramosViasLayerFeatureBeans.isEmpty()){
					return viasAndTramosViasLayerFeatureBeans.toArray(new LayerFeatureBean[viasAndTramosViasLayerFeatureBeans.size()]);
				}
			}
		}

		return null;
	}

	private boolean interventionHasViaOrTramoVia() {	

		if (this.aviso != null && this.aviso.getFeatureRelation()!=null && this.aviso.getFeatureRelation().length>0){
			LayerFeatureBean[] list = getInterventionHasViaOrTramoVia(this.aviso);
			if(list!=null && list.length>0){
				return true;
			}
		}
		return false;
	}

	
	
	private HashMap<Integer, ArrayList<Integer>> getInterventionIdViaWithTramosVias(LocalGISIntervention intervention){

		if (intervention != null && intervention.getFeatureRelation()!=null && intervention.getFeatureRelation().length>0){

			GeopistaEditor geopistaEditor =  null;
			try{
				geopistaEditor = ((GeopistaEditorPanel) AppContext.getApplicationContext().getBlackboard().get("GeopistaEditor")).getEditor();
			}catch (Exception e) {
				e.printStackTrace();
			}

			if (geopistaEditor != null && geopistaEditor.getLayerManager()!= null &&
					geopistaEditor.getLayerManager().getLayers()!= null && !geopistaEditor.getLayerManager().getLayers().isEmpty()){

				LayerFeatureBean[] layersFeatures = intervention.getFeatureRelation();
				Iterator layers = geopistaEditor.getLayerManager().getLayers().iterator();
				HashMap<Integer, ArrayList<Integer>> viasAndTramosViasLayerFeatureBeans = new HashMap<Integer, ArrayList<Integer>>();

				while(layers.hasNext()){
					Object next = layers.next();
					if (next!= null && next instanceof GeopistaLayer){
						GeopistaLayer geopistaLayer = (GeopistaLayer) next;
//						if (geopistaLayer.getId_LayerDataBase()==11 || geopistaLayer.getId_LayerDataBase()==16){
						if (geopistaLayer.getId_LayerDataBase()==11 ){
							for(int i=0; i < layersFeatures.length; i++){
								if (layersFeatures[i]!=null){
									LayerFeatureBean layerFeatuerBean = layersFeatures[i];
									if (geopistaLayer.getId_LayerDataBase() == layerFeatuerBean.getIdLayer()){
										if (geopistaLayer.getFeatureCollectionWrapper()!=null &&
												geopistaLayer.getFeatureCollectionWrapper().getFeatures()!=null &&
												!geopistaLayer.getFeatureCollectionWrapper().getFeatures().isEmpty()){
											List features = geopistaLayer.getFeatureCollectionWrapper().getFeatures();
											for(int n=0; n < features.size(); n++){
												if (features.get(n)!=null && features.get(n) instanceof GeopistaFeature){
													GeopistaFeature geoFeature = (GeopistaFeature) features.get(n);
													int dataBaseFeatureId = -1;

													try{
														dataBaseFeatureId = Integer.parseInt(geoFeature.getSystemId());
													}catch (NumberFormatException e) {
														e.printStackTrace();
													}

													if (layerFeatuerBean.getIdFeature() == dataBaseFeatureId){
														try{
															int idCalle = Integer.parseInt(geoFeature.getAttribute(((GeopistaSchema)geoFeature.getSchema()).getAttributeByColumn("id_via")).toString());
															int idTramo = Integer.parseInt(geoFeature.getAttribute(((GeopistaSchema)geoFeature.getSchema()).getAttributeByColumn("id")).toString());
															if (viasAndTramosViasLayerFeatureBeans.get(idCalle) == null){
																ArrayList<Integer> newList = new ArrayList<Integer>();
																newList.add(idTramo);
																viasAndTramosViasLayerFeatureBeans.put(idCalle, newList);
															}else{
																if (!viasAndTramosViasLayerFeatureBeans.get(idCalle).contains(idTramo)){
																	viasAndTramosViasLayerFeatureBeans.get(idCalle).add(idTramo);
																}
															}
														}catch (Exception e) {
															e.printStackTrace();
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (viasAndTramosViasLayerFeatureBeans!=null && !viasAndTramosViasLayerFeatureBeans.isEmpty()){
					return viasAndTramosViasLayerFeatureBeans;
				}
			}
		}

		return null;
	}
	
	
	
	private void onInformeCiudadanosButtonDo() {
		int seleccion = JOptionPane.showConfirmDialog(this,I18N.get("avisospanels","localgisgestionciudad.interfaces.avisos.intervention.works.information.dialog.confirmation"));
		if (seleccion == 0){

			
			
			ArrayList<PostalDataOT> postalData = new ArrayList<PostalDataOT>();
			ArrayList<String> calles = new ArrayList<String>();

			HashMap<Integer, ArrayList<Integer>> tramosvias = this.getInterventionIdViaWithTramosVias(this.aviso);
			
			// Obtenemos los PostalDatas
			if (tramosvias!=null){
				Iterator<Integer> values = tramosvias.keySet().iterator();
				while(values.hasNext()){
					int idStreet = values.next();
					ArrayList<Integer> tramosArrayList = tramosvias.get(idStreet);
					String userName = AppContext.getApplicationContext().getUserPreference(AppContext.USER_LOGIN, "", true);
					int idEntidad = AppContext.getIdEntidad();
					if ((userName != null && !userName.equals("")) && idEntidad > 0 ){
						PostalDataOT[] postalDataArray;
						try {
							postalDataArray = WSInterventionsWrapper.getPostalDataFromIdTramosAndIdVia(
									userName,
									idEntidad, 
									tramosArrayList.toArray(new Integer[tramosArrayList.size()]),
									idStreet);
							if (postalDataArray!=null && postalDataArray.length>0)
								for (int i=0; i < postalDataArray.length; i++){
									postalData.add(postalDataArray[i]);
								}
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
				}	
			}
			
			
			// OBtenemos los nombres de las calles
			if (tramosvias!=null){
				Iterator<Integer> values = tramosvias.keySet().iterator();
				while(values.hasNext()){
					int idStreet = values.next();
					GestionCiudadOperaciones operaciones = new GestionCiudadOperaciones();
					
					try{
						calles.add(operaciones.getStreetNameFromVias(idStreet, AppContext.getIdMunicipio()));
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			if (postalData!=null && !postalData.isEmpty()){
				ImprimirInformeDialog dialog = new ImprimirInformeDialog(
						AppContext.getApplicationContext().getMainFrame(),
						I18N.get("avisospanels","localgisgestionciudad.interfaces.avisos.intervention.works.information.dialog.title.conf"),
						true,
						((DomainNode)this.getAvisoFieldsPanel().getActuationTypesComboBoxEstructuras().getSelectedItem()).toString(),
						((DomainNode)this.getAvisoFieldsPanel().getInterventionTypesComboBoxEstructuras().getSelectedItem()).toString(),
						calles,
						postalData
				);
			} else{
				JOptionPane.showMessageDialog(this, "No hay datos de ciudadanos asociados esta intervención");
			}
		}

	}


//	private ArrayList<String> getInterventionViasIdentification(LocalGISIntervention intervention){
//
//		if (intervention != null && intervention.getFeatureRelation()!=null && intervention.getFeatureRelation().length>0){
//			GeopistaEditor geopistaEditor =  null;
//			try{
//				geopistaEditor = ((GeopistaEditorPanel) AppContext.getApplicationContext().getBlackboard().get("GeopistaEditor")).getEditor();
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//
//			if (geopistaEditor != null && geopistaEditor.getLayerManager()!= null &&
//					geopistaEditor.getLayerManager().getLayers()!= null && !geopistaEditor.getLayerManager().getLayers().isEmpty()){
//
//				LayerFeatureBean[] layersFeatures = intervention.getFeatureRelation();
//				Iterator layers = geopistaEditor.getLayerManager().getLayers().iterator();
//				ArrayList<String> viasAndTramosId = new ArrayList<String>();
//
//				while(layers.hasNext()){
//					Object next = layers.next();
//					if (next!= null && next instanceof GeopistaLayer){
//						GeopistaLayer geopistaLayer = (GeopistaLayer) next;
//						if (geopistaLayer.getId_LayerDataBase()==11 || geopistaLayer.getId_LayerDataBase()==16){
//							for(int i=0; i < layersFeatures.length; i++){
//								if (layersFeatures[i]!=null){
//									LayerFeatureBean layerFeatuerBean = layersFeatures[i];
//									if (geopistaLayer.getId_LayerDataBase() == layerFeatuerBean.getIdLayer()){
//										if (geopistaLayer.getFeatureCollectionWrapper()!=null &&
//												geopistaLayer.getFeatureCollectionWrapper().getFeatures()!=null &&
//												!geopistaLayer.getFeatureCollectionWrapper().getFeatures().isEmpty()){
//											List features = geopistaLayer.getFeatureCollectionWrapper().getFeatures();
//											for(int n=0; n < features.size(); n++){
//												if (features.get(n)!=null && features.get(n) instanceof GeopistaFeature){
//													GeopistaFeature geoFeature = (GeopistaFeature) features.get(n);
//													int dataBaseFeatureId = -1;
//
//													try{
//														dataBaseFeatureId = Integer.parseInt(geoFeature.getSystemId());
//													}catch (NumberFormatException e) {
//														e.printStackTrace();
//													}
//
//												 ioi
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//				if (viasAndTramosId!=null && !viasAndTramosId.isEmpty()){
//					ArrayList<String> resultado = new ArrayList<String>();
//					Iterator layersit = geopistaEditor.getLayerManager().getLayers().iterator();
//					while (layersit.hasNext()){
//						GeopistaLayer layer = (GeopistaLayer) layersit.next();
//						if (layer!=null){
//							if (layer.getId_LayerDataBase()==16){
//								if (layer.getFeatureCollectionWrapper()!=null &&
//										layer.getFeatureCollectionWrapper().getFeatures()!=null &&
//										!layer.getFeatureCollectionWrapper().getFeatures().isEmpty()){
//									List features = layer.getFeatureCollectionWrapper().getFeatures();
//									for(int n=0; n < features.size(); n++){
//										if (features.get(n)!=null && features.get(n) instanceof GeopistaFeature){
//											GeopistaFeature geoFeature = (GeopistaFeature) features.get(n);
//											if (geoFeature.getSchema().hasAttribute(idvia) && geoFeature.getAttribute(idvia)!=null
//													&& viasAndTramosId.contains(geoFeature.getAttribute(idvia).toString())){
//												try{
//													resultado.add(geoFeature.getAttribute(tipoCalle) + " " + geoFeature.getAttribute(nombreCalle));
//												}catch (Exception e) {
//													e.pr
//												}
//											}
//										}
//									}
//								}
//
//							}
//						}
//					}
//					return resultado;
//				}
//			}
//		}
//		return new ArrayList<String>();
//	}
//	
	

}
