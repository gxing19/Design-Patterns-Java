package com.gxitsky.structural.proxy.static_proxy1;

/**
 * @description 代理模式 之 静态代理 -- StaticProxyImpl实现类
 * @description StaticProxyImpl，在代理模式中，叫做委托类，包含业务逻辑
 * @description 一个接口实现类
 */
public class UserServiceImpl implements UserService {

	@Override
	public void queryInfo() {
		System.out.println("代理模式 之 静态代理 -- StaticProxyImpl实现类   查看信息...");  
	}
}
