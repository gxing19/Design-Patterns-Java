package com.gxitsky.structural.flyweight.demo;

/**
 * @author gxing
 * @desc 具体享元
 * @date 2021/11/2
 */
public class Flavor extends Order {

    private String flavor;

    public Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serve(Table table) {
        System.out.println("Serving table:" + table.getNumber() + ", flavor:" + flavor);
    }

    @Override
    public String getFlavor() {
        return this.flavor;
    }
}
