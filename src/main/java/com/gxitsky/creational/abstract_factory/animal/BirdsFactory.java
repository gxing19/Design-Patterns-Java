package com.gxitsky.creational.abstract_factory.animal;

public class BirdsFactory extends AnimalFactory {
    @Override
    public Animal create(String animal) {
        animal = animal.toUpperCase();

        if (animal.equals("OWL")) {
            return new Owl();
        }
        return null;
    }
}
