package com.designpatterns.behavioral.observer.demo2;

public class ConcreteSubject extends AbstractSubject {

    private String state;

    public void change(String newState) {
        this.state = newState;
        this.notifyObservers();
    }
}
