package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Car;

/**
 * 福特汽车工厂
 */
public class FuTeCarFactory extends AbstractCarFactory {

    @Override
    public Car createTopCar() {
        return null;
    }

    @Override
    public Car createSeniorCar() {
        return null;
    }
}