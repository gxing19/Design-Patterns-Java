package com.gxitsky.creational.factory_method;

import com.gxitsky.creational.factory_method.product.Car;

/**
 * 产品工厂公共抽象
 */
public abstract class AbstractCarFactory {

    /**
     * 公共接口
     * @return
     */
    public abstract Car createCar();

}
