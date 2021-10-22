package com.designpatterns.structural.flyweight;

/**
 * @author gxing
 * @desc 具体享元
 * @date 2021/7/13
 */
@KeyAnnotation(key = "keyB")
public class ConcreteFlyweightB implements Flyweight {

    // 内部状态
    private static String innerState = "infoB";

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println("ConcreteFlyweightB:" + outState.getOutState());
    }
}
