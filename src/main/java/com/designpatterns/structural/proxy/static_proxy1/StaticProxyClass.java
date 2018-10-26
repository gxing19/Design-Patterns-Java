package com.designpatterns.structural.proxy.static_proxy1;

/**
 * @description 代理模式 之 静态代理 -- StaticProxy代理类
 * @description StaticProxy，在代理模式中，叫做代理类，增强StaticProxyImpl实现类
 * @description 一个代理类，也实现了接口，是增强版的实现类
 */
public class StaticProxyClass implements UserService {

	private UserServiceImpl userServiceImpl;

	public StaticProxyClass(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	/**
	 * 重写被代理目标对象的方法
	 */
	@Override
	public void queryInfo() {
		// 事务处理之前，可以执行一段代码
		System.out.println("事务处理之前...");
		// 调用委托类的方法
		userServiceImpl.queryInfo();
		// 事务处理之后，可以执行一段代码
		System.out.println("事务处理之后...");
	}

}
