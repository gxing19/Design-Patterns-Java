package com.gxitsky.structural.flyweight;

/**
 * @author gxing
 * @desc 享元角色
 * @date 2021/7/13
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight state);
}
