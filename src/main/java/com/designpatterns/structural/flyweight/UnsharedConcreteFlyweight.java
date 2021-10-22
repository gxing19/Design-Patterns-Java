package com.designpatterns.structural.flyweight;

/**
 * @author gxing
 * @desc 非享元角色
 * @date 2021/7/13
 */
public class UnsharedConcreteFlyweight {

    private String outState;

    public UnsharedConcreteFlyweight(String outState) {
        this.outState = outState;
    }

    public String getOutState() {
        return outState;
    }

    public void setOutState(String outState) {
        this.outState = outState;
    }
}
