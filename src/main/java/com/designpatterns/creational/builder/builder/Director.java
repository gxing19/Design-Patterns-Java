package com.designpatterns.creational.builder.builder;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
