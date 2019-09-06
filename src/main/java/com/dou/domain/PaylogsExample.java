package com.dou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PaylogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaylogsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("Idnumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("Idnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("Idnumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("Idnumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("Idnumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Idnumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("Idnumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("Idnumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("Idnumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("Idnumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("Idnumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("Idnumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("Idnumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("Idnumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andMachinecdeIsNull() {
            addCriterion("machinecde is null");
            return (Criteria) this;
        }

        public Criteria andMachinecdeIsNotNull() {
            addCriterion("machinecde is not null");
            return (Criteria) this;
        }

        public Criteria andMachinecdeEqualTo(String value) {
            addCriterion("machinecde =", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotEqualTo(String value) {
            addCriterion("machinecde <>", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeGreaterThan(String value) {
            addCriterion("machinecde >", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeGreaterThanOrEqualTo(String value) {
            addCriterion("machinecde >=", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeLessThan(String value) {
            addCriterion("machinecde <", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeLessThanOrEqualTo(String value) {
            addCriterion("machinecde <=", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeLike(String value) {
            addCriterion("machinecde like", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotLike(String value) {
            addCriterion("machinecde not like", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeIn(List<String> values) {
            addCriterion("machinecde in", values, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotIn(List<String> values) {
            addCriterion("machinecde not in", values, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeBetween(String value1, String value2) {
            addCriterion("machinecde between", value1, value2, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotBetween(String value1, String value2) {
            addCriterion("machinecde not between", value1, value2, "machinecde");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andStausIsNull() {
            addCriterion("staus is null");
            return (Criteria) this;
        }

        public Criteria andStausIsNotNull() {
            addCriterion("staus is not null");
            return (Criteria) this;
        }

        public Criteria andStausEqualTo(Double value) {
            addCriterion("staus =", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotEqualTo(Double value) {
            addCriterion("staus <>", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThan(Double value) {
            addCriterion("staus >", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThanOrEqualTo(Double value) {
            addCriterion("staus >=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThan(Double value) {
            addCriterion("staus <", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThanOrEqualTo(Double value) {
            addCriterion("staus <=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausIn(List<Double> values) {
            addCriterion("staus in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotIn(List<Double> values) {
            addCriterion("staus not in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausBetween(Double value1, Double value2) {
            addCriterion("staus between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotBetween(Double value1, Double value2) {
            addCriterion("staus not between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNull() {
            addCriterion("ptime is null");
            return (Criteria) this;
        }

        public Criteria andPtimeIsNotNull() {
            addCriterion("ptime is not null");
            return (Criteria) this;
        }

        public Criteria andPtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ptime =", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ptime <>", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ptime >", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ptime >=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThan(Date value) {
            addCriterionForJDBCDate("ptime <", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ptime <=", value, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ptime in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ptime not in", values, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ptime between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andPtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ptime not between", value1, value2, "ptime");
            return (Criteria) this;
        }

        public Criteria andPmoneyIsNull() {
            addCriterion("pmoney is null");
            return (Criteria) this;
        }

        public Criteria andPmoneyIsNotNull() {
            addCriterion("pmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPmoneyEqualTo(Double value) {
            addCriterion("pmoney =", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyNotEqualTo(Double value) {
            addCriterion("pmoney <>", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyGreaterThan(Double value) {
            addCriterion("pmoney >", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pmoney >=", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyLessThan(Double value) {
            addCriterion("pmoney <", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyLessThanOrEqualTo(Double value) {
            addCriterion("pmoney <=", value, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyIn(List<Double> values) {
            addCriterion("pmoney in", values, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyNotIn(List<Double> values) {
            addCriterion("pmoney not in", values, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyBetween(Double value1, Double value2) {
            addCriterion("pmoney between", value1, value2, "pmoney");
            return (Criteria) this;
        }

        public Criteria andPmoneyNotBetween(Double value1, Double value2) {
            addCriterion("pmoney not between", value1, value2, "pmoney");
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