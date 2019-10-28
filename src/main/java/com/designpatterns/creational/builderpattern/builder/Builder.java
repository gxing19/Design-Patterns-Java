package com.designpatterns.creational.builderpattern.builder;

public abstract class Builder {

    public void buildPartA(){}
    public void buildPartB(){}
    public abstract Product getResult();
}
