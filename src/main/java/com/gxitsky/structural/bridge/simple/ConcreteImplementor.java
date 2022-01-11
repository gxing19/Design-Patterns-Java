package com.gxitsky.structural.bridge.simple;

/**
 * @author gxing
 * @desc 只有一个具体实现化类, 可以省略掉抽象实现化类
 * @date 2021/6/18
 */
public class ConcreteImplementor {
    public void operationImpl() {
        System.out.println("-----> 具体实现操作 Implementor");
    }
}
