/**
 * MapDocument.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.geopista.ui.GeopistaLayerNamePanel;
import com.geopista.ui.plugin.LegendRenderer;
import com.geopista.ui.plugin.scalebar.GeopistaScaleBarRenderer;
import com.geopista.ui.renderer.UncachedLayerRenderer;
import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.util.Assert;
import com.vividsolutions.jump.workbench.model.Layer;
import com.vividsolutions.jump.workbench.ui.ILayerViewPanel;
import com.vividsolutions.jump.workbench.ui.LayerViewPanel;
import com.vividsolutions.jump.workbench.ui.LayerViewPanelContext;
import com.vividsolutions.jump.workbench.ui.renderer.Renderer;

/**
 * Documento que representa un mapa a imprimir.
 * 
 * Las dimensiones del pintado utiliza las unidades del contexto gr�fico	
 *  Cuando es una impresora las unidades son puntos 1/72 de pulgada
 * Cuando es un componente ser�n pixeles.
 * Observar que la funci�n de scale del Graphics permite independizar el pintado del dispositivo.
 * @see PrintPreviewPanel
 * @author juacas
 */
public class MapDocument implements Printable
{
	private boolean leyenda;

	private Image layerPanelImage = null;
	private GeopistaLayerNamePanel layerNamePanel = null;

	private Collection layersToPrint = null;
	private ArrayList layersReversed=null;
	private ILayerViewPanel layerViewPanel = null;

	private int alturaArbol = 0;
	private PageFormat pf=null;

	private double margen = 0;
	private double printAreaWidth = 0;
	private double printAreaHeight = 0;
	private Envelope envelope = null;

	private double imageableHeight = 0;
	private double imageableWidth = 0;

	private LayerViewPanel virtualPanel=null;


	/*
	 * TODO: El constructor necesita un par�metro de escala y para configurar escal�metros, etc.
	 */
	public MapDocument(GeopistaLayerNamePanel layerNamePanel, ILayerViewPanel layerViewPanel, PageFormat pageFormat, int newScale) {
		this.layerNamePanel = layerNamePanel;
		this.layerViewPanel = layerViewPanel;

		this.layersToPrint = layerViewPanel.getLayerManager().getVisibleLayers(false);
		layersReversed = new ArrayList(layersToPrint);
		Collections.reverse(layersReversed);

		this.imageableHeight = (int) pageFormat.getImageableHeight();
		this.imageableWidth =  (int) pageFormat.getImageableWidth();
		
		printAreaWidth = this.imageableWidth;
		printAreaHeight= this.imageableHeight;

		double margen_cm=0;// Margen que deseamos dejar libre en la pantalla en cent�metros
		margen = margen_cm/2.54 * 72;

		//calculamos el ancho del envelope a partir de la escala
		if(newScale > 0)
		{
			double px_cm =  ((printAreaWidth - 2*margen)/72 * 2.54);
			double py_cm =  ((printAreaHeight - 2*margen)/72 * 2.54);

			double envelopeWidth = newScale*px_cm/100; // en metros
			double envelopeHeight = newScale*py_cm/100; // en metros
			Envelope originalEnvelope = layerViewPanel.getViewport().getEnvelopeInModelCoordinates();
			double envelopeCenterX = originalEnvelope.getMinX()+(originalEnvelope.getMaxX()-originalEnvelope.getMinX())/2;
			double envelopeCenterY = originalEnvelope.getMinY()+(originalEnvelope.getMaxY()-originalEnvelope.getMinY())/2;

			envelope = new Envelope(envelopeCenterX-(envelopeWidth/2),envelopeCenterX+(envelopeWidth/2), envelopeCenterY+(envelopeHeight/2),envelopeCenterY-(envelopeHeight/2)); 
		}
		else
		{
			//Vista actual
			if (newScale == -1)
				envelope = layerViewPanel.getViewport().getEnvelopeInModelCoordinates();
			else if (newScale == -2) //Todo el mapa
				envelope = layerViewPanel.getViewport().fullExtent();
		}
	}

	public MapDocument(GeopistaLayerNamePanel layerNamePanel, ILayerViewPanel layerViewPanel, PageFormat pageFormat, int newScale, Envelope sourceEnvelope) {
		this.layerNamePanel = layerNamePanel;
		this.layerViewPanel = layerViewPanel;

		this.layersToPrint = layerViewPanel.getLayerManager().getVisibleLayers(false);
		layersReversed = new ArrayList(layersToPrint);
		Collections.reverse(layersReversed);

		this.imageableHeight =  pageFormat.getImageableHeight();
		this.imageableWidth =   pageFormat.getImageableWidth();
		
		printAreaWidth=this.imageableWidth;
		printAreaHeight=this.imageableHeight;

		double margen_cm=0;// Margen que deseamos dejar libre en la pantalla en cent�metros
		margen = margen_cm/2.54 * 72;

		//calculamos el ancho del envelope a partir de la escala
		if(newScale > 0) {
			double px_m =  ((printAreaWidth - 2*margen)/72 * 2.54/100);
			double py_m =  ((printAreaHeight - 2*margen)/72 * 2.54/100);

			double envelopeWidth = newScale*px_m;
			double envelopeHeight = newScale*py_m; 
			Envelope originalEnvelope = new Envelope(sourceEnvelope);
			double envelopeCenterX = (originalEnvelope.getMinX()+originalEnvelope.getMaxX())/2;
			double envelopeCenterY = (originalEnvelope.getMinY()+originalEnvelope.getMaxY())/2;
			envelope = new Envelope(envelopeCenterX-(envelopeWidth/2),envelopeCenterX+(envelopeWidth/2), envelopeCenterY+(envelopeHeight/2),envelopeCenterY-(envelopeHeight/2)); 
		}
		else
			envelope = new Envelope(sourceEnvelope);
	}
	/**
	 * Las dimensiones del pintado utiliza las unidades del contexto gr�fico
	 * Cuando es una impresora las unidades son puntos 1/72 de pulgada
	 * Cuando es un componente ser�n pixeles.
	 * Observar que la funci�n de scale del Graphics permite independizar el pintado del dispositivo.
	 * Si se desea utilizar este m�todo para dibujar en un componente hay que aplicar scale al Graphics 
	 * antes de llamar a la funci�n print.
	 * 
	 * @see PrintPreviewPanel
	 * @see java.awt.print.Printable#print(java.awt.Graphics, java.awt.print.PageFormat, int)
	 */
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

