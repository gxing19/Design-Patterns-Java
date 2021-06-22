package com.designpatterns.behavioral.mediator;

/**
 * @author gxing
 * @desc 具体同事类
 * @date 2021/6/21
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    void receive() {
        System.out.println("-----> A Receive");
    }

    @Override
    void send() {
        System.out.println("-----> A Send");
//        mediator.relay(this);
        mediator.relayToB(this);
    }
}
