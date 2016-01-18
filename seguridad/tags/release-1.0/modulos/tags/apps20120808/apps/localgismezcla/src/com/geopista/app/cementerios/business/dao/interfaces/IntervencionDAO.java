package com.geopista.app.cementerios.business.dao.interfaces;

import java.sql.SQLException;

import com.geopista.app.cementerios.business.vo.Intervencion;
import com.geopista.app.cementerios.business.vo.IntervencionExample;
import java.util.List;

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