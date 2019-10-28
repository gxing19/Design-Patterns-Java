package com.designpatterns.creational.builderpattern.familybarrel;

/**
 * 产品部件：汉堡
 */
public class Hamburger {

    //类型：鸡肉,牛肉,鳕鱼
    private String flavor;

    public Hamburger(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public Hamburger setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }
}
