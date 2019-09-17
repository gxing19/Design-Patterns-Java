package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Bus;
import com.designpatterns.creational.abstractfactory.product.Truck;

/**
 * 产品工厂公共抽象
 */
public interface AbstractCarFactory {

    /**
     * 公共接口
     *
     * @return
     */
    Bus createBus();

    Truck createTruck();

}
