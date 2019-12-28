package com.designpatterns.creational.builder.builder;

public abstract class Builder {

    public void buildPartA(){}
    public void buildPartB(){}
    public abstract Product getResult();
}
