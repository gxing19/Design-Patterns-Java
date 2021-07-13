package com.designpatterns.structural.flyweight;

/**
 * @author gxing
 * @desc 具体享元
 * @date 2021/7/13
 */
@KeyAnnotation(key = "keyB")
public class ConcreteFlyweightB implements Flyweight {

    private String key;

    public ConcreteFlyweightB(String key) {
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println("ConcreteFlyweightB:" + outState.getInfo());
    }
}
