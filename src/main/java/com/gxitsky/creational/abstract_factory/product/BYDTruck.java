package com.gxitsky.creational.abstract_factory.product;

/**
 * 具体产品
 * 高配
 */
public class BYDTruck implements ITruck {

    @Override
    public void show() {
        System.out.println("this is a byd truck");
    }
}
