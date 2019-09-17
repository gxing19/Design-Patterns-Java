package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.product.TopLevelCar;

/**
 * 产品具体工厂
 *
 * 生产高配汽车
 */
public class TopLevelCarFactory extends AbstractCarFactory {

    @Override
    public TopLevelCar createCar() {
        return new TopLevelCar();
    }
}
