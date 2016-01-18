/**
 * LocalgisSpatialRefSysDAOImpl.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.web.core.dao.sqlmap;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import com.localgis.web.core.dao.LocalgisSpatialRefSysDAO;
import com.localgis.web.core.model.LocalgisSpatialRefSys;

public class LocalgisSpatialRefSysDAOImpl extends SqlMapDaoTemplate implements LocalgisSpatialRefSysDAO {

    private static Logger logger = Logger.getLogger(LocalgisSpatialRefSysDAOImpl.class);

    public LocalgisSpatialRefSysDAOImpl(DaoManager daoManager) {
        super(daoManager);
    }

    public LocalgisSpatialRefSys selectSpatialRefSysBySrid(Integer srid) {
        Map params = new HashMap();
        params.put("srid", srid);
        LocalgisSpatialRefSys result = (LocalgisSpatialRefSys) queryForObject("localgis_spatial_ref_sys.selectSpatialRefSysBySrid", params);
        return result;
    }

}