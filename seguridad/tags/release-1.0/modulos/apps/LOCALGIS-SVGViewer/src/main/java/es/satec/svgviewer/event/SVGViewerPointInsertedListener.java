package es.satec.svgviewer.event;

import com.tinyline.svg.SVGNode;

/**
 * Interfaz para notificar la inserci�n de un punto en el documento SVG
 * a la aplicaci�n cliente.
 * @author jpresa
 */
public interface SVGViewerPointInsertedListener {

	public void pointInserted(SVGNode point);
	
}
