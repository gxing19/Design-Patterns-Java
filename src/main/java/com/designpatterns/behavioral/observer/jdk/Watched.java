package com.designpatterns.behavioral.observer.jdk;

import java.util.Observable;

/**
 * 被观察者
 */
public class Watched extends Observable {

    private String data = "";

    public String getDate(){
        return data;
    }

    public void changeDate(String data){
        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }

        notifyObservers();
    }

}
