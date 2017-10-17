package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartidIsNull() {
            addCriterion("cartId is null");
            return (Criteria) this;
        }

        public Criteria andCartidIsNotNull() {
            addCriterion("cartId is not null");
            return (Criteria) this;
        }

        public Criteria andCartidEqualTo(Integer value) {
            addCriterion("cartId =", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotEqualTo(Integer value) {
            addCriterion("cartId <>", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThan(Integer value) {
            addCriterion("cartId >", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartId >=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThan(Integer value) {
            addCriterion("cartId <", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidLessThanOrEqualTo(Integer value) {
            addCriterion("cartId <=", value, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidIn(List<Integer> values) {
            addCriterion("cartId in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotIn(List<Integer> values) {
            addCriterion("cartId not in", values, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidBetween(Integer value1, Integer value2) {
            addCriterion("cartId between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartId not between", value1, value2, "cartid");
            return (Criteria) this;
        }

        public Criteria andCartolderidIsNull() {
            addCriterion("cartOlderId is null");
            return (Criteria) this;
        }

        public Criteria andCartolderidIsNotNull() {
            addCriterion("cartOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andCartolderidEqualTo(Integer value) {
            addCriterion("cartOlderId =", value, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidNotEqualTo(Integer value) {
            addCriterion("cartOlderId <>", value, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidGreaterThan(Integer value) {
            addCriterion("cartOlderId >", value, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartOlderId >=", value, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidLessThan(Integer value) {
            addCriterion("cartOlderId <", value, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidLessThanOrEqualTo(Integer value) {
            addCriterion("cartOlderId <=", value, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidIn(List<Integer> values) {
            addCriterion("cartOlderId in", values, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidNotIn(List<Integer> values) {
            addCriterion("cartOlderId not in", values, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidBetween(Integer value1, Integer value2) {
            addCriterion("cartOlderId between", value1, value2, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartOlderId not between", value1, value2, "cartolderid");
            return (Criteria) this;
        }

        public Criteria andCartproductidIsNull() {
            addCriterion("cartProductId is null");
            return (Criteria) this;
        }

        public Criteria andCartproductidIsNotNull() {
            addCriterion("cartProductId is not null");
            return (Criteria) this;
        }

        public Criteria andCartproductidEqualTo(Integer value) {
            addCriterion("cartProductId =", value, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidNotEqualTo(Integer value) {
            addCriterion("cartProductId <>", value, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidGreaterThan(Integer value) {
            addCriterion("cartProductId >", value, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartProductId >=", value, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidLessThan(Integer value) {
            addCriterion("cartProductId <", value, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidLessThanOrEqualTo(Integer value) {
            addCriterion("cartProductId <=", value, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidIn(List<Integer> values) {
            addCriterion("cartProductId in", values, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidNotIn(List<Integer> values) {
            addCriterion("cartProductId not in", values, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidBetween(Integer value1, Integer value2) {
            addCriterion("cartProductId between", value1, value2, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartProductId not between", value1, value2, "cartproductid");
            return (Criteria) this;
        }

        public Criteria andCartcountIsNull() {
            addCriterion("cartCount is null");
            return (Criteria) this;
        }

        public Criteria andCartcountIsNotNull() {
            addCriterion("cartCount is not null");
            return (Criteria) this;
        }

        public Criteria andCartcountEqualTo(Integer value) {
            addCriterion("cartCount =", value, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountNotEqualTo(Integer value) {
            addCriterion("cartCount <>", value, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountGreaterThan(Integer value) {
            addCriterion("cartCount >", value, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartCount >=", value, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountLessThan(Integer value) {
            addCriterion("cartCount <", value, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountLessThanOrEqualTo(Integer value) {
            addCriterion("cartCount <=", value, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountIn(List<Integer> values) {
            addCriterion("cartCount in", values, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountNotIn(List<Integer> values) {
            addCriterion("cartCount not in", values, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountBetween(Integer value1, Integer value2) {
            addCriterion("cartCount between", value1, value2, "cartcount");
            return (Criteria) this;
        }

        public Criteria andCartcountNotBetween(Integer value1, Integer value2) {
            addCriterion("cartCount not between", value1, value2, "cartcount");
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