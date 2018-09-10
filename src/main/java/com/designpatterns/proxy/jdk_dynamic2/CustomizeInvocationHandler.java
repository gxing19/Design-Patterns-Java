package com.designpatterns.proxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现InvocationHandler接口方式
 */
public class CustomizeInvocationHandler implements InvocationHandler {

    private Object target;

    public CustomizeInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 重写invoke()方法
     * @param proxy
     * @param method
     * @param args
     * @return
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
