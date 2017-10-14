package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QueueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueueExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQueueidIsNull() {
            addCriterion("queueId is null");
            return (Criteria) this;
        }

        public Criteria andQueueidIsNotNull() {
            addCriterion("queueId is not null");
            return (Criteria) this;
        }

        public Criteria andQueueidEqualTo(Integer value) {
            addCriterion("queueId =", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidNotEqualTo(Integer value) {
            addCriterion("queueId <>", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidGreaterThan(Integer value) {
            addCriterion("queueId >", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("queueId >=", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidLessThan(Integer value) {
            addCriterion("queueId <", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidLessThanOrEqualTo(Integer value) {
            addCriterion("queueId <=", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidIn(List<Integer> values) {
            addCriterion("queueId in", values, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidNotIn(List<Integer> values) {
            addCriterion("queueId not in", values, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidBetween(Integer value1, Integer value2) {
            addCriterion("queueId between", value1, value2, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidNotBetween(Integer value1, Integer value2) {
            addCriterion("queueId not between", value1, value2, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidIsNull() {
            addCriterion("queueAssistantId is null");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidIsNotNull() {
            addCriterion("queueAssistantId is not null");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidEqualTo(Integer value) {
            addCriterion("queueAssistantId =", value, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidNotEqualTo(Integer value) {
            addCriterion("queueAssistantId <>", value, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidGreaterThan(Integer value) {
            addCriterion("queueAssistantId >", value, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("queueAssistantId >=", value, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidLessThan(Integer value) {
            addCriterion("queueAssistantId <", value, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidLessThanOrEqualTo(Integer value) {
            addCriterion("queueAssistantId <=", value, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidIn(List<Integer> values) {
            addCriterion("queueAssistantId in", values, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidNotIn(List<Integer> values) {
            addCriterion("queueAssistantId not in", values, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidBetween(Integer value1, Integer value2) {
            addCriterion("queueAssistantId between", value1, value2, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueassistantidNotBetween(Integer value1, Integer value2) {
            addCriterion("queueAssistantId not between", value1, value2, "queueassistantid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidIsNull() {
            addCriterion("queueOlderId is null");
            return (Criteria) this;
        }

        public Criteria andQueueolderidIsNotNull() {
            addCriterion("queueOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andQueueolderidEqualTo(Integer value) {
            addCriterion("queueOlderId =", value, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidNotEqualTo(Integer value) {
            addCriterion("queueOlderId <>", value, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidGreaterThan(Integer value) {
            addCriterion("queueOlderId >", value, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("queueOlderId >=", value, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidLessThan(Integer value) {
            addCriterion("queueOlderId <", value, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidLessThanOrEqualTo(Integer value) {
            addCriterion("queueOlderId <=", value, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidIn(List<Integer> values) {
            addCriterion("queueOlderId in", values, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidNotIn(List<Integer> values) {
            addCriterion("queueOlderId not in", values, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidBetween(Integer value1, Integer value2) {
            addCriterion("queueOlderId between", value1, value2, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueueolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("queueOlderId not between", value1, value2, "queueolderid");
            return (Criteria) this;
        }

        public Criteria andQueuedateIsNull() {
            addCriterion("queueDate is null");
            return (Criteria) this;
        }

        public Criteria andQueuedateIsNotNull() {
            addCriterion("queueDate is not null");
            return (Criteria) this;
        }

        public Criteria andQueuedateEqualTo(Date value) {
            addCriterionForJDBCDate("queueDate =", value, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("queueDate <>", value, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateGreaterThan(Date value) {
            addCriterionForJDBCDate("queueDate >", value, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("queueDate >=", value, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateLessThan(Date value) {
            addCriterionForJDBCDate("queueDate <", value, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("queueDate <=", value, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateIn(List<Date> values) {
            addCriterionForJDBCDate("queueDate in", values, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("queueDate not in", values, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("queueDate between", value1, value2, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("queueDate not between", value1, value2, "queuedate");
            return (Criteria) this;
        }

        public Criteria andQueuetypeIsNull() {
            addCriterion("queueType is null");
            return (Criteria) this;
        }

        public Criteria andQueuetypeIsNotNull() {
            addCriterion("queueType is not null");
            return (Criteria) this;
        }

        public Criteria andQueuetypeEqualTo(String value) {
            addCriterion("queueType =", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeNotEqualTo(String value) {
            addCriterion("queueType <>", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeGreaterThan(String value) {
            addCriterion("queueType >", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("queueType >=", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeLessThan(String value) {
            addCriterion("queueType <", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeLessThanOrEqualTo(String value) {
            addCriterion("queueType <=", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeLike(String value) {
            addCriterion("queueType like", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeNotLike(String value) {
            addCriterion("queueType not like", value, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeIn(List<String> values) {
            addCriterion("queueType in", values, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeNotIn(List<String> values) {
            addCriterion("queueType not in", values, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeBetween(String value1, String value2) {
            addCriterion("queueType between", value1, value2, "queuetype");
            return (Criteria) this;
        }

        public Criteria andQueuetypeNotBetween(String value1, String value2) {
            addCriterion("queueType not between", value1, value2, "queuetype");
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