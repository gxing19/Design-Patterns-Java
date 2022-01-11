package com.gxitsky.creational.builder.builder;

public class ConcreteBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA(){
        product.add("partX");
    }

    @Override
    public void buildPartB(){
        product.add("partY");
    }

    public Product getResult(){
        return product;
    }
}
