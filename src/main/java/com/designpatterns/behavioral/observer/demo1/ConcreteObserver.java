package com.designpatterns.behavioral.observer.demo1;

public class ConcreteObserver implements IObserver {
    @Override
    public void update() {
        System.out.println("观察者收到通知,更新自己行为.......");
    }
}
