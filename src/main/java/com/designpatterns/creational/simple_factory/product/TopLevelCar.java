package com.designpatterns.product;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 顶配
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class TopLevelCar extends Car {

    private Integer price = 300000;

    public void run(){
        System.out.println("Top Level Car Run.....");
    }

}
