package com.gxitsky.creational.builder.familybarrel;


/**
 * 复杂产品
 */
public class FamilyBarrel {

    //鸡腿
    private Drumstick drumstick;
    //可乐
    private CocaCola cocaCola;
    //汉堡
    private Hamburger hamburger;
    //薯条
    private FrenchFries frenchFries;
    //派
    private Pie pie;

    public SelectorBuilder select() {
        return new SelectorBuilder(this);
    }

    public Pie getPie() {
        return pie;
    }

    public FamilyBarrel setPie(Pie pie) {
        this.pie = pie;
        return this;
    }

    public Drumstick getDrumstick() {
        return drumstick;
    }

    public FamilyBarrel setDrumstick(Drumstick drumstick) {
        this.drumstick = drumstick;
        return this;
    }

    public CocaCola getCocaCola() {
        return cocaCola;
    }

    public FamilyBarrel setCocaCola(CocaCola cocaCola) {
        this.cocaCola = cocaCola;
        return this;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public FamilyBarrel setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
        return this;
    }

    public FrenchFries getFrenchFries() {
        return frenchFries;
    }

    public FamilyBarrel setFrenchFries(FrenchFries frenchFries) {
        this.frenchFries = frenchFries;
        return this;
    }

    public void show() {
        String barrel = "麦当劳全家桶:[" + drumstick.getFlavor() + ", " + cocaCola.getVolume() + ", " +
                hamburger.getFlavor() + ", " + frenchFries.getCapacity() + ", " + pie.getFlavor() + "]";
        System.out.println(barrel);
    }
}