		this.pf = pageFormat;
		graphics.translate((int)margen+(int)pageFormat.getImageableX(),(int)margen+(int)pageFormat.getImageableY());
		graphics.drawRect(0, 0, (int)(pageFormat.getImageableWidth()-margen), (int)(pageFormat.getImageableHeight()-margen));
		graphics.clipRect(0, 0, (int)(pageFormat.getImageableWidth()-margen), (int)(pageFormat.getImageableHeight()-margen));
		try {
			print((Graphics2D) graphics,layerViewPanel.getLayerManager().getVisibleLayers(false),envelope,(int) (printAreaWidth-2*margen),(int) (printAreaHeight-2*margen));
		}catch(Exception e) { //capturo la excepcion porque no puedo lanzarla ya que el metodo paint sobreescrito no lo admite
			e.printStackTrace();
		}
		double labelx= 1*72/2.54;
		double labely= 1*72/2.54;
		double labelwidth= 5*72/2.54;
		double labelheight= 2*72/2.54;
		graphics.setColor(Color.WHITE);
		graphics.fill3DRect((int)labelx,(int)labely,(int)labelwidth,(int)labelheight,true);
		graphics.setColor(Color.BLACK);
		graphics.draw3DRect((int)labelx,(int)labely,(int)labelwidth,(int)labelheight,true);
		graphics.drawString("Mapa GEOPISTA",(int)labelx+20,(int)labely+20);

		// Flush memory
		System.gc();
		return Printable.PAGE_EXISTS;
	}





	private void print(Graphics2D graphics, Collection layers, Envelope envelope, int extentInPixelsW,int extentInPixelsH) throws Exception {

		Assert.isTrue(!layers.isEmpty());
		final Throwable[] throwable = new Throwable[] { null };
		if (virtualPanel==null) // intenta ahorra algo de memoria en el caso de la impresion en la que se llaman muchas veces a print
		{
			virtualPanel = new LayerViewPanel(((Layer) layers.iterator().next()).getLayerManager(),
					new LayerViewPanelContext() {
				public void setStatusMessage(String message) {
				}
				public void warnUser(String warning) {
				}
				public void handleThrowable(Throwable t) {
					throwable[0] = t;
				}
			});
		}
		virtualPanel.setSize(extentInPixelsW, extentInPixelsH);
		virtualPanel.getViewport().zoom(envelope);

		for (Iterator i = layersReversed.iterator(); i.hasNext();) {
			Layer layer = (Layer) i.next();

			virtualPanel.getRenderingManager().putAboveLayerables(
					GeopistaScaleBarRenderer.CONTENT_ID,
					new Renderer.Factory() {
						public Renderer create() {
							return new GeopistaScaleBarRenderer(virtualPanel);
						}
					});

			virtualPanel.getRenderingManager().putAboveLayerables(
					LegendRenderer.CONTENT_ID,
					new Renderer.Factory() {
						public Renderer create() {
							return new LegendRenderer(virtualPanel,(int)imageableHeight,(int)imageableWidth);
						}
					});

			virtualPanel.getRenderingManager().render(GeopistaScaleBarRenderer.CONTENT_ID);   
			virtualPanel.getRenderingManager().render(LegendRenderer.CONTENT_ID);           
			UncachedLayerRenderer renderer = new UncachedLayerRenderer(layer, virtualPanel);

			//Wait for rendering to complete rather than running it in a separate thread. [Jon Aquino]
			Runnable runnable = renderer.createRunnable();
			if (runnable != null) { runnable.run(); } // realmente no lanza otro hilo, siempre es null

			renderer.copyTo(graphics);

			GeopistaScaleBarRenderer.setEnabled(true,virtualPanel);
			((GeopistaScaleBarRenderer) virtualPanel.getRenderingManager().getRenderer(GeopistaScaleBarRenderer.CONTENT_ID)).paint(graphics,virtualPanel.getViewport().getScale());

			boolean showLegend = false;
			if(layerNamePanel!=null) showLegend=true;
			LegendRenderer.setEnabled(showLegend,virtualPanel);
			((LegendRenderer) virtualPanel.getRenderingManager().getRenderer(LegendRenderer.CONTENT_ID)).paint(graphics,layerNamePanel);
		}

		GeopistaFunctionUtils.pointsMeter(virtualPanel,this.pf);

		if (throwable[0] != null) 
			throw throwable[0] instanceof Exception ? (Exception) throwable[0] : new Exception(throwable[0].getMessage());
	}

	private  void paintBackground(Graphics2D graphics, int extentW,int extentH) {
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, extentW, extentH);
	}

	public static void main(String[] args) {
	}
}
