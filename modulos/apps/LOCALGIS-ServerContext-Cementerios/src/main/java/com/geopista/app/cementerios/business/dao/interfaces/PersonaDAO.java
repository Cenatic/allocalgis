/**
 * PersonaDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.vo.Persona;
import com.geopista.app.cementerios.business.vo.PersonaExample;

public interface PersonaDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @throws SQLException 
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	int deleteByPrimaryKey(String dni) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	void insert(Persona record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	void insertSelective(Persona record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	List selectByExample(PersonaExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	Persona selectByPrimaryKey(String dni) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	int updateByPrimaryKeySelective(Persona record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.persona
	 * @ibatorgenerated  Mon Jun 06 12:49:46 CEST 2011
	 */
	int updateByPrimaryKey(Persona record) throws SQLException;

//	/**
//	 * Set the iBATIS Database Layer SqlMapClient to work with.
//	 * @param sqlMapper
//	 */
//	void setSqlMapClient(SqlMapClient sqlMapper)throws SQLException;


}