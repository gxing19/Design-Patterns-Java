package com.designpatterns.behavioral.template_method;

public class TemplateMain {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }
}
