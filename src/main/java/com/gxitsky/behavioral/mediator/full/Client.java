package com.gxitsky.behavioral.mediator.full;

/**
 * @author gxing
 * @desc
 * @date 2021/6/21
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);
        mediator.register(colleagueA);
        mediator.register(colleagueB);

        colleagueA.send();
        System.out.println("--------------------------");
        colleagueB.send();

    }
}
