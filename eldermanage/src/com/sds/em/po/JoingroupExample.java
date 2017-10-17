package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JoingroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JoingroupExample() {
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

        public Criteria andJoingroupidIsNull() {
            addCriterion("joinGroupId is null");
            return (Criteria) this;
        }

        public Criteria andJoingroupidIsNotNull() {
            addCriterion("joinGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andJoingroupidEqualTo(Integer value) {
            addCriterion("joinGroupId =", value, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidNotEqualTo(Integer value) {
            addCriterion("joinGroupId <>", value, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidGreaterThan(Integer value) {
            addCriterion("joinGroupId >", value, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinGroupId >=", value, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidLessThan(Integer value) {
            addCriterion("joinGroupId <", value, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidLessThanOrEqualTo(Integer value) {
            addCriterion("joinGroupId <=", value, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidIn(List<Integer> values) {
            addCriterion("joinGroupId in", values, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidNotIn(List<Integer> values) {
            addCriterion("joinGroupId not in", values, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidBetween(Integer value1, Integer value2) {
            addCriterion("joinGroupId between", value1, value2, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoingroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("joinGroupId not between", value1, value2, "joingroupid");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNull() {
            addCriterion("joinId is null");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNotNull() {
            addCriterion("joinId is not null");
            return (Criteria) this;
        }

        public Criteria andJoinidEqualTo(Integer value) {
            addCriterion("joinId =", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotEqualTo(Integer value) {
            addCriterion("joinId <>", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThan(Integer value) {
            addCriterion("joinId >", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinId >=", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThan(Integer value) {
            addCriterion("joinId <", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThanOrEqualTo(Integer value) {
            addCriterion("joinId <=", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidIn(List<Integer> values) {
            addCriterion("joinId in", values, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotIn(List<Integer> values) {
            addCriterion("joinId not in", values, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidBetween(Integer value1, Integer value2) {
            addCriterion("joinId between", value1, value2, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotBetween(Integer value1, Integer value2) {
            addCriterion("joinId not between", value1, value2, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidIsNull() {
            addCriterion("joinOlderId is null");
            return (Criteria) this;
        }

        public Criteria andJoinolderidIsNotNull() {
            addCriterion("joinOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andJoinolderidEqualTo(Integer value) {
            addCriterion("joinOlderId =", value, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidNotEqualTo(Integer value) {
            addCriterion("joinOlderId <>", value, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidGreaterThan(Integer value) {
            addCriterion("joinOlderId >", value, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinOlderId >=", value, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidLessThan(Integer value) {
            addCriterion("joinOlderId <", value, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidLessThanOrEqualTo(Integer value) {
            addCriterion("joinOlderId <=", value, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidIn(List<Integer> values) {
            addCriterion("joinOlderId in", values, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidNotIn(List<Integer> values) {
            addCriterion("joinOlderId not in", values, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidBetween(Integer value1, Integer value2) {
            addCriterion("joinOlderId between", value1, value2, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoinolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("joinOlderId not between", value1, value2, "joinolderid");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("joinDate is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("joinDate is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(Date value) {
            addCriterionForJDBCDate("joinDate =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("joinDate <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(Date value) {
            addCriterionForJDBCDate("joinDate >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joinDate >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(Date value) {
            addCriterionForJDBCDate("joinDate <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joinDate <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<Date> values) {
            addCriterionForJDBCDate("joinDate in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("joinDate not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joinDate between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joinDate not between", value1, value2, "joindate");
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