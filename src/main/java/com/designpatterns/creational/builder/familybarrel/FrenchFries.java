package com.designpatterns.creational.builder.familybarrel;

/**
 * 产品部件：署条
 */
public class FrenchFries {

    //容量
    private String capacity;

    public FrenchFries(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public FrenchFries setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
}
