package com.dan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dan.pojo.Category;
import com.dan.service.sc.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/count")
	@ResponseBody
	public int getCScount() {
		int count = categoryService.findCategoryCount();
		return count;
	}

	@RequestMapping("/catDetail")
	@ResponseBody
	public List<Category> getCsDetail() {
		List<Category> list = categoryService.findCategoryDetail();
		return list;
	}
}
