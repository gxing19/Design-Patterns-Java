package com.designpatterns.behavioral.observer.full;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements ISubject {

    private Vector<IObserver> vector = new Vector<>();

    @Override
    public void add(IObserver observer) {
        vector.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        vector.remove(observer);

    }

    @Override
    public void someChange(Object String) {
        System.out.println("-----> some change:" + String);
        notifyObserver(String);
    }

    @Override
    public void notifyObserver(Object String) {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((IObserver)enumeration.nextElement()).update(String);
        }

    }

    private Enumeration observers() {
        return ((Vector)vector.clone()).elements();
    }
}
