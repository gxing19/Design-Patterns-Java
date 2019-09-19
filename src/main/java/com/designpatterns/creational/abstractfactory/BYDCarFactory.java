package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.BYDBus;
import com.designpatterns.creational.abstractfactory.product.BYDTruck;
import com.designpatterns.creational.abstractfactory.product.IBus;
import com.designpatterns.creational.abstractfactory.product.ITruck;

/**
 * 比亚迪汽车工厂
 */
public class BYDCarFactory implements AbstractCarFactory {

    @Override
    public IBus createBus() {
        return new BYDBus();
    }

    @Override
    public ITruck createTruck() {
        return new BYDTruck();
    }
}
