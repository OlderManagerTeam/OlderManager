package com.sds.em.po;

import java.util.ArrayList;
import java.util.List;

public class NewspicturelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewspicturelistExample() {
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

        public Criteria andNewspicturelistidIsNull() {
            addCriterion("newsPictureListId is null");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidIsNotNull() {
            addCriterion("newsPictureListId is not null");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidEqualTo(Integer value) {
            addCriterion("newsPictureListId =", value, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidNotEqualTo(Integer value) {
            addCriterion("newsPictureListId <>", value, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidGreaterThan(Integer value) {
            addCriterion("newsPictureListId >", value, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsPictureListId >=", value, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidLessThan(Integer value) {
            addCriterion("newsPictureListId <", value, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidLessThanOrEqualTo(Integer value) {
            addCriterion("newsPictureListId <=", value, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidIn(List<Integer> values) {
            addCriterion("newsPictureListId in", values, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidNotIn(List<Integer> values) {
            addCriterion("newsPictureListId not in", values, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidBetween(Integer value1, Integer value2) {
            addCriterion("newsPictureListId between", value1, value2, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspicturelistidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsPictureListId not between", value1, value2, "newspicturelistid");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlIsNull() {
            addCriterion("newsPictureUrl is null");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlIsNotNull() {
            addCriterion("newsPictureUrl is not null");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlEqualTo(String value) {
            addCriterion("newsPictureUrl =", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlNotEqualTo(String value) {
            addCriterion("newsPictureUrl <>", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlGreaterThan(String value) {
            addCriterion("newsPictureUrl >", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlGreaterThanOrEqualTo(String value) {
            addCriterion("newsPictureUrl >=", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlLessThan(String value) {
            addCriterion("newsPictureUrl <", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlLessThanOrEqualTo(String value) {
            addCriterion("newsPictureUrl <=", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlLike(String value) {
            addCriterion("newsPictureUrl like", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlNotLike(String value) {
            addCriterion("newsPictureUrl not like", value, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlIn(List<String> values) {
            addCriterion("newsPictureUrl in", values, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlNotIn(List<String> values) {
            addCriterion("newsPictureUrl not in", values, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlBetween(String value1, String value2) {
            addCriterion("newsPictureUrl between", value1, value2, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureurlNotBetween(String value1, String value2) {
            addCriterion("newsPictureUrl not between", value1, value2, "newspictureurl");
            return (Criteria) this;
        }

        public Criteria andNewspictureidIsNull() {
            addCriterion("newsPictureId is null");
            return (Criteria) this;
        }

        public Criteria andNewspictureidIsNotNull() {
            addCriterion("newsPictureId is not null");
            return (Criteria) this;
        }

        public Criteria andNewspictureidEqualTo(Integer value) {
            addCriterion("newsPictureId =", value, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidNotEqualTo(Integer value) {
            addCriterion("newsPictureId <>", value, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidGreaterThan(Integer value) {
            addCriterion("newsPictureId >", value, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsPictureId >=", value, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidLessThan(Integer value) {
            addCriterion("newsPictureId <", value, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidLessThanOrEqualTo(Integer value) {
            addCriterion("newsPictureId <=", value, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidIn(List<Integer> values) {
            addCriterion("newsPictureId in", values, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidNotIn(List<Integer> values) {
            addCriterion("newsPictureId not in", values, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidBetween(Integer value1, Integer value2) {
            addCriterion("newsPictureId between", value1, value2, "newspictureid");
            return (Criteria) this;
        }

        public Criteria andNewspictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsPictureId not between", value1, value2, "newspictureid");
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