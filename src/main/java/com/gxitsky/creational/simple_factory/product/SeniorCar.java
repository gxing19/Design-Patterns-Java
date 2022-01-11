package com.gxitsky.product;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 高配
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class SeniorCar extends Car {

    private Integer price = 280000;
}
