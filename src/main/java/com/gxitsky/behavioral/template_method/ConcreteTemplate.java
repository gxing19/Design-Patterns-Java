package com.gxitsky.behavioral.template_method;

public class ConcreteTemplate extends AbstractTemplate {
    @Override
    void doOperation1() {
        System.out.println("doOperation1() .....");
    }

    @Override
    void doOperation2() {
        System.out.println("doOperation2() .....");
    }
}
