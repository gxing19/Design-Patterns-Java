package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Bus;
import com.designpatterns.creational.abstractfactory.product.Truck;

/**
 * 福特汽车工厂
 */
public class FuTeCarFactory implements AbstractCarFactory {

    @Override
    public Bus createBus() {
        System.out.println("福特工厂--> 生产巴士......");
        return new Bus();
    }

    @Override
    public Truck createTruck() {
        System.out.println("福特工厂--> 生成卡车......");
        return new Truck();
    }
}