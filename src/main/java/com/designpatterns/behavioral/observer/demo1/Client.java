package com.designpatterns.behavioral.observer.demo1;

public class Client {

    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        IObserver observer = new ConcreteObserver();
        subject.add(observer);
        subject.someChange("Hello World");
    }
}
