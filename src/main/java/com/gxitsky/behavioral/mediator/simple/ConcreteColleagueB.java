package com.gxitsky.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc 具体同事类
 * @date 2021/6/21
 */
public class ConcreteColleagueB extends Colleague {

//    private static SimpleMediator mediator;

    public ConcreteColleagueB() {
        Mediator mediator = Mediator.getInstance();
        mediator.register(this);
    }

    @Override
    void receive() {
        System.out.println("-----> B Receive");
    }

    @Override
    void send() {
        System.out.println("-----> B Send");
        Mediator mediator = Mediator.getInstance();
        mediator.relay(this);
    }
}
