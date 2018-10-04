package com.dan.service.sc;

import java.util.List;

import com.dan.pojo.Category;


/**
 * 二级分类的业务层代码
 */

public interface CategoryService {
	public int findCategoryCount();
	public List<Category> findCategoryDetail();

}
