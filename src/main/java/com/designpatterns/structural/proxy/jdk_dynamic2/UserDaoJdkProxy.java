package com.designpatterns.structural.proxy.jdk_dynamic2;

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

public class UserDaoJdkProxy<T> implements InvocationHandler {

    //目标对象，接口实现类
    private T target;

    public UserDaoJdkProxy(T target) {
        this.target = target;
    }

    //把目标实现类传进有参构造
    public Object getProxyObject() {
        //返回代理对象，绑定的是个接口
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * 重写invoke方法
     * 扩展功能在invoke方法里执行
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("事务开启。。。。");
        Object result = method.invoke(target, args);
        System.out.println("事务结束。。。。");
        return result;
    }
}
