package com.gxitsky.structural.facade.abstraction;

/**
 * @author gxing
 * @desc 门面对象
 * @date 2021/6/16
 */
public class SubFacade extends AbstractFacade {

    private static Facade facade = new Facade();
    private static SubSystemD subSystemD = new SubSystemD();

    @Override
    public void operation2() {
        System.out.println("----->SubFacade operation2");
        facade.operation1();
        subSystemD.operationD();
    }
}
