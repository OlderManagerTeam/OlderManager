package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class ShiroroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShiroroleExample() {
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

        public Criteria andShirotelIsNull() {
            addCriterion("shirotel is null");
            return (Criteria) this;
        }

        public Criteria andShirotelIsNotNull() {
            addCriterion("shirotel is not null");
            return (Criteria) this;
        }

        public Criteria andShirotelEqualTo(String value) {
            addCriterion("shirotel =", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelNotEqualTo(String value) {
            addCriterion("shirotel <>", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelGreaterThan(String value) {
            addCriterion("shirotel >", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelGreaterThanOrEqualTo(String value) {
            addCriterion("shirotel >=", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelLessThan(String value) {
            addCriterion("shirotel <", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelLessThanOrEqualTo(String value) {
            addCriterion("shirotel <=", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelLike(String value) {
            addCriterion("shirotel like", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelNotLike(String value) {
            addCriterion("shirotel not like", value, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelIn(List<String> values) {
            addCriterion("shirotel in", values, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelNotIn(List<String> values) {
            addCriterion("shirotel not in", values, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelBetween(String value1, String value2) {
            addCriterion("shirotel between", value1, value2, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShirotelNotBetween(String value1, String value2) {
            addCriterion("shirotel not between", value1, value2, "shirotel");
            return (Criteria) this;
        }

        public Criteria andShiroroleIsNull() {
            addCriterion("shirorole is null");
            return (Criteria) this;
        }

        public Criteria andShiroroleIsNotNull() {
            addCriterion("shirorole is not null");
            return (Criteria) this;
        }

        public Criteria andShiroroleEqualTo(String value) {
            addCriterion("shirorole =", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleNotEqualTo(String value) {
            addCriterion("shirorole <>", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleGreaterThan(String value) {
            addCriterion("shirorole >", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleGreaterThanOrEqualTo(String value) {
            addCriterion("shirorole >=", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleLessThan(String value) {
            addCriterion("shirorole <", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleLessThanOrEqualTo(String value) {
            addCriterion("shirorole <=", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleLike(String value) {
            addCriterion("shirorole like", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleNotLike(String value) {
            addCriterion("shirorole not like", value, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleIn(List<String> values) {
            addCriterion("shirorole in", values, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleNotIn(List<String> values) {
            addCriterion("shirorole not in", values, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleBetween(String value1, String value2) {
            addCriterion("shirorole between", value1, value2, "shirorole");
            return (Criteria) this;
        }

        public Criteria andShiroroleNotBetween(String value1, String value2) {
            addCriterion("shirorole not between", value1, value2, "shirorole");
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