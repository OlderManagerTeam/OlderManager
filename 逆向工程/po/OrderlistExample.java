package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOrderlistidIsNull() {
            addCriterion("orderListId is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistidIsNotNull() {
            addCriterion("orderListId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistidEqualTo(Integer value) {
            addCriterion("orderListId =", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidNotEqualTo(Integer value) {
            addCriterion("orderListId <>", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidGreaterThan(Integer value) {
            addCriterion("orderListId >", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderListId >=", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidLessThan(Integer value) {
            addCriterion("orderListId <", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidLessThanOrEqualTo(Integer value) {
            addCriterion("orderListId <=", value, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidIn(List<Integer> values) {
            addCriterion("orderListId in", values, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidNotIn(List<Integer> values) {
            addCriterion("orderListId not in", values, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidBetween(Integer value1, Integer value2) {
            addCriterion("orderListId between", value1, value2, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderListId not between", value1, value2, "orderlistid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidIsNull() {
            addCriterion("orderListFId is null");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidIsNotNull() {
            addCriterion("orderListFId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidEqualTo(Integer value) {
            addCriterion("orderListFId =", value, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidNotEqualTo(Integer value) {
            addCriterion("orderListFId <>", value, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidGreaterThan(Integer value) {
            addCriterion("orderListFId >", value, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderListFId >=", value, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidLessThan(Integer value) {
            addCriterion("orderListFId <", value, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidLessThanOrEqualTo(Integer value) {
            addCriterion("orderListFId <=", value, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidIn(List<Integer> values) {
            addCriterion("orderListFId in", values, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidNotIn(List<Integer> values) {
            addCriterion("orderListFId not in", values, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidBetween(Integer value1, Integer value2) {
            addCriterion("orderListFId between", value1, value2, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderlistfidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderListFId not between", value1, value2, "orderlistfid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIsNull() {
            addCriterion("orderProductId is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIsNotNull() {
            addCriterion("orderProductId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductidEqualTo(Integer value) {
            addCriterion("orderProductId =", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotEqualTo(Integer value) {
            addCriterion("orderProductId <>", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidGreaterThan(Integer value) {
            addCriterion("orderProductId >", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderProductId >=", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLessThan(Integer value) {
            addCriterion("orderProductId <", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLessThanOrEqualTo(Integer value) {
            addCriterion("orderProductId <=", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIn(List<Integer> values) {
            addCriterion("orderProductId in", values, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotIn(List<Integer> values) {
            addCriterion("orderProductId not in", values, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidBetween(Integer value1, Integer value2) {
            addCriterion("orderProductId between", value1, value2, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderProductId not between", value1, value2, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountIsNull() {
            addCriterion("orderProductCount is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountIsNotNull() {
            addCriterion("orderProductCount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountEqualTo(Integer value) {
            addCriterion("orderProductCount =", value, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountNotEqualTo(Integer value) {
            addCriterion("orderProductCount <>", value, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountGreaterThan(Integer value) {
            addCriterion("orderProductCount >", value, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderProductCount >=", value, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountLessThan(Integer value) {
            addCriterion("orderProductCount <", value, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountLessThanOrEqualTo(Integer value) {
            addCriterion("orderProductCount <=", value, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountIn(List<Integer> values) {
            addCriterion("orderProductCount in", values, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountNotIn(List<Integer> values) {
            addCriterion("orderProductCount not in", values, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountBetween(Integer value1, Integer value2) {
            addCriterion("orderProductCount between", value1, value2, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderproductcountNotBetween(Integer value1, Integer value2) {
            addCriterion("orderProductCount not between", value1, value2, "orderproductcount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountIsNull() {
            addCriterion("orderDiscount is null");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountIsNotNull() {
            addCriterion("orderDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountEqualTo(Float value) {
            addCriterion("orderDiscount =", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountNotEqualTo(Float value) {
            addCriterion("orderDiscount <>", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountGreaterThan(Float value) {
            addCriterion("orderDiscount >", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("orderDiscount >=", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountLessThan(Float value) {
            addCriterion("orderDiscount <", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountLessThanOrEqualTo(Float value) {
            addCriterion("orderDiscount <=", value, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountIn(List<Float> values) {
            addCriterion("orderDiscount in", values, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountNotIn(List<Float> values) {
            addCriterion("orderDiscount not in", values, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountBetween(Float value1, Float value2) {
            addCriterion("orderDiscount between", value1, value2, "orderdiscount");
            return (Criteria) this;
        }

        public Criteria andOrderdiscountNotBetween(Float value1, Float value2) {
            addCriterion("orderDiscount not between", value1, value2, "orderdiscount");
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