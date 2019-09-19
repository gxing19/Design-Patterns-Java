package com.designpatterns.creational.abstractfactory.product;

/**
 * 具体产品
 * 高配
 */
public class FUTETruck implements ITruck {

    @Override
    public void show() {
        System.out.println("this is a fute truck");
    }
}
