package com.gxitsky.creational.singleton;

/**
 * @name: Singleton_Eager1
 * @desc: 饿汉式:线程安全,类在装载时即初始化实例,实例若没用到则浪费内存)
 */
public class Singleton_Eager1 {

    //1. 创建本类对象,不想让外部修改成员变量的值，私有
    private static Singleton_Eager1 instance = new Singleton_Eager1();

    //2. 私有构造方法，其他类不能访问该构造方法，也就不能通过构造方法来创建对象
    private Singleton_Eager1() {
    }

    //3. 返回实例
    public static Singleton_Eager1 getInstance() {
        return instance;
    }
}
