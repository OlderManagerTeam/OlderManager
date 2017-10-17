package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VisitedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitedExample() {
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

        public Criteria andVisitedidIsNull() {
            addCriterion("visitedId is null");
            return (Criteria) this;
        }

        public Criteria andVisitedidIsNotNull() {
            addCriterion("visitedId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedidEqualTo(Integer value) {
            addCriterion("visitedId =", value, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidNotEqualTo(Integer value) {
            addCriterion("visitedId <>", value, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidGreaterThan(Integer value) {
            addCriterion("visitedId >", value, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitedId >=", value, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidLessThan(Integer value) {
            addCriterion("visitedId <", value, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidLessThanOrEqualTo(Integer value) {
            addCriterion("visitedId <=", value, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidIn(List<Integer> values) {
            addCriterion("visitedId in", values, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidNotIn(List<Integer> values) {
            addCriterion("visitedId not in", values, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidBetween(Integer value1, Integer value2) {
            addCriterion("visitedId between", value1, value2, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitedId not between", value1, value2, "visitedid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidIsNull() {
            addCriterion("visitedAssistantId is null");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidIsNotNull() {
            addCriterion("visitedAssistantId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidEqualTo(Integer value) {
            addCriterion("visitedAssistantId =", value, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidNotEqualTo(Integer value) {
            addCriterion("visitedAssistantId <>", value, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidGreaterThan(Integer value) {
            addCriterion("visitedAssistantId >", value, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitedAssistantId >=", value, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidLessThan(Integer value) {
            addCriterion("visitedAssistantId <", value, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidLessThanOrEqualTo(Integer value) {
            addCriterion("visitedAssistantId <=", value, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidIn(List<Integer> values) {
            addCriterion("visitedAssistantId in", values, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidNotIn(List<Integer> values) {
            addCriterion("visitedAssistantId not in", values, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidBetween(Integer value1, Integer value2) {
            addCriterion("visitedAssistantId between", value1, value2, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedassistantidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitedAssistantId not between", value1, value2, "visitedassistantid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidIsNull() {
            addCriterion("visitedOlderId is null");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidIsNotNull() {
            addCriterion("visitedOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidEqualTo(Integer value) {
            addCriterion("visitedOlderId =", value, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidNotEqualTo(Integer value) {
            addCriterion("visitedOlderId <>", value, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidGreaterThan(Integer value) {
            addCriterion("visitedOlderId >", value, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitedOlderId >=", value, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidLessThan(Integer value) {
            addCriterion("visitedOlderId <", value, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidLessThanOrEqualTo(Integer value) {
            addCriterion("visitedOlderId <=", value, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidIn(List<Integer> values) {
            addCriterion("visitedOlderId in", values, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidNotIn(List<Integer> values) {
            addCriterion("visitedOlderId not in", values, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidBetween(Integer value1, Integer value2) {
            addCriterion("visitedOlderId between", value1, value2, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitedOlderId not between", value1, value2, "visitedolderid");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentIsNull() {
            addCriterion("visitedjudgeContent is null");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentIsNotNull() {
            addCriterion("visitedjudgeContent is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentEqualTo(String value) {
            addCriterion("visitedjudgeContent =", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentNotEqualTo(String value) {
            addCriterion("visitedjudgeContent <>", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentGreaterThan(String value) {
            addCriterion("visitedjudgeContent >", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentGreaterThanOrEqualTo(String value) {
            addCriterion("visitedjudgeContent >=", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentLessThan(String value) {
            addCriterion("visitedjudgeContent <", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentLessThanOrEqualTo(String value) {
            addCriterion("visitedjudgeContent <=", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentLike(String value) {
            addCriterion("visitedjudgeContent like", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentNotLike(String value) {
            addCriterion("visitedjudgeContent not like", value, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentIn(List<String> values) {
            addCriterion("visitedjudgeContent in", values, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentNotIn(List<String> values) {
            addCriterion("visitedjudgeContent not in", values, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentBetween(String value1, String value2) {
            addCriterion("visitedjudgeContent between", value1, value2, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgecontentNotBetween(String value1, String value2) {
            addCriterion("visitedjudgeContent not between", value1, value2, "visitedjudgecontent");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarIsNull() {
            addCriterion("visitedjudgeStar is null");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarIsNotNull() {
            addCriterion("visitedjudgeStar is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarEqualTo(Integer value) {
            addCriterion("visitedjudgeStar =", value, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarNotEqualTo(Integer value) {
            addCriterion("visitedjudgeStar <>", value, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarGreaterThan(Integer value) {
            addCriterion("visitedjudgeStar >", value, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitedjudgeStar >=", value, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarLessThan(Integer value) {
            addCriterion("visitedjudgeStar <", value, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarLessThanOrEqualTo(Integer value) {
            addCriterion("visitedjudgeStar <=", value, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarIn(List<Integer> values) {
            addCriterion("visitedjudgeStar in", values, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarNotIn(List<Integer> values) {
            addCriterion("visitedjudgeStar not in", values, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarBetween(Integer value1, Integer value2) {
            addCriterion("visitedjudgeStar between", value1, value2, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedjudgestarNotBetween(Integer value1, Integer value2) {
            addCriterion("visitedjudgeStar not between", value1, value2, "visitedjudgestar");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentIsNull() {
            addCriterion("visitedContent is null");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentIsNotNull() {
            addCriterion("visitedContent is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentEqualTo(String value) {
            addCriterion("visitedContent =", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentNotEqualTo(String value) {
            addCriterion("visitedContent <>", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentGreaterThan(String value) {
            addCriterion("visitedContent >", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentGreaterThanOrEqualTo(String value) {
            addCriterion("visitedContent >=", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentLessThan(String value) {
            addCriterion("visitedContent <", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentLessThanOrEqualTo(String value) {
            addCriterion("visitedContent <=", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentLike(String value) {
            addCriterion("visitedContent like", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentNotLike(String value) {
            addCriterion("visitedContent not like", value, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentIn(List<String> values) {
            addCriterion("visitedContent in", values, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentNotIn(List<String> values) {
            addCriterion("visitedContent not in", values, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentBetween(String value1, String value2) {
            addCriterion("visitedContent between", value1, value2, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisitedcontentNotBetween(String value1, String value2) {
            addCriterion("visitedContent not between", value1, value2, "visitedcontent");
            return (Criteria) this;
        }

        public Criteria andVisiteddateIsNull() {
            addCriterion("visitedDate is null");
            return (Criteria) this;
        }

        public Criteria andVisiteddateIsNotNull() {
            addCriterion("visitedDate is not null");
            return (Criteria) this;
        }

        public Criteria andVisiteddateEqualTo(Date value) {
            addCriterionForJDBCDate("visitedDate =", value, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("visitedDate <>", value, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateGreaterThan(Date value) {
            addCriterionForJDBCDate("visitedDate >", value, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visitedDate >=", value, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateLessThan(Date value) {
            addCriterionForJDBCDate("visitedDate <", value, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visitedDate <=", value, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateIn(List<Date> values) {
            addCriterionForJDBCDate("visitedDate in", values, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("visitedDate not in", values, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visitedDate between", value1, value2, "visiteddate");
            return (Criteria) this;
        }

        public Criteria andVisiteddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visitedDate not between", value1, value2, "visiteddate");
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