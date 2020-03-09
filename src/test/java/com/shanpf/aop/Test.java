package com.shanpf.aop;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.shanpf.aop.service.IUserService;
import com.shanpf.aop.service.UserServiceImpl;
import com.shanpf.aop.vo.User;

public class Test {

	@org.junit.Test
	public void test() {
		IUserService userService = new UserServiceImpl();
		InvocationHandler ih = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("额外功能");
				method.invoke(userService, args);
				return null;
			}
		};
		IUserService proxy = (IUserService) Proxy.newProxyInstance(Test.class.getClassLoader(),userService.getClass().getInterfaces(), ih);
		proxy.queryOne("1");
		System.out.println("----------------");
		proxy.insertUser(new User());
	}

}
