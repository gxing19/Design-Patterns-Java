package com.gxitsky.product;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 中配
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class MiddleCar extends Car {

    private Integer price = 260000;

}
