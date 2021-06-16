package com.designpatterns.structural.facade;

/**
 * @author gxing
 * @desc
 * @date 2021/6/16
 */
public class Facade2 {

    private Facade facade = new Facade();
    private SubSystemD systemD = new SubSystemD();

    public void operation() {
        this.facade.operation();
        this.systemD.operationD();
    }
}
