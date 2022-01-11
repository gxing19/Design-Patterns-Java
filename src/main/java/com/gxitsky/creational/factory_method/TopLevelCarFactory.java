package com.gxitsky.creational.factory_method;

import com.gxitsky.creational.factory_method.product.TopLevelCar;

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
