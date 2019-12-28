package com.designpatterns.creational.abstract_factory;

import com.designpatterns.creational.abstract_factory.product.IBus;
import com.designpatterns.creational.abstract_factory.product.ITruck;

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
