package com.gxitsky.creational.abstract_factory;

import com.gxitsky.creational.abstract_factory.product.BYDBus;
import com.gxitsky.creational.abstract_factory.product.BYDTruck;
import com.gxitsky.creational.abstract_factory.product.IBus;
import com.gxitsky.creational.abstract_factory.product.ITruck;

/**
 * 比亚迪汽车工厂
 */
public class BYDCarFactory implements AbstractCarFactory {

    @Override
    public IBus createBus() {
        return new BYDBus();
    }

    @Override
    public ITruck createTruck() {
        return new BYDTruck();
    }
}
