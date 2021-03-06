/**
 * CementerioFeatureDAOImpl.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.implementations;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.dao.DAO;
import com.geopista.app.cementerios.business.dao.interfaces.CementerioFeatureDAO;
import com.geopista.app.cementerios.business.vo.CementerioFeatureKey;

public class CementerioFeatureDAOImpl  extends DAO implements CementerioFeatureDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.cementerio_feature
	 * @ibatorgenerated  Fri Jun 10 13:16:00 CEST 2011
	 */
	public CementerioFeatureDAOImpl() {
		super();
	}


	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.cementerio_feature
	 * @throws SQLException 
	 * @ibatorgenerated  Fri Jun 10 13:16:00 CEST 2011
	 */
	public int deleteByPrimaryKey(CementerioFeatureKey key) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.delete("cementerio_cementerio_feature.ibatorgenerated_deleteByPrimaryKey",
						key);
		return rows;
	}


	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.cementerio_feature
	 * @ibatorgenerated  Fri Jun 10 13:16:00 CEST 2011
	 */
	public void insert(CementerioFeatureKey record) throws SQLException {
		getSqlMapClientTemplate().insert(
				"cementerio_cementerio_feature.ibatorgenerated_insert", record);
	}


	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.cementerio_feature
	 * @ibatorgenerated  Fri Jun 10 13:16:00 CEST 2011
	 */
	public void insertSelective(CementerioFeatureKey record) throws SQLException {
		getSqlMapClientTemplate()
				.insert("cementerio_cementerio_feature.ibatorgenerated_insertSelective",
						record);
	}


	public List selectByFeature (Integer id_feature) throws SQLException {
		List  listKeys =  getSqlMapClientTemplate()
			.queryForList("cementerio_cementerio_feature.selectByFeature",id_feature);
		return listKeys;
	}

	
	public List selectByElem(Integer id_unidad) throws SQLException {
		List  listKeys =  getSqlMapClientTemplate()
		.queryForList("cementerio_cementerio_feature.selectByElem",id_unidad);
		return listKeys;
	}
	
	public int deleteByElem(Integer id_elemcementerio) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.delete("cementerio_cementerio_feature.deleteByElem",
						id_elemcementerio);
		return rows;
	}

	public List selectByFeatureAndLayerUnidad(CementerioFeatureKey record) throws SQLException {
		List  listKeys =  getSqlMapClientTemplate()
		.queryForList("cementerio_cementerio_feature.selectByFeatureAndLayerUnidad",record);
	return listKeys;
	}

	
	
	
}