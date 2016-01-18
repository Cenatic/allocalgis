/**
 * LocalizacionDAOImpl.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.implementations;

import java.sql.SQLException;

import com.geopista.app.cementerios.business.dao.DAO;
import com.geopista.app.cementerios.business.dao.interfaces.LocalizacionDAO;
import com.geopista.app.cementerios.business.vo.Localizacion;

public class LocalizacionDAOImpl extends DAO implements LocalizacionDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public LocalizacionDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public int deleteByPrimaryKey(Integer id) throws SQLException {
		Localizacion key = new Localizacion();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"cementerio_localizacion.ibatorgenerated_deleteByPrimaryKey",
				key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public Integer insert(Localizacion record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_localizacion.ibatorgenerated_insert", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public Integer insertSelective(Localizacion record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_localizacion.ibatorgenerated_insertSelective",
				record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public Localizacion selectByPrimaryKey(Integer id) throws SQLException {
		Localizacion key = new Localizacion();
		key.setId(id);
		Localizacion record = (Localizacion) getSqlMapClientTemplate()
				.queryForObject(
						"cementerio_localizacion.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public int updateByPrimaryKeySelective(Localizacion record)  throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_localizacion.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.localizacion
	 * @ibatorgenerated  Tue May 03 16:38:46 CEST 2011
	 */
	public int updateByPrimaryKey(Localizacion record)  throws SQLException {
		int rows = getSqlMapClientTemplate().update(
				"cementerio_localizacion.ibatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}

	public int selectByLastSeqKey() throws SQLException {
		Integer lastKey = (Integer) getSqlMapClientTemplate()
				.queryForObject(
						"cementerio_localizacion.selectByLastSeqKey",
						null);
		return lastKey.intValue();
	}

}