package com.shanpf.aop.service;

import com.shanpf.aop.vo.User;

public class UserServiceImpl implements IUserService {

	@Override
	public String insertUser(User user) {
		//System.out.println("额外功能");
		System.out.println("核心功能  in insertUser");
		return "4";
	}

	@Override
	public User queryOne(String id) {
		//System.out.println("额外功能");
		System.out.println("核心功能  in queryOne");
		return new User();
	}

}
