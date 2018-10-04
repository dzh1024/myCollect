package com.dan.service.sc;

import java.util.List;

import com.dan.pojo.CategorySecond;

/**
 * 二级分类的业务层代码
 */

public interface CategorySecondService {
	public int findCSCount();
	public List<CategorySecond> findCSDetail();

}
