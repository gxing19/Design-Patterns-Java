package com.designpatterns.behavioral.observer.demo1;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements ISubject {

    private Vector vector = new Vector();

    @Override
    public void add(IObserver observer) {
        vector.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        vector.remove(observer);

    }

    @Override
    public void notifyObserver() {

        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((IObserver)enumeration.nextElement()).update();
        }

    }

    private Enumeration observers() {
        return ((Vector)vector.clone()).elements();
    }
}
