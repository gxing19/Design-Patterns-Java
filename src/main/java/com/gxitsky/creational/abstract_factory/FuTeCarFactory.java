package com.gxitsky.creational.abstract_factory;

import com.gxitsky.creational.abstract_factory.product.FUTEBus;
import com.gxitsky.creational.abstract_factory.product.FUTETruck;
import com.gxitsky.creational.abstract_factory.product.IBus;
import com.gxitsky.creational.abstract_factory.product.ITruck;

/**
 * 福特汽车工厂
 */
public class FuTeCarFactory implements AbstractCarFactory {

    @Override
    public IBus createBus() {
        return new FUTEBus();
    }

    @Override
    public ITruck createTruck() {
        return new FUTETruck();
    }
}