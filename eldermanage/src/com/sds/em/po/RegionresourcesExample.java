package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class RegionresourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionresourcesExample() {
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

        public Criteria andRegionresourcesidIsNull() {
            addCriterion("regionResourcesId is null");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidIsNotNull() {
            addCriterion("regionResourcesId is not null");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidEqualTo(Integer value) {
            addCriterion("regionResourcesId =", value, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidNotEqualTo(Integer value) {
            addCriterion("regionResourcesId <>", value, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidGreaterThan(Integer value) {
            addCriterion("regionResourcesId >", value, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("regionResourcesId >=", value, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidLessThan(Integer value) {
            addCriterion("regionResourcesId <", value, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidLessThanOrEqualTo(Integer value) {
            addCriterion("regionResourcesId <=", value, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidIn(List<Integer> values) {
            addCriterion("regionResourcesId in", values, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidNotIn(List<Integer> values) {
            addCriterion("regionResourcesId not in", values, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidBetween(Integer value1, Integer value2) {
            addCriterion("regionResourcesId between", value1, value2, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesidNotBetween(Integer value1, Integer value2) {
            addCriterion("regionResourcesId not between", value1, value2, "regionresourcesid");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameIsNull() {
            addCriterion("regionResourcesrName is null");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameIsNotNull() {
            addCriterion("regionResourcesrName is not null");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameEqualTo(String value) {
            addCriterion("regionResourcesrName =", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameNotEqualTo(String value) {
            addCriterion("regionResourcesrName <>", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameGreaterThan(String value) {
            addCriterion("regionResourcesrName >", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameGreaterThanOrEqualTo(String value) {
            addCriterion("regionResourcesrName >=", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameLessThan(String value) {
            addCriterion("regionResourcesrName <", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameLessThanOrEqualTo(String value) {
            addCriterion("regionResourcesrName <=", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameLike(String value) {
            addCriterion("regionResourcesrName like", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameNotLike(String value) {
            addCriterion("regionResourcesrName not like", value, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameIn(List<String> values) {
            addCriterion("regionResourcesrName in", values, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameNotIn(List<String> values) {
            addCriterion("regionResourcesrName not in", values, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameBetween(String value1, String value2) {
            addCriterion("regionResourcesrName between", value1, value2, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andRegionresourcesrnameNotBetween(String value1, String value2) {
            addCriterion("regionResourcesrName not between", value1, value2, "regionresourcesrname");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidIsNull() {
            addCriterion("resourcesDroitId is null");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidIsNotNull() {
            addCriterion("resourcesDroitId is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidEqualTo(Integer value) {
            addCriterion("resourcesDroitId =", value, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidNotEqualTo(Integer value) {
            addCriterion("resourcesDroitId <>", value, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidGreaterThan(Integer value) {
            addCriterion("resourcesDroitId >", value, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resourcesDroitId >=", value, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidLessThan(Integer value) {
            addCriterion("resourcesDroitId <", value, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidLessThanOrEqualTo(Integer value) {
            addCriterion("resourcesDroitId <=", value, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidIn(List<Integer> values) {
            addCriterion("resourcesDroitId in", values, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidNotIn(List<Integer> values) {
            addCriterion("resourcesDroitId not in", values, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidBetween(Integer value1, Integer value2) {
            addCriterion("resourcesDroitId between", value1, value2, "resourcesdroitid");
            return (Criteria) this;
        }

        public Criteria andResourcesdroitidNotBetween(Integer value1, Integer value2) {
            addCriterion("resourcesDroitId not between", value1, value2, "resourcesdroitid");
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