package com.designpatterns.creational.abstractfactory.product;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 具体产品
 * 高配
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class SeniorCar extends Car {

    private Integer price = 280000;

    @Override
    public void show() {
        System.out.println("这是一辆 高配 的汽车");
    }
}
