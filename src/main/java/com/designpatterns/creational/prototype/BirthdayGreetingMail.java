package com.designpatterns.creational.prototype;

public class BirthdayGreetingMail implements IMail {

    private String name;
    private String msg = "生日快乐！";

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
