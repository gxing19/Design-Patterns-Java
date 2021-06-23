package com.designpatterns.behavioral.observer.full;

/**
 * 定义添加、删除、通知观察者的方法
 */
public interface ISubject {

    void add(IObserver observer);

    void remove(IObserver observer);

    void someChange(Object String);

    void notifyObserver(Object String);
}
