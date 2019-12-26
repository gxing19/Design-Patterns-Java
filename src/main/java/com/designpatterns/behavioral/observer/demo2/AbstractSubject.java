package com.designpatterns.behavioral.observer.demo2;


import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject {

    private Vector vector = new Vector();

    public void add(IObserver observer) {
        vector.add(observer);
    }

    public void remove(IObserver observer) {
        vector.remove(observer);
    }

    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()) {
            ((IObserver) enumeration.nextElement()).update();
        }
    }

    public Enumeration observers() {
        return ((Vector) vector.clone()).elements();
    }
}
