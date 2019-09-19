package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.FUTEBus;
import com.designpatterns.creational.abstractfactory.product.FUTETruck;
import com.designpatterns.creational.abstractfactory.product.IBus;
import com.designpatterns.creational.abstractfactory.product.ITruck;

/**
 * 福特汽车工厂
 */
public class FuTeCarFactory implements AbstractCarFactory {

    @Override
    public IBus createBus() {
        return new FUTEBus();
    }

    @Override
    public ITruck createTruck() {
        return new FUTETruck();
    }
}