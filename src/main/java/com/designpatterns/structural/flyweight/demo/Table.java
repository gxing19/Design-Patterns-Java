package com.designpatterns.structural.flyweight.demo;

/**
 * @author gxing
 * @desc 复合状态
 * @date 2021/11/2
 */
public class Table {

    private int number;

    public Table() {
    }

    public Table(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
