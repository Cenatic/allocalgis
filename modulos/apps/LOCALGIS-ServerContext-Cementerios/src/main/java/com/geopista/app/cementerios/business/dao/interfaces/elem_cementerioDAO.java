/**
 * elem_cementerioDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.vo.elem_cementerio;
import com.geopista.app.cementerios.business.vo.elem_cementerioExample;

public interface elem_cementerioDAO {
    /**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
     * @throws SQLException 
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	int deleteByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	Integer insert(elem_cementerio record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	Integer insertSelective(elem_cementerio record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	List selectByExample(elem_cementerioExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	elem_cementerio selectByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	int updateByPrimaryKeySelective(elem_cementerio record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	int updateByPrimaryKey(elem_cementerio record) throws SQLException;

	int selectByLastSeqKey() throws SQLException;
}