package com.designpatterns.behavioral.mediator;

/**
 * @author gxing
 * @desc
 * @date 2021/6/21
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague c1 = new ConcreteColleagueA(mediator);
        Colleague c2 = new ConcreteColleagueB(mediator);
        mediator.register(c1);
        mediator.register(c2);

        c1.send();
        System.out.println("--------------------------");
        c2.send();

    }
}
