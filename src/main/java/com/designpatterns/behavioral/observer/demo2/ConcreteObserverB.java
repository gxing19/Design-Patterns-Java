package com.designpatterns.behavioral.observer.demo2;

/**
 * 具体观察者
 */
public class ConcreteObserverB extends AbstractObserver {

    public ConcreteObserverB(Subject subject) {
        super.subject = subject;
        subject.add(this);

    }

    @Override
    public void update(Object content) {
        System.out.println("观察者B收到通知,更新自己行为.......");
    }
}
