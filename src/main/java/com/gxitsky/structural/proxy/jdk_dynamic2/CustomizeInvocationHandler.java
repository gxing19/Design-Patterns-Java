package com.gxitsky.structural.proxy.jdk_dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现InvocationHandler接口方式
 */
public class CustomizeInvocationHandler implements InvocationHandler {

    // 目标对象,即被代理对象
    private Object target;

    public CustomizeInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 重写invoke()方法
     *
     * @param proxy  代理对象
     * @param method 被代理对象的方法
     * @param args   被代理对象的方法入参
     * @return Object
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("transaction begin....");
        Object object = method.invoke(target, args);
        System.out.println("transaction end....");
        return object;
    }

}
