package com.gxitsky.behavioral.mediator.full;

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
        System.out.println("-----> B Receive");
    }

    @Override
    void send() {
        System.out.println("-----> B Send");
        mediator.relay(this);
    }
}
