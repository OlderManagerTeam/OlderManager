package com.sds.em.shop.pojo;

import com.sds.em.po.Product;

//商品及有关此商品的量信息
public class ProductAmount extends Product {
	int storecount;
	int storedaybrowse;
	int storemonthbrowse;
	int storedaysales;
	int storemonthsales;
	
	int storetotalsales;
	

	public int getStoretotalsales() {
		return storetotalsales;
	}

	public void setStoretotalsales(int storetotalsales) {
		this.storetotalsales = storetotalsales;
	}

	public int getStorecount() {
		return storecount;
	}

	public void setStorecount(int storecount) {
		this.storecount = storecount;
	}

	public int getStoredaybrowse() {
		return storedaybrowse;
	}

	public void setStoredaybrowse(int storedaybrowse) {
		this.storedaybrowse = storedaybrowse;
	}

	public int getStoremonthbrowse() {
		return storemonthbrowse;
	}

	public void setStoremonthbrowse(int storemonthbrowse) {
		this.storemonthbrowse = storemonthbrowse;
	}

	public int getStoredaysales() {
		return storedaysales;
	}

	public void setStoredaysales(int storedaysales) {
		this.storedaysales = storedaysales;
	}

	public int getStoremonthsales() {
		return storemonthsales;
	}

	public void setStoremonthsales(int storemonthsales) {
		this.storemonthsales = storemonthsales;
	}

}
