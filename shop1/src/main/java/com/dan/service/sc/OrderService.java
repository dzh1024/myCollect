package com.dan.service.sc;

import java.util.List;
import com.dan.pojo.Order;

/**
 * 订单业务层代码
 */

public interface OrderService {
	public int findOrderCount();
	public List<Order> findOrderDetail();

}
