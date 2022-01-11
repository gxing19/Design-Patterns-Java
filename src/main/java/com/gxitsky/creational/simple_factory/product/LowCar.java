package com.gxitsky.product;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 低配
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class LowCar extends Car {

    private Integer price = 230000;
}
