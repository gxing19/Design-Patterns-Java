package com.designpatterns.creational.abstract_factory;

import com.designpatterns.creational.abstract_factory.product.IBus;
import com.designpatterns.creational.abstract_factory.product.ITruck;

public class MainMethod {

    public static void main(String[] args) {

        AbstractCarFactory byd = new BYDCarFactory();
        IBus bydBus = byd.createBus();
        ITruck bydTruck = byd.createTruck();

        bydBus.show();
        bydTruck.show();

        AbstractCarFactory fute = new FuTeCarFactory();
        IBus futeBus = byd.createBus();
        ITruck futeTruck = fute.createTruck();

        futeBus.show();
        futeTruck.show();
    }
}
