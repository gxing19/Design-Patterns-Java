package com.designpatterns.structural.bridge.simple;

/**
 * @author gxing
 * @desc 客户端
 * @date 2021/6/18
 */
public class Client {

    public static void main(String[] args) {
        ConcreteImplementor concreteImplementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(concreteImplementor);
        abstraction.operation();
    }
}
