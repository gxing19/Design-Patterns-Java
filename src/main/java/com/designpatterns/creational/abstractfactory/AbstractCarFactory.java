package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.IBus;
import com.designpatterns.creational.abstractfactory.product.ITruck;

/**
 * 产品工厂公共抽象
 */
public interface AbstractCarFactory {

    /**
     * 公共接口
     *
     * @return
     */
    IBus createBus();

    ITruck createTruck();

}
