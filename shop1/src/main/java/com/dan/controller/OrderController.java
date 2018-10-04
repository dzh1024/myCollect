package com.dan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dan.pojo.Order;
import com.dan.service.sc.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping("/count")
	@ResponseBody
	public int getCScount() {
		int count = orderService.findOrderCount();
		return count;
	}

	@RequestMapping("/orderDetail")
	@ResponseBody
	public List<Order> getCsDetail() {
		List<Order> list = orderService.findOrderDetail();
		return list;
	}
}
