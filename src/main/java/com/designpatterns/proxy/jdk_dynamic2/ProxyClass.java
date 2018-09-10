package com.designpatterns.proxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 执行动态代理对象的所有方法时，都会被替换成执行如下invoke方法 
 * 其中： 
 * proxy：代表动态代理对象
 * method：代表正在执行的方法
 * args：代表调用目标方法时传入的实参
 */

public class ProxyClass implements InvocationHandler {
	
	//目标对象，接口实现类
	private Object obj;

	//把目标实现类传进有参构造
	public Object getProxyObject(Object obj) {
		this.obj = obj;
		
		System.out.println(obj.getClass().getInterfaces()[0]);
		//返回代理对象，绑定的是个接口
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(), 
				this);
	}
	
	/**
	 * 重写invoke方法
	 * 扩展功能在invoke方法里执行
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("事务开启。。。。");
		result = method.invoke(obj, args);
		System.out.println("事务结束。。。。");
		return result;
	}
}
