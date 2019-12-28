package com.designpatterns.behavioral.observer.demo1;

public interface ISubject {

    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObserver();


}
