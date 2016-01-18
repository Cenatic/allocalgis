/**
 * PersonaDAOImpl.java
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
import com.geopista.app.cementerios.business.dao.interfaces.PersonaDAO;
import com.geopista.app.cementerios.business.vo.Persona;
import com.geopista.app.cementerios.business.vo.PersonaExample;

public class PersonaDAOImpl extends DAO implements PersonaDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public PersonaDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @throws SQLException 
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public int deleteByPrimaryKey(String dni) throws SQLException {
		Persona key = new Persona();
		key.setDni(dni);
		int rows = getSqlMapClientTemplate().delete(
				"cementerio_persona.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public void insert(Persona record)  throws SQLException {
		getSqlMapClientTemplate().insert(
				"cementerio_persona.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public void insertSelective(Persona record)  throws SQLException {
		getSqlMapClientTemplate().insert(
				"cementerio_persona.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public List selectByExample(PersonaExample example)  throws SQLException {
		List list = getSqlMapClientTemplate().queryForList(
				"cementerio_persona.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public Persona selectByPrimaryKey(String dni)  throws SQLException {
		Persona key = new Persona();
		key.setDni(dni);
		Persona record = (Persona) getSqlMapClientTemplate().queryForObject(
				"cementerio_persona.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public int updateByPrimaryKeySelective(Persona record)  throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_persona.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	public int updateByPrimaryKey(Persona record)  throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_persona.ibatorgenerated_updateByPrimaryKey",
						record);
		return rows;
	}
}