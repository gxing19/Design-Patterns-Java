package com.designpatterns.behavioral.observer.simple;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new ConcreteObserverA(subject);
        new ConcreteObserverB(subject);
        subject.someChange("Hello World");
    }
}
