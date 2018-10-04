package com.dan.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.sevice.UserInfoService;

//@Controller
@RestController
public class RegisterController {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/register")
	public String register(HttpServletRequest requests) {
		String id = UUID.randomUUID().toString().replace("-", "");
		System.out.println(id);
		ByteSource salt = ByteSource.Util.bytes("USERNAME");

		String newPs = new SimpleHash("MD5", "123456", salt, 2).toHex();
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("id", id);
		dataMap.put("username", "zhdan");
		dataMap.put("name", "");
		dataMap.put("password", newPs);
		dataMap.put("salt", salt.toHex());

		// 看数据库中是否存在该账户
//		Map<String, Object> userInfo = queryInfoByUsername(username);
//		if (userInfo == null) {
		userInfoService.insertDataService(dataMap);
//		}

		return "HHEHE";
	}
}
