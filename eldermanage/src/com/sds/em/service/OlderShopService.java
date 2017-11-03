package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Product;

public interface OlderShopService {
	
	public Message addProduct(Product product) throws Exception;
	public Message getproductlist(int producttypenumber) throws Exception;
	public Message getproductinfo(int productid);
	public Message getproductrate(int productid);
	public Message product(Product product);
}
