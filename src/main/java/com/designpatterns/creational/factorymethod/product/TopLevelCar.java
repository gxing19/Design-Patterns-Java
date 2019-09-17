package com.designpatterns.creational.factorymethod.product;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 具体产品
 * 顶配
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class TopLevelCar extends Car {

    private Integer price = 300000;

    @Override
    public void show() {
        System.out.println("这是一辆 顶配 的汽车");
    }

}
