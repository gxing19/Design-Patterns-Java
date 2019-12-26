package com.designpatterns.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Wathcer implements Observer {

    /**
     * 观察者主动将自己加入到被观察者维护的观察者聚集中
     * @param watched
     */
    public Wathcer(Watched watched) {
        watched.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("Data has been changed to :" + ((Watched)o).getDate());

    }
}
