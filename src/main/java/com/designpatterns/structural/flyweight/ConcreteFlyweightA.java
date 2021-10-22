package com.designpatterns.structural.flyweight;

/**
 * @author gxing
 * @desc 具体享元
 * @date 2021/7/13
 */
@KeyAnnotation(key = "keyA")
public class ConcreteFlyweightA implements Flyweight {

    // 内部状态
    private static String innerState = "infoA";

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println("ConcreteFlyweightA:" + outState.getOutState());
    }
}
