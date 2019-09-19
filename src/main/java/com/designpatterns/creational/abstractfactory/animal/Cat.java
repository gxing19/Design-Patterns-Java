package com.designpatterns.creational.abstractfactory.animal;

public class Cat implements Animal {
    @Override
    public void show() {
        System.out.println("I'm the Cat");
    }
}
