package com.designpatterns.structural.facade;

/**
 * @author gxing
 * @desc 门面对象
 * @date 2021/6/16
 */
public class Facade {

    private static SubSystemA systemA = new SubSystemA();
    private static SubSystemB systemB = new SubSystemB();
    private static SubSystemC systemC = new SubSystemC();

    public void operation() {
        //调用多个子系统
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
