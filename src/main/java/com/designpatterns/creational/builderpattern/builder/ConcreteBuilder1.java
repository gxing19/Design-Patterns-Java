package com.designpatterns.creational.builderpattern.builder;

public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA(){
        product.add("partA");
    }

    @Override
    public void buildPartB(){
        product.add("partB");
    }

    public Product getResult(){
        return product;
    }
}
