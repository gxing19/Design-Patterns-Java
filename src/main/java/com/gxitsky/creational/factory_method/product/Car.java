package com.gxitsky.creational.factory_method.product;

import lombok.Getter;
import lombok.ToString;

/**
 * 产品抽象
 */
@Getter
@ToString
public abstract class Car {

    private Integer wheel = 4;
    private Integer engine = 1;

    public abstract void show();

}
