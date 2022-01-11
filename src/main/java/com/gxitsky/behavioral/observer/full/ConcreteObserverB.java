package com.gxitsky.behavioral.observer.full;

public class ConcreteObserverB implements IObserver {
    @Override
    public void update(Object String) {
        System.out.println("观察者B收到通知,更新自己行为....... " + String);
    }
}
