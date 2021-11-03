package com.designpatterns.structural.flyweight.demo;

/**
 * @author gxing
 * @desc 客户端
 * @date 2021/11/2
 */
public class ClientTest {

//    private static FlavorFactory factory;

    public static void main(String[] args) {
//        factory = new FlavorFactory();

        FlavorFactorySingleton factory = FlavorFactorySingleton.getInstance();
        Order blackCoffee = factory.getOrder("Black Coffee");
        blackCoffee.serve(new Table(100));

        Order cappuccino = factory.getOrder("Cappuccino");
        cappuccino.serve(new Table(85));

        System.out.println("Coffee Types:" + factory.getTotalFlavors());

    }
}
