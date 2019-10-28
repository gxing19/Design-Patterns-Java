package com.designpatterns.creational.builderpattern.familybarrel;

/**
 * 产品部件：可乐
 */
public class CocaCola {

    //容量：大杯，中杯，小杯
    private String volume;

    public CocaCola(String volume) {
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public CocaCola setVolume(String volume) {
        this.volume = volume;
        return this;
    }
}
