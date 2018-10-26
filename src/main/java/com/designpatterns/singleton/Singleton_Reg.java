package com.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @name: Singleton_Reg
 * @desc: 登记式单模式, 是对一组单例进行维护
 **/
public class Singleton_Reg {

    private Singleton_Reg() {
    }

    private static Map<String, Singleton_Reg> singletonMap = new HashMap<>();

    // 静态代码块
    static {
        Singleton_Reg instance = new Singleton_Reg();
        singletonMap.put(instance.getClass().getName(), instance);
    }

    // 静态工厂方法，返回唯一登记，有则取出，没有则存入
    public static Singleton_Reg getInstance(String className) {
        if (className == null) {
            className = "com.demo.SingletonReg";
        }
        if (!singletonMap.containsKey(className)) {
            try {
                singletonMap.put(className, (Singleton_Reg) Class.forName(className).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return singletonMap.get(className);
    }
}