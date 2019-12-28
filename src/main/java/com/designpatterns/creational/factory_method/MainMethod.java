package com.designpatterns.creational.factory_method;

public class MainMethod {

    public static void main(String[] args) {

        //通过具体工厂创建具体产品
        AbstractCarFactory topLevelCarFactory = new TopLevelCarFactory();
        topLevelCarFactory.createCar().show();

        AbstractCarFactory seniorCarFactory = new SeniorCarFactory();
        seniorCarFactory.createCar().show();
    }
}
