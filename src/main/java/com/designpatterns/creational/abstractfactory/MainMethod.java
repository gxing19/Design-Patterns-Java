package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.IBus;
import com.designpatterns.creational.abstractfactory.product.ITruck;

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
