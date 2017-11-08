package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class ProductviewlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductviewlistExample() {
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

        public Criteria andPviewpicidIsNull() {
            addCriterion("pviewpicid is null");
            return (Criteria) this;
        }

        public Criteria andPviewpicidIsNotNull() {
            addCriterion("pviewpicid is not null");
            return (Criteria) this;
        }

        public Criteria andPviewpicidEqualTo(Integer value) {
            addCriterion("pviewpicid =", value, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidNotEqualTo(Integer value) {
            addCriterion("pviewpicid <>", value, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidGreaterThan(Integer value) {
            addCriterion("pviewpicid >", value, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pviewpicid >=", value, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidLessThan(Integer value) {
            addCriterion("pviewpicid <", value, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidLessThanOrEqualTo(Integer value) {
            addCriterion("pviewpicid <=", value, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidIn(List<Integer> values) {
            addCriterion("pviewpicid in", values, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidNotIn(List<Integer> values) {
            addCriterion("pviewpicid not in", values, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidBetween(Integer value1, Integer value2) {
            addCriterion("pviewpicid between", value1, value2, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicidNotBetween(Integer value1, Integer value2) {
            addCriterion("pviewpicid not between", value1, value2, "pviewpicid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidIsNull() {
            addCriterion("pviewpicproductid is null");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidIsNotNull() {
            addCriterion("pviewpicproductid is not null");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidEqualTo(Integer value) {
            addCriterion("pviewpicproductid =", value, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidNotEqualTo(Integer value) {
            addCriterion("pviewpicproductid <>", value, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidGreaterThan(Integer value) {
            addCriterion("pviewpicproductid >", value, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pviewpicproductid >=", value, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidLessThan(Integer value) {
            addCriterion("pviewpicproductid <", value, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidLessThanOrEqualTo(Integer value) {
            addCriterion("pviewpicproductid <=", value, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidIn(List<Integer> values) {
            addCriterion("pviewpicproductid in", values, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidNotIn(List<Integer> values) {
            addCriterion("pviewpicproductid not in", values, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidBetween(Integer value1, Integer value2) {
            addCriterion("pviewpicproductid between", value1, value2, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("pviewpicproductid not between", value1, value2, "pviewpicproductid");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicIsNull() {
            addCriterion("pviewpicbigpic is null");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicIsNotNull() {
            addCriterion("pviewpicbigpic is not null");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicEqualTo(String value) {
            addCriterion("pviewpicbigpic =", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicNotEqualTo(String value) {
            addCriterion("pviewpicbigpic <>", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicGreaterThan(String value) {
            addCriterion("pviewpicbigpic >", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicGreaterThanOrEqualTo(String value) {
            addCriterion("pviewpicbigpic >=", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicLessThan(String value) {
            addCriterion("pviewpicbigpic <", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicLessThanOrEqualTo(String value) {
            addCriterion("pviewpicbigpic <=", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicLike(String value) {
            addCriterion("pviewpicbigpic like", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicNotLike(String value) {
            addCriterion("pviewpicbigpic not like", value, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicIn(List<String> values) {
            addCriterion("pviewpicbigpic in", values, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicNotIn(List<String> values) {
            addCriterion("pviewpicbigpic not in", values, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicBetween(String value1, String value2) {
            addCriterion("pviewpicbigpic between", value1, value2, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicbigpicNotBetween(String value1, String value2) {
            addCriterion("pviewpicbigpic not between", value1, value2, "pviewpicbigpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicIsNull() {
            addCriterion("pviewpicpic is null");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicIsNotNull() {
            addCriterion("pviewpicpic is not null");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicEqualTo(String value) {
            addCriterion("pviewpicpic =", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicNotEqualTo(String value) {
            addCriterion("pviewpicpic <>", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicGreaterThan(String value) {
            addCriterion("pviewpicpic >", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicGreaterThanOrEqualTo(String value) {
            addCriterion("pviewpicpic >=", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicLessThan(String value) {
            addCriterion("pviewpicpic <", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicLessThanOrEqualTo(String value) {
            addCriterion("pviewpicpic <=", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicLike(String value) {
            addCriterion("pviewpicpic like", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicNotLike(String value) {
            addCriterion("pviewpicpic not like", value, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicIn(List<String> values) {
            addCriterion("pviewpicpic in", values, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicNotIn(List<String> values) {
            addCriterion("pviewpicpic not in", values, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicBetween(String value1, String value2) {
            addCriterion("pviewpicpic between", value1, value2, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicpicNotBetween(String value1, String value2) {
            addCriterion("pviewpicpic not between", value1, value2, "pviewpicpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicIsNull() {
            addCriterion("pviewpicsmallpic is null");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicIsNotNull() {
            addCriterion("pviewpicsmallpic is not null");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicEqualTo(String value) {
            addCriterion("pviewpicsmallpic =", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicNotEqualTo(String value) {
            addCriterion("pviewpicsmallpic <>", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicGreaterThan(String value) {
            addCriterion("pviewpicsmallpic >", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicGreaterThanOrEqualTo(String value) {
            addCriterion("pviewpicsmallpic >=", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicLessThan(String value) {
            addCriterion("pviewpicsmallpic <", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicLessThanOrEqualTo(String value) {
            addCriterion("pviewpicsmallpic <=", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicLike(String value) {
            addCriterion("pviewpicsmallpic like", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicNotLike(String value) {
            addCriterion("pviewpicsmallpic not like", value, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicIn(List<String> values) {
            addCriterion("pviewpicsmallpic in", values, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicNotIn(List<String> values) {
            addCriterion("pviewpicsmallpic not in", values, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicBetween(String value1, String value2) {
            addCriterion("pviewpicsmallpic between", value1, value2, "pviewpicsmallpic");
            return (Criteria) this;
        }

        public Criteria andPviewpicsmallpicNotBetween(String value1, String value2) {
            addCriterion("pviewpicsmallpic not between", value1, value2, "pviewpicsmallpic");
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