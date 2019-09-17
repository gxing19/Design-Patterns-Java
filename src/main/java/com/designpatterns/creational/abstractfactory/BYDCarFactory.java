package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Car;

/**
 * 比亚迪汽车工厂
 */
public class BYDCarFactory extends AbstractCarFactory {

    @Override
    public Car createTopCar() {
        return null;
    }

    @Override
    public Car createSeniorCar() {
        return null;
    }
}
