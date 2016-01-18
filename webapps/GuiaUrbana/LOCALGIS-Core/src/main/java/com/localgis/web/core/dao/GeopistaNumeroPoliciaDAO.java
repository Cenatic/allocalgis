/**
 * GeopistaNumeroPoliciaDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.web.core.dao;

import com.ibatis.dao.client.Dao;
import com.localgis.web.core.model.GeopistaNumeroPolicia;

/**
 * DAO para manejar los n�meros de policia de la base de datos de Geopista
 * 
 * @author albegarcia
 * 
 */
public interface GeopistaNumeroPoliciaDAO extends Dao {

    /**
     * M�todo que devuelve un numero de policia a partir de su id
     * 
     * @param id
     *            Identificador del n�mero de polic�a
     * @return N�mero de policia de Geopista
     *         <code>com.geopista.app.guiaurbana.api.model.GeopistaNumeroPolicia</code>
     */
    public GeopistaNumeroPolicia selectNumeroPoliciaById(Integer id, Integer srid);

}