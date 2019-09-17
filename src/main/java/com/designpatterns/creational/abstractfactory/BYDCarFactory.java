package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.product.Bus;
import com.designpatterns.creational.abstractfactory.product.Truck;

/**
 * 比亚迪汽车工厂
 */
public class BYDCarFactory implements AbstractCarFactory {

    @Override
    public Bus createBus() {
        System.out.println("比亚迪工厂--> 生产巴士......");
        return new Bus();
    }

    @Override
    public Truck createTruck() {
        System.out.println("比亚迪工厂--> 生成卡车......");
        return new Truck();
    }
}
