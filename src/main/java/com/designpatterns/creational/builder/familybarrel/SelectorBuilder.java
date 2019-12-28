package com.designpatterns.creational.builder.familybarrel;

public class SelectorBuilder {

    private FamilyBarrel familyBarrel;

    public SelectorBuilder() {
    }

    public SelectorBuilder(FamilyBarrel familyBarrel) {
        this.familyBarrel = familyBarrel;
    }
}
