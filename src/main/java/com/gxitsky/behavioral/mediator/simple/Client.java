package com.gxitsky.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc
 * @date 2021/6/21
 */
public class Client {

    public static void main(String[] args) {
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        colleagueA.send();
        System.out.println("--------------------------");
        colleagueB.send();

    }
}
