/**
 * LocalgisLayerDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.web.core.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.localgis.web.core.model.LocalgisLayer;
import com.localgis.web.core.model.LocalgisLayerExt;

/**
 * DAO para manejar las capas de la base de datos de Localgis
 * 
 * @author albegarcia
 * 
 */
public interface LocalgisLayerDAO {

    /**
     * M�todo para insertar una capa en la base de datos
     * 
     * @param record
     *            La capa a insertar
     * @return El identificador de la capa insertada
     */
    public Integer insert(LocalgisLayer record);

    /**
     * M�todo para obtener una capa por idEntidad y por idGeopista
     * 
     * @param idEntidad
     *            Identificador de la entidad
     * @param idGeopista
     *            Identificador de la capa en Geopista
     * @param publicMaps
     *            Si se desea obtener la capa de los mapas publicos (true) o
     *            privados (false)
     */
    public LocalgisLayer selectLayerByIdEntidadAndIdGeopista(Integer idEntidad, Integer idGeopista, Boolean publicMaps);

    /**
     * M�todo para actualizar una capa por primary key
     * 
     * @param record
     *            La capa a actualizar
     * @return El n�mero de capas actualizadas
     */
    public int updateByPrimaryKey(LocalgisLayer record);

    /**
     * M�todo para obtener las capas que no est�n referenciadas por ningun mapa
     * 
     * @return La lista de capas que no est�n referenciadas como objetos
     *         LocalgisLayer
     */
    public List selectUnreferenceLayers();

    /**
     * M�todo para eliminar una capa por primary key
     * 
     * @param layerid
     *            Identificador de la capa a eliminar
     * 
     * @return El n�mero de registros eliminados
     */
    public int deleteByPrimaryKey(Integer layerid);

    /**
     * M�todo para obtener las capas de un mapa determinado
     * 
     * @param idMap
     *            Identificador del mapa
     * @param locale
     *            Locales para hacer la consulta
     * @return Una lista de capas como objetos LocalgisLayerExt
     * 
     */
    public List selectLayersByIdMap(Integer idMap, String locale);

    /**
     * M�todo para obtener las capas de un mapa determinado
     * 
     * @param idMapGeopista
     *            Identificador del mapa
     * @param locale
     *            Locales para hacer la consulta
     * @return Una lista de capas como objetos LocalgisLayerExt
     * 
     */
    public List selectLayersByIdMapGeopista(Integer idMapGeopista, String locale);
    
    public List selectLayersByIdMapGeopistaAndEntidad(Integer idMapGeopista, String locale,Integer idEntidad,int tipoPublicacion);
    
    public Timestamp getFechaPrimeraVersion(LocalgisLayer localgisLayer);
    
    /**
     * M�todo para obtener la geometr�a (en texto) de una capa determinada
     * @param layer Nombre de la tabla de la capa
     * @param municipio Municipio
     * @return Geometr�a
     */
    public List<String> getGeometryFromLayer(String layer, String municipio);
    
    public String getIdLayerFromGuiaUrbana(String layerId);
    

    //*********** SADIM ************
    //*********** SADIM ************
    //*********** SADIM ************
    //*********** SADIM ************
    public LocalgisLayer selectLayerByName(String layername); 
 
    public LocalgisLayerExt selectLayerById(Integer idLayer,Integer idMap,String locale); 
    
    public List<HashMap<String, Object>> selectPublicAnexosByIdLayerAndIdFeature(int idLayer, int idFeature);

    public List<HashMap<String, Object>> selectAllAnexosByIdLayerAndIdFeature(int idLayer, int idFeature);

	public List<HashMap<String,Object>> getLayersInArea(ArrayList listaCompletaCapas,String srid,String bbox);


}