package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class DroitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DroitExample() {
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

        public Criteria andDroitidIsNull() {
            addCriterion("droitId is null");
            return (Criteria) this;
        }

        public Criteria andDroitidIsNotNull() {
            addCriterion("droitId is not null");
            return (Criteria) this;
        }

        public Criteria andDroitidEqualTo(Integer value) {
            addCriterion("droitId =", value, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidNotEqualTo(Integer value) {
            addCriterion("droitId <>", value, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidGreaterThan(Integer value) {
            addCriterion("droitId >", value, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("droitId >=", value, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidLessThan(Integer value) {
            addCriterion("droitId <", value, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidLessThanOrEqualTo(Integer value) {
            addCriterion("droitId <=", value, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidIn(List<Integer> values) {
            addCriterion("droitId in", values, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidNotIn(List<Integer> values) {
            addCriterion("droitId not in", values, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidBetween(Integer value1, Integer value2) {
            addCriterion("droitId between", value1, value2, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitidNotBetween(Integer value1, Integer value2) {
            addCriterion("droitId not between", value1, value2, "droitid");
            return (Criteria) this;
        }

        public Criteria andDroitnameIsNull() {
            addCriterion("droitName is null");
            return (Criteria) this;
        }

        public Criteria andDroitnameIsNotNull() {
            addCriterion("droitName is not null");
            return (Criteria) this;
        }

        public Criteria andDroitnameEqualTo(String value) {
            addCriterion("droitName =", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameNotEqualTo(String value) {
            addCriterion("droitName <>", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameGreaterThan(String value) {
            addCriterion("droitName >", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameGreaterThanOrEqualTo(String value) {
            addCriterion("droitName >=", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameLessThan(String value) {
            addCriterion("droitName <", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameLessThanOrEqualTo(String value) {
            addCriterion("droitName <=", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameLike(String value) {
            addCriterion("droitName like", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameNotLike(String value) {
            addCriterion("droitName not like", value, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameIn(List<String> values) {
            addCriterion("droitName in", values, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameNotIn(List<String> values) {
            addCriterion("droitName not in", values, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameBetween(String value1, String value2) {
            addCriterion("droitName between", value1, value2, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitnameNotBetween(String value1, String value2) {
            addCriterion("droitName not between", value1, value2, "droitname");
            return (Criteria) this;
        }

        public Criteria andDroitroleidIsNull() {
            addCriterion("droitRoleId is null");
            return (Criteria) this;
        }

        public Criteria andDroitroleidIsNotNull() {
            addCriterion("droitRoleId is not null");
            return (Criteria) this;
        }

        public Criteria andDroitroleidEqualTo(Integer value) {
            addCriterion("droitRoleId =", value, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidNotEqualTo(Integer value) {
            addCriterion("droitRoleId <>", value, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidGreaterThan(Integer value) {
            addCriterion("droitRoleId >", value, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("droitRoleId >=", value, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidLessThan(Integer value) {
            addCriterion("droitRoleId <", value, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidLessThanOrEqualTo(Integer value) {
            addCriterion("droitRoleId <=", value, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidIn(List<Integer> values) {
            addCriterion("droitRoleId in", values, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidNotIn(List<Integer> values) {
            addCriterion("droitRoleId not in", values, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidBetween(Integer value1, Integer value2) {
            addCriterion("droitRoleId between", value1, value2, "droitroleid");
            return (Criteria) this;
        }

        public Criteria andDroitroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("droitRoleId not between", value1, value2, "droitroleid");
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