package com.gxitsky.structural.bridge.adapter;

/**
 * @author gxing
 * @desc
 * @date 2021/6/21
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Implementor implementor = new ObjectAdapter(adaptee);
        Abstraction abstraction = new RefinedAbstract(implementor);
        abstraction.operation();
    }
}
