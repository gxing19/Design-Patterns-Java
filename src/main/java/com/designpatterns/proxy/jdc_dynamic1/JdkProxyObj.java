package com.designpatterns.proxy.jdc_dynamic1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyObj {

    //目标对象，即实现接口的目标类
    private Object obj;

    //将目标对象做为参数传入构造方法
    public JdkProxyObj(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取代理对象
     * 传入InvocationHandler，重写invoke方法
     * 扩展功能在invoke方法里执行
     *
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //给目标对象方法传入的参数
                        /*for (Object param : args) {
                            System.out.println(param);
                        }*/
                        System.out.println("开始事务。。。。。");
                        //执行目标对象方法
                        Object methodValue = method.invoke(obj, args);
                        System.out.println("结束事务。。。。。");
                        return methodValue;
                    }
                });
    }

}
