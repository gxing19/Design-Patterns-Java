package com.designpatterns.creational.abstractfactory.animal;

public class MammalsFactory extends AnimalFactory {
    @Override
    public Animal create(String animal) {
        animal = animal.toUpperCase();

        if (animal.equals("CAT")) {
            return new Cat();
        } else if (animal.equals("FOX")) {
            return new Fox();
        }
        return null;
    }
}
