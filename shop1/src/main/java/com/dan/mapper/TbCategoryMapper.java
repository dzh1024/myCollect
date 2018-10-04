package com.dan.mapper;

import java.util.List;

import com.dan.pojo.Category;

public interface TbCategoryMapper {
	public int findCategoryCount();

	public List<Category> findCategoryDetail();
}
