/**
 * RelTitularDAOImpl.java
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
import com.geopista.app.cementerios.business.dao.interfaces.RelTitularDAO;
import com.geopista.app.cementerios.business.vo.RelTitular;
import com.geopista.app.cementerios.business.vo.RelTitularKey;

public class RelTitularDAOImpl extends DAO implements RelTitularDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public RelTitularDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public int deleteByPrimaryKey(RelTitularKey key) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.delete("cementerio_reltitular.ibatorgenerated_deleteByPrimaryKey",
						key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public void insert(RelTitular record) throws SQLException {
		getSqlMapClientTemplate().insert(
				"cementerio_reltitular.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public void insertSelective(RelTitular record) throws SQLException {
		getSqlMapClientTemplate()
				.insert("cementerio_reltitular.ibatorgenerated_insertSelective",
						record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public RelTitular selectByPrimaryKey(RelTitularKey key) throws SQLException {
		RelTitular record = (RelTitular) getSqlMapClientTemplate()
				.queryForObject(
						"cementerio_reltitular.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public int updateByPrimaryKeySelective(RelTitular record) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_reltitular.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.reltitular
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public int updateByPrimaryKey(RelTitular record) throws SQLException {
		int rows = getSqlMapClientTemplate().update(
				"cementerio_reltitular.ibatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}
	
	public List selectByConcesion (Integer id_concesion) throws SQLException {
	List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_reltitular.selectByConcesion",
				id_concesion);
	return list;
	}

	public List selectByTitular (String dni_persona) throws SQLException {
		List list = getSqlMapClientTemplate()
			.queryForList(
					"cementerio_reltitular.selectByTitular",
					dni_persona);
		return list;
	}
	
	public List selectAll () throws SQLException{
		List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_reltitular.selectAll",
				null);
		return list;
	}
}