package com.designpatterns.structural.proxy.static_proxy1;

/**
 * @desc 代理模式 之 静态代理<br>
 *     静态代理：指由程序员创建或特定工具自动生成源代码，再对其进行编译。在程序运行前，代理类的.class文件就已经存在了。
 *     静态代理组成要素: 1.一个接口, 2.一个接口实现类, 3.一个代理类，也实现接口，是增强版的接口实现类
 * @author gxing
 * @date 2021/11/3 14:27
 */
public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        //将要代理的目标对象作为参数传入代理类的构造方法
        userService = new UserServiceProxy(userService);
        //代理类对象调用重写接口的方法
        userService.queryInfo();
    }

}

/*
 * 静态代理的一个缺点就是：我们需要为每一个接口生成一个代理类，也就是一个接口必然要对应一个代理类。
 * 这样必然会生成很多的代理类，并且这些代理类的代码有很多重复的部分。
 * 解决这一问题，最好的办法就是通过一个代理类 完成全部的代理功能，此时就要使用动态代理。
 */