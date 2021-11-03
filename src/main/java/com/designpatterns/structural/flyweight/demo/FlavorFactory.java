package com.designpatterns.structural.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gxing
 * @desc 享元工厂
 * @date 2021/11/2
 */
public class FlavorFactory {

    private Map<String, Order> flavorMap = new HashMap<>();
    private int totalFlavors = 0;

    public Order getOrder(String flavor) {
        if (!flavorMap.containsKey(flavor)) {
            flavorMap.put(flavor, new Flavor(flavor));

        }
        return flavorMap.get(flavor);
    }

    public int getTotalFlavors() {
        return flavorMap.size();
    }
}
