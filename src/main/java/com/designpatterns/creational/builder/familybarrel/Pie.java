package com.designpatterns.creational.builder.familybarrel;

/**
 * 产品部件：派
 */
public class Pie {

    //口味：菠萝，香芋，蜜桃
    private String flavor;

    public Pie(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public Pie setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }
}
