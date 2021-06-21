package com.designpatterns.behavioral.mediator;

/**
 * @author gxing
 * @desc 具体同事类
 * @date 2021/6/21
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    void receive() {

    }

    @Override
    void send() {
        System.out.println("-----> Send B");
    }
}
