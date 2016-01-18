/*
 * Created on 31-mar-2005 by juacas
 */
package com.geopista.bean;

import com.geopista.feature.GeopistaFeature;
import com.geopista.feature.GeopistaSchema;
import com.geopista.model.GeopistaLayer;
import com.geopista.model.GeopistaMap;
import com.vividsolutions.jts.geom.Geometry;

/**
 * TODO Documentaci�n
 * 
 * @author juacas
 */
public interface IGEOPISTABean
{
	/**
	 * Abre el di�logo de seleccion de mapas para que el usuario elija el que
	 * desea abrir.
	 * 
	 * @return Un objeto GeopistaMap o Null si se ha cancelado la elecci�n
	 */
	public GeopistaMap selectMap();

	/**
	 * Selecciona la capa
	 * 
	 * @param layername
	 *            como capa actual
	 * @param layerName
	 * @return true si no hay errores
	 */
	public abstract boolean setLayer(String layerName);

	/**
	 * Informa del esquema que se debe asociar a la capa actual
	 * 
	 * @param XMLGeopistaSchema
	 * @return true si no hay errores
	 */
	public boolean setSchema(String XMLGeopistaSchema);

	/**
	 * Asigna un valor al atributo  de la feature temporal activa
	 * @param name
	 * @param value 
	 * @return true si no hay error
	 */
	public abstract boolean setAttribute(String name, Object value);
	/**
	 * Asigna un valor al atributo de la feature temporal activa
	 *         
	 * @param name
	 * @param value representaci�n en forma de cadena para el valor del atributo.
	 * @return true si no hay error
	 */public abstract boolean setAttributeAsString(String name, String value);

	/**
	 * Informa de que la feature
	 * 
	 * @param sysId
	 *            de la capa activa se ha borrado del mapa. El Bean lleva un
	 *            registro de estos cambios para facilitar la sincronizaci�n
	 * @param sysId
	 */
	public boolean removeFeature(String sysId);

	/**
	 * Notifica la creaci�n de una nueva feature.
	 * 
	 * @param handle
	 *            identificador de la feature creada
	 * @return true si no hay errores
	 */
	public boolean newFeature(String handle);

	/**
	 * Informa de que la feature
	 * 
	 * @param sysId
	 *            de la capa activa se ha modificado en el mapa. El Bean lleva
	 *            un registro de estos cambios para facilitar la sincronizaci�n
	 * @param sysId
	 */
	public void modifiedFeature(String sysId);

	/**
	 * Obtiene el valor de un atributo de la feature temporal activa
	 * 
	 * @param name
	 * @return el valor que contiene el atributo. Null si hay un error o si el
	 *         atributo est� vacio. Nota: Hay que comprobar el estado de los
	 *         errores si se devuelve null.
	 */
	public abstract Object getAttribute(String name);

	/**
	 * Abre una ventana para la edici�n interactiva de los atributos.
	 * 
	 * @return true si se ha aceptado o false si se ha cancelado
	 */
	public abstract boolean edit();

	/**
	 * Contrasta los atributos con el esquema definido en esta capa.
	 * 
	 * @param interactive
	 *            true si se desea mostrar el di�logo en caso de no validez
	 * @return true si pasa la validaci�n, false en caso contrario
	 */
	public boolean checkFeature(Boolean interactive);

	/**
	 * Verifica que la geometr�a cumple las restricciones de la capa. Se pasa la
	 * Geometr�a en un objeto Geometry (obtenido antes con getGeometry)
	 * 
	 * @param geom
	 * @return true si es todo correcto
	 */
	public boolean checkGeometry(Geometry geom);

	/**
	 * Verifica que la geometr�a cumple las restricciones de la capa. Se pasa la
	 * Geometr�a en formato WKT
	 * 
	 * @param WKTgeom
	 * @return true si es todo correcto
	 */
	public boolean checkGeometry(String WKTgeom);

	/**
	 * Reinicia la feature temporal activa
	 */
	public abstract void reset();

	/**
	 * Obtiene el nombre del mapa activo
	 * 
	 * @return
	 */
	public abstract String getMapName();

	/**
	 * Obtiene el path donde se almacena la versi�n local del mapa
	 * 
	 * @return
	 */
	public abstract String getMapPath();

	/**
	 * Devuelve una lista de mensajes describiendo los errores que se han
	 * detectado en la ultima operaci�n.
	 * 
	 * @return String[] con los mensajes descriptivos de los errores. array
	 *         vacio si no hay errores
	 */
	public String[] getErrorMessages();

	/**
	 * Obtiene el formato local del mapa extraido.
	 * 
	 * @return
	 */
	public abstract String getMapFormat();

	/**
	 * Devuelve el Schema de la capa activa
	 * 
	 * @return
	 */
	public abstract GeopistaSchema getSchema();

	/**
	 * Solicita la extracci�n de un mapa de Geopista. Lanza el proceso de
	 * extracci�n de mapas de Geopista, que incluye bloqueo de datos en la BBDD,
	 * descarga de la informaci�n de Geopista, exportaci�n a DXF, generaci�n de
	 * ficheros de control para la sincronizaci�n.
	 * 
	 * @param mapName
	 *            Identificador del sistema del mapa.
	 * @param longIni
	 *            Coordenada del boundingbox a bloquear.
	 * @param latIni
	 *            Coordenada del boundingbox a bloquear.
	 * @param longEnd
	 *            Coordenada del boundingbox a bloquear.
	 * @param latEnd
	 *            Coordenada del boundingbox a bloquear.
	 * @param format
	 *            de momento solo soporta "DXF"
	 * @return
	 */
	public abstract GeopistaMap extractMap(String mapName, Double longIni,
			Double latIni, Double longEnd, Double latEnd, String format);

	/**
	 * Sincroniza los cambios del mapa activo con GEOPISTA. Sincroniza el mapa
	 * que incluye: Lee el DXF, actualiza en Geopista las features nuevas y
	 * modificadas, elimina las eliminadas, desbloquea la secci�n bloqueada y
	 * borra el mapa (estos dos pasos si se especifica por el usuario).
	 * 
	 * @return true si no ha habido incidentes.
	 */
	public boolean syncMap();

	/**
	 * Devuelve el mapa activo
	 * 
	 * @return
	 */
	public abstract GeopistaMap getMap();

	/**
	 * Obtiene la Feature temporal de la capa activa. Devuelve un intefaz para
	 * acceso a la Feature de trabajo mediante IDispatch. Se ofrecen m�todos de
	 * acceso secuencial para caso de problemas con Automation.
	 * 
	 * @return GeopistaFeature actual. Variable temporal interna.
	 */
	public abstract GeopistaFeature getFeature();

	/**
	 * Crea un esquema de prueba. SOLO PARA DESARROLLO.
	 * 
	 * @deprecated
	 */
	public void createTestConfig();

	/**
	 * Obtiene la geometria de la feature temporal de la capa activa.
	 * 
	 * @return
	 */
	public Geometry getGeometry();

	/**
	 * Define la geometr�a activa en formato WKT
	 * 
	 * @return
	 */
	public String getWKTGeometry();

	/**
	 * Define la Geometria a la feature activa en formato WKT.
	 * 
	 * @param geo
	 */
	public boolean setGeometry(String geometryWKT);

	/**
	 * Devuelve la lista de capas asociadas al mapa activo.
	 * 
	 * @return
	 */
	public GeopistaLayer[] getLayers();

}