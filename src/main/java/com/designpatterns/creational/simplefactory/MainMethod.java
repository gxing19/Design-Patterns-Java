package com.designpatterns.creational.simplefactory;

import com.designpatterns.product.LowCar;
import com.designpatterns.product.MiddleCar;
import com.designpatterns.product.SeniorCar;
import com.designpatterns.product.TopLevelCar;

public class MainMethod {

    public static void main(String[] args) {

        TopLevelCar topLevelCar = (TopLevelCar) CarFactory.createCar("top");
        SeniorCar seniorCar = (SeniorCar) CarFactory.createCar("senior");
        MiddleCar middleCar = (MiddleCar) CarFactory.createCar("middle");
        LowCar lowCar = (LowCar) CarFactory.createCar("low");

        System.out.println(topLevelCar);
        System.out.println(seniorCar);
        System.out.println(middleCar);
        System.out.println(lowCar);

    }
}
