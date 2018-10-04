package com.dan.service.sc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.mapper.TbCategorySecondMapper;
import com.dan.pojo.CategorySecond;
import com.dan.service.sc.CategorySecondService;

@Service
public class CategorySecondServiceImpl implements CategorySecondService{
	// 注入Dao
	@Autowired
	private TbCategorySecondMapper tbCategorySecondMapper;
	
	@Override
	public int findCSCount() {
		int count = tbCategorySecondMapper.findCSCount();
		return count;
	}

	@Override
	public List<CategorySecond> findCSDetail() {
		List<CategorySecond> list = tbCategorySecondMapper.findCsDetail();
		return list;
	}

}
