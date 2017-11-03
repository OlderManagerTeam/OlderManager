package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderproductviewMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.mapper.ProducttypeMapper;
import com.sds.em.mapper.ProducttypetwoMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Product;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductstoreExample;
import com.sds.em.po.ProductstoreExample.Criteria;
import com.sds.em.service.ShopViewFrontService;
import com.sds.em.shop.pojo.ProductAmount;
import com.sds.em.shop.pojo.productGradeExtend;
import com.sds.em.shop.pojo.productGradeExtend;

public class ShopViewFrontServiceImpl implements ShopViewFrontService {
	@Autowired
	ProductstoreMapper productstoreMapper;
	@Autowired
	ProductMapper productMapper;

	@Autowired
	ProducttypeMapper producttypeMapper;
	@Autowired
	ProducttypetwoMapper producttypetwoMapper;

	@Autowired
	OlderproductviewMapper olderproductviewMapper;

	@Autowired
	ProductrateMapper productrateMapper;

	@Override
	public Message todayRecommend() throws Exception {
		try {
			List<Product> productList = productMapper.todayRecommend();
			if (productList != null) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message typeRecommend(String typecontent) throws Exception {
		try {
			List<Product> productList = productMapper.typeRecommend(typecontent);
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message productSearch(String info) throws Exception {
		try {
			List<Product> productList = productMapper.productSearch(info);

			List<ProductAmount> amountList = new ArrayList<ProductAmount>();

			for (Product i : productList) {
				ProductAmount productAmount = new ProductAmount();
				productAmount = productMapper.productSearchId(i.getProductid());
				amountList.add(productAmount);
			}
			if (!amountList.isEmpty()) {
				return new Message(true, "返回成功", amountList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message productSearchSort(String info, String sort) throws Exception {
		try {
			List<ProductAmount> productList = null;
			if (sort.equals("销量排序")) {
				productList = productMapper.productSearchSortA(info);
			} else if (sort.equals("价格优先")) {
				productList = productMapper.productSearchSortP(info);
			} else if (sort.equals("评价为主")) {

			}
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message typeTwoProducts(String typetwocontent) throws Exception {
		try {
			List<ProductAmount> amountList = productMapper.typeTwoRecommend(typetwocontent);
			if (!amountList.isEmpty()) {
				return new Message(true, "返回成功", amountList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getProduct(int productid) throws Exception {
		try {
			ProductAmount productAmount = new ProductAmount();
			productAmount = productMapper.productSearchId(productid);
			if (productAmount != null) {
				return new Message(true, "返回成功", productAmount);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message repeatedView() throws Exception {
		try {
			List<Product> productList = productMapper.repeatedView();
			if (productList != null) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message repeatedOlderView(int olderid) throws Exception {
		try {
			List<Product> productList = olderproductviewMapper.repeatedOlderView(olderid);
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message getProductGrade(int productid) {
		try {
			List<Productrate> rateList = productrateMapper.getProductRateInfo(productid);
			int totalRate = rateList.size();
			int highRate = 0;
			int mediumRate = 0;
			int badRate = 0;

			double avg = 0.0;
			for (Productrate p : rateList) {
				if (p.getRatestar() >= 4) {
					highRate++;
				} else if (p.getRatestar() <= 2) {
					badRate++;
				} else {
					mediumRate++;
				}
				avg = avg+(p.getRatestar() / 5.0);
			}
			String percent =""+(int)((avg / totalRate)*100);

			productGradeExtend productGradeExtend = new productGradeExtend();
			productGradeExtend.setPercent(percent);
			productGradeExtend.setBadRate(badRate);
			productGradeExtend.setHighRate(highRate);
			productGradeExtend.setMediumRate(mediumRate);
			productGradeExtend.setTotalRate(totalRate);
			if (productGradeExtend != null) {
				return new Message(true, "返回成功", productGradeExtend);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getProductRateInfo(int productid) {
		try {
			List<Productrate> rateList = productrateMapper.getProductRateInfo(productid);
			if (!rateList.isEmpty()) {
				return new Message(true, "返回成功", rateList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

}
