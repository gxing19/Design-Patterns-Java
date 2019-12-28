package com.designpatterns.creational.abstract_factory.animal;

public class AnimalMain {

    public static void main(String[] args) {
        AnimalFactory factory = new BirdsFactory();
        Animal owl = factory.create("Owl");
        owl.show();

        factory = new MammalsFactory();
        Animal fox = factory.create("Fox");
        fox.show();
    }
}
