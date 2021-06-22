package com.designpatterns.behavioral.observer.demo2;

/**
 * 抽象观察者
 */
public abstract class AbstractObserver {

    protected Subject subject;

    abstract void update(Object content);
}
