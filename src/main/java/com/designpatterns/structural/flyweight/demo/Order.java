package com.designpatterns.structural.flyweight.demo;

/**
 * @author gxing
 * @desc 抽象享元角色
 * @date 2021/11/2
 */
public abstract class Order {

    /**
     * 把咖啡卖给客人
     * @param table
     */
    public abstract void serve(Table table);

    /**
     * 特点,名称
     * @return
     */
    public abstract String getFlavor();
}
