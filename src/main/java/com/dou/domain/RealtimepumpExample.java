package com.dou.domain;

import java.util.ArrayList;
import java.util.List;

public class RealtimepumpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RealtimepumpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andActualcurrentIsNull() {
            addCriterion("actualcurrent is null");
            return (Criteria) this;
        }

        public Criteria andActualcurrentIsNotNull() {
            addCriterion("actualcurrent is not null");
            return (Criteria) this;
        }

        public Criteria andActualcurrentEqualTo(String value) {
            addCriterion("actualcurrent =", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentNotEqualTo(String value) {
            addCriterion("actualcurrent <>", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentGreaterThan(String value) {
            addCriterion("actualcurrent >", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentGreaterThanOrEqualTo(String value) {
            addCriterion("actualcurrent >=", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentLessThan(String value) {
            addCriterion("actualcurrent <", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentLessThanOrEqualTo(String value) {
            addCriterion("actualcurrent <=", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentLike(String value) {
            addCriterion("actualcurrent like", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentNotLike(String value) {
            addCriterion("actualcurrent not like", value, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentIn(List<String> values) {
            addCriterion("actualcurrent in", values, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentNotIn(List<String> values) {
            addCriterion("actualcurrent not in", values, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentBetween(String value1, String value2) {
            addCriterion("actualcurrent between", value1, value2, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andActualcurrentNotBetween(String value1, String value2) {
            addCriterion("actualcurrent not between", value1, value2, "actualcurrent");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(String value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(String value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(String value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(String value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(String value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(String value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLike(String value) {
            addCriterion("voltage like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotLike(String value) {
            addCriterion("voltage not like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<String> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<String> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(String value1, String value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(String value1, String value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andInsflowrateIsNull() {
            addCriterion("insflowrate is null");
            return (Criteria) this;
        }

        public Criteria andInsflowrateIsNotNull() {
            addCriterion("insflowrate is not null");
            return (Criteria) this;
        }

        public Criteria andInsflowrateEqualTo(String value) {
            addCriterion("insflowrate =", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateNotEqualTo(String value) {
            addCriterion("insflowrate <>", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateGreaterThan(String value) {
            addCriterion("insflowrate >", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateGreaterThanOrEqualTo(String value) {
            addCriterion("insflowrate >=", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateLessThan(String value) {
            addCriterion("insflowrate <", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateLessThanOrEqualTo(String value) {
            addCriterion("insflowrate <=", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateLike(String value) {
            addCriterion("insflowrate like", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateNotLike(String value) {
            addCriterion("insflowrate not like", value, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateIn(List<String> values) {
            addCriterion("insflowrate in", values, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateNotIn(List<String> values) {
            addCriterion("insflowrate not in", values, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateBetween(String value1, String value2) {
            addCriterion("insflowrate between", value1, value2, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andInsflowrateNotBetween(String value1, String value2) {
            addCriterion("insflowrate not between", value1, value2, "insflowrate");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowIsNull() {
            addCriterion("cumulativeflow is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowIsNotNull() {
            addCriterion("cumulativeflow is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowEqualTo(String value) {
            addCriterion("cumulativeflow =", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowNotEqualTo(String value) {
            addCriterion("cumulativeflow <>", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowGreaterThan(String value) {
            addCriterion("cumulativeflow >", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowGreaterThanOrEqualTo(String value) {
            addCriterion("cumulativeflow >=", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowLessThan(String value) {
            addCriterion("cumulativeflow <", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowLessThanOrEqualTo(String value) {
            addCriterion("cumulativeflow <=", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowLike(String value) {
            addCriterion("cumulativeflow like", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowNotLike(String value) {
            addCriterion("cumulativeflow not like", value, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowIn(List<String> values) {
            addCriterion("cumulativeflow in", values, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowNotIn(List<String> values) {
            addCriterion("cumulativeflow not in", values, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowBetween(String value1, String value2) {
            addCriterion("cumulativeflow between", value1, value2, "cumulativeflow");
            return (Criteria) this;
        }

        public Criteria andCumulativeflowNotBetween(String value1, String value2) {
            addCriterion("cumulativeflow not between", value1, value2, "cumulativeflow");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}