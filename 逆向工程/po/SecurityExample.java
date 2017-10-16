package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class SecurityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecurityExample() {
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

        public Criteria andSecurityidIsNull() {
            addCriterion("securityId is null");
            return (Criteria) this;
        }

        public Criteria andSecurityidIsNotNull() {
            addCriterion("securityId is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityidEqualTo(Integer value) {
            addCriterion("securityId =", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotEqualTo(Integer value) {
            addCriterion("securityId <>", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidGreaterThan(Integer value) {
            addCriterion("securityId >", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("securityId >=", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidLessThan(Integer value) {
            addCriterion("securityId <", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidLessThanOrEqualTo(Integer value) {
            addCriterion("securityId <=", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidIn(List<Integer> values) {
            addCriterion("securityId in", values, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotIn(List<Integer> values) {
            addCriterion("securityId not in", values, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidBetween(Integer value1, Integer value2) {
            addCriterion("securityId between", value1, value2, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotBetween(Integer value1, Integer value2) {
            addCriterion("securityId not between", value1, value2, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidIsNull() {
            addCriterion("securityQuestionId is null");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidIsNotNull() {
            addCriterion("securityQuestionId is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidEqualTo(Integer value) {
            addCriterion("securityQuestionId =", value, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidNotEqualTo(Integer value) {
            addCriterion("securityQuestionId <>", value, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidGreaterThan(Integer value) {
            addCriterion("securityQuestionId >", value, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("securityQuestionId >=", value, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidLessThan(Integer value) {
            addCriterion("securityQuestionId <", value, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidLessThanOrEqualTo(Integer value) {
            addCriterion("securityQuestionId <=", value, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidIn(List<Integer> values) {
            addCriterion("securityQuestionId in", values, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidNotIn(List<Integer> values) {
            addCriterion("securityQuestionId not in", values, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidBetween(Integer value1, Integer value2) {
            addCriterion("securityQuestionId between", value1, value2, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecurityquestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("securityQuestionId not between", value1, value2, "securityquestionid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidIsNull() {
            addCriterion("securityStaffId is null");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidIsNotNull() {
            addCriterion("securityStaffId is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidEqualTo(Integer value) {
            addCriterion("securityStaffId =", value, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidNotEqualTo(Integer value) {
            addCriterion("securityStaffId <>", value, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidGreaterThan(Integer value) {
            addCriterion("securityStaffId >", value, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("securityStaffId >=", value, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidLessThan(Integer value) {
            addCriterion("securityStaffId <", value, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidLessThanOrEqualTo(Integer value) {
            addCriterion("securityStaffId <=", value, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidIn(List<Integer> values) {
            addCriterion("securityStaffId in", values, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidNotIn(List<Integer> values) {
            addCriterion("securityStaffId not in", values, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidBetween(Integer value1, Integer value2) {
            addCriterion("securityStaffId between", value1, value2, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecuritystaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("securityStaffId not between", value1, value2, "securitystaffid");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerIsNull() {
            addCriterion("securityAnswer is null");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerIsNotNull() {
            addCriterion("securityAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerEqualTo(String value) {
            addCriterion("securityAnswer =", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotEqualTo(String value) {
            addCriterion("securityAnswer <>", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerGreaterThan(String value) {
            addCriterion("securityAnswer >", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerGreaterThanOrEqualTo(String value) {
            addCriterion("securityAnswer >=", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerLessThan(String value) {
            addCriterion("securityAnswer <", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerLessThanOrEqualTo(String value) {
            addCriterion("securityAnswer <=", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerLike(String value) {
            addCriterion("securityAnswer like", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotLike(String value) {
            addCriterion("securityAnswer not like", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerIn(List<String> values) {
            addCriterion("securityAnswer in", values, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotIn(List<String> values) {
            addCriterion("securityAnswer not in", values, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerBetween(String value1, String value2) {
            addCriterion("securityAnswer between", value1, value2, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotBetween(String value1, String value2) {
            addCriterion("securityAnswer not between", value1, value2, "securityanswer");
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