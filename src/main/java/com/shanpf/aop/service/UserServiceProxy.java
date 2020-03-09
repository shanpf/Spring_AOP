package com.shanpf.aop.service;

import com.shanpf.aop.vo.User;

/**
 * 静态代理类
 * 	1>要和目标保持一致,要和目标保持统一接口
 * 	2>组成：目标+额外功能
* @Title: UserServiceProxy.java
* @Package com.shanpf.aop.service
* @Description: 代替UserServiceImpl打理 的额外功能
* @author shanpf
* @date 2020年3月9日 下午3:12:27
* @version V1.0
 */
public class UserServiceProxy implements IUserService {
	//原始业务
	private IUserService userService = new UserServiceImpl();

	public String insertUser(User user) {
		System.out.println("额外功能");
		return userService.insertUser(user);
	}

	public User queryOne(String id) {
		System.out.println("额外功能");
		return userService.queryOne(id);

	}

}
