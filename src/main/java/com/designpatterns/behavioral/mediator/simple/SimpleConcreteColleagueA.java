package com.designpatterns.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc 具体同事类
 * @date 2021/6/21
 */
public class SimpleConcreteColleagueA extends SimpleColleague {

//    private static SimpleMediator mediator;

    public SimpleConcreteColleagueA() {
        SimpleMediator mediator = SimpleMediator.getInstance();
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
        SimpleMediator mediator = SimpleMediator.getInstance();
        mediator.relayToB(this);
    }
}
