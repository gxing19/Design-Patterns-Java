package com.designpatterns.behavioral.mediator;

/**
 * @author gxing
 * @desc 抽象中间者
 * @date 2021/6/21
 */
public abstract class Mediator {

    abstract void register(Colleague colleague);

    abstract void relay(Colleague colleague);
}
