package com.designpatterns.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc 具体同事类
 * @date 2021/6/21
 */
public class ConcreteColleagueA extends Colleague {

//    private static SimpleMediator mediator;

    public ConcreteColleagueA() {
        Mediator mediator = Mediator.getInstance();
        mediator.register(this);
    }

    @Override
    void receive() {
        System.out.println("-----> A Receive");
    }

    @Override
    void send() {
        System.out.println("-----> A Send");
//        mediator.relay(this);
        Mediator mediator = Mediator.getInstance();
        mediator.relayToB(this);
    }
}
