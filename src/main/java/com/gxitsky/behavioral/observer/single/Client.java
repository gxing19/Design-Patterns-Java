package com.gxitsky.behavioral.observer.single;

public class Client {

    public static void main(String[] args) {
        new ConcreteObserverA();
        new ConcreteObserverB();
        Subject.getInstance().someChange("Hello World");
    }
}
