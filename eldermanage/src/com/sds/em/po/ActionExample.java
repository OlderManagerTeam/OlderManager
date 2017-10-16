package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActionExample() {
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

        public Criteria andActionidIsNull() {
            addCriterion("actionId is null");
            return (Criteria) this;
        }

        public Criteria andActionidIsNotNull() {
            addCriterion("actionId is not null");
            return (Criteria) this;
        }

        public Criteria andActionidEqualTo(Integer value) {
            addCriterion("actionId =", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidNotEqualTo(Integer value) {
            addCriterion("actionId <>", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidGreaterThan(Integer value) {
            addCriterion("actionId >", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionId >=", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidLessThan(Integer value) {
            addCriterion("actionId <", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidLessThanOrEqualTo(Integer value) {
            addCriterion("actionId <=", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidIn(List<Integer> values) {
            addCriterion("actionId in", values, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidNotIn(List<Integer> values) {
            addCriterion("actionId not in", values, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidBetween(Integer value1, Integer value2) {
            addCriterion("actionId between", value1, value2, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidNotBetween(Integer value1, Integer value2) {
            addCriterion("actionId not between", value1, value2, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidIsNull() {
            addCriterion("actionBranchId is null");
            return (Criteria) this;
        }

        public Criteria andActionbranchidIsNotNull() {
            addCriterion("actionBranchId is not null");
            return (Criteria) this;
        }

        public Criteria andActionbranchidEqualTo(Integer value) {
            addCriterion("actionBranchId =", value, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidNotEqualTo(Integer value) {
            addCriterion("actionBranchId <>", value, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidGreaterThan(Integer value) {
            addCriterion("actionBranchId >", value, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionBranchId >=", value, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidLessThan(Integer value) {
            addCriterion("actionBranchId <", value, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidLessThanOrEqualTo(Integer value) {
            addCriterion("actionBranchId <=", value, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidIn(List<Integer> values) {
            addCriterion("actionBranchId in", values, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidNotIn(List<Integer> values) {
            addCriterion("actionBranchId not in", values, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidBetween(Integer value1, Integer value2) {
            addCriterion("actionBranchId between", value1, value2, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionbranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("actionBranchId not between", value1, value2, "actionbranchid");
            return (Criteria) this;
        }

        public Criteria andActionstartdateIsNull() {
            addCriterion("actionStartDate is null");
            return (Criteria) this;
        }

        public Criteria andActionstartdateIsNotNull() {
            addCriterion("actionStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andActionstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("actionStartDate =", value, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("actionStartDate <>", value, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("actionStartDate >", value, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actionStartDate >=", value, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateLessThan(Date value) {
            addCriterionForJDBCDate("actionStartDate <", value, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actionStartDate <=", value, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("actionStartDate in", values, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("actionStartDate not in", values, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actionStartDate between", value1, value2, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actionStartDate not between", value1, value2, "actionstartdate");
            return (Criteria) this;
        }

        public Criteria andActionintroIsNull() {
            addCriterion("actionIntro is null");
            return (Criteria) this;
        }

        public Criteria andActionintroIsNotNull() {
            addCriterion("actionIntro is not null");
            return (Criteria) this;
        }

        public Criteria andActionintroEqualTo(String value) {
            addCriterion("actionIntro =", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroNotEqualTo(String value) {
            addCriterion("actionIntro <>", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroGreaterThan(String value) {
            addCriterion("actionIntro >", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroGreaterThanOrEqualTo(String value) {
            addCriterion("actionIntro >=", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroLessThan(String value) {
            addCriterion("actionIntro <", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroLessThanOrEqualTo(String value) {
            addCriterion("actionIntro <=", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroLike(String value) {
            addCriterion("actionIntro like", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroNotLike(String value) {
            addCriterion("actionIntro not like", value, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroIn(List<String> values) {
            addCriterion("actionIntro in", values, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroNotIn(List<String> values) {
            addCriterion("actionIntro not in", values, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroBetween(String value1, String value2) {
            addCriterion("actionIntro between", value1, value2, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionintroNotBetween(String value1, String value2) {
            addCriterion("actionIntro not between", value1, value2, "actionintro");
            return (Criteria) this;
        }

        public Criteria andActionnameIsNull() {
            addCriterion("actionName is null");
            return (Criteria) this;
        }

        public Criteria andActionnameIsNotNull() {
            addCriterion("actionName is not null");
            return (Criteria) this;
        }

        public Criteria andActionnameEqualTo(String value) {
            addCriterion("actionName =", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotEqualTo(String value) {
            addCriterion("actionName <>", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameGreaterThan(String value) {
            addCriterion("actionName >", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameGreaterThanOrEqualTo(String value) {
            addCriterion("actionName >=", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLessThan(String value) {
            addCriterion("actionName <", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLessThanOrEqualTo(String value) {
            addCriterion("actionName <=", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLike(String value) {
            addCriterion("actionName like", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotLike(String value) {
            addCriterion("actionName not like", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameIn(List<String> values) {
            addCriterion("actionName in", values, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotIn(List<String> values) {
            addCriterion("actionName not in", values, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameBetween(String value1, String value2) {
            addCriterion("actionName between", value1, value2, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotBetween(String value1, String value2) {
            addCriterion("actionName not between", value1, value2, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionaddressIsNull() {
            addCriterion("actionAddress is null");
            return (Criteria) this;
        }

        public Criteria andActionaddressIsNotNull() {
            addCriterion("actionAddress is not null");
            return (Criteria) this;
        }

        public Criteria andActionaddressEqualTo(String value) {
            addCriterion("actionAddress =", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressNotEqualTo(String value) {
            addCriterion("actionAddress <>", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressGreaterThan(String value) {
            addCriterion("actionAddress >", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressGreaterThanOrEqualTo(String value) {
            addCriterion("actionAddress >=", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressLessThan(String value) {
            addCriterion("actionAddress <", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressLessThanOrEqualTo(String value) {
            addCriterion("actionAddress <=", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressLike(String value) {
            addCriterion("actionAddress like", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressNotLike(String value) {
            addCriterion("actionAddress not like", value, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressIn(List<String> values) {
            addCriterion("actionAddress in", values, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressNotIn(List<String> values) {
            addCriterion("actionAddress not in", values, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressBetween(String value1, String value2) {
            addCriterion("actionAddress between", value1, value2, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionaddressNotBetween(String value1, String value2) {
            addCriterion("actionAddress not between", value1, value2, "actionaddress");
            return (Criteria) this;
        }

        public Criteria andActionstatusIsNull() {
            addCriterion("actionStatus is null");
            return (Criteria) this;
        }

        public Criteria andActionstatusIsNotNull() {
            addCriterion("actionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andActionstatusEqualTo(Integer value) {
            addCriterion("actionStatus =", value, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusNotEqualTo(Integer value) {
            addCriterion("actionStatus <>", value, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusGreaterThan(Integer value) {
            addCriterion("actionStatus >", value, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionStatus >=", value, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusLessThan(Integer value) {
            addCriterion("actionStatus <", value, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusLessThanOrEqualTo(Integer value) {
            addCriterion("actionStatus <=", value, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusIn(List<Integer> values) {
            addCriterion("actionStatus in", values, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusNotIn(List<Integer> values) {
            addCriterion("actionStatus not in", values, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusBetween(Integer value1, Integer value2) {
            addCriterion("actionStatus between", value1, value2, "actionstatus");
            return (Criteria) this;
        }

        public Criteria andActionstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("actionStatus not between", value1, value2, "actionstatus");
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