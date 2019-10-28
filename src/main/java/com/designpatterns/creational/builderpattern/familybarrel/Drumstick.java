package com.designpatterns.creational.builderpattern.familybarrel;

/**
 * 产品部件：鸡腿
 */
public class Drumstick {

    //口味：盐焗，麦辣，
    private String flavor;

    public Drumstick(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public Drumstick setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

}
