package com.geopista.app.cementerios.business.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExhumacionExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public ExhumacionExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	protected ExhumacionExample(ExhumacionExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table cementerio.exhumacion
	 * @ibatorgenerated  Thu Jul 28 10:27:59 CEST 2011
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List dateList = new ArrayList();
			Iterator iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(((Date) iter.next()).getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andInformeIsNull() {
			addCriterion("informe is null");
			return this;
		}

		public Criteria andInformeIsNotNull() {
			addCriterion("informe is not null");
			return this;
		}

		public Criteria andInformeEqualTo(String value) {
			addCriterion("informe =", value, "informe");
			return this;
		}

		public Criteria andInformeNotEqualTo(String value) {
			addCriterion("informe <>", value, "informe");
			return this;
		}

		public Criteria andInformeGreaterThan(String value) {
			addCriterion("informe >", value, "informe");
			return this;
		}

		public Criteria andInformeGreaterThanOrEqualTo(String value) {
			addCriterion("informe >=", value, "informe");
			return this;
		}

		public Criteria andInformeLessThan(String value) {
			addCriterion("informe <", value, "informe");
			return this;
		}

		public Criteria andInformeLessThanOrEqualTo(String value) {
			addCriterion("informe <=", value, "informe");
			return this;
		}

		public Criteria andInformeLike(String value) {
			addCriterion("informe like", value, "informe");
			return this;
		}

		public Criteria andInformeNotLike(String value) {
			addCriterion("informe not like", value, "informe");
			return this;
		}

		public Criteria andInformeIn(List values) {
			addCriterion("informe in", values, "informe");
			return this;
		}

		public Criteria andInformeNotIn(List values) {
			addCriterion("informe not in", values, "informe");
			return this;
		}

		public Criteria andInformeBetween(String value1, String value2) {
			addCriterion("informe between", value1, value2, "informe");
			return this;
		}

		public Criteria andInformeNotBetween(String value1, String value2) {
			addCriterion("informe not between", value1, value2, "informe");
			return this;
		}

		public Criteria andContenedorIsNull() {
			addCriterion("contenedor is null");
			return this;
		}

		public Criteria andContenedorIsNotNull() {
			addCriterion("contenedor is not null");
			return this;
		}

		public Criteria andContenedorEqualTo(Integer value) {
			addCriterion("contenedor =", value, "contenedor");
			return this;
		}

		public Criteria andContenedorNotEqualTo(Integer value) {
			addCriterion("contenedor <>", value, "contenedor");
			return this;
		}

		public Criteria andContenedorGreaterThan(Integer value) {
			addCriterion("contenedor >", value, "contenedor");
			return this;
		}

		public Criteria andContenedorGreaterThanOrEqualTo(Integer value) {
			addCriterion("contenedor >=", value, "contenedor");
			return this;
		}

		public Criteria andContenedorLessThan(Integer value) {
			addCriterion("contenedor <", value, "contenedor");
			return this;
		}

		public Criteria andContenedorLessThanOrEqualTo(Integer value) {
			addCriterion("contenedor <=", value, "contenedor");
			return this;
		}

		public Criteria andContenedorIn(List values) {
			addCriterion("contenedor in", values, "contenedor");
			return this;
		}

		public Criteria andContenedorNotIn(List values) {
			addCriterion("contenedor not in", values, "contenedor");
			return this;
		}

		public Criteria andContenedorBetween(Integer value1, Integer value2) {
			addCriterion("contenedor between", value1, value2, "contenedor");
			return this;
		}

		public Criteria andContenedorNotBetween(Integer value1, Integer value2) {
			addCriterion("contenedor not between", value1, value2, "contenedor");
			return this;
		}

		public Criteria andCodigoIsNull() {
			addCriterion("codigo is null");
			return this;
		}

		public Criteria andCodigoIsNotNull() {
			addCriterion("codigo is not null");
			return this;
		}

		public Criteria andCodigoEqualTo(String value) {
			addCriterion("codigo =", value, "codigo");
			return this;
		}

		public Criteria andCodigoNotEqualTo(String value) {
			addCriterion("codigo <>", value, "codigo");
			return this;
		}

		public Criteria andCodigoGreaterThan(String value) {
			addCriterion("codigo >", value, "codigo");
			return this;
		}

		public Criteria andCodigoGreaterThanOrEqualTo(String value) {
			addCriterion("codigo >=", value, "codigo");
			return this;
		}

		public Criteria andCodigoLessThan(String value) {
			addCriterion("codigo <", value, "codigo");
			return this;
		}

		public Criteria andCodigoLessThanOrEqualTo(String value) {
			addCriterion("codigo <=", value, "codigo");
			return this;
		}

		public Criteria andCodigoLike(String value) {
			addCriterion("codigo like", value, "codigo");
			return this;
		}

		public Criteria andCodigoNotLike(String value) {
			addCriterion("codigo not like", value, "codigo");
			return this;
		}

		public Criteria andCodigoIn(List values) {
			addCriterion("codigo in", values, "codigo");
			return this;
		}

		public Criteria andCodigoNotIn(List values) {
			addCriterion("codigo not in", values, "codigo");
			return this;
		}

		public Criteria andCodigoBetween(String value1, String value2) {
			addCriterion("codigo between", value1, value2, "codigo");
			return this;
		}

		public Criteria andCodigoNotBetween(String value1, String value2) {
			addCriterion("codigo not between", value1, value2, "codigo");
			return this;
		}

		public Criteria andFechaExhumacionIsNull() {
			addCriterion("fecha_exhumacion is null");
			return this;
		}

		public Criteria andFechaExhumacionIsNotNull() {
			addCriterion("fecha_exhumacion is not null");
			return this;
		}

		public Criteria andFechaExhumacionEqualTo(Date value) {
			addCriterionForJDBCDate("fecha_exhumacion =", value,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionNotEqualTo(Date value) {
			addCriterionForJDBCDate("fecha_exhumacion <>", value,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionGreaterThan(Date value) {
			addCriterionForJDBCDate("fecha_exhumacion >", value,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fecha_exhumacion >=", value,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionLessThan(Date value) {
			addCriterionForJDBCDate("fecha_exhumacion <", value,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fecha_exhumacion <=", value,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionIn(List values) {
			addCriterionForJDBCDate("fecha_exhumacion in", values,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionNotIn(List values) {
			addCriterionForJDBCDate("fecha_exhumacion not in", values,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fecha_exhumacion between", value1, value2,
					"fechaExhumacion");
			return this;
		}

		public Criteria andFechaExhumacionNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fecha_exhumacion not between", value1,
					value2, "fechaExhumacion");
			return this;
		}

		public Criteria andIdDifuntoIsNull() {
			addCriterion("id_difunto is null");
			return this;
		}

		public Criteria andIdDifuntoIsNotNull() {
			addCriterion("id_difunto is not null");
			return this;
		}

		public Criteria andIdDifuntoEqualTo(Integer value) {
			addCriterion("id_difunto =", value, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoNotEqualTo(Integer value) {
			addCriterion("id_difunto <>", value, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoGreaterThan(Integer value) {
			addCriterion("id_difunto >", value, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_difunto >=", value, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoLessThan(Integer value) {
			addCriterion("id_difunto <", value, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoLessThanOrEqualTo(Integer value) {
			addCriterion("id_difunto <=", value, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoIn(List values) {
			addCriterion("id_difunto in", values, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoNotIn(List values) {
			addCriterion("id_difunto not in", values, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoBetween(Integer value1, Integer value2) {
			addCriterion("id_difunto between", value1, value2, "idDifunto");
			return this;
		}

		public Criteria andIdDifuntoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_difunto not between", value1, value2, "idDifunto");
			return this;
		}

		public Criteria andIdTarifaIsNull() {
			addCriterion("id_tarifa is null");
			return this;
		}

		public Criteria andIdTarifaIsNotNull() {
			addCriterion("id_tarifa is not null");
			return this;
		}

		public Criteria andIdTarifaEqualTo(Integer value) {
			addCriterion("id_tarifa =", value, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaNotEqualTo(Integer value) {
			addCriterion("id_tarifa <>", value, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaGreaterThan(Integer value) {
			addCriterion("id_tarifa >", value, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_tarifa >=", value, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaLessThan(Integer value) {
			addCriterion("id_tarifa <", value, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaLessThanOrEqualTo(Integer value) {
			addCriterion("id_tarifa <=", value, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaIn(List values) {
			addCriterion("id_tarifa in", values, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaNotIn(List values) {
			addCriterion("id_tarifa not in", values, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaBetween(Integer value1, Integer value2) {
			addCriterion("id_tarifa between", value1, value2, "idTarifa");
			return this;
		}

		public Criteria andIdTarifaNotBetween(Integer value1, Integer value2) {
			addCriterion("id_tarifa not between", value1, value2, "idTarifa");
			return this;
		}

		public Criteria andTipoExhumacionIsNull() {
			addCriterion("tipo_exhumacion is null");
			return this;
		}

		public Criteria andTipoExhumacionIsNotNull() {
			addCriterion("tipo_exhumacion is not null");
			return this;
		}

		public Criteria andTipoExhumacionEqualTo(Integer value) {
			addCriterion("tipo_exhumacion =", value, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionNotEqualTo(Integer value) {
			addCriterion("tipo_exhumacion <>", value, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionGreaterThan(Integer value) {
			addCriterion("tipo_exhumacion >", value, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionGreaterThanOrEqualTo(Integer value) {
			addCriterion("tipo_exhumacion >=", value, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionLessThan(Integer value) {
			addCriterion("tipo_exhumacion <", value, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionLessThanOrEqualTo(Integer value) {
			addCriterion("tipo_exhumacion <=", value, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionIn(List values) {
			addCriterion("tipo_exhumacion in", values, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionNotIn(List values) {
			addCriterion("tipo_exhumacion not in", values, "tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionBetween(Integer value1, Integer value2) {
			addCriterion("tipo_exhumacion between", value1, value2,
					"tipoExhumacion");
			return this;
		}

		public Criteria andTipoExhumacionNotBetween(Integer value1,
				Integer value2) {
			addCriterion("tipo_exhumacion not between", value1, value2,
					"tipoExhumacion");
			return this;
		}

		public Criteria andRedRestosIsNull() {
			addCriterion("red_restos is null");
			return this;
		}

		public Criteria andRedRestosIsNotNull() {
			addCriterion("red_restos is not null");
			return this;
		}

		public Criteria andRedRestosEqualTo(Integer value) {
			addCriterion("red_restos =", value, "redRestos");
			return this;
		}

		public Criteria andRedRestosNotEqualTo(Integer value) {
			addCriterion("red_restos <>", value, "redRestos");
			return this;
		}

		public Criteria andRedRestosGreaterThan(Integer value) {
			addCriterion("red_restos >", value, "redRestos");
			return this;
		}

		public Criteria andRedRestosGreaterThanOrEqualTo(Integer value) {
			addCriterion("red_restos >=", value, "redRestos");
			return this;
		}

		public Criteria andRedRestosLessThan(Integer value) {
			addCriterion("red_restos <", value, "redRestos");
			return this;
		}

		public Criteria andRedRestosLessThanOrEqualTo(Integer value) {
			addCriterion("red_restos <=", value, "redRestos");
			return this;
		}

		public Criteria andRedRestosIn(List values) {
			addCriterion("red_restos in", values, "redRestos");
			return this;
		}

		public Criteria andRedRestosNotIn(List values) {
			addCriterion("red_restos not in", values, "redRestos");
			return this;
		}

		public Criteria andRedRestosBetween(Integer value1, Integer value2) {
			addCriterion("red_restos between", value1, value2, "redRestos");
			return this;
		}

		public Criteria andRedRestosNotBetween(Integer value1, Integer value2) {
			addCriterion("red_restos not between", value1, value2, "redRestos");
			return this;
		}

		public Criteria andTrasladoIsNull() {
			addCriterion("traslado is null");
			return this;
		}

		public Criteria andTrasladoIsNotNull() {
			addCriterion("traslado is not null");
			return this;
		}

		public Criteria andTrasladoEqualTo(Integer value) {
			addCriterion("traslado =", value, "traslado");
			return this;
		}

		public Criteria andTrasladoNotEqualTo(Integer value) {
			addCriterion("traslado <>", value, "traslado");
			return this;
		}

		public Criteria andTrasladoGreaterThan(Integer value) {
			addCriterion("traslado >", value, "traslado");
			return this;
		}

		public Criteria andTrasladoGreaterThanOrEqualTo(Integer value) {
			addCriterion("traslado >=", value, "traslado");
			return this;
		}

		public Criteria andTrasladoLessThan(Integer value) {
			addCriterion("traslado <", value, "traslado");
			return this;
		}

		public Criteria andTrasladoLessThanOrEqualTo(Integer value) {
			addCriterion("traslado <=", value, "traslado");
			return this;
		}

		public Criteria andTrasladoIn(List values) {
			addCriterion("traslado in", values, "traslado");
			return this;
		}

		public Criteria andTrasladoNotIn(List values) {
			addCriterion("traslado not in", values, "traslado");
			return this;
		}

		public Criteria andTrasladoBetween(Integer value1, Integer value2) {
			addCriterion("traslado between", value1, value2, "traslado");
			return this;
		}

		public Criteria andTrasladoNotBetween(Integer value1, Integer value2) {
			addCriterion("traslado not between", value1, value2, "traslado");
			return this;
		}

		public Criteria andPrecioFinalIsNull() {
			addCriterion("precio_final is null");
			return this;
		}

		public Criteria andPrecioFinalIsNotNull() {
			addCriterion("precio_final is not null");
			return this;
		}

		public Criteria andPrecioFinalEqualTo(String value) {
			addCriterion("precio_final =", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalNotEqualTo(String value) {
			addCriterion("precio_final <>", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalGreaterThan(String value) {
			addCriterion("precio_final >", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalGreaterThanOrEqualTo(String value) {
			addCriterion("precio_final >=", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalLessThan(String value) {
			addCriterion("precio_final <", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalLessThanOrEqualTo(String value) {
			addCriterion("precio_final <=", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalLike(String value) {
			addCriterion("precio_final like", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalNotLike(String value) {
			addCriterion("precio_final not like", value, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalIn(List values) {
			addCriterion("precio_final in", values, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalNotIn(List values) {
			addCriterion("precio_final not in", values, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalBetween(String value1, String value2) {
			addCriterion("precio_final between", value1, value2, "precioFinal");
			return this;
		}

		public Criteria andPrecioFinalNotBetween(String value1, String value2) {
			addCriterion("precio_final not between", value1, value2,
					"precioFinal");
			return this;
		}

		public Criteria andBonificacionIsNull() {
			addCriterion("bonificacion is null");
			return this;
		}

		public Criteria andBonificacionIsNotNull() {
			addCriterion("bonificacion is not null");
			return this;
		}

		public Criteria andBonificacionEqualTo(String value) {
			addCriterion("bonificacion =", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionNotEqualTo(String value) {
			addCriterion("bonificacion <>", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionGreaterThan(String value) {
			addCriterion("bonificacion >", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionGreaterThanOrEqualTo(String value) {
			addCriterion("bonificacion >=", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionLessThan(String value) {
			addCriterion("bonificacion <", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionLessThanOrEqualTo(String value) {
			addCriterion("bonificacion <=", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionLike(String value) {
			addCriterion("bonificacion like", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionNotLike(String value) {
			addCriterion("bonificacion not like", value, "bonificacion");
			return this;
		}

		public Criteria andBonificacionIn(List values) {
			addCriterion("bonificacion in", values, "bonificacion");
			return this;
		}

		public Criteria andBonificacionNotIn(List values) {
			addCriterion("bonificacion not in", values, "bonificacion");
			return this;
		}

		public Criteria andBonificacionBetween(String value1, String value2) {
			addCriterion("bonificacion between", value1, value2, "bonificacion");
			return this;
		}

		public Criteria andBonificacionNotBetween(String value1, String value2) {
			addCriterion("bonificacion not between", value1, value2,
					"bonificacion");
			return this;
		}
	}
}