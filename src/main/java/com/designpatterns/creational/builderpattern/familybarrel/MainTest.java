package com.designpatterns.creational.builderpattern.familybarrel;

public class MainTest {

    public static void main(String[] args) {

        Director director = new Director();

        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.construct(builderA);
        FamilyBarrel barrelA = builderA.getResult();
        barrelA.show();

        director.construct(builderB);
        FamilyBarrel barrelB = builderB.getResult();
        barrelB.show();

        SelectorBuilder select = new FamilyBarrel().select();
    }
}
