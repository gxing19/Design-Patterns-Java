package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Bus;
import com.designpatterns.creational.abstractfactory.product.Truck;

public class MainMethod {

    public static void main(String[] args) {

        AbstractCarFactory byd = new BYDCarFactory();
        Bus bydBus = byd.createBus();
        Truck bydTruck = byd.createTruck();
        bydBus.show();
        bydTruck.show();

        AbstractCarFactory fute = new FuTeCarFactory();
        Bus futeBus = byd.createBus();
        Truck futeTruck = byd.createTruck();
        futeBus.show();
        futeTruck.show();
    }
}
