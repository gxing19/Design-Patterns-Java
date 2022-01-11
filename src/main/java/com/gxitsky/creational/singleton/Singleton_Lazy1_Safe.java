package com.gxitsky.creational.singleton;

/**
 * @name: Singleton_Lazy1_Safe
 * @desc: 懒汉式:使用synchronized同步方法解决线程安全问题
 **/
public class Singleton_Lazy1_Safe {

    private static Singleton_Lazy1_Safe instance;

    private Singleton_Lazy1_Safe() {
    }

    // 方法加锁,但效率低
    public static synchronized Singleton_Lazy1_Safe getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy1_Safe();
        }
        return instance;
    }
}