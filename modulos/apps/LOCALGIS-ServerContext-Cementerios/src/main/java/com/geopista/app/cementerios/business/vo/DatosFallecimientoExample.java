/**
 * DatosFallecimientoExample.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatosFallecimientoExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public DatosFallecimientoExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    protected DatosFallecimientoExample(DatosFallecimientoExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table cementerio.datosfallecimiento
     *
     * @ibatorgenerated Wed Jul 27 11:11:23 CEST 2011
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
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

        public Criteria andLugarIsNull() {
            addCriterion("lugar is null");
            return this;
        }

        public Criteria andLugarIsNotNull() {
            addCriterion("lugar is not null");
            return this;
        }

        public Criteria andLugarEqualTo(String value) {
            addCriterion("lugar =", value, "lugar");
            return this;
        }

        public Criteria andLugarNotEqualTo(String value) {
            addCriterion("lugar <>", value, "lugar");
            return this;
        }

        public Criteria andLugarGreaterThan(String value) {
            addCriterion("lugar >", value, "lugar");
            return this;
        }

        public Criteria andLugarGreaterThanOrEqualTo(String value) {
            addCriterion("lugar >=", value, "lugar");
            return this;
        }

        public Criteria andLugarLessThan(String value) {
            addCriterion("lugar <", value, "lugar");
            return this;
        }

        public Criteria andLugarLessThanOrEqualTo(String value) {
            addCriterion("lugar <=", value, "lugar");
            return this;
        }

        public Criteria andLugarLike(String value) {
            addCriterion("lugar like", value, "lugar");
            return this;
        }

        public Criteria andLugarNotLike(String value) {
            addCriterion("lugar not like", value, "lugar");
            return this;
        }

        public Criteria andLugarIn(List values) {
            addCriterion("lugar in", values, "lugar");
            return this;
        }

        public Criteria andLugarNotIn(List values) {
            addCriterion("lugar not in", values, "lugar");
            return this;
        }

        public Criteria andLugarBetween(String value1, String value2) {
            addCriterion("lugar between", value1, value2, "lugar");
            return this;
        }

        public Criteria andLugarNotBetween(String value1, String value2) {
            addCriterion("lugar not between", value1, value2, "lugar");
            return this;
        }

        public Criteria andPoblacionIsNull() {
            addCriterion("poblacion is null");
            return this;
        }

        public Criteria andPoblacionIsNotNull() {
            addCriterion("poblacion is not null");
            return this;
        }

        public Criteria andPoblacionEqualTo(String value) {
            addCriterion("poblacion =", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionNotEqualTo(String value) {
            addCriterion("poblacion <>", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionGreaterThan(String value) {
            addCriterion("poblacion >", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionGreaterThanOrEqualTo(String value) {
            addCriterion("poblacion >=", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionLessThan(String value) {
            addCriterion("poblacion <", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionLessThanOrEqualTo(String value) {
            addCriterion("poblacion <=", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionLike(String value) {
            addCriterion("poblacion like", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionNotLike(String value) {
            addCriterion("poblacion not like", value, "poblacion");
            return this;
        }

        public Criteria andPoblacionIn(List values) {
            addCriterion("poblacion in", values, "poblacion");
            return this;
        }

        public Criteria andPoblacionNotIn(List values) {
            addCriterion("poblacion not in", values, "poblacion");
            return this;
        }

        public Criteria andPoblacionBetween(String value1, String value2) {
            addCriterion("poblacion between", value1, value2, "poblacion");
            return this;
        }

        public Criteria andPoblacionNotBetween(String value1, String value2) {
            addCriterion("poblacion not between", value1, value2, "poblacion");
            return this;
        }

        public Criteria andCausaFundamentalIsNull() {
            addCriterion("causa_fundamental is null");
            return this;
        }

        public Criteria andCausaFundamentalIsNotNull() {
            addCriterion("causa_fundamental is not null");
            return this;
        }

        public Criteria andCausaFundamentalEqualTo(String value) {
            addCriterion("causa_fundamental =", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalNotEqualTo(String value) {
            addCriterion("causa_fundamental <>", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalGreaterThan(String value) {
            addCriterion("causa_fundamental >", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalGreaterThanOrEqualTo(String value) {
            addCriterion("causa_fundamental >=", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalLessThan(String value) {
            addCriterion("causa_fundamental <", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalLessThanOrEqualTo(String value) {
            addCriterion("causa_fundamental <=", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalLike(String value) {
            addCriterion("causa_fundamental like", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalNotLike(String value) {
            addCriterion("causa_fundamental not like", value, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalIn(List values) {
            addCriterion("causa_fundamental in", values, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalNotIn(List values) {
            addCriterion("causa_fundamental not in", values, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalBetween(String value1, String value2) {
            addCriterion("causa_fundamental between", value1, value2, "causaFundamental");
            return this;
        }

        public Criteria andCausaFundamentalNotBetween(String value1, String value2) {
            addCriterion("causa_fundamental not between", value1, value2, "causaFundamental");
            return this;
        }

        public Criteria andCausaInmediataIsNull() {
            addCriterion("causa_inmediata is null");
            return this;
        }

        public Criteria andCausaInmediataIsNotNull() {
            addCriterion("causa_inmediata is not null");
            return this;
        }

        public Criteria andCausaInmediataEqualTo(String value) {
            addCriterion("causa_inmediata =", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataNotEqualTo(String value) {
            addCriterion("causa_inmediata <>", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataGreaterThan(String value) {
            addCriterion("causa_inmediata >", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataGreaterThanOrEqualTo(String value) {
            addCriterion("causa_inmediata >=", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataLessThan(String value) {
            addCriterion("causa_inmediata <", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataLessThanOrEqualTo(String value) {
            addCriterion("causa_inmediata <=", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataLike(String value) {
            addCriterion("causa_inmediata like", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataNotLike(String value) {
            addCriterion("causa_inmediata not like", value, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataIn(List values) {
            addCriterion("causa_inmediata in", values, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataNotIn(List values) {
            addCriterion("causa_inmediata not in", values, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataBetween(String value1, String value2) {
            addCriterion("causa_inmediata between", value1, value2, "causaInmediata");
            return this;
        }

        public Criteria andCausaInmediataNotBetween(String value1, String value2) {
            addCriterion("causa_inmediata not between", value1, value2, "causaInmediata");
            return this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("fecha is null");
            return this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("fecha is not null");
            return this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterion("fecha =", value, "fecha");
            return this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterion("fecha <>", value, "fecha");
            return this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterion("fecha >", value, "fecha");
            return this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha >=", value, "fecha");
            return this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterion("fecha <", value, "fecha");
            return this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterion("fecha <=", value, "fecha");
            return this;
        }

        public Criteria andFechaIn(List values) {
            addCriterion("fecha in", values, "fecha");
            return this;
        }

        public Criteria andFechaNotIn(List values) {
            addCriterion("fecha not in", values, "fecha");
            return this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterion("fecha between", value1, value2, "fecha");
            return this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterion("fecha not between", value1, value2, "fecha");
            return this;
        }

        public Criteria andMedicoIsNull() {
            addCriterion("medico is null");
            return this;
        }

        public Criteria andMedicoIsNotNull() {
            addCriterion("medico is not null");
            return this;
        }

        public Criteria andMedicoEqualTo(String value) {
            addCriterion("medico =", value, "medico");
            return this;
        }

        public Criteria andMedicoNotEqualTo(String value) {
            addCriterion("medico <>", value, "medico");
            return this;
        }

        public Criteria andMedicoGreaterThan(String value) {
            addCriterion("medico >", value, "medico");
            return this;
        }

        public Criteria andMedicoGreaterThanOrEqualTo(String value) {
            addCriterion("medico >=", value, "medico");
            return this;
        }

        public Criteria andMedicoLessThan(String value) {
            addCriterion("medico <", value, "medico");
            return this;
        }

        public Criteria andMedicoLessThanOrEqualTo(String value) {
            addCriterion("medico <=", value, "medico");
            return this;
        }

        public Criteria andMedicoLike(String value) {
            addCriterion("medico like", value, "medico");
            return this;
        }

        public Criteria andMedicoNotLike(String value) {
            addCriterion("medico not like", value, "medico");
            return this;
        }

        public Criteria andMedicoIn(List values) {
            addCriterion("medico in", values, "medico");
            return this;
        }

        public Criteria andMedicoNotIn(List values) {
            addCriterion("medico not in", values, "medico");
            return this;
        }

        public Criteria andMedicoBetween(String value1, String value2) {
            addCriterion("medico between", value1, value2, "medico");
            return this;
        }

        public Criteria andMedicoNotBetween(String value1, String value2) {
            addCriterion("medico not between", value1, value2, "medico");
            return this;
        }

        public Criteria andNumColegiadoIsNull() {
            addCriterion("num_colegiado is null");
            return this;
        }

        public Criteria andNumColegiadoIsNotNull() {
            addCriterion("num_colegiado is not null");
            return this;
        }

        public Criteria andNumColegiadoEqualTo(String value) {
            addCriterion("num_colegiado =", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoNotEqualTo(String value) {
            addCriterion("num_colegiado <>", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoGreaterThan(String value) {
            addCriterion("num_colegiado >", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoGreaterThanOrEqualTo(String value) {
            addCriterion("num_colegiado >=", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoLessThan(String value) {
            addCriterion("num_colegiado <", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoLessThanOrEqualTo(String value) {
            addCriterion("num_colegiado <=", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoLike(String value) {
            addCriterion("num_colegiado like", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoNotLike(String value) {
            addCriterion("num_colegiado not like", value, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoIn(List values) {
            addCriterion("num_colegiado in", values, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoNotIn(List values) {
            addCriterion("num_colegiado not in", values, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoBetween(String value1, String value2) {
            addCriterion("num_colegiado between", value1, value2, "numColegiado");
            return this;
        }

        public Criteria andNumColegiadoNotBetween(String value1, String value2) {
            addCriterion("num_colegiado not between", value1, value2, "numColegiado");
            return this;
        }

        public Criteria andRegistroCivillIsNull() {
            addCriterion("registro_civill is null");
            return this;
        }

        public Criteria andRegistroCivillIsNotNull() {
            addCriterion("registro_civill is not null");
            return this;
        }

        public Criteria andRegistroCivillEqualTo(String value) {
            addCriterion("registro_civill =", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillNotEqualTo(String value) {
            addCriterion("registro_civill <>", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillGreaterThan(String value) {
            addCriterion("registro_civill >", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillGreaterThanOrEqualTo(String value) {
            addCriterion("registro_civill >=", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillLessThan(String value) {
            addCriterion("registro_civill <", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillLessThanOrEqualTo(String value) {
            addCriterion("registro_civill <=", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillLike(String value) {
            addCriterion("registro_civill like", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillNotLike(String value) {
            addCriterion("registro_civill not like", value, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillIn(List values) {
            addCriterion("registro_civill in", values, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillNotIn(List values) {
            addCriterion("registro_civill not in", values, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillBetween(String value1, String value2) {
            addCriterion("registro_civill between", value1, value2, "registroCivill");
            return this;
        }

        public Criteria andRegistroCivillNotBetween(String value1, String value2) {
            addCriterion("registro_civill not between", value1, value2, "registroCivill");
            return this;
        }

        public Criteria andReferenciaIsNull() {
            addCriterion("referencia is null");
            return this;
        }

        public Criteria andReferenciaIsNotNull() {
            addCriterion("referencia is not null");
            return this;
        }

        public Criteria andReferenciaEqualTo(String value) {
            addCriterion("referencia =", value, "referencia");
            return this;
        }

        public Criteria andReferenciaNotEqualTo(String value) {
            addCriterion("referencia <>", value, "referencia");
            return this;
        }

        public Criteria andReferenciaGreaterThan(String value) {
            addCriterion("referencia >", value, "referencia");
            return this;
        }

        public Criteria andReferenciaGreaterThanOrEqualTo(String value) {
            addCriterion("referencia >=", value, "referencia");
            return this;
        }

        public Criteria andReferenciaLessThan(String value) {
            addCriterion("referencia <", value, "referencia");
            return this;
        }

        public Criteria andReferenciaLessThanOrEqualTo(String value) {
            addCriterion("referencia <=", value, "referencia");
            return this;
        }

        public Criteria andReferenciaLike(String value) {
            addCriterion("referencia like", value, "referencia");
            return this;
        }

        public Criteria andReferenciaNotLike(String value) {
            addCriterion("referencia not like", value, "referencia");
            return this;
        }

        public Criteria andReferenciaIn(List values) {
            addCriterion("referencia in", values, "referencia");
            return this;
        }

        public Criteria andReferenciaNotIn(List values) {
            addCriterion("referencia not in", values, "referencia");
            return this;
        }

        public Criteria andReferenciaBetween(String value1, String value2) {
            addCriterion("referencia between", value1, value2, "referencia");
            return this;
        }

        public Criteria andReferenciaNotBetween(String value1, String value2) {
            addCriterion("referencia not between", value1, value2, "referencia");
            return this;
        }
    }
}