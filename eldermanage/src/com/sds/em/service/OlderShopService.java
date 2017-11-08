package com.sds.em.service;

import java.util.List;

import com.sds.em.po.Message;
import com.sds.em.po.Product;
import com.sds.em.po.Productgroup;
import com.sds.em.po.Productpiclist;
import com.sds.em.po.Productviewlist;

public interface OlderShopService {
	
	public Message addProduct(Product product) throws Exception;
	public Message getproductlist(int producttypenumber) throws Exception;
	public Message getproductinfo(int productid);
	public Message getproductrate(int productid);
	public Message product(Product product, List<Productpiclist> productpiclist, List<Productviewlist> productviewlist);
	public Message productalter(Product product);
	public Message productdelete(int productid);
	public Message getorders();
	public Message getordersrate(int ordersid);
	public Message deleteorder(int ordersid);
	public Message orderok(int ordersid);
	public Message ordercancel(int ordersid);
	public Message getproductstore();
	public Message addproductstore(int productid, int productcount);
	public Message getproductgroup();
	public Message deleteproductgroup(int groupid);
	public Message ordersproductgroup(int groupid);
	public Message productgroupjoin(int groupid);
	public Message getorderlist(int orderid);
	public Message addproductgroup(Productgroup productgroup);
}
