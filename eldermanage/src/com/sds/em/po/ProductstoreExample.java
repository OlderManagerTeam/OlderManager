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

        public Criteria andStoremonthbrowseIsNull() {
            addCriterion("storeMonthBrowse is null");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseIsNotNull() {
            addCriterion("storeMonthBrowse is not null");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseEqualTo(Integer value) {
            addCriterion("storeMonthBrowse =", value, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseNotEqualTo(Integer value) {
            addCriterion("storeMonthBrowse <>", value, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseGreaterThan(Integer value) {
            addCriterion("storeMonthBrowse >", value, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeMonthBrowse >=", value, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseLessThan(Integer value) {
            addCriterion("storeMonthBrowse <", value, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseLessThanOrEqualTo(Integer value) {
            addCriterion("storeMonthBrowse <=", value, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseIn(List<Integer> values) {
            addCriterion("storeMonthBrowse in", values, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseNotIn(List<Integer> values) {
            addCriterion("storeMonthBrowse not in", values, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseBetween(Integer value1, Integer value2) {
            addCriterion("storeMonthBrowse between", value1, value2, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoremonthbrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("storeMonthBrowse not between", value1, value2, "storemonthbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseIsNull() {
            addCriterion("storeYearBrowse is null");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseIsNotNull() {
            addCriterion("storeYearBrowse is not null");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseEqualTo(Integer value) {
            addCriterion("storeYearBrowse =", value, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseNotEqualTo(Integer value) {
            addCriterion("storeYearBrowse <>", value, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseGreaterThan(Integer value) {
            addCriterion("storeYearBrowse >", value, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeYearBrowse >=", value, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseLessThan(Integer value) {
            addCriterion("storeYearBrowse <", value, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseLessThanOrEqualTo(Integer value) {
            addCriterion("storeYearBrowse <=", value, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseIn(List<Integer> values) {
            addCriterion("storeYearBrowse in", values, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseNotIn(List<Integer> values) {
            addCriterion("storeYearBrowse not in", values, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseBetween(Integer value1, Integer value2) {
            addCriterion("storeYearBrowse between", value1, value2, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoreyearbrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("storeYearBrowse not between", value1, value2, "storeyearbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseIsNull() {
            addCriterion("storeTotalBrowse is null");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseIsNotNull() {
            addCriterion("storeTotalBrowse is not null");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseEqualTo(Integer value) {
            addCriterion("storeTotalBrowse =", value, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseNotEqualTo(Integer value) {
            addCriterion("storeTotalBrowse <>", value, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseGreaterThan(Integer value) {
            addCriterion("storeTotalBrowse >", value, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeTotalBrowse >=", value, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseLessThan(Integer value) {
            addCriterion("storeTotalBrowse <", value, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseLessThanOrEqualTo(Integer value) {
            addCriterion("storeTotalBrowse <=", value, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseIn(List<Integer> values) {
            addCriterion("storeTotalBrowse in", values, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseNotIn(List<Integer> values) {
            addCriterion("storeTotalBrowse not in", values, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseBetween(Integer value1, Integer value2) {
            addCriterion("storeTotalBrowse between", value1, value2, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoretotalbrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("storeTotalBrowse not between", value1, value2, "storetotalbrowse");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesIsNull() {
            addCriterion("storeDaySales is null");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesIsNotNull() {
            addCriterion("storeDaySales is not null");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesEqualTo(Integer value) {
            addCriterion("storeDaySales =", value, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesNotEqualTo(Integer value) {
            addCriterion("storeDaySales <>", value, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesGreaterThan(Integer value) {
            addCriterion("storeDaySales >", value, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeDaySales >=", value, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesLessThan(Integer value) {
            addCriterion("storeDaySales <", value, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesLessThanOrEqualTo(Integer value) {
            addCriterion("storeDaySales <=", value, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesIn(List<Integer> values) {
            addCriterion("storeDaySales in", values, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesNotIn(List<Integer> values) {
            addCriterion("storeDaySales not in", values, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesBetween(Integer value1, Integer value2) {
            addCriterion("storeDaySales between", value1, value2, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoredaysalesNotBetween(Integer value1, Integer value2) {
            addCriterion("storeDaySales not between", value1, value2, "storedaysales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesIsNull() {
            addCriterion("storeMonthSales is null");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesIsNotNull() {
            addCriterion("storeMonthSales is not null");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesEqualTo(Integer value) {
            addCriterion("storeMonthSales =", value, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesNotEqualTo(Integer value) {
            addCriterion("storeMonthSales <>", value, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesGreaterThan(Integer value) {
            addCriterion("storeMonthSales >", value, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeMonthSales >=", value, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesLessThan(Integer value) {
            addCriterion("storeMonthSales <", value, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesLessThanOrEqualTo(Integer value) {
            addCriterion("storeMonthSales <=", value, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesIn(List<Integer> values) {
            addCriterion("storeMonthSales in", values, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesNotIn(List<Integer> values) {
            addCriterion("storeMonthSales not in", values, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesBetween(Integer value1, Integer value2) {
            addCriterion("storeMonthSales between", value1, value2, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoremonthsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("storeMonthSales not between", value1, value2, "storemonthsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesIsNull() {
            addCriterion("storeYearSales is null");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesIsNotNull() {
            addCriterion("storeYearSales is not null");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesEqualTo(Integer value) {
            addCriterion("storeYearSales =", value, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesNotEqualTo(Integer value) {
            addCriterion("storeYearSales <>", value, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesGreaterThan(Integer value) {
            addCriterion("storeYearSales >", value, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeYearSales >=", value, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesLessThan(Integer value) {
            addCriterion("storeYearSales <", value, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesLessThanOrEqualTo(Integer value) {
            addCriterion("storeYearSales <=", value, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesIn(List<Integer> values) {
            addCriterion("storeYearSales in", values, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesNotIn(List<Integer> values) {
            addCriterion("storeYearSales not in", values, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesBetween(Integer value1, Integer value2) {
            addCriterion("storeYearSales between", value1, value2, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoreyearsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("storeYearSales not between", value1, value2, "storeyearsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesIsNull() {
            addCriterion("storeTotalSales is null");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesIsNotNull() {
            addCriterion("storeTotalSales is not null");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesEqualTo(Integer value) {
            addCriterion("storeTotalSales =", value, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesNotEqualTo(Integer value) {
            addCriterion("storeTotalSales <>", value, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesGreaterThan(Integer value) {
            addCriterion("storeTotalSales >", value, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeTotalSales >=", value, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesLessThan(Integer value) {
            addCriterion("storeTotalSales <", value, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesLessThanOrEqualTo(Integer value) {
            addCriterion("storeTotalSales <=", value, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesIn(List<Integer> values) {
            addCriterion("storeTotalSales in", values, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesNotIn(List<Integer> values) {
            addCriterion("storeTotalSales not in", values, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesBetween(Integer value1, Integer value2) {
            addCriterion("storeTotalSales between", value1, value2, "storetotalsales");
            return (Criteria) this;
        }

        public Criteria andStoretotalsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("storeTotalSales not between", value1, value2, "storetotalsales");
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