package com.dou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OperatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperatorExample() {
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

        public Criteria andPlantimeIsNull() {
            addCriterion("plantime is null");
            return (Criteria) this;
        }

        public Criteria andPlantimeIsNotNull() {
            addCriterion("plantime is not null");
            return (Criteria) this;
        }

        public Criteria andPlantimeEqualTo(Date value) {
            addCriterionForJDBCDate("plantime =", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("plantime <>", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeGreaterThan(Date value) {
            addCriterionForJDBCDate("plantime >", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plantime >=", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeLessThan(Date value) {
            addCriterionForJDBCDate("plantime <", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plantime <=", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeIn(List<Date> values) {
            addCriterionForJDBCDate("plantime in", values, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("plantime not in", values, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plantime between", value1, value2, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plantime not between", value1, value2, "plantime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNull() {
            addCriterion("realtime is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNotNull() {
            addCriterion("realtime is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeEqualTo(Date value) {
            addCriterionForJDBCDate("realtime =", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("realtime <>", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("realtime >", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realtime >=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThan(Date value) {
            addCriterionForJDBCDate("realtime <", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("realtime <=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIn(List<Date> values) {
            addCriterionForJDBCDate("realtime in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("realtime not in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realtime between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("realtime not between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTechnicianIsNull() {
            addCriterion("Technician is null");
            return (Criteria) this;
        }

        public Criteria andTechnicianIsNotNull() {
            addCriterion("Technician is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicianEqualTo(String value) {
            addCriterion("Technician =", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotEqualTo(String value) {
            addCriterion("Technician <>", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianGreaterThan(String value) {
            addCriterion("Technician >", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianGreaterThanOrEqualTo(String value) {
            addCriterion("Technician >=", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianLessThan(String value) {
            addCriterion("Technician <", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianLessThanOrEqualTo(String value) {
            addCriterion("Technician <=", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianLike(String value) {
            addCriterion("Technician like", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotLike(String value) {
            addCriterion("Technician not like", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianIn(List<String> values) {
            addCriterion("Technician in", values, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotIn(List<String> values) {
            addCriterion("Technician not in", values, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianBetween(String value1, String value2) {
            addCriterion("Technician between", value1, value2, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotBetween(String value1, String value2) {
            addCriterion("Technician not between", value1, value2, "technician");
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