package com.designpatterns.behavioral.observer.single;

/**
 * 具体观察者
 */
public class ConcreteObserverA extends AbstractObserver {

    public ConcreteObserverA() {
        Subject.getInstance().add(this);
    }

    @Override
    public void update(Object content) {
        System.out.println("观察者A收到通知,更新自己行为.......");
    }
}
