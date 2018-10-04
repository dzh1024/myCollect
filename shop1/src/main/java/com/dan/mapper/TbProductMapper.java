package com.dan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dan.pojo.Product;

public interface TbProductMapper {
	public List<Product> findHotProduct();

	public int findProductCount();

	public List<Product> findProductDetail();

	public List<Product> findProListByCsid(@Param("csid") String csid, @Param("page") String page);
}
