package com.designpatterns.structural.bridge.adapter;

/**
 * @author gxing
 * @desc 抽象角色
 * @date 2021/6/21
 */
public abstract class Abstraction {

    protected  Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}
