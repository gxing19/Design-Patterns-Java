package com.designpatterns.behavioral.observer.demo2;

public class MainTest {

    private static ConcreteSubject concreteSubject;
    private static IObserver observer;

    public static void main(String[] args) {
        concreteSubject = new ConcreteSubject();
        observer = new ConcreteObserver();
        concreteSubject.add(observer);
        concreteSubject.change("A");
    }
}
