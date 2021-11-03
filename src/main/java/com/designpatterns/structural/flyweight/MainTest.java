package com.designpatterns.structural.flyweight;

import java.lang.reflect.InvocationTargetException;

/**
 * @author gxing
 * @desc
 * @date 2021/7/13
 */
public class MainTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Flyweight flyweight = FlyweightFactory.getFlyweight("keyA");
//        flyweight.operation(new UnsharedConcreteFlyweight("Hello"));
//        System.out.println();

        FlyweightFactorySingleton factory = FlyweightFactorySingleton.getFactory();
        Flyweight flyweight = factory.getFlyweight("keyA");
        flyweight.operation(new UnsharedConcreteFlyweight("Hello"));

    }
}
