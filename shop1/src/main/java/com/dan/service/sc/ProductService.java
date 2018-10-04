package com.dan.service.sc;

import java.util.List;

import com.dan.pojo.Product;

/**
 * 二级分类的业务层代码
 */

public interface ProductService {
	
	public List<Product> findHotProduct();
	
	public int findProductCount();

	public List<Product> findProductDetail();
	
	public List<Product> findProListByCsid(String csid,String page);
}
