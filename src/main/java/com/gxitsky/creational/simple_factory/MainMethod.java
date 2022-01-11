package com.gxitsky.creational.simple_factory;

import com.gxitsky.product.LowCar;
import com.gxitsky.product.MiddleCar;
import com.gxitsky.product.SeniorCar;
import com.gxitsky.product.TopLevelCar;

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
