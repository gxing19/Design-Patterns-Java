package com.designpatterns.creational.builderpattern.builder;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
