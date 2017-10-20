package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActionrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActionrecordExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andArecordidIsNull() {
            addCriterion("ARecordId is null");
            return (Criteria) this;
        }

        public Criteria andArecordidIsNotNull() {
            addCriterion("ARecordId is not null");
            return (Criteria) this;
        }

        public Criteria andArecordidEqualTo(Integer value) {
            addCriterion("ARecordId =", value, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidNotEqualTo(Integer value) {
            addCriterion("ARecordId <>", value, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidGreaterThan(Integer value) {
            addCriterion("ARecordId >", value, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARecordId >=", value, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidLessThan(Integer value) {
            addCriterion("ARecordId <", value, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidLessThanOrEqualTo(Integer value) {
            addCriterion("ARecordId <=", value, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidIn(List<Integer> values) {
            addCriterion("ARecordId in", values, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidNotIn(List<Integer> values) {
            addCriterion("ARecordId not in", values, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidBetween(Integer value1, Integer value2) {
            addCriterion("ARecordId between", value1, value2, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("ARecordId not between", value1, value2, "arecordid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidIsNull() {
            addCriterion("ARecordolderId is null");
            return (Criteria) this;
        }

        public Criteria andArecordolderidIsNotNull() {
            addCriterion("ARecordolderId is not null");
            return (Criteria) this;
        }

        public Criteria andArecordolderidEqualTo(Integer value) {
            addCriterion("ARecordolderId =", value, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidNotEqualTo(Integer value) {
            addCriterion("ARecordolderId <>", value, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidGreaterThan(Integer value) {
            addCriterion("ARecordolderId >", value, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARecordolderId >=", value, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidLessThan(Integer value) {
            addCriterion("ARecordolderId <", value, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidLessThanOrEqualTo(Integer value) {
            addCriterion("ARecordolderId <=", value, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidIn(List<Integer> values) {
            addCriterion("ARecordolderId in", values, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidNotIn(List<Integer> values) {
            addCriterion("ARecordolderId not in", values, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidBetween(Integer value1, Integer value2) {
            addCriterion("ARecordolderId between", value1, value2, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("ARecordolderId not between", value1, value2, "arecordolderid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidIsNull() {
            addCriterion("ARecordActionId is null");
            return (Criteria) this;
        }

        public Criteria andArecordactionidIsNotNull() {
            addCriterion("ARecordActionId is not null");
            return (Criteria) this;
        }

        public Criteria andArecordactionidEqualTo(Integer value) {
            addCriterion("ARecordActionId =", value, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidNotEqualTo(Integer value) {
            addCriterion("ARecordActionId <>", value, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidGreaterThan(Integer value) {
            addCriterion("ARecordActionId >", value, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARecordActionId >=", value, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidLessThan(Integer value) {
            addCriterion("ARecordActionId <", value, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidLessThanOrEqualTo(Integer value) {
            addCriterion("ARecordActionId <=", value, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidIn(List<Integer> values) {
            addCriterion("ARecordActionId in", values, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidNotIn(List<Integer> values) {
            addCriterion("ARecordActionId not in", values, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidBetween(Integer value1, Integer value2) {
            addCriterion("ARecordActionId between", value1, value2, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecordactionidNotBetween(Integer value1, Integer value2) {
            addCriterion("ARecordActionId not between", value1, value2, "arecordactionid");
            return (Criteria) this;
        }

        public Criteria andArecorddateIsNull() {
            addCriterion("ARecordDate is null");
            return (Criteria) this;
        }

        public Criteria andArecorddateIsNotNull() {
            addCriterion("ARecordDate is not null");
            return (Criteria) this;
        }

        public Criteria andArecorddateEqualTo(Date value) {
            addCriterionForJDBCTime("ARecordDate =", value, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateNotEqualTo(Date value) {
            addCriterionForJDBCTime("ARecordDate <>", value, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateGreaterThan(Date value) {
            addCriterionForJDBCTime("ARecordDate >", value, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ARecordDate >=", value, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateLessThan(Date value) {
            addCriterionForJDBCTime("ARecordDate <", value, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ARecordDate <=", value, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateIn(List<Date> values) {
            addCriterionForJDBCTime("ARecordDate in", values, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateNotIn(List<Date> values) {
            addCriterionForJDBCTime("ARecordDate not in", values, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ARecordDate between", value1, value2, "arecorddate");
            return (Criteria) this;
        }

        public Criteria andArecorddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ARecordDate not between", value1, value2, "arecorddate");
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