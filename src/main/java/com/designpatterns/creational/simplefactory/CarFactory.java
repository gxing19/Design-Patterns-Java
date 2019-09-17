package com.designpatterns.creational.simplefactory;

import com.designpatterns.product.*;

public class CarFactory {

    public static Car createCar(String type) {

        Car car = null;

        switch (type) {
            case "top":
                car = new TopLevelCar();
                break;
            case "senior":
                car = new SeniorCar();
                break;
            case "middle":
                car = new MiddleCar();
                break;
            case "low":
                car = new LowCar();
                break;
        }
        return car;
    }

}
