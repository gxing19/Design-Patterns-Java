package com.designpatterns.structural.facade.full;

/**
 * @author gxing
 * @desc
 * @date 2021/6/16
 */
public class Facade2 extends AbstractFacade {

    private Facade facade = new Facade();
    private SubSystemD systemD = new SubSystemD();

    @Override
    public void operation2() {
        this.facade.operation1();
        this.systemD.operationD();
    }
}
