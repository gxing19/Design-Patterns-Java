package com.designpatterns.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc 抽象同事类
 * @date 2021/6/21
 */
public abstract class Colleague {

    abstract void receive();

    abstract void send();
}
