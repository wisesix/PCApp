package com.dou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoraterminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoraterminalExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNull() {
            addCriterion("RefreshTime is null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNotNull() {
            addCriterion("RefreshTime is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeEqualTo(Date value) {
            addCriterion("RefreshTime =", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotEqualTo(Date value) {
            addCriterion("RefreshTime <>", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThan(Date value) {
            addCriterion("RefreshTime >", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RefreshTime >=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThan(Date value) {
            addCriterion("RefreshTime <", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThanOrEqualTo(Date value) {
            addCriterion("RefreshTime <=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIn(List<Date> values) {
            addCriterion("RefreshTime in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotIn(List<Date> values) {
            addCriterion("RefreshTime not in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeBetween(Date value1, Date value2) {
            addCriterion("RefreshTime between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotBetween(Date value1, Date value2) {
            addCriterion("RefreshTime not between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Integer value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Integer value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Integer value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Integer value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Integer value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Integer> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Integer> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Integer value1, Integer value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDi01IsNull() {
            addCriterion("DI01 is null");
            return (Criteria) this;
        }

        public Criteria andDi01IsNotNull() {
            addCriterion("DI01 is not null");
            return (Criteria) this;
        }

        public Criteria andDi01EqualTo(Integer value) {
            addCriterion("DI01 =", value, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01NotEqualTo(Integer value) {
            addCriterion("DI01 <>", value, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01GreaterThan(Integer value) {
            addCriterion("DI01 >", value, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01GreaterThanOrEqualTo(Integer value) {
            addCriterion("DI01 >=", value, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01LessThan(Integer value) {
            addCriterion("DI01 <", value, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01LessThanOrEqualTo(Integer value) {
            addCriterion("DI01 <=", value, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01In(List<Integer> values) {
            addCriterion("DI01 in", values, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01NotIn(List<Integer> values) {
            addCriterion("DI01 not in", values, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01Between(Integer value1, Integer value2) {
            addCriterion("DI01 between", value1, value2, "di01");
            return (Criteria) this;
        }

        public Criteria andDi01NotBetween(Integer value1, Integer value2) {
            addCriterion("DI01 not between", value1, value2, "di01");
            return (Criteria) this;
        }

        public Criteria andDi02IsNull() {
            addCriterion("DI02 is null");
            return (Criteria) this;
        }

        public Criteria andDi02IsNotNull() {
            addCriterion("DI02 is not null");
            return (Criteria) this;
        }

        public Criteria andDi02EqualTo(Integer value) {
            addCriterion("DI02 =", value, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02NotEqualTo(Integer value) {
            addCriterion("DI02 <>", value, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02GreaterThan(Integer value) {
            addCriterion("DI02 >", value, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02GreaterThanOrEqualTo(Integer value) {
            addCriterion("DI02 >=", value, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02LessThan(Integer value) {
            addCriterion("DI02 <", value, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02LessThanOrEqualTo(Integer value) {
            addCriterion("DI02 <=", value, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02In(List<Integer> values) {
            addCriterion("DI02 in", values, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02NotIn(List<Integer> values) {
            addCriterion("DI02 not in", values, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02Between(Integer value1, Integer value2) {
            addCriterion("DI02 between", value1, value2, "di02");
            return (Criteria) this;
        }

        public Criteria andDi02NotBetween(Integer value1, Integer value2) {
            addCriterion("DI02 not between", value1, value2, "di02");
            return (Criteria) this;
        }

        public Criteria andDi03IsNull() {
            addCriterion("DI03 is null");
            return (Criteria) this;
        }

        public Criteria andDi03IsNotNull() {
            addCriterion("DI03 is not null");
            return (Criteria) this;
        }

        public Criteria andDi03EqualTo(Integer value) {
            addCriterion("DI03 =", value, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03NotEqualTo(Integer value) {
            addCriterion("DI03 <>", value, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03GreaterThan(Integer value) {
            addCriterion("DI03 >", value, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03GreaterThanOrEqualTo(Integer value) {
            addCriterion("DI03 >=", value, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03LessThan(Integer value) {
            addCriterion("DI03 <", value, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03LessThanOrEqualTo(Integer value) {
            addCriterion("DI03 <=", value, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03In(List<Integer> values) {
            addCriterion("DI03 in", values, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03NotIn(List<Integer> values) {
            addCriterion("DI03 not in", values, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03Between(Integer value1, Integer value2) {
            addCriterion("DI03 between", value1, value2, "di03");
            return (Criteria) this;
        }

        public Criteria andDi03NotBetween(Integer value1, Integer value2) {
            addCriterion("DI03 not between", value1, value2, "di03");
            return (Criteria) this;
        }

        public Criteria andDi04IsNull() {
            addCriterion("DI04 is null");
            return (Criteria) this;
        }

        public Criteria andDi04IsNotNull() {
            addCriterion("DI04 is not null");
            return (Criteria) this;
        }

        public Criteria andDi04EqualTo(Integer value) {
            addCriterion("DI04 =", value, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04NotEqualTo(Integer value) {
            addCriterion("DI04 <>", value, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04GreaterThan(Integer value) {
            addCriterion("DI04 >", value, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04GreaterThanOrEqualTo(Integer value) {
            addCriterion("DI04 >=", value, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04LessThan(Integer value) {
            addCriterion("DI04 <", value, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04LessThanOrEqualTo(Integer value) {
            addCriterion("DI04 <=", value, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04In(List<Integer> values) {
            addCriterion("DI04 in", values, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04NotIn(List<Integer> values) {
            addCriterion("DI04 not in", values, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04Between(Integer value1, Integer value2) {
            addCriterion("DI04 between", value1, value2, "di04");
            return (Criteria) this;
        }

        public Criteria andDi04NotBetween(Integer value1, Integer value2) {
            addCriterion("DI04 not between", value1, value2, "di04");
            return (Criteria) this;
        }

        public Criteria andD001IsNull() {
            addCriterion("D001 is null");
            return (Criteria) this;
        }

        public Criteria andD001IsNotNull() {
            addCriterion("D001 is not null");
            return (Criteria) this;
        }

        public Criteria andD001EqualTo(Integer value) {
            addCriterion("D001 =", value, "d001");
            return (Criteria) this;
        }

        public Criteria andD001NotEqualTo(Integer value) {
            addCriterion("D001 <>", value, "d001");
            return (Criteria) this;
        }

        public Criteria andD001GreaterThan(Integer value) {
            addCriterion("D001 >", value, "d001");
            return (Criteria) this;
        }

        public Criteria andD001GreaterThanOrEqualTo(Integer value) {
            addCriterion("D001 >=", value, "d001");
            return (Criteria) this;
        }

        public Criteria andD001LessThan(Integer value) {
            addCriterion("D001 <", value, "d001");
            return (Criteria) this;
        }

        public Criteria andD001LessThanOrEqualTo(Integer value) {
            addCriterion("D001 <=", value, "d001");
            return (Criteria) this;
        }

        public Criteria andD001In(List<Integer> values) {
            addCriterion("D001 in", values, "d001");
            return (Criteria) this;
        }

        public Criteria andD001NotIn(List<Integer> values) {
            addCriterion("D001 not in", values, "d001");
            return (Criteria) this;
        }

        public Criteria andD001Between(Integer value1, Integer value2) {
            addCriterion("D001 between", value1, value2, "d001");
            return (Criteria) this;
        }

        public Criteria andD001NotBetween(Integer value1, Integer value2) {
            addCriterion("D001 not between", value1, value2, "d001");
            return (Criteria) this;
        }

        public Criteria andD002IsNull() {
            addCriterion("D002 is null");
            return (Criteria) this;
        }

        public Criteria andD002IsNotNull() {
            addCriterion("D002 is not null");
            return (Criteria) this;
        }

        public Criteria andD002EqualTo(Integer value) {
            addCriterion("D002 =", value, "d002");
            return (Criteria) this;
        }

        public Criteria andD002NotEqualTo(Integer value) {
            addCriterion("D002 <>", value, "d002");
            return (Criteria) this;
        }

        public Criteria andD002GreaterThan(Integer value) {
            addCriterion("D002 >", value, "d002");
            return (Criteria) this;
        }

        public Criteria andD002GreaterThanOrEqualTo(Integer value) {
            addCriterion("D002 >=", value, "d002");
            return (Criteria) this;
        }

        public Criteria andD002LessThan(Integer value) {
            addCriterion("D002 <", value, "d002");
            return (Criteria) this;
        }

        public Criteria andD002LessThanOrEqualTo(Integer value) {
            addCriterion("D002 <=", value, "d002");
            return (Criteria) this;
        }

        public Criteria andD002In(List<Integer> values) {
            addCriterion("D002 in", values, "d002");
            return (Criteria) this;
        }

        public Criteria andD002NotIn(List<Integer> values) {
            addCriterion("D002 not in", values, "d002");
            return (Criteria) this;
        }

        public Criteria andD002Between(Integer value1, Integer value2) {
            addCriterion("D002 between", value1, value2, "d002");
            return (Criteria) this;
        }

        public Criteria andD002NotBetween(Integer value1, Integer value2) {
            addCriterion("D002 not between", value1, value2, "d002");
            return (Criteria) this;
        }

        public Criteria andD003IsNull() {
            addCriterion("D003 is null");
            return (Criteria) this;
        }

        public Criteria andD003IsNotNull() {
            addCriterion("D003 is not null");
            return (Criteria) this;
        }

        public Criteria andD003EqualTo(Integer value) {
            addCriterion("D003 =", value, "d003");
            return (Criteria) this;
        }

        public Criteria andD003NotEqualTo(Integer value) {
            addCriterion("D003 <>", value, "d003");
            return (Criteria) this;
        }

        public Criteria andD003GreaterThan(Integer value) {
            addCriterion("D003 >", value, "d003");
            return (Criteria) this;
        }

        public Criteria andD003GreaterThanOrEqualTo(Integer value) {
            addCriterion("D003 >=", value, "d003");
            return (Criteria) this;
        }

        public Criteria andD003LessThan(Integer value) {
            addCriterion("D003 <", value, "d003");
            return (Criteria) this;
        }

        public Criteria andD003LessThanOrEqualTo(Integer value) {
            addCriterion("D003 <=", value, "d003");
            return (Criteria) this;
        }

        public Criteria andD003In(List<Integer> values) {
            addCriterion("D003 in", values, "d003");
            return (Criteria) this;
        }

        public Criteria andD003NotIn(List<Integer> values) {
            addCriterion("D003 not in", values, "d003");
            return (Criteria) this;
        }

        public Criteria andD003Between(Integer value1, Integer value2) {
            addCriterion("D003 between", value1, value2, "d003");
            return (Criteria) this;
        }

        public Criteria andD003NotBetween(Integer value1, Integer value2) {
            addCriterion("D003 not between", value1, value2, "d003");
            return (Criteria) this;
        }

        public Criteria andD004IsNull() {
            addCriterion("D004 is null");
            return (Criteria) this;
        }

        public Criteria andD004IsNotNull() {
            addCriterion("D004 is not null");
            return (Criteria) this;
        }

        public Criteria andD004EqualTo(Integer value) {
            addCriterion("D004 =", value, "d004");
            return (Criteria) this;
        }

        public Criteria andD004NotEqualTo(Integer value) {
            addCriterion("D004 <>", value, "d004");
            return (Criteria) this;
        }

        public Criteria andD004GreaterThan(Integer value) {
            addCriterion("D004 >", value, "d004");
            return (Criteria) this;
        }

        public Criteria andD004GreaterThanOrEqualTo(Integer value) {
            addCriterion("D004 >=", value, "d004");
            return (Criteria) this;
        }

        public Criteria andD004LessThan(Integer value) {
            addCriterion("D004 <", value, "d004");
            return (Criteria) this;
        }

        public Criteria andD004LessThanOrEqualTo(Integer value) {
            addCriterion("D004 <=", value, "d004");
            return (Criteria) this;
        }

        public Criteria andD004In(List<Integer> values) {
            addCriterion("D004 in", values, "d004");
            return (Criteria) this;
        }

        public Criteria andD004NotIn(List<Integer> values) {
            addCriterion("D004 not in", values, "d004");
            return (Criteria) this;
        }

        public Criteria andD004Between(Integer value1, Integer value2) {
            addCriterion("D004 between", value1, value2, "d004");
            return (Criteria) this;
        }

        public Criteria andD004NotBetween(Integer value1, Integer value2) {
            addCriterion("D004 not between", value1, value2, "d004");
            return (Criteria) this;
        }

        public Criteria andAi01IsNull() {
            addCriterion("AI01 is null");
            return (Criteria) this;
        }

        public Criteria andAi01IsNotNull() {
            addCriterion("AI01 is not null");
            return (Criteria) this;
        }

        public Criteria andAi01EqualTo(Float value) {
            addCriterion("AI01 =", value, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01NotEqualTo(Float value) {
            addCriterion("AI01 <>", value, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01GreaterThan(Float value) {
            addCriterion("AI01 >", value, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01GreaterThanOrEqualTo(Float value) {
            addCriterion("AI01 >=", value, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01LessThan(Float value) {
            addCriterion("AI01 <", value, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01LessThanOrEqualTo(Float value) {
            addCriterion("AI01 <=", value, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01In(List<Float> values) {
            addCriterion("AI01 in", values, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01NotIn(List<Float> values) {
            addCriterion("AI01 not in", values, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01Between(Float value1, Float value2) {
            addCriterion("AI01 between", value1, value2, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi01NotBetween(Float value1, Float value2) {
            addCriterion("AI01 not between", value1, value2, "ai01");
            return (Criteria) this;
        }

        public Criteria andAi02IsNull() {
            addCriterion("AI02 is null");
            return (Criteria) this;
        }

        public Criteria andAi02IsNotNull() {
            addCriterion("AI02 is not null");
            return (Criteria) this;
        }

        public Criteria andAi02EqualTo(Float value) {
            addCriterion("AI02 =", value, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02NotEqualTo(Float value) {
            addCriterion("AI02 <>", value, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02GreaterThan(Float value) {
            addCriterion("AI02 >", value, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02GreaterThanOrEqualTo(Float value) {
            addCriterion("AI02 >=", value, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02LessThan(Float value) {
            addCriterion("AI02 <", value, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02LessThanOrEqualTo(Float value) {
            addCriterion("AI02 <=", value, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02In(List<Float> values) {
            addCriterion("AI02 in", values, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02NotIn(List<Float> values) {
            addCriterion("AI02 not in", values, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02Between(Float value1, Float value2) {
            addCriterion("AI02 between", value1, value2, "ai02");
            return (Criteria) this;
        }

        public Criteria andAi02NotBetween(Float value1, Float value2) {
            addCriterion("AI02 not between", value1, value2, "ai02");
            return (Criteria) this;
        }

        public Criteria andA001IsNull() {
            addCriterion("A001 is null");
            return (Criteria) this;
        }

        public Criteria andA001IsNotNull() {
            addCriterion("A001 is not null");
            return (Criteria) this;
        }

        public Criteria andA001EqualTo(Float value) {
            addCriterion("A001 =", value, "a001");
            return (Criteria) this;
        }

        public Criteria andA001NotEqualTo(Float value) {
            addCriterion("A001 <>", value, "a001");
            return (Criteria) this;
        }

        public Criteria andA001GreaterThan(Float value) {
            addCriterion("A001 >", value, "a001");
            return (Criteria) this;
        }

        public Criteria andA001GreaterThanOrEqualTo(Float value) {
            addCriterion("A001 >=", value, "a001");
            return (Criteria) this;
        }

        public Criteria andA001LessThan(Float value) {
            addCriterion("A001 <", value, "a001");
            return (Criteria) this;
        }

        public Criteria andA001LessThanOrEqualTo(Float value) {
            addCriterion("A001 <=", value, "a001");
            return (Criteria) this;
        }

        public Criteria andA001In(List<Float> values) {
            addCriterion("A001 in", values, "a001");
            return (Criteria) this;
        }

        public Criteria andA001NotIn(List<Float> values) {
            addCriterion("A001 not in", values, "a001");
            return (Criteria) this;
        }

        public Criteria andA001Between(Float value1, Float value2) {
            addCriterion("A001 between", value1, value2, "a001");
            return (Criteria) this;
        }

        public Criteria andA001NotBetween(Float value1, Float value2) {
            addCriterion("A001 not between", value1, value2, "a001");
            return (Criteria) this;
        }

        public Criteria andA002IsNull() {
            addCriterion("A002 is null");
            return (Criteria) this;
        }

        public Criteria andA002IsNotNull() {
            addCriterion("A002 is not null");
            return (Criteria) this;
        }

        public Criteria andA002EqualTo(Float value) {
            addCriterion("A002 =", value, "a002");
            return (Criteria) this;
        }

        public Criteria andA002NotEqualTo(Float value) {
            addCriterion("A002 <>", value, "a002");
            return (Criteria) this;
        }

        public Criteria andA002GreaterThan(Float value) {
            addCriterion("A002 >", value, "a002");
            return (Criteria) this;
        }

        public Criteria andA002GreaterThanOrEqualTo(Float value) {
            addCriterion("A002 >=", value, "a002");
            return (Criteria) this;
        }

        public Criteria andA002LessThan(Float value) {
            addCriterion("A002 <", value, "a002");
            return (Criteria) this;
        }

        public Criteria andA002LessThanOrEqualTo(Float value) {
            addCriterion("A002 <=", value, "a002");
            return (Criteria) this;
        }

        public Criteria andA002In(List<Float> values) {
            addCriterion("A002 in", values, "a002");
            return (Criteria) this;
        }

        public Criteria andA002NotIn(List<Float> values) {
            addCriterion("A002 not in", values, "a002");
            return (Criteria) this;
        }

        public Criteria andA002Between(Float value1, Float value2) {
            addCriterion("A002 between", value1, value2, "a002");
            return (Criteria) this;
        }

        public Criteria andA002NotBetween(Float value1, Float value2) {
            addCriterion("A002 not between", value1, value2, "a002");
            return (Criteria) this;
        }

        public Criteria andC1D001IsNull() {
            addCriterion("C1_D001 is null");
            return (Criteria) this;
        }

        public Criteria andC1D001IsNotNull() {
            addCriterion("C1_D001 is not null");
            return (Criteria) this;
        }

        public Criteria andC1D001EqualTo(Integer value) {
            addCriterion("C1_D001 =", value, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001NotEqualTo(Integer value) {
            addCriterion("C1_D001 <>", value, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001GreaterThan(Integer value) {
            addCriterion("C1_D001 >", value, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001GreaterThanOrEqualTo(Integer value) {
            addCriterion("C1_D001 >=", value, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001LessThan(Integer value) {
            addCriterion("C1_D001 <", value, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001LessThanOrEqualTo(Integer value) {
            addCriterion("C1_D001 <=", value, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001In(List<Integer> values) {
            addCriterion("C1_D001 in", values, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001NotIn(List<Integer> values) {
            addCriterion("C1_D001 not in", values, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001Between(Integer value1, Integer value2) {
            addCriterion("C1_D001 between", value1, value2, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D001NotBetween(Integer value1, Integer value2) {
            addCriterion("C1_D001 not between", value1, value2, "c1D001");
            return (Criteria) this;
        }

        public Criteria andC1D002IsNull() {
            addCriterion("C1_D002 is null");
            return (Criteria) this;
        }

        public Criteria andC1D002IsNotNull() {
            addCriterion("C1_D002 is not null");
            return (Criteria) this;
        }

        public Criteria andC1D002EqualTo(Integer value) {
            addCriterion("C1_D002 =", value, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002NotEqualTo(Integer value) {
            addCriterion("C1_D002 <>", value, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002GreaterThan(Integer value) {
            addCriterion("C1_D002 >", value, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002GreaterThanOrEqualTo(Integer value) {
            addCriterion("C1_D002 >=", value, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002LessThan(Integer value) {
            addCriterion("C1_D002 <", value, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002LessThanOrEqualTo(Integer value) {
            addCriterion("C1_D002 <=", value, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002In(List<Integer> values) {
            addCriterion("C1_D002 in", values, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002NotIn(List<Integer> values) {
            addCriterion("C1_D002 not in", values, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002Between(Integer value1, Integer value2) {
            addCriterion("C1_D002 between", value1, value2, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC1D002NotBetween(Integer value1, Integer value2) {
            addCriterion("C1_D002 not between", value1, value2, "c1D002");
            return (Criteria) this;
        }

        public Criteria andC0D001IsNull() {
            addCriterion("C0_D001 is null");
            return (Criteria) this;
        }

        public Criteria andC0D001IsNotNull() {
            addCriterion("C0_D001 is not null");
            return (Criteria) this;
        }

        public Criteria andC0D001EqualTo(Integer value) {
            addCriterion("C0_D001 =", value, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001NotEqualTo(Integer value) {
            addCriterion("C0_D001 <>", value, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001GreaterThan(Integer value) {
            addCriterion("C0_D001 >", value, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001GreaterThanOrEqualTo(Integer value) {
            addCriterion("C0_D001 >=", value, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001LessThan(Integer value) {
            addCriterion("C0_D001 <", value, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001LessThanOrEqualTo(Integer value) {
            addCriterion("C0_D001 <=", value, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001In(List<Integer> values) {
            addCriterion("C0_D001 in", values, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001NotIn(List<Integer> values) {
            addCriterion("C0_D001 not in", values, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001Between(Integer value1, Integer value2) {
            addCriterion("C0_D001 between", value1, value2, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D001NotBetween(Integer value1, Integer value2) {
            addCriterion("C0_D001 not between", value1, value2, "c0D001");
            return (Criteria) this;
        }

        public Criteria andC0D002IsNull() {
            addCriterion("C0_D002 is null");
            return (Criteria) this;
        }

        public Criteria andC0D002IsNotNull() {
            addCriterion("C0_D002 is not null");
            return (Criteria) this;
        }

        public Criteria andC0D002EqualTo(Integer value) {
            addCriterion("C0_D002 =", value, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002NotEqualTo(Integer value) {
            addCriterion("C0_D002 <>", value, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002GreaterThan(Integer value) {
            addCriterion("C0_D002 >", value, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002GreaterThanOrEqualTo(Integer value) {
            addCriterion("C0_D002 >=", value, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002LessThan(Integer value) {
            addCriterion("C0_D002 <", value, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002LessThanOrEqualTo(Integer value) {
            addCriterion("C0_D002 <=", value, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002In(List<Integer> values) {
            addCriterion("C0_D002 in", values, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002NotIn(List<Integer> values) {
            addCriterion("C0_D002 not in", values, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002Between(Integer value1, Integer value2) {
            addCriterion("C0_D002 between", value1, value2, "c0D002");
            return (Criteria) this;
        }

        public Criteria andC0D002NotBetween(Integer value1, Integer value2) {
            addCriterion("C0_D002 not between", value1, value2, "c0D002");
            return (Criteria) this;
        }

        public Criteria andSflowIsNull() {
            addCriterion("Sflow is null");
            return (Criteria) this;
        }

        public Criteria andSflowIsNotNull() {
            addCriterion("Sflow is not null");
            return (Criteria) this;
        }

        public Criteria andSflowEqualTo(Float value) {
            addCriterion("Sflow =", value, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowNotEqualTo(Float value) {
            addCriterion("Sflow <>", value, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowGreaterThan(Float value) {
            addCriterion("Sflow >", value, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowGreaterThanOrEqualTo(Float value) {
            addCriterion("Sflow >=", value, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowLessThan(Float value) {
            addCriterion("Sflow <", value, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowLessThanOrEqualTo(Float value) {
            addCriterion("Sflow <=", value, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowIn(List<Float> values) {
            addCriterion("Sflow in", values, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowNotIn(List<Float> values) {
            addCriterion("Sflow not in", values, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowBetween(Float value1, Float value2) {
            addCriterion("Sflow between", value1, value2, "sflow");
            return (Criteria) this;
        }

        public Criteria andSflowNotBetween(Float value1, Float value2) {
            addCriterion("Sflow not between", value1, value2, "sflow");
            return (Criteria) this;
        }

        public Criteria andLflowIsNull() {
            addCriterion("Lflow is null");
            return (Criteria) this;
        }

        public Criteria andLflowIsNotNull() {
            addCriterion("Lflow is not null");
            return (Criteria) this;
        }

        public Criteria andLflowEqualTo(Float value) {
            addCriterion("Lflow =", value, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowNotEqualTo(Float value) {
            addCriterion("Lflow <>", value, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowGreaterThan(Float value) {
            addCriterion("Lflow >", value, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowGreaterThanOrEqualTo(Float value) {
            addCriterion("Lflow >=", value, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowLessThan(Float value) {
            addCriterion("Lflow <", value, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowLessThanOrEqualTo(Float value) {
            addCriterion("Lflow <=", value, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowIn(List<Float> values) {
            addCriterion("Lflow in", values, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowNotIn(List<Float> values) {
            addCriterion("Lflow not in", values, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowBetween(Float value1, Float value2) {
            addCriterion("Lflow between", value1, value2, "lflow");
            return (Criteria) this;
        }

        public Criteria andLflowNotBetween(Float value1, Float value2) {
            addCriterion("Lflow not between", value1, value2, "lflow");
            return (Criteria) this;
        }

        public Criteria andDtuidIsNull() {
            addCriterion("DtuId is null");
            return (Criteria) this;
        }

        public Criteria andDtuidIsNotNull() {
            addCriterion("DtuId is not null");
            return (Criteria) this;
        }

        public Criteria andDtuidEqualTo(Integer value) {
            addCriterion("DtuId =", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidNotEqualTo(Integer value) {
            addCriterion("DtuId <>", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidGreaterThan(Integer value) {
            addCriterion("DtuId >", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DtuId >=", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidLessThan(Integer value) {
            addCriterion("DtuId <", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidLessThanOrEqualTo(Integer value) {
            addCriterion("DtuId <=", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidIn(List<Integer> values) {
            addCriterion("DtuId in", values, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidNotIn(List<Integer> values) {
            addCriterion("DtuId not in", values, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidBetween(Integer value1, Integer value2) {
            addCriterion("DtuId between", value1, value2, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidNotBetween(Integer value1, Integer value2) {
            addCriterion("DtuId not between", value1, value2, "dtuid");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("Lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("Lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("Lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("Lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("Lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("Lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("Lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("Lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("Lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("Lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("Lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("Lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("Lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("Lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("Lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("Lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("Lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("Lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("Lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("Lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("Lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("Lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("Lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("Lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("Lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("Lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("Lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("Lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageIsNull() {
            addCriterion("BatteryVoltage is null");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageIsNotNull() {
            addCriterion("BatteryVoltage is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageEqualTo(Float value) {
            addCriterion("BatteryVoltage =", value, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageNotEqualTo(Float value) {
            addCriterion("BatteryVoltage <>", value, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageGreaterThan(Float value) {
            addCriterion("BatteryVoltage >", value, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageGreaterThanOrEqualTo(Float value) {
            addCriterion("BatteryVoltage >=", value, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageLessThan(Float value) {
            addCriterion("BatteryVoltage <", value, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageLessThanOrEqualTo(Float value) {
            addCriterion("BatteryVoltage <=", value, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageIn(List<Float> values) {
            addCriterion("BatteryVoltage in", values, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageNotIn(List<Float> values) {
            addCriterion("BatteryVoltage not in", values, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageBetween(Float value1, Float value2) {
            addCriterion("BatteryVoltage between", value1, value2, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andBatteryvoltageNotBetween(Float value1, Float value2) {
            addCriterion("BatteryVoltage not between", value1, value2, "batteryvoltage");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureIsNull() {
            addCriterion("Terminaltemperature is null");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureIsNotNull() {
            addCriterion("Terminaltemperature is not null");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureEqualTo(Float value) {
            addCriterion("Terminaltemperature =", value, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureNotEqualTo(Float value) {
            addCriterion("Terminaltemperature <>", value, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureGreaterThan(Float value) {
            addCriterion("Terminaltemperature >", value, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("Terminaltemperature >=", value, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureLessThan(Float value) {
            addCriterion("Terminaltemperature <", value, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureLessThanOrEqualTo(Float value) {
            addCriterion("Terminaltemperature <=", value, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureIn(List<Float> values) {
            addCriterion("Terminaltemperature in", values, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureNotIn(List<Float> values) {
            addCriterion("Terminaltemperature not in", values, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureBetween(Float value1, Float value2) {
            addCriterion("Terminaltemperature between", value1, value2, "terminaltemperature");
            return (Criteria) this;
        }

        public Criteria andTerminaltemperatureNotBetween(Float value1, Float value2) {
            addCriterion("Terminaltemperature not between", value1, value2, "terminaltemperature");
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