package com.designpatterns.structural.bridge.full;

/**
 * @author gxing
 * @desc 抽象化角色扩展
 * @date 2021/6/18
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("-----> 访问扩展抽象化");
        super.implementor.operationImpl();
    }


}
