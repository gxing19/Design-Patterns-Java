package com.designpatterns.creational.abstractfactory.animal;

public class Owl implements Animal {
    @Override
    public void show() {
        System.out.println("I'm the Owl");
    }
}
