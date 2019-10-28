package com.designpatterns.creational.builderpattern.familybarrel;

/**
 * 具体建造者B
 */
public class ConcreteBuilderB implements Builder {

    FamilyBarrel familyBarrel = new FamilyBarrel();

    @Override
    public void buildCocaCola() {
        familyBarrel.setCocaCola(new CocaCola("大杯可乐"));
    }

    @Override
    public void buildDrumstick() {
        familyBarrel.setDrumstick(new Drumstick("盐焗鸡腿"));
    }

    @Override
    public void buildFrenchFires() {
        familyBarrel.setFrenchFries(new FrenchFries("大份薯条"));
    }

    @Override
    public void buildPie() {
        familyBarrel.setPie(new Pie("香芋派"));
    }

    @Override
    public void buildHamburger() {
        familyBarrel.setHamburger(new Hamburger("鳕鱼汉堡"));
    }


    @Override
    public FamilyBarrel getResult() {
        return familyBarrel;
    }
}
