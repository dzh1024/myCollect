package com.dan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dan.pojo.CategorySecond;
import com.dan.service.sc.CategorySecondService;

@Controller
@RequestMapping("/secondCategory")
public class SecondCategoryController {
	@Autowired
	private CategorySecondService categorySecondService;

	@RequestMapping("/CScount")
	@ResponseBody
	public int getCScount() {
		int count = categorySecondService.findCSCount();
		return count;
	}

	@RequestMapping("/CsDetail")
	@ResponseBody
	public List<CategorySecond> getCsDetail() {
		System.out.println("---------");
		List<CategorySecond> list = categorySecondService.findCSDetail();
		return list;
	}

	@RequestMapping("/abc")
	@ResponseBody
	public String abc() {
		System.out.println("---------");
		System.out.println("++++++++++++++++");
		return "abcdef";
	}
}
