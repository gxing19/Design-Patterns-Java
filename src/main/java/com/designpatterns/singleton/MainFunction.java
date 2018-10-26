package com.designpatterns.singleton;

/**
 * @name: MainFunction
 * @desc: TODO
 * @author: gxing
 * @date: 2018-10-26 13:57
 **/
public class MainFunction {

    public static void main(String[] args) {

        Singleton_Enum instance = Singleton_Enum.getInstance();
        Singleton_Enum instance1 = Singleton_Enum.INSTANCE;
        System.out.println(instance == instance1);

    }

}