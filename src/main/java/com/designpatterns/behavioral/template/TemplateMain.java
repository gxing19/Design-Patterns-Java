package com.designpatterns.behavioral.template;

public class TemplateMain {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.TemplateMethod();
    }
}
