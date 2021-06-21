package com.designpatterns.structural.bridge.adapter;

/**
 * @author gxing
 * @desc 适配器
 * @date 2021/6/21
 */
public class ObjectAdapter extends ConcreteImplementor {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operationImpl() {
        adaptee.specificRequest();
    }

}
