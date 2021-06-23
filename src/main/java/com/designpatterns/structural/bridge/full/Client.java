package com.designpatterns.structural.bridge.full;

/**
 * @author gxing
 * @desc 客户端
 * @date 2021/6/18
 */
public class Client {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
