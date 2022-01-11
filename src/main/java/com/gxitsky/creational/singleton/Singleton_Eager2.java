package com.gxitsky.creational.singleton;

/**
 * @name: Singleton_Eager2
 * @desc: 饿汉式变种:引用变量使用final修饰，其它类不可以修改此变量的值
 */
public class Singleton_Eager2 {

    //1.引用变量使用 final修饰，不可改变值
    public static final Singleton_Eager2 instance = new Singleton_Eager2();

    //2.私有构造方法，其他类不能访问该构造方法，也就不能通过构造方法来创建对象
    private Singleton_Eager2() {
    }

    // 返回实体
    public static Singleton_Eager2 getInstance() {
        return instance;
    }
}