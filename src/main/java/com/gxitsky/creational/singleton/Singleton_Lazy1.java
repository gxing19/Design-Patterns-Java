package com.gxitsky.creational.singleton;

/**
 * @name: Singleton_Lazy1
 * @desc: 懒汉式:先判断实例是否存在,不存在则创建,线程不安全
 **/
public class Singleton_Lazy1 {

    // 1.声明一个引用，不创建对象
    private static Singleton_Lazy1 instance;

    // 2.私有构造方法，其他类不能访问该构造方法，也就不能通过构造方法来创建对象
    private Singleton_Lazy1() {
    }

    // 3.返回实例
    public static Singleton_Lazy1 getInstance() {
        // 每次都得判断，浪费时间
        if (instance == null) {
            // 在多线程的情况下，线程执行权可能被抢走，
            // 线程1等待，线程2执行创建对象；线程1醒来创建对象，就不是单例了
            instance = new Singleton_Lazy1();
        }
        return instance;
    }
}