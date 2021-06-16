package com.designpatterns.structural.facade;

/**
 * @author gxing
 * @desc 客户端
 * @date 2021/6/16
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
