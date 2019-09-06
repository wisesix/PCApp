package com.dou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PumptableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PumptableExample() {
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

        public Criteria andUabIsNull() {
            addCriterion("Uab is null");
            return (Criteria) this;
        }

        public Criteria andUabIsNotNull() {
            addCriterion("Uab is not null");
            return (Criteria) this;
        }

        public Criteria andUabEqualTo(Float value) {
            addCriterion("Uab =", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabNotEqualTo(Float value) {
            addCriterion("Uab <>", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabGreaterThan(Float value) {
            addCriterion("Uab >", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabGreaterThanOrEqualTo(Float value) {
            addCriterion("Uab >=", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabLessThan(Float value) {
            addCriterion("Uab <", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabLessThanOrEqualTo(Float value) {
            addCriterion("Uab <=", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabIn(List<Float> values) {
            addCriterion("Uab in", values, "uab");
            return (Criteria) this;
        }

        public Criteria andUabNotIn(List<Float> values) {
            addCriterion("Uab not in", values, "uab");
            return (Criteria) this;
        }

        public Criteria andUabBetween(Float value1, Float value2) {
            addCriterion("Uab between", value1, value2, "uab");
            return (Criteria) this;
        }

        public Criteria andUabNotBetween(Float value1, Float value2) {
            addCriterion("Uab not between", value1, value2, "uab");
            return (Criteria) this;
        }

        public Criteria andUbcIsNull() {
            addCriterion("Ubc is null");
            return (Criteria) this;
        }

        public Criteria andUbcIsNotNull() {
            addCriterion("Ubc is not null");
            return (Criteria) this;
        }

        public Criteria andUbcEqualTo(Float value) {
            addCriterion("Ubc =", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcNotEqualTo(Float value) {
            addCriterion("Ubc <>", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcGreaterThan(Float value) {
            addCriterion("Ubc >", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcGreaterThanOrEqualTo(Float value) {
            addCriterion("Ubc >=", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcLessThan(Float value) {
            addCriterion("Ubc <", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcLessThanOrEqualTo(Float value) {
            addCriterion("Ubc <=", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcIn(List<Float> values) {
            addCriterion("Ubc in", values, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcNotIn(List<Float> values) {
            addCriterion("Ubc not in", values, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcBetween(Float value1, Float value2) {
            addCriterion("Ubc between", value1, value2, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcNotBetween(Float value1, Float value2) {
            addCriterion("Ubc not between", value1, value2, "ubc");
            return (Criteria) this;
        }

        public Criteria andUcaIsNull() {
            addCriterion("Uca is null");
            return (Criteria) this;
        }

        public Criteria andUcaIsNotNull() {
            addCriterion("Uca is not null");
            return (Criteria) this;
        }

        public Criteria andUcaEqualTo(Float value) {
            addCriterion("Uca =", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaNotEqualTo(Float value) {
            addCriterion("Uca <>", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaGreaterThan(Float value) {
            addCriterion("Uca >", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaGreaterThanOrEqualTo(Float value) {
            addCriterion("Uca >=", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaLessThan(Float value) {
            addCriterion("Uca <", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaLessThanOrEqualTo(Float value) {
            addCriterion("Uca <=", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaIn(List<Float> values) {
            addCriterion("Uca in", values, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaNotIn(List<Float> values) {
            addCriterion("Uca not in", values, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaBetween(Float value1, Float value2) {
            addCriterion("Uca between", value1, value2, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaNotBetween(Float value1, Float value2) {
            addCriterion("Uca not between", value1, value2, "uca");
            return (Criteria) this;
        }

        public Criteria andIaIsNull() {
            addCriterion("Ia is null");
            return (Criteria) this;
        }

        public Criteria andIaIsNotNull() {
            addCriterion("Ia is not null");
            return (Criteria) this;
        }

        public Criteria andIaEqualTo(Float value) {
            addCriterion("Ia =", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaNotEqualTo(Float value) {
            addCriterion("Ia <>", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaGreaterThan(Float value) {
            addCriterion("Ia >", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaGreaterThanOrEqualTo(Float value) {
            addCriterion("Ia >=", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaLessThan(Float value) {
            addCriterion("Ia <", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaLessThanOrEqualTo(Float value) {
            addCriterion("Ia <=", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaIn(List<Float> values) {
            addCriterion("Ia in", values, "ia");
            return (Criteria) this;
        }

        public Criteria andIaNotIn(List<Float> values) {
            addCriterion("Ia not in", values, "ia");
            return (Criteria) this;
        }

        public Criteria andIaBetween(Float value1, Float value2) {
            addCriterion("Ia between", value1, value2, "ia");
            return (Criteria) this;
        }

        public Criteria andIaNotBetween(Float value1, Float value2) {
            addCriterion("Ia not between", value1, value2, "ia");
            return (Criteria) this;
        }

        public Criteria andIbIsNull() {
            addCriterion("Ib is null");
            return (Criteria) this;
        }

        public Criteria andIbIsNotNull() {
            addCriterion("Ib is not null");
            return (Criteria) this;
        }

        public Criteria andIbEqualTo(Float value) {
            addCriterion("Ib =", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbNotEqualTo(Float value) {
            addCriterion("Ib <>", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbGreaterThan(Float value) {
            addCriterion("Ib >", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbGreaterThanOrEqualTo(Float value) {
            addCriterion("Ib >=", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbLessThan(Float value) {
            addCriterion("Ib <", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbLessThanOrEqualTo(Float value) {
            addCriterion("Ib <=", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbIn(List<Float> values) {
            addCriterion("Ib in", values, "ib");
            return (Criteria) this;
        }

        public Criteria andIbNotIn(List<Float> values) {
            addCriterion("Ib not in", values, "ib");
            return (Criteria) this;
        }

        public Criteria andIbBetween(Float value1, Float value2) {
            addCriterion("Ib between", value1, value2, "ib");
            return (Criteria) this;
        }

        public Criteria andIbNotBetween(Float value1, Float value2) {
            addCriterion("Ib not between", value1, value2, "ib");
            return (Criteria) this;
        }

        public Criteria andIcIsNull() {
            addCriterion("Ic is null");
            return (Criteria) this;
        }

        public Criteria andIcIsNotNull() {
            addCriterion("Ic is not null");
            return (Criteria) this;
        }

        public Criteria andIcEqualTo(Float value) {
            addCriterion("Ic =", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotEqualTo(Float value) {
            addCriterion("Ic <>", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThan(Float value) {
            addCriterion("Ic >", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThanOrEqualTo(Float value) {
            addCriterion("Ic >=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThan(Float value) {
            addCriterion("Ic <", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThanOrEqualTo(Float value) {
            addCriterion("Ic <=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcIn(List<Float> values) {
            addCriterion("Ic in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotIn(List<Float> values) {
            addCriterion("Ic not in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcBetween(Float value1, Float value2) {
            addCriterion("Ic between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotBetween(Float value1, Float value2) {
            addCriterion("Ic not between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andPIsNull() {
            addCriterion("P is null");
            return (Criteria) this;
        }

        public Criteria andPIsNotNull() {
            addCriterion("P is not null");
            return (Criteria) this;
        }

        public Criteria andPEqualTo(Float value) {
            addCriterion("P =", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotEqualTo(Float value) {
            addCriterion("P <>", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThan(Float value) {
            addCriterion("P >", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThanOrEqualTo(Float value) {
            addCriterion("P >=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThan(Float value) {
            addCriterion("P <", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThanOrEqualTo(Float value) {
            addCriterion("P <=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPIn(List<Float> values) {
            addCriterion("P in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPNotIn(List<Float> values) {
            addCriterion("P not in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPBetween(Float value1, Float value2) {
            addCriterion("P between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andPNotBetween(Float value1, Float value2) {
            addCriterion("P not between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andQIsNull() {
            addCriterion("Q is null");
            return (Criteria) this;
        }

        public Criteria andQIsNotNull() {
            addCriterion("Q is not null");
            return (Criteria) this;
        }

        public Criteria andQEqualTo(Float value) {
            addCriterion("Q =", value, "q");
            return (Criteria) this;
        }

        public Criteria andQNotEqualTo(Float value) {
            addCriterion("Q <>", value, "q");
            return (Criteria) this;
        }

        public Criteria andQGreaterThan(Float value) {
            addCriterion("Q >", value, "q");
            return (Criteria) this;
        }

        public Criteria andQGreaterThanOrEqualTo(Float value) {
            addCriterion("Q >=", value, "q");
            return (Criteria) this;
        }

        public Criteria andQLessThan(Float value) {
            addCriterion("Q <", value, "q");
            return (Criteria) this;
        }

        public Criteria andQLessThanOrEqualTo(Float value) {
            addCriterion("Q <=", value, "q");
            return (Criteria) this;
        }

        public Criteria andQIn(List<Float> values) {
            addCriterion("Q in", values, "q");
            return (Criteria) this;
        }

        public Criteria andQNotIn(List<Float> values) {
            addCriterion("Q not in", values, "q");
            return (Criteria) this;
        }

        public Criteria andQBetween(Float value1, Float value2) {
            addCriterion("Q between", value1, value2, "q");
            return (Criteria) this;
        }

        public Criteria andQNotBetween(Float value1, Float value2) {
            addCriterion("Q not between", value1, value2, "q");
            return (Criteria) this;
        }

        public Criteria andPfIsNull() {
            addCriterion("PF is null");
            return (Criteria) this;
        }

        public Criteria andPfIsNotNull() {
            addCriterion("PF is not null");
            return (Criteria) this;
        }

        public Criteria andPfEqualTo(Float value) {
            addCriterion("PF =", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotEqualTo(Float value) {
            addCriterion("PF <>", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThan(Float value) {
            addCriterion("PF >", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThanOrEqualTo(Float value) {
            addCriterion("PF >=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThan(Float value) {
            addCriterion("PF <", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThanOrEqualTo(Float value) {
            addCriterion("PF <=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfIn(List<Float> values) {
            addCriterion("PF in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotIn(List<Float> values) {
            addCriterion("PF not in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfBetween(Float value1, Float value2) {
            addCriterion("PF between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotBetween(Float value1, Float value2) {
            addCriterion("PF not between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andSyIsNull() {
            addCriterion("Sy is null");
            return (Criteria) this;
        }

        public Criteria andSyIsNotNull() {
            addCriterion("Sy is not null");
            return (Criteria) this;
        }

        public Criteria andSyEqualTo(Float value) {
            addCriterion("Sy =", value, "sy");
            return (Criteria) this;
        }

        public Criteria andSyNotEqualTo(Float value) {
            addCriterion("Sy <>", value, "sy");
            return (Criteria) this;
        }

        public Criteria andSyGreaterThan(Float value) {
            addCriterion("Sy >", value, "sy");
            return (Criteria) this;
        }

        public Criteria andSyGreaterThanOrEqualTo(Float value) {
            addCriterion("Sy >=", value, "sy");
            return (Criteria) this;
        }

        public Criteria andSyLessThan(Float value) {
            addCriterion("Sy <", value, "sy");
            return (Criteria) this;
        }

        public Criteria andSyLessThanOrEqualTo(Float value) {
            addCriterion("Sy <=", value, "sy");
            return (Criteria) this;
        }

        public Criteria andSyIn(List<Float> values) {
            addCriterion("Sy in", values, "sy");
            return (Criteria) this;
        }

        public Criteria andSyNotIn(List<Float> values) {
            addCriterion("Sy not in", values, "sy");
            return (Criteria) this;
        }

        public Criteria andSyBetween(Float value1, Float value2) {
            addCriterion("Sy between", value1, value2, "sy");
            return (Criteria) this;
        }

        public Criteria andSyNotBetween(Float value1, Float value2) {
            addCriterion("Sy not between", value1, value2, "sy");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(Integer value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(Integer value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(Integer value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(Integer value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(Integer value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<Integer> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<Integer> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(Integer value1, Integer value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(Integer value1, Integer value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("stop is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("stop is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Integer value) {
            addCriterion("stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Integer value) {
            addCriterion("stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Integer value) {
            addCriterion("stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Integer value) {
            addCriterion("stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Integer value) {
            addCriterion("stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Integer> values) {
            addCriterion("stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Integer> values) {
            addCriterion("stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Integer value1, Integer value2) {
            addCriterion("stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Integer value1, Integer value2) {
            addCriterion("stop not between", value1, value2, "stop");
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