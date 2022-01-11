package com.gxitsky.structural.bridge.full;

/**
 * @author gxing
 * @desc 抽象化角色
 * @date 2021/6/18
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}
