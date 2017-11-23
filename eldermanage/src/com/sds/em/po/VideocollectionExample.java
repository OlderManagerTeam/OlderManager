package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideocollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideocollectionExample() {
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

        public Criteria andVideocollectionidIsNull() {
            addCriterion("videoCollectionId is null");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidIsNotNull() {
            addCriterion("videoCollectionId is not null");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidEqualTo(Integer value) {
            addCriterion("videoCollectionId =", value, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidNotEqualTo(Integer value) {
            addCriterion("videoCollectionId <>", value, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidGreaterThan(Integer value) {
            addCriterion("videoCollectionId >", value, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoCollectionId >=", value, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidLessThan(Integer value) {
            addCriterion("videoCollectionId <", value, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidLessThanOrEqualTo(Integer value) {
            addCriterion("videoCollectionId <=", value, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidIn(List<Integer> values) {
            addCriterion("videoCollectionId in", values, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidNotIn(List<Integer> values) {
            addCriterion("videoCollectionId not in", values, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidBetween(Integer value1, Integer value2) {
            addCriterion("videoCollectionId between", value1, value2, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocollectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoCollectionId not between", value1, value2, "videocollectionid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidIsNull() {
            addCriterion("videoColleOlderId is null");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidIsNotNull() {
            addCriterion("videoColleOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidEqualTo(Integer value) {
            addCriterion("videoColleOlderId =", value, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidNotEqualTo(Integer value) {
            addCriterion("videoColleOlderId <>", value, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidGreaterThan(Integer value) {
            addCriterion("videoColleOlderId >", value, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoColleOlderId >=", value, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidLessThan(Integer value) {
            addCriterion("videoColleOlderId <", value, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidLessThanOrEqualTo(Integer value) {
            addCriterion("videoColleOlderId <=", value, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidIn(List<Integer> values) {
            addCriterion("videoColleOlderId in", values, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidNotIn(List<Integer> values) {
            addCriterion("videoColleOlderId not in", values, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidBetween(Integer value1, Integer value2) {
            addCriterion("videoColleOlderId between", value1, value2, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocolleolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoColleOlderId not between", value1, value2, "videocolleolderid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidIsNull() {
            addCriterion("videoColleVideoId is null");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidIsNotNull() {
            addCriterion("videoColleVideoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidEqualTo(Integer value) {
            addCriterion("videoColleVideoId =", value, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidNotEqualTo(Integer value) {
            addCriterion("videoColleVideoId <>", value, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidGreaterThan(Integer value) {
            addCriterion("videoColleVideoId >", value, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoColleVideoId >=", value, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidLessThan(Integer value) {
            addCriterion("videoColleVideoId <", value, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidLessThanOrEqualTo(Integer value) {
            addCriterion("videoColleVideoId <=", value, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidIn(List<Integer> values) {
            addCriterion("videoColleVideoId in", values, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidNotIn(List<Integer> values) {
            addCriterion("videoColleVideoId not in", values, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidBetween(Integer value1, Integer value2) {
            addCriterion("videoColleVideoId between", value1, value2, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocollevideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoColleVideoId not between", value1, value2, "videocollevideoid");
            return (Criteria) this;
        }

        public Criteria andVideocolledateIsNull() {
            addCriterion("videoColleDate is null");
            return (Criteria) this;
        }

        public Criteria andVideocolledateIsNotNull() {
            addCriterion("videoColleDate is not null");
            return (Criteria) this;
        }

        public Criteria andVideocolledateEqualTo(Date value) {
            addCriterion("videoColleDate =", value, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateNotEqualTo(Date value) {
            addCriterion("videoColleDate <>", value, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateGreaterThan(Date value) {
            addCriterion("videoColleDate >", value, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateGreaterThanOrEqualTo(Date value) {
            addCriterion("videoColleDate >=", value, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateLessThan(Date value) {
            addCriterion("videoColleDate <", value, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateLessThanOrEqualTo(Date value) {
            addCriterion("videoColleDate <=", value, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateIn(List<Date> values) {
            addCriterion("videoColleDate in", values, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateNotIn(List<Date> values) {
            addCriterion("videoColleDate not in", values, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateBetween(Date value1, Date value2) {
            addCriterion("videoColleDate between", value1, value2, "videocolledate");
            return (Criteria) this;
        }

        public Criteria andVideocolledateNotBetween(Date value1, Date value2) {
            addCriterion("videoColleDate not between", value1, value2, "videocolledate");
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