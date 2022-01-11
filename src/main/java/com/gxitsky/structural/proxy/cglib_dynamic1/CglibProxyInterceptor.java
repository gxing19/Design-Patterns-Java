package com.gxitsky.structural.proxy.cglib_dynamic1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyInterceptor implements MethodInterceptor {
    //被代理的目标类
    private Object obj;

    public CglibProxyInterceptor(Object obj) {
        this.obj = obj;
    }

    //创建代理对象
    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        //指定需要创建子类的父类
        enhancer.setSuperclass(obj.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] objArr, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib transaction begin...");
        //执行方法,调的是父类的方法，代理对象是目标对象的子类
        methodProxy.invokeSuper(obj, objArr);
        System.out.println("cglib transaction end...");
        return null;
    }
}
