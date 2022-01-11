package com.gxitsky.behavioral.observer.full;

public class Client {

    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        IObserver observerA = new ConcreteObserverA();
        subject.add(observerA);
        IObserver observerB = new ConcreteObserverB();
        subject.add(observerB);
        subject.someChange("Hello World");
    }
}
