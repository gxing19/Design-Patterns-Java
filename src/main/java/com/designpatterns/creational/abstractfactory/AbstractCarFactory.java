package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Car;

/**
 * 产品工厂公共抽象
 */
public abstract class AbstractCarFactory {

    /**
     * 公共接口
     * @return
     */
    public abstract Car createTopCar();

    public abstract Car createSeniorCar();

}
