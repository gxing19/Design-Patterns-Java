package com.gxitsky.structural.bridge.adapter;

/**
 * @author gxing
 * @desc 扩展抽象角色
 * @date 2021/6/21
 */
public class RefinedAbstract extends Abstraction {

    public RefinedAbstract(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        super.implementor.operationImpl();
    }
}
