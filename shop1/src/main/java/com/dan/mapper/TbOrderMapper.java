package com.dan.mapper;

import java.util.List;
import com.dan.pojo.Order;

public interface TbOrderMapper {
	public int findOrderCount();
	public List<Order> findOrderDetail();
}
