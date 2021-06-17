package com.designpatterns.structural.facade;

/**
 * @author gxing
 * @desc 客户端
 * @date 2021/6/16
 */
public class Client {

    public static void main(String[] args) {
        AbstractFacade facade1 = new Facade();
        facade1.operation1();

        AbstractFacade facade2 = new Facade2();
        facade2.operation2();
    }
}
