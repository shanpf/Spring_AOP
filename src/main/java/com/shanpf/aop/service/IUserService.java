package com.shanpf.aop.service;

import com.shanpf.aop.vo.User;

public interface IUserService {
	public String insertUser(User user);

	public User queryOne(String id);
}
