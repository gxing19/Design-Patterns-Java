package com.designpatterns.creational.abstract_factory.product;

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
