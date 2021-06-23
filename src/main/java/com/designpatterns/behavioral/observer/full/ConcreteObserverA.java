package com.designpatterns.behavioral.observer.full;

public class ConcreteObserverA implements IObserver {
    @Override
    public void update(Object String) {
        System.out.println("观察者A收到通知,更新自己行为....... " + String);
    }
}
