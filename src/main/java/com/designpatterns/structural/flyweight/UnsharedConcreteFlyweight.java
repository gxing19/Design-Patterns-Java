package com.designpatterns.structural.flyweight;

/**
 * @author gxing
 * @desc 非享元角色
 * @date 2021/7/13
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
