package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Product;

public interface OlderShopService {
	
	public Message addProduct(Product product) throws Exception;
	public Message getproductlist(int producttypenumber) throws Exception;
	public Message getproductinfo(int productid);
	public Message getproductrate(int productid);
	public Message product(Product product);
	public Message productalter(Product product);
	public Message productdelete(int productid);
	public Message getorders();
	public Message getordersrate(int ordersid);
	public Message deleteorder(int ordersid);
	public Message orderok(int ordersid);
	public Message ordercancel(int ordersid);
	public Message getproductstore();
	public Message addproductstore(int productid, int productcount);
}
