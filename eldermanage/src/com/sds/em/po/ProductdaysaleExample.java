package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andPdsidIsNull() {
            addCriterion("pdsid is null");
            return (Criteria) this;
        }

        public Criteria andPdsidIsNotNull() {
            addCriterion("pdsid is not null");
            return (Criteria) this;
        }

        public Criteria andPdsidEqualTo(Long value) {
            addCriterion("pdsid =", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidNotEqualTo(Long value) {
            addCriterion("pdsid <>", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidGreaterThan(Long value) {
            addCriterion("pdsid >", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidGreaterThanOrEqualTo(Long value) {
            addCriterion("pdsid >=", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidLessThan(Long value) {
            addCriterion("pdsid <", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidLessThanOrEqualTo(Long value) {
            addCriterion("pdsid <=", value, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidIn(List<Long> values) {
            addCriterion("pdsid in", values, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidNotIn(List<Long> values) {
            addCriterion("pdsid not in", values, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidBetween(Long value1, Long value2) {
            addCriterion("pdsid between", value1, value2, "pdsid");
            return (Criteria) this;
        }

        public Criteria andPdsidNotBetween(Long value1, Long value2) {
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
            addCriterion("pdsdaydate =", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateNotEqualTo(Date value) {
            addCriterion("pdsdaydate <>", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateGreaterThan(Date value) {
            addCriterion("pdsdaydate >", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("pdsdaydate >=", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateLessThan(Date value) {
            addCriterion("pdsdaydate <", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateLessThanOrEqualTo(Date value) {
            addCriterion("pdsdaydate <=", value, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateIn(List<Date> values) {
            addCriterion("pdsdaydate in", values, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateNotIn(List<Date> values) {
            addCriterion("pdsdaydate not in", values, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateBetween(Date value1, Date value2) {
            addCriterion("pdsdaydate between", value1, value2, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andPdsdaydateNotBetween(Date value1, Date value2) {
            addCriterion("pdsdaydate not between", value1, value2, "pdsdaydate");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseIsNull() {
            addCriterion("storeDayBrowse is null");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseIsNotNull() {
            addCriterion("storeDayBrowse is not null");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseEqualTo(Integer value) {
            addCriterion("storeDayBrowse =", value, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseNotEqualTo(Integer value) {
            addCriterion("storeDayBrowse <>", value, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseGreaterThan(Integer value) {
            addCriterion("storeDayBrowse >", value, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeDayBrowse >=", value, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseLessThan(Integer value) {
            addCriterion("storeDayBrowse <", value, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseLessThanOrEqualTo(Integer value) {
            addCriterion("storeDayBrowse <=", value, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseIn(List<Integer> values) {
            addCriterion("storeDayBrowse in", values, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseNotIn(List<Integer> values) {
            addCriterion("storeDayBrowse not in", values, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseBetween(Integer value1, Integer value2) {
            addCriterion("storeDayBrowse between", value1, value2, "storedaybrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaybrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("storeDayBrowse not between", value1, value2, "storedaybrowse");
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