package com.designpatterns.creational.builderpattern.familybarrel;

public class SelectorBuilder {

    private FamilyBarrel familyBarrel;

    public SelectorBuilder() {
    }

    public SelectorBuilder(FamilyBarrel familyBarrel) {
        this.familyBarrel = familyBarrel;
    }
}
