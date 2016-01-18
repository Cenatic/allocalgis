package com.geopista.app.cementerios.business.dao.implementations;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.dao.DAO;
import com.geopista.app.cementerios.business.dao.interfaces.elem_cementerioDAO;
import com.geopista.app.cementerios.business.vo.elem_cementerio;
import com.geopista.app.cementerios.business.vo.elem_cementerioExample;

public class elem_cementerioDAOImpl extends DAO implements elem_cementerioDAO {

    /**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public elem_cementerioDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @throws SQLException 
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public int deleteByPrimaryKey(Integer id) throws SQLException {
		elem_cementerio key = new elem_cementerio();
		key.setId(id);
		int rows = getSqlMapClientTemplate()
				.delete("cementerio_elem_cementerio.ibatorgenerated_deleteByPrimaryKey",
						key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public Integer insert(elem_cementerio record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_elem_cementerio.ibatorgenerated_insert", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public Integer insertSelective(elem_cementerio record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_elem_cementerio.ibatorgenerated_insertSelective",
				record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public List selectByExample(elem_cementerioExample example) throws SQLException {
		List list = getSqlMapClientTemplate().queryForList(
				"cementerio_elem_cementerio.ibatorgenerated_selectByExample",
				example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public elem_cementerio selectByPrimaryKey(Integer id) throws SQLException {
		elem_cementerio key = new elem_cementerio();
		key.setId(id);
		elem_cementerio record = (elem_cementerio) getSqlMapClientTemplate()
				.queryForObject(
						"cementerio_elem_cementerio.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public int updateByPrimaryKeySelective(elem_cementerio record) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_elem_cementerio.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.elem_cementerio
	 * @ibatorgenerated  Fri Jun 10 13:12:03 CEST 2011
	 */
	public int updateByPrimaryKey(elem_cementerio record) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_elem_cementerio.ibatorgenerated_updateByPrimaryKey",
						record);
		return rows;
	}

	public int selectByLastSeqKey() throws SQLException {
		Integer lastKey = (Integer) getSqlMapClientTemplate()
				.queryForObject(
						"cementerio_elem_cementerio.selectByLastSeqKey",
						null);
		return lastKey.intValue();
	}

}