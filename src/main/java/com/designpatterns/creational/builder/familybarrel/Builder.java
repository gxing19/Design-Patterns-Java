package com.designpatterns.creational.builder.familybarrel;

/**
 * 抽象建造者
 */
public interface Builder {

    //可乐
    void buildCocaCola();

    //鸡腿
    void buildDrumstick();

    //薯条
    void buildFrenchFires();

    //汉堡
    void buildHamburger();

    //派
    void buildPie();

    //返回结果
    FamilyBarrel getResult();
}
