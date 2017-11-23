package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OldermessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldermessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageId is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageId is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageId =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageId <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageId >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageId >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageId <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageId <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageId in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageId not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageId between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageId not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidIsNull() {
            addCriterion("messageOlderid is null");
            return (Criteria) this;
        }

        public Criteria andMessageolderidIsNotNull() {
            addCriterion("messageOlderid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageolderidEqualTo(Integer value) {
            addCriterion("messageOlderid =", value, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidNotEqualTo(Integer value) {
            addCriterion("messageOlderid <>", value, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidGreaterThan(Integer value) {
            addCriterion("messageOlderid >", value, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageOlderid >=", value, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidLessThan(Integer value) {
            addCriterion("messageOlderid <", value, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidLessThanOrEqualTo(Integer value) {
            addCriterion("messageOlderid <=", value, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidIn(List<Integer> values) {
            addCriterion("messageOlderid in", values, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidNotIn(List<Integer> values) {
            addCriterion("messageOlderid not in", values, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidBetween(Integer value1, Integer value2) {
            addCriterion("messageOlderid between", value1, value2, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessageolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageOlderid not between", value1, value2, "messageolderid");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNull() {
            addCriterion("messageContent is null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNotNull() {
            addCriterion("messageContent is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentEqualTo(String value) {
            addCriterion("messageContent =", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotEqualTo(String value) {
            addCriterion("messageContent <>", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThan(String value) {
            addCriterion("messageContent >", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("messageContent >=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThan(String value) {
            addCriterion("messageContent <", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThanOrEqualTo(String value) {
            addCriterion("messageContent <=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLike(String value) {
            addCriterion("messageContent like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotLike(String value) {
            addCriterion("messageContent not like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIn(List<String> values) {
            addCriterion("messageContent in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotIn(List<String> values) {
            addCriterion("messageContent not in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentBetween(String value1, String value2) {
            addCriterion("messageContent between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotBetween(String value1, String value2) {
            addCriterion("messageContent not between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagedateIsNull() {
            addCriterion("messageDate is null");
            return (Criteria) this;
        }

        public Criteria andMessagedateIsNotNull() {
            addCriterion("messageDate is not null");
            return (Criteria) this;
        }

        public Criteria andMessagedateEqualTo(Date value) {
            addCriterion("messageDate =", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateNotEqualTo(Date value) {
            addCriterion("messageDate <>", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateGreaterThan(Date value) {
            addCriterion("messageDate >", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("messageDate >=", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateLessThan(Date value) {
            addCriterion("messageDate <", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateLessThanOrEqualTo(Date value) {
            addCriterion("messageDate <=", value, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateIn(List<Date> values) {
            addCriterion("messageDate in", values, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateNotIn(List<Date> values) {
            addCriterion("messageDate not in", values, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateBetween(Date value1, Date value2) {
            addCriterion("messageDate between", value1, value2, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagedateNotBetween(Date value1, Date value2) {
            addCriterion("messageDate not between", value1, value2, "messagedate");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNull() {
            addCriterion("messageType is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNotNull() {
            addCriterion("messageType is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeEqualTo(String value) {
            addCriterion("messageType =", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotEqualTo(String value) {
            addCriterion("messageType <>", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThan(String value) {
            addCriterion("messageType >", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("messageType >=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThan(String value) {
            addCriterion("messageType <", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThanOrEqualTo(String value) {
            addCriterion("messageType <=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLike(String value) {
            addCriterion("messageType like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotLike(String value) {
            addCriterion("messageType not like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIn(List<String> values) {
            addCriterion("messageType in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotIn(List<String> values) {
            addCriterion("messageType not in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeBetween(String value1, String value2) {
            addCriterion("messageType between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotBetween(String value1, String value2) {
            addCriterion("messageType not between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIsNull() {
            addCriterion("messageStatus is null");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIsNotNull() {
            addCriterion("messageStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMessagestatusEqualTo(String value) {
            addCriterion("messageStatus =", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotEqualTo(String value) {
            addCriterion("messageStatus <>", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusGreaterThan(String value) {
            addCriterion("messageStatus >", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusGreaterThanOrEqualTo(String value) {
            addCriterion("messageStatus >=", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLessThan(String value) {
            addCriterion("messageStatus <", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLessThanOrEqualTo(String value) {
            addCriterion("messageStatus <=", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusLike(String value) {
            addCriterion("messageStatus like", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotLike(String value) {
            addCriterion("messageStatus not like", value, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusIn(List<String> values) {
            addCriterion("messageStatus in", values, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotIn(List<String> values) {
            addCriterion("messageStatus not in", values, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusBetween(String value1, String value2) {
            addCriterion("messageStatus between", value1, value2, "messagestatus");
            return (Criteria) this;
        }

        public Criteria andMessagestatusNotBetween(String value1, String value2) {
            addCriterion("messageStatus not between", value1, value2, "messagestatus");
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