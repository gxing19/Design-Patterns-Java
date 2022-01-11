package com.gxitsky.structural.bridge.full;

/**
 * @author gxing
 * @desc 具体实现
 * @date 2021/6/18
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("-----> 具体实现操作 ConcreteImplementorB");
    }
}
