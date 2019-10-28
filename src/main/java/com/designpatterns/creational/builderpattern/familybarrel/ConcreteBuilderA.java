package com.designpatterns.creational.builderpattern.familybarrel;

/**
 * 具体建造者A
 */
public class ConcreteBuilderA implements Builder {

    FamilyBarrel familyBarrel = new FamilyBarrel();

    @Override
    public void buildCocaCola() {
        familyBarrel.setCocaCola(new CocaCola("中杯可乐"));
    }

    @Override
    public void buildDrumstick() {
        familyBarrel.setDrumstick(new Drumstick("麦辣鸡腿"));
    }

    @Override
    public void buildFrenchFires() {
        familyBarrel.setFrenchFries(new FrenchFries("小份薯条"));
    }

    @Override
    public void buildHamburger() {
        familyBarrel.setHamburger(new Hamburger("牛肉汉堡"));
    }

    @Override
    public void buildPie() {
        familyBarrel.setPie(new Pie("菠萝味"));
    }

    @Override
    public FamilyBarrel getResult() {
        return familyBarrel;
    }
}
