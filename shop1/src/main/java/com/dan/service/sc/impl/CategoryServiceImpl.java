package com.dan.service.sc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.mapper.TbCategoryMapper;
import com.dan.pojo.Category;
import com.dan.service.sc.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private TbCategoryMapper tbCategoryMapper;
	
	@Override
	public int findCategoryCount() {
		int count = tbCategoryMapper.findCategoryCount();
		return count;
	}

	@Override
	public List<Category> findCategoryDetail() {
		List<Category> list = tbCategoryMapper.findCategoryDetail();
		return list;
	}

}
