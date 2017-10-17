package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class BranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BranchExample() {
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

        public Criteria andBranchidIsNull() {
            addCriterion("branchId is null");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNotNull() {
            addCriterion("branchId is not null");
            return (Criteria) this;
        }

        public Criteria andBranchidEqualTo(Integer value) {
            addCriterion("branchId =", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotEqualTo(Integer value) {
            addCriterion("branchId <>", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThan(Integer value) {
            addCriterion("branchId >", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("branchId >=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThan(Integer value) {
            addCriterion("branchId <", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThanOrEqualTo(Integer value) {
            addCriterion("branchId <=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidIn(List<Integer> values) {
            addCriterion("branchId in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotIn(List<Integer> values) {
            addCriterion("branchId not in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidBetween(Integer value1, Integer value2) {
            addCriterion("branchId between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("branchId not between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchnameIsNull() {
            addCriterion("branchName is null");
            return (Criteria) this;
        }

        public Criteria andBranchnameIsNotNull() {
            addCriterion("branchName is not null");
            return (Criteria) this;
        }

        public Criteria andBranchnameEqualTo(String value) {
            addCriterion("branchName =", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotEqualTo(String value) {
            addCriterion("branchName <>", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameGreaterThan(String value) {
            addCriterion("branchName >", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameGreaterThanOrEqualTo(String value) {
            addCriterion("branchName >=", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameLessThan(String value) {
            addCriterion("branchName <", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameLessThanOrEqualTo(String value) {
            addCriterion("branchName <=", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameLike(String value) {
            addCriterion("branchName like", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotLike(String value) {
            addCriterion("branchName not like", value, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameIn(List<String> values) {
            addCriterion("branchName in", values, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotIn(List<String> values) {
            addCriterion("branchName not in", values, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameBetween(String value1, String value2) {
            addCriterion("branchName between", value1, value2, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchnameNotBetween(String value1, String value2) {
            addCriterion("branchName not between", value1, value2, "branchname");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeIsNull() {
            addCriterion("branchPostCode is null");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeIsNotNull() {
            addCriterion("branchPostCode is not null");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeEqualTo(String value) {
            addCriterion("branchPostCode =", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeNotEqualTo(String value) {
            addCriterion("branchPostCode <>", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeGreaterThan(String value) {
            addCriterion("branchPostCode >", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("branchPostCode >=", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeLessThan(String value) {
            addCriterion("branchPostCode <", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeLessThanOrEqualTo(String value) {
            addCriterion("branchPostCode <=", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeLike(String value) {
            addCriterion("branchPostCode like", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeNotLike(String value) {
            addCriterion("branchPostCode not like", value, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeIn(List<String> values) {
            addCriterion("branchPostCode in", values, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeNotIn(List<String> values) {
            addCriterion("branchPostCode not in", values, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeBetween(String value1, String value2) {
            addCriterion("branchPostCode between", value1, value2, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchpostcodeNotBetween(String value1, String value2) {
            addCriterion("branchPostCode not between", value1, value2, "branchpostcode");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridIsNull() {
            addCriterion("branchManagerId is null");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridIsNotNull() {
            addCriterion("branchManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridEqualTo(Integer value) {
            addCriterion("branchManagerId =", value, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridNotEqualTo(Integer value) {
            addCriterion("branchManagerId <>", value, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridGreaterThan(Integer value) {
            addCriterion("branchManagerId >", value, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("branchManagerId >=", value, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridLessThan(Integer value) {
            addCriterion("branchManagerId <", value, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridLessThanOrEqualTo(Integer value) {
            addCriterion("branchManagerId <=", value, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridIn(List<Integer> values) {
            addCriterion("branchManagerId in", values, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridNotIn(List<Integer> values) {
            addCriterion("branchManagerId not in", values, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridBetween(Integer value1, Integer value2) {
            addCriterion("branchManagerId between", value1, value2, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchmanageridNotBetween(Integer value1, Integer value2) {
            addCriterion("branchManagerId not between", value1, value2, "branchmanagerid");
            return (Criteria) this;
        }

        public Criteria andBranchadressIsNull() {
            addCriterion("branchAdress is null");
            return (Criteria) this;
        }

        public Criteria andBranchadressIsNotNull() {
            addCriterion("branchAdress is not null");
            return (Criteria) this;
        }

        public Criteria andBranchadressEqualTo(String value) {
            addCriterion("branchAdress =", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressNotEqualTo(String value) {
            addCriterion("branchAdress <>", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressGreaterThan(String value) {
            addCriterion("branchAdress >", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressGreaterThanOrEqualTo(String value) {
            addCriterion("branchAdress >=", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressLessThan(String value) {
            addCriterion("branchAdress <", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressLessThanOrEqualTo(String value) {
            addCriterion("branchAdress <=", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressLike(String value) {
            addCriterion("branchAdress like", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressNotLike(String value) {
            addCriterion("branchAdress not like", value, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressIn(List<String> values) {
            addCriterion("branchAdress in", values, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressNotIn(List<String> values) {
            addCriterion("branchAdress not in", values, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressBetween(String value1, String value2) {
            addCriterion("branchAdress between", value1, value2, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchadressNotBetween(String value1, String value2) {
            addCriterion("branchAdress not between", value1, value2, "branchadress");
            return (Criteria) this;
        }

        public Criteria andBranchkpiIsNull() {
            addCriterion("branchKPI is null");
            return (Criteria) this;
        }

        public Criteria andBranchkpiIsNotNull() {
            addCriterion("branchKPI is not null");
            return (Criteria) this;
        }

        public Criteria andBranchkpiEqualTo(Float value) {
            addCriterion("branchKPI =", value, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiNotEqualTo(Float value) {
            addCriterion("branchKPI <>", value, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiGreaterThan(Float value) {
            addCriterion("branchKPI >", value, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiGreaterThanOrEqualTo(Float value) {
            addCriterion("branchKPI >=", value, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiLessThan(Float value) {
            addCriterion("branchKPI <", value, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiLessThanOrEqualTo(Float value) {
            addCriterion("branchKPI <=", value, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiIn(List<Float> values) {
            addCriterion("branchKPI in", values, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiNotIn(List<Float> values) {
            addCriterion("branchKPI not in", values, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiBetween(Float value1, Float value2) {
            addCriterion("branchKPI between", value1, value2, "branchkpi");
            return (Criteria) this;
        }

        public Criteria andBranchkpiNotBetween(Float value1, Float value2) {
            addCriterion("branchKPI not between", value1, value2, "branchkpi");
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