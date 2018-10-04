package com.dan.service.sc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.mapper.TbProductMapper;
import com.dan.pojo.Product;
import com.dan.service.sc.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private TbProductMapper tbProductMapper;

	@Override
	public List<Product> findHotProduct() {
		List<Product> list = tbProductMapper.findHotProduct();
		return list;
	}
	
	@Override
	public int findProductCount() {
		int count = tbProductMapper.findProductCount();
		return count;
	}

	@Override
	public List<Product> findProductDetail() {
		List<Product> list = tbProductMapper.findProductDetail();
		return list;
	}

	@Override
	public List<Product> findProListByCsid(String csid, String page) {
		List<Product> list = tbProductMapper.findProListByCsid(csid,page);
		return list;
	}

}
