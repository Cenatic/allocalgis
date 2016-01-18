/**
 * IntervencionDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.vo.Intervencion;
import com.geopista.app.cementerios.business.vo.IntervencionExample;

public interface IntervencionDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @throws SQLException 
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	int deleteByExample(IntervencionExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	int deleteByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	Integer insert(Intervencion record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	Integer insertSelective(Intervencion record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	List selectByExample(IntervencionExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	Intervencion selectByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	int updateByExampleSelective(Intervencion record,
			IntervencionExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	int updateByExample(Intervencion record, IntervencionExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	int updateByPrimaryKeySelective(Intervencion record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.intervencion
	 * @ibatorgenerated  Fri Jul 08 14:28:21 CEST 2011
	 */
	int updateByPrimaryKey(Intervencion record) throws SQLException;
	
	int selectByLastSeqKey() throws SQLException;

	List selectAll() throws SQLException ;

}