package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class ProductrateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductrateExample() {
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

        public Criteria andRateidIsNull() {
            addCriterion("rateId is null");
            return (Criteria) this;
        }

        public Criteria andRateidIsNotNull() {
            addCriterion("rateId is not null");
            return (Criteria) this;
        }

        public Criteria andRateidEqualTo(Integer value) {
            addCriterion("rateId =", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidNotEqualTo(Integer value) {
            addCriterion("rateId <>", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidGreaterThan(Integer value) {
            addCriterion("rateId >", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rateId >=", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidLessThan(Integer value) {
            addCriterion("rateId <", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidLessThanOrEqualTo(Integer value) {
            addCriterion("rateId <=", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidIn(List<Integer> values) {
            addCriterion("rateId in", values, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidNotIn(List<Integer> values) {
            addCriterion("rateId not in", values, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidBetween(Integer value1, Integer value2) {
            addCriterion("rateId between", value1, value2, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidNotBetween(Integer value1, Integer value2) {
            addCriterion("rateId not between", value1, value2, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateolderidIsNull() {
            addCriterion("rateOlderId is null");
            return (Criteria) this;
        }

        public Criteria andRateolderidIsNotNull() {
            addCriterion("rateOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andRateolderidEqualTo(Integer value) {
            addCriterion("rateOlderId =", value, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidNotEqualTo(Integer value) {
            addCriterion("rateOlderId <>", value, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidGreaterThan(Integer value) {
            addCriterion("rateOlderId >", value, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rateOlderId >=", value, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidLessThan(Integer value) {
            addCriterion("rateOlderId <", value, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidLessThanOrEqualTo(Integer value) {
            addCriterion("rateOlderId <=", value, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidIn(List<Integer> values) {
            addCriterion("rateOlderId in", values, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidNotIn(List<Integer> values) {
            addCriterion("rateOlderId not in", values, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidBetween(Integer value1, Integer value2) {
            addCriterion("rateOlderId between", value1, value2, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("rateOlderId not between", value1, value2, "rateolderid");
            return (Criteria) this;
        }

        public Criteria andRateproductidIsNull() {
            addCriterion("rateProductId is null");
            return (Criteria) this;
        }

        public Criteria andRateproductidIsNotNull() {
            addCriterion("rateProductId is not null");
            return (Criteria) this;
        }

        public Criteria andRateproductidEqualTo(Integer value) {
            addCriterion("rateProductId =", value, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidNotEqualTo(Integer value) {
            addCriterion("rateProductId <>", value, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidGreaterThan(Integer value) {
            addCriterion("rateProductId >", value, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rateProductId >=", value, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidLessThan(Integer value) {
            addCriterion("rateProductId <", value, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidLessThanOrEqualTo(Integer value) {
            addCriterion("rateProductId <=", value, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidIn(List<Integer> values) {
            addCriterion("rateProductId in", values, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidNotIn(List<Integer> values) {
            addCriterion("rateProductId not in", values, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidBetween(Integer value1, Integer value2) {
            addCriterion("rateProductId between", value1, value2, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRateproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("rateProductId not between", value1, value2, "rateproductid");
            return (Criteria) this;
        }

        public Criteria andRatestarIsNull() {
            addCriterion("rateStar is null");
            return (Criteria) this;
        }

        public Criteria andRatestarIsNotNull() {
            addCriterion("rateStar is not null");
            return (Criteria) this;
        }

        public Criteria andRatestarEqualTo(Integer value) {
            addCriterion("rateStar =", value, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarNotEqualTo(Integer value) {
            addCriterion("rateStar <>", value, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarGreaterThan(Integer value) {
            addCriterion("rateStar >", value, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarGreaterThanOrEqualTo(Integer value) {
            addCriterion("rateStar >=", value, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarLessThan(Integer value) {
            addCriterion("rateStar <", value, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarLessThanOrEqualTo(Integer value) {
            addCriterion("rateStar <=", value, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarIn(List<Integer> values) {
            addCriterion("rateStar in", values, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarNotIn(List<Integer> values) {
            addCriterion("rateStar not in", values, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarBetween(Integer value1, Integer value2) {
            addCriterion("rateStar between", value1, value2, "ratestar");
            return (Criteria) this;
        }

        public Criteria andRatestarNotBetween(Integer value1, Integer value2) {
            addCriterion("rateStar not between", value1, value2, "ratestar");
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