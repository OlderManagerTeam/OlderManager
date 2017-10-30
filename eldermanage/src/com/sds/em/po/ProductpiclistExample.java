package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class ProductpiclistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductpiclistExample() {
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

        public Criteria andPpicidIsNull() {
            addCriterion("ppicId is null");
            return (Criteria) this;
        }

        public Criteria andPpicidIsNotNull() {
            addCriterion("ppicId is not null");
            return (Criteria) this;
        }

        public Criteria andPpicidEqualTo(Integer value) {
            addCriterion("ppicId =", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidNotEqualTo(Integer value) {
            addCriterion("ppicId <>", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidGreaterThan(Integer value) {
            addCriterion("ppicId >", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppicId >=", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidLessThan(Integer value) {
            addCriterion("ppicId <", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidLessThanOrEqualTo(Integer value) {
            addCriterion("ppicId <=", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidIn(List<Integer> values) {
            addCriterion("ppicId in", values, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidNotIn(List<Integer> values) {
            addCriterion("ppicId not in", values, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidBetween(Integer value1, Integer value2) {
            addCriterion("ppicId between", value1, value2, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidNotBetween(Integer value1, Integer value2) {
            addCriterion("ppicId not between", value1, value2, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPproductidIsNull() {
            addCriterion("pproductid is null");
            return (Criteria) this;
        }

        public Criteria andPproductidIsNotNull() {
            addCriterion("pproductid is not null");
            return (Criteria) this;
        }

        public Criteria andPproductidEqualTo(Integer value) {
            addCriterion("pproductid =", value, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidNotEqualTo(Integer value) {
            addCriterion("pproductid <>", value, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidGreaterThan(Integer value) {
            addCriterion("pproductid >", value, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pproductid >=", value, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidLessThan(Integer value) {
            addCriterion("pproductid <", value, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidLessThanOrEqualTo(Integer value) {
            addCriterion("pproductid <=", value, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidIn(List<Integer> values) {
            addCriterion("pproductid in", values, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidNotIn(List<Integer> values) {
            addCriterion("pproductid not in", values, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidBetween(Integer value1, Integer value2) {
            addCriterion("pproductid between", value1, value2, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("pproductid not between", value1, value2, "pproductid");
            return (Criteria) this;
        }

        public Criteria andPpicurlIsNull() {
            addCriterion("ppicUrl is null");
            return (Criteria) this;
        }

        public Criteria andPpicurlIsNotNull() {
            addCriterion("ppicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPpicurlEqualTo(Integer value) {
            addCriterion("ppicUrl =", value, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlNotEqualTo(Integer value) {
            addCriterion("ppicUrl <>", value, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlGreaterThan(Integer value) {
            addCriterion("ppicUrl >", value, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppicUrl >=", value, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlLessThan(Integer value) {
            addCriterion("ppicUrl <", value, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlLessThanOrEqualTo(Integer value) {
            addCriterion("ppicUrl <=", value, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlIn(List<Integer> values) {
            addCriterion("ppicUrl in", values, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlNotIn(List<Integer> values) {
            addCriterion("ppicUrl not in", values, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlBetween(Integer value1, Integer value2) {
            addCriterion("ppicUrl between", value1, value2, "ppicurl");
            return (Criteria) this;
        }

        public Criteria andPpicurlNotBetween(Integer value1, Integer value2) {
            addCriterion("ppicUrl not between", value1, value2, "ppicurl");
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