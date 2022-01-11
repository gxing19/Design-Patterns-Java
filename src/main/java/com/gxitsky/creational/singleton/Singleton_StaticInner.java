package com.gxitsky.creational.singleton;

/**
 * @name: Singleton_StaticInner
 * @desc: 静态内部类:饿汉式和懒汉式综合模式,即保证了初始化，又保证了同步(线程安全)
 **/
public class Singleton_StaticInner {

    //内部类在第一次使用时才会被加载。
    private static class InstanceHandle {
        public static Singleton_StaticInner instance = new Singleton_StaticInner();
    }

    private Singleton_StaticInner() {
    }

    public static Singleton_StaticInner getInstance() {
        return InstanceHandle.instance;
    }
}