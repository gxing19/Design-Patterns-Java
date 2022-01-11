package com.gxitsky.structural.bridge.adapter;

/**
 * @author gxing
 * @desc 具体实现角色
 * @date 2021/6/21
 */
public class ConcreteImplementor implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("-----> 具体实现角色");
    }
}
