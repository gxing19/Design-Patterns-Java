package com.gxitsky.structural.bridge.simple;

/**
 * @author gxing
 * @desc 抽象化角色
 * @date 2021/6/18
 */
public abstract class Abstraction {

    protected ConcreteImplementor concreteImplementor;

    public Abstraction(ConcreteImplementor concreteImplementor) {
        this.concreteImplementor = concreteImplementor;
    }

    abstract void operation();
}
