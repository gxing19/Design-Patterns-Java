package com.designpatterns.behavioral.mediator.full;

/**
 * @author gxing
 * @desc 抽象同事类
 * @date 2021/6/21
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void receive();

    abstract void send();
}
