package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class OlderproductviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderproductviewExample() {
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

        public Criteria andProductviewidIsNull() {
            addCriterion("productviewID is null");
            return (Criteria) this;
        }

        public Criteria andProductviewidIsNotNull() {
            addCriterion("productviewID is not null");
            return (Criteria) this;
        }

        public Criteria andProductviewidEqualTo(Integer value) {
            addCriterion("productviewID =", value, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidNotEqualTo(Integer value) {
            addCriterion("productviewID <>", value, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidGreaterThan(Integer value) {
            addCriterion("productviewID >", value, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productviewID >=", value, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidLessThan(Integer value) {
            addCriterion("productviewID <", value, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidLessThanOrEqualTo(Integer value) {
            addCriterion("productviewID <=", value, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidIn(List<Integer> values) {
            addCriterion("productviewID in", values, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidNotIn(List<Integer> values) {
            addCriterion("productviewID not in", values, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidBetween(Integer value1, Integer value2) {
            addCriterion("productviewID between", value1, value2, "productviewid");
            return (Criteria) this;
        }

        public Criteria andProductviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("productviewID not between", value1, value2, "productviewid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidIsNull() {
            addCriterion("pviewproductID is null");
            return (Criteria) this;
        }

        public Criteria andPviewproductidIsNotNull() {
            addCriterion("pviewproductID is not null");
            return (Criteria) this;
        }

        public Criteria andPviewproductidEqualTo(Integer value) {
            addCriterion("pviewproductID =", value, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidNotEqualTo(Integer value) {
            addCriterion("pviewproductID <>", value, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidGreaterThan(Integer value) {
            addCriterion("pviewproductID >", value, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pviewproductID >=", value, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidLessThan(Integer value) {
            addCriterion("pviewproductID <", value, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidLessThanOrEqualTo(Integer value) {
            addCriterion("pviewproductID <=", value, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidIn(List<Integer> values) {
            addCriterion("pviewproductID in", values, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidNotIn(List<Integer> values) {
            addCriterion("pviewproductID not in", values, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidBetween(Integer value1, Integer value2) {
            addCriterion("pviewproductID between", value1, value2, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("pviewproductID not between", value1, value2, "pviewproductid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidIsNull() {
            addCriterion("pviewolderid is null");
            return (Criteria) this;
        }

        public Criteria andPviewolderidIsNotNull() {
            addCriterion("pviewolderid is not null");
            return (Criteria) this;
        }

        public Criteria andPviewolderidEqualTo(Integer value) {
            addCriterion("pviewolderid =", value, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidNotEqualTo(Integer value) {
            addCriterion("pviewolderid <>", value, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidGreaterThan(Integer value) {
            addCriterion("pviewolderid >", value, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pviewolderid >=", value, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidLessThan(Integer value) {
            addCriterion("pviewolderid <", value, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidLessThanOrEqualTo(Integer value) {
            addCriterion("pviewolderid <=", value, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidIn(List<Integer> values) {
            addCriterion("pviewolderid in", values, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidNotIn(List<Integer> values) {
            addCriterion("pviewolderid not in", values, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidBetween(Integer value1, Integer value2) {
            addCriterion("pviewolderid between", value1, value2, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("pviewolderid not between", value1, value2, "pviewolderid");
            return (Criteria) this;
        }

        public Criteria andPviewocountIsNull() {
            addCriterion("pviewocount is null");
            return (Criteria) this;
        }

        public Criteria andPviewocountIsNotNull() {
            addCriterion("pviewocount is not null");
            return (Criteria) this;
        }

        public Criteria andPviewocountEqualTo(Integer value) {
            addCriterion("pviewocount =", value, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountNotEqualTo(Integer value) {
            addCriterion("pviewocount <>", value, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountGreaterThan(Integer value) {
            addCriterion("pviewocount >", value, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pviewocount >=", value, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountLessThan(Integer value) {
            addCriterion("pviewocount <", value, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountLessThanOrEqualTo(Integer value) {
            addCriterion("pviewocount <=", value, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountIn(List<Integer> values) {
            addCriterion("pviewocount in", values, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountNotIn(List<Integer> values) {
            addCriterion("pviewocount not in", values, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountBetween(Integer value1, Integer value2) {
            addCriterion("pviewocount between", value1, value2, "pviewocount");
            return (Criteria) this;
        }

        public Criteria andPviewocountNotBetween(Integer value1, Integer value2) {
            addCriterion("pviewocount not between", value1, value2, "pviewocount");
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