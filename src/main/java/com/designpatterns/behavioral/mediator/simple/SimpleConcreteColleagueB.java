package com.designpatterns.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc 具体同事类
 * @date 2021/6/21
 */
public class SimpleConcreteColleagueB extends SimpleColleague {

//    private static SimpleMediator mediator;

    public SimpleConcreteColleagueB() {
        SimpleMediator mediator = SimpleMediator.getInstance();
        mediator.register(this);
    }

    @Override
    void receive() {
        System.out.println("-----> B Receive");
    }

    @Override
    void send() {
        System.out.println("-----> B Send");
        SimpleMediator mediator = SimpleMediator.getInstance();
        mediator.relay(this);
    }
}
