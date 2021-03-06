package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideorecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideorecordExample() {
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

        public Criteria andVrecordidIsNull() {
            addCriterion("vRecordId is null");
            return (Criteria) this;
        }

        public Criteria andVrecordidIsNotNull() {
            addCriterion("vRecordId is not null");
            return (Criteria) this;
        }

        public Criteria andVrecordidEqualTo(Integer value) {
            addCriterion("vRecordId =", value, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidNotEqualTo(Integer value) {
            addCriterion("vRecordId <>", value, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidGreaterThan(Integer value) {
            addCriterion("vRecordId >", value, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vRecordId >=", value, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidLessThan(Integer value) {
            addCriterion("vRecordId <", value, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("vRecordId <=", value, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidIn(List<Integer> values) {
            addCriterion("vRecordId in", values, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidNotIn(List<Integer> values) {
            addCriterion("vRecordId not in", values, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidBetween(Integer value1, Integer value2) {
            addCriterion("vRecordId between", value1, value2, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("vRecordId not between", value1, value2, "vrecordid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidIsNull() {
            addCriterion("vRecordOlderId is null");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidIsNotNull() {
            addCriterion("vRecordOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidEqualTo(Integer value) {
            addCriterion("vRecordOlderId =", value, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidNotEqualTo(Integer value) {
            addCriterion("vRecordOlderId <>", value, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidGreaterThan(Integer value) {
            addCriterion("vRecordOlderId >", value, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vRecordOlderId >=", value, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidLessThan(Integer value) {
            addCriterion("vRecordOlderId <", value, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidLessThanOrEqualTo(Integer value) {
            addCriterion("vRecordOlderId <=", value, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidIn(List<Integer> values) {
            addCriterion("vRecordOlderId in", values, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidNotIn(List<Integer> values) {
            addCriterion("vRecordOlderId not in", values, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidBetween(Integer value1, Integer value2) {
            addCriterion("vRecordOlderId between", value1, value2, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("vRecordOlderId not between", value1, value2, "vrecordolderid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidIsNull() {
            addCriterion("vRecordVideoId is null");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidIsNotNull() {
            addCriterion("vRecordVideoId is not null");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidEqualTo(Integer value) {
            addCriterion("vRecordVideoId =", value, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidNotEqualTo(Integer value) {
            addCriterion("vRecordVideoId <>", value, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidGreaterThan(Integer value) {
            addCriterion("vRecordVideoId >", value, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vRecordVideoId >=", value, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidLessThan(Integer value) {
            addCriterion("vRecordVideoId <", value, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidLessThanOrEqualTo(Integer value) {
            addCriterion("vRecordVideoId <=", value, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidIn(List<Integer> values) {
            addCriterion("vRecordVideoId in", values, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidNotIn(List<Integer> values) {
            addCriterion("vRecordVideoId not in", values, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidBetween(Integer value1, Integer value2) {
            addCriterion("vRecordVideoId between", value1, value2, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecordvideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("vRecordVideoId not between", value1, value2, "vrecordvideoid");
            return (Criteria) this;
        }

        public Criteria andVrecorddateIsNull() {
            addCriterion("vRecordDate is null");
            return (Criteria) this;
        }

        public Criteria andVrecorddateIsNotNull() {
            addCriterion("vRecordDate is not null");
            return (Criteria) this;
        }

        public Criteria andVrecorddateEqualTo(Date value) {
            addCriterion("vRecordDate =", value, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateNotEqualTo(Date value) {
            addCriterion("vRecordDate <>", value, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateGreaterThan(Date value) {
            addCriterion("vRecordDate >", value, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateGreaterThanOrEqualTo(Date value) {
            addCriterion("vRecordDate >=", value, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateLessThan(Date value) {
            addCriterion("vRecordDate <", value, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateLessThanOrEqualTo(Date value) {
            addCriterion("vRecordDate <=", value, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateIn(List<Date> values) {
            addCriterion("vRecordDate in", values, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateNotIn(List<Date> values) {
            addCriterion("vRecordDate not in", values, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateBetween(Date value1, Date value2) {
            addCriterion("vRecordDate between", value1, value2, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecorddateNotBetween(Date value1, Date value2) {
            addCriterion("vRecordDate not between", value1, value2, "vrecorddate");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeIsNull() {
            addCriterion("vRecordTime is null");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeIsNotNull() {
            addCriterion("vRecordTime is not null");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeEqualTo(Integer value) {
            addCriterion("vRecordTime =", value, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeNotEqualTo(Integer value) {
            addCriterion("vRecordTime <>", value, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeGreaterThan(Integer value) {
            addCriterion("vRecordTime >", value, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vRecordTime >=", value, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeLessThan(Integer value) {
            addCriterion("vRecordTime <", value, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeLessThanOrEqualTo(Integer value) {
            addCriterion("vRecordTime <=", value, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeIn(List<Integer> values) {
            addCriterion("vRecordTime in", values, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeNotIn(List<Integer> values) {
            addCriterion("vRecordTime not in", values, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeBetween(Integer value1, Integer value2) {
            addCriterion("vRecordTime between", value1, value2, "vrecordtime");
            return (Criteria) this;
        }

        public Criteria andVrecordtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("vRecordTime not between", value1, value2, "vrecordtime");
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