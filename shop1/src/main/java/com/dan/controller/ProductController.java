package com.dan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dan.pojo.Product;
import com.dan.service.sc.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/findHotProduct")
	@ResponseBody
	public List<Product> getNewProduct() {
		List<Product> list = productService.findHotProduct();
		return list;
	}
	

	@RequestMapping("/count")
	@ResponseBody
	public int getProCount() {
		int count = productService.findProductCount();
		return count;
	}

	@RequestMapping("/proDetail")
	@ResponseBody
	public List<Product> getProDetail() {
		List<Product> list = productService.findProductDetail();
		return list;
	}
	
	@RequestMapping("/findProListByCsid")
	@ResponseBody
	public List<Product> findProListByCsid(@RequestParam(defaultValue="1") String csid,@RequestParam(defaultValue="1") String page)  {
		List<Product> list = productService.findProListByCsid(csid,page);
		return list;
	}
}
