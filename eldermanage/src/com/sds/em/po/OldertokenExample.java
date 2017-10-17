package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class OldertokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldertokenExample() {
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

        public Criteria andOlderidIsNull() {
            addCriterion("olderId is null");
            return (Criteria) this;
        }

        public Criteria andOlderidIsNotNull() {
            addCriterion("olderId is not null");
            return (Criteria) this;
        }

        public Criteria andOlderidEqualTo(Integer value) {
            addCriterion("olderId =", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidNotEqualTo(Integer value) {
            addCriterion("olderId <>", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidGreaterThan(Integer value) {
            addCriterion("olderId >", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olderId >=", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidLessThan(Integer value) {
            addCriterion("olderId <", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidLessThanOrEqualTo(Integer value) {
            addCriterion("olderId <=", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidIn(List<Integer> values) {
            addCriterion("olderId in", values, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidNotIn(List<Integer> values) {
            addCriterion("olderId not in", values, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidBetween(Integer value1, Integer value2) {
            addCriterion("olderId between", value1, value2, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidNotBetween(Integer value1, Integer value2) {
            addCriterion("olderId not between", value1, value2, "olderid");
            return (Criteria) this;
        }

        public Criteria andOldertokenIsNull() {
            addCriterion("olderToken is null");
            return (Criteria) this;
        }

        public Criteria andOldertokenIsNotNull() {
            addCriterion("olderToken is not null");
            return (Criteria) this;
        }

        public Criteria andOldertokenEqualTo(String value) {
            addCriterion("olderToken =", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenNotEqualTo(String value) {
            addCriterion("olderToken <>", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenGreaterThan(String value) {
            addCriterion("olderToken >", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenGreaterThanOrEqualTo(String value) {
            addCriterion("olderToken >=", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenLessThan(String value) {
            addCriterion("olderToken <", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenLessThanOrEqualTo(String value) {
            addCriterion("olderToken <=", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenLike(String value) {
            addCriterion("olderToken like", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenNotLike(String value) {
            addCriterion("olderToken not like", value, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenIn(List<String> values) {
            addCriterion("olderToken in", values, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenNotIn(List<String> values) {
            addCriterion("olderToken not in", values, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenBetween(String value1, String value2) {
            addCriterion("olderToken between", value1, value2, "oldertoken");
            return (Criteria) this;
        }

        public Criteria andOldertokenNotBetween(String value1, String value2) {
            addCriterion("olderToken not between", value1, value2, "oldertoken");
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