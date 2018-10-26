package com.designpatterns.singleton;

/**
 * @name: Singleton_DoubleSyn
 * @desc: 双重校验锁
 **/
public class Singleton_DoubleSyn {

    private static volatile Singleton_DoubleSyn instance;

    private Singleton_DoubleSyn() {
    }

    public static Singleton_DoubleSyn getInstance() {
        if (instance == null) {
            synchronized (Singleton_DoubleSyn.class) {
                if (instance == null) {
                    instance = new Singleton_DoubleSyn();
                }
            }
        }
        return instance;
    }
}