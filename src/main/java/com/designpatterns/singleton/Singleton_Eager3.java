package com.designpatterns.singleton;

/**
 * @name: Singleton_Hungry3
 * @desc: 饿汉式变种:静态代码块的方式创建实例,与 Hungry1_Singleton 类似
 **/
public class Singleton_Eager3 {

    private static Singleton_Eager3 instance = null;

    //静态代码块的方式
    static {
        instance = new Singleton_Eager3();
    }

    private Singleton_Eager3() {
    }

    public static Singleton_Eager3 getInstance() {
        return instance;
    }
}