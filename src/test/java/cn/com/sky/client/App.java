package cn.com.sky.client;

import cn.com.sky.service.UserService;

import com.caucho.hessian.client.HessianProxyFactory;

public class App {
	public static void main(String[] args) throws Exception {
		
		HessianProxyFactory factory = new HessianProxyFactory();

		String url = "http://127.0.0.1:3389/hessian/user";

		UserService us = (UserService) factory.create(UserService.class, url);

		System.out.println(us.getById(123l));
		System.out.println(us.get());
	}
}