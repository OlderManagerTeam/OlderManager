package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class ProducttypetwoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProducttypetwoExample() {
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

        public Criteria andTypetwoidIsNull() {
            addCriterion("typeTwoId is null");
            return (Criteria) this;
        }

        public Criteria andTypetwoidIsNotNull() {
            addCriterion("typeTwoId is not null");
            return (Criteria) this;
        }

        public Criteria andTypetwoidEqualTo(Integer value) {
            addCriterion("typeTwoId =", value, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidNotEqualTo(Integer value) {
            addCriterion("typeTwoId <>", value, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidGreaterThan(Integer value) {
            addCriterion("typeTwoId >", value, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeTwoId >=", value, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidLessThan(Integer value) {
            addCriterion("typeTwoId <", value, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidLessThanOrEqualTo(Integer value) {
            addCriterion("typeTwoId <=", value, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidIn(List<Integer> values) {
            addCriterion("typeTwoId in", values, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidNotIn(List<Integer> values) {
            addCriterion("typeTwoId not in", values, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidBetween(Integer value1, Integer value2) {
            addCriterion("typeTwoId between", value1, value2, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwoidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeTwoId not between", value1, value2, "typetwoid");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentIsNull() {
            addCriterion("typeTwoContent is null");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentIsNotNull() {
            addCriterion("typeTwoContent is not null");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentEqualTo(String value) {
            addCriterion("typeTwoContent =", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentNotEqualTo(String value) {
            addCriterion("typeTwoContent <>", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentGreaterThan(String value) {
            addCriterion("typeTwoContent >", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentGreaterThanOrEqualTo(String value) {
            addCriterion("typeTwoContent >=", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentLessThan(String value) {
            addCriterion("typeTwoContent <", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentLessThanOrEqualTo(String value) {
            addCriterion("typeTwoContent <=", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentLike(String value) {
            addCriterion("typeTwoContent like", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentNotLike(String value) {
            addCriterion("typeTwoContent not like", value, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentIn(List<String> values) {
            addCriterion("typeTwoContent in", values, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentNotIn(List<String> values) {
            addCriterion("typeTwoContent not in", values, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentBetween(String value1, String value2) {
            addCriterion("typeTwoContent between", value1, value2, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwocontentNotBetween(String value1, String value2) {
            addCriterion("typeTwoContent not between", value1, value2, "typetwocontent");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidIsNull() {
            addCriterion("typeTwoTypeId is null");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidIsNotNull() {
            addCriterion("typeTwoTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidEqualTo(Integer value) {
            addCriterion("typeTwoTypeId =", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidNotEqualTo(Integer value) {
            addCriterion("typeTwoTypeId <>", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidGreaterThan(Integer value) {
            addCriterion("typeTwoTypeId >", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeTwoTypeId >=", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidLessThan(Integer value) {
            addCriterion("typeTwoTypeId <", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeTwoTypeId <=", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidIn(List<Integer> values) {
            addCriterion("typeTwoTypeId in", values, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidNotIn(List<Integer> values) {
            addCriterion("typeTwoTypeId not in", values, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeTwoTypeId between", value1, value2, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeTwoTypeId not between", value1, value2, "typetwotypeid");
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