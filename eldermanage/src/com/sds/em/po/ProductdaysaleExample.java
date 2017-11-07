package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductdaysaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductdaysaleExample() {
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

        public Criteria andPdsidIsNull() {
            addCriterion("pdsid is null");
            return (Criteria) this;
        }

        public Criteria andPdsidIsNotNull() {
            addCriterion("pdsid is not null");
            return (Criteria) this;
        }

        public Criteria andPdsidEqualTo(Integer value) {
            addCriterion("pdsid =", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidNotEqualTo(Integer value) {
            addCriterion("pdsid <>", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidGreaterThan(Integer value) {
            addCriterion("pdsid >", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdsid >=", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidLessThan(Integer value) {
            addCriterion("pdsid <", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidLessThanOrEqualTo(Integer value) {
            addCriterion("pdsid <=", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidIn(List<Integer> values) {
            addCriterion("pdsid in", values, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidNotIn(List<Integer> values) {
            addCriterion("pdsid not in", values, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidBetween(Integer value1, Integer value2) {
            addCriterion("pdsid between", value1, value2, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidNotBetween(Integer value1, Integer value2) {
            addCriterion("pdsid not between", value1, value2, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidIsNull() {
            addCriterion("pdsproductid is null");
            return (Criteria) this;
        }

        public Criteria andPdsproductidIsNotNull() {
            addCriterion("pdsproductid is not null");
            return (Criteria) this;
        }

        public Criteria andPdsproductidEqualTo(Integer value) {
            addCriterion("pdsproductid =", value, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidNotEqualTo(Integer value) {
            addCriterion("pdsproductid <>", value, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidGreaterThan(Integer value) {
            addCriterion("pdsproductid >", value, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdsproductid >=", value, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidLessThan(Integer value) {
            addCriterion("pdsproductid <", value, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidLessThanOrEqualTo(Integer value) {
            addCriterion("pdsproductid <=", value, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidIn(List<Integer> values) {
            addCriterion("pdsproductid in", values, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidNotIn(List<Integer> values) {
            addCriterion("pdsproductid not in", values, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidBetween(Integer value1, Integer value2) {
            addCriterion("pdsproductid between", value1, value2, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("pdsproductid not between", value1, value2, "pdsproductid");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleIsNull() {
            addCriterion("pdsdaysale is null");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleIsNotNull() {
            addCriterion("pdsdaysale is not null");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleEqualTo(Integer value) {
            addCriterion("pdsdaysale =", value, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleNotEqualTo(Integer value) {
            addCriterion("pdsdaysale <>", value, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleGreaterThan(Integer value) {
            addCriterion("pdsdaysale >", value, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdsdaysale >=", value, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleLessThan(Integer value) {
            addCriterion("pdsdaysale <", value, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleLessThanOrEqualTo(Integer value) {
            addCriterion("pdsdaysale <=", value, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleIn(List<Integer> values) {
            addCriterion("pdsdaysale in", values, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleNotIn(List<Integer> values) {
            addCriterion("pdsdaysale not in", values, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleBetween(Integer value1, Integer value2) {
            addCriterion("pdsdaysale between", value1, value2, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaysaleNotBetween(Integer value1, Integer value2) {
            addCriterion("pdsdaysale not between", value1, value2, "pdsdaysale");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateIsNull() {
            addCriterion("pdsdaydate is null");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateIsNotNull() {
            addCriterion("pdsdaydate is not null");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateEqualTo(Date value) {
            addCriterionForJDBCDate("pdsdaydate =", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pdsdaydate <>", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateGreaterThan(Date value) {
            addCriterionForJDBCDate("pdsdaydate >", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pdsdaydate >=", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateLessThan(Date value) {
            addCriterionForJDBCDate("pdsdaydate <", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pdsdaydate <=", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateIn(List<Date> values) {
            addCriterionForJDBCDate("pdsdaydate in", values, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pdsdaydate not in", values, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pdsdaydate between", value1, value2, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pdsdaydate not between", value1, value2, "pdsdaydate");
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