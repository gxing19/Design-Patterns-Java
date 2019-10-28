package com.designpatterns.creational.builderpattern.familybarrel;

public class Director {

    public void construct(Builder builder) {
        builder.buildCocaCola();
        builder.buildDrumstick();
        builder.buildFrenchFires();
        builder.buildHamburger();
        builder.buildPie();
    }
}
