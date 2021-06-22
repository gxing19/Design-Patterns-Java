package com.designpatterns.behavioral.mediator.simple;

/**
 * @author gxing
 * @desc
 * @date 2021/6/21
 */
public class Client {

    public static void main(String[] args) {
        SimpleColleague simpleColleagueA = new SimpleConcreteColleagueA();
        SimpleColleague simpleColleagueB = new SimpleConcreteColleagueB();

        simpleColleagueA.send();
        System.out.println("--------------------------");
        simpleColleagueB.send();

    }
}
