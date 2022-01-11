package com.gxitsky.structural.proxy.static_proxy1;

/**
 * @desc 代理模式 之 静态代理 -- StaticProxy代理类<br>
 * StaticProxy，在代理模式中，叫做代理类，增强StaticProxyImpl实现类<br>
 * 一个代理类，也实现了接口，是增强版的实现类
 * @author gxing
 * @date 2021/11/3 14:26
 */
public class UserServiceProxy implements UserService {

	private UserService userService;

	public UserServiceProxy(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 重写被代理目标对象的方法
	 */
	@Override
	public void queryInfo() {
		// 事务处理之前，可以执行一段代码
		System.out.println("事务处理之前...");
		// 调用委托类的方法
		userService.queryInfo();
		// 事务处理之后，可以执行一段代码
		System.out.println("事务处理之后...");
	}

}
