package com.designpatterns.creational.prototype;

public class HappyNewYearMail implements IMail {

    private String name;
    private String msg = "新年快乐！";

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
