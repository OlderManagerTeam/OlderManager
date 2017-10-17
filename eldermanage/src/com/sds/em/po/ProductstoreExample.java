package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class ProductstoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductstoreExample() {
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

        public Criteria andStoreidIsNull() {
            addCriterion("storeId is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeId =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeId <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeId >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeId >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeId <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeId <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeId in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeId not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeId between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeId not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidIsNull() {
            addCriterion("storeProductId is null");
            return (Criteria) this;
        }

        public Criteria andStoreproductidIsNotNull() {
            addCriterion("storeProductId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreproductidEqualTo(Integer value) {
            addCriterion("storeProductId =", value, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidNotEqualTo(Integer value) {
            addCriterion("storeProductId <>", value, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidGreaterThan(Integer value) {
            addCriterion("storeProductId >", value, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeProductId >=", value, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidLessThan(Integer value) {
            addCriterion("storeProductId <", value, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidLessThanOrEqualTo(Integer value) {
            addCriterion("storeProductId <=", value, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidIn(List<Integer> values) {
            addCriterion("storeProductId in", values, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidNotIn(List<Integer> values) {
            addCriterion("storeProductId not in", values, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidBetween(Integer value1, Integer value2) {
            addCriterion("storeProductId between", value1, value2, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStoreproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeProductId not between", value1, value2, "storeproductid");
            return (Criteria) this;
        }

        public Criteria andStorecountIsNull() {
            addCriterion("storeCount is null");
            return (Criteria) this;
        }

        public Criteria andStorecountIsNotNull() {
            addCriterion("storeCount is not null");
            return (Criteria) this;
        }

        public Criteria andStorecountEqualTo(Integer value) {
            addCriterion("storeCount =", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotEqualTo(Integer value) {
            addCriterion("storeCount <>", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountGreaterThan(Integer value) {
            addCriterion("storeCount >", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeCount >=", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLessThan(Integer value) {
            addCriterion("storeCount <", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLessThanOrEqualTo(Integer value) {
            addCriterion("storeCount <=", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountIn(List<Integer> values) {
            addCriterion("storeCount in", values, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotIn(List<Integer> values) {
            addCriterion("storeCount not in", values, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountBetween(Integer value1, Integer value2) {
            addCriterion("storeCount between", value1, value2, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotBetween(Integer value1, Integer value2) {
            addCriterion("storeCount not between", value1, value2, "storecount");
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