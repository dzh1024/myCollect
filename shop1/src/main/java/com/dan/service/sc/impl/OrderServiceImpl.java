package com.dan.service.sc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.mapper.TbOrderMapper;
import com.dan.pojo.Order;
import com.dan.service.sc.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private TbOrderMapper tbOrderMapper;

	@Override
	public int findOrderCount() {
		int count = tbOrderMapper.findOrderCount();
		return count;
	}

	@Override
	public List<Order> findOrderDetail() {
		List<Order> list = tbOrderMapper.findOrderDetail();
		return list;
	}
}
