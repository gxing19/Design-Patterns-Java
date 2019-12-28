package com.designpatterns.behavioral.observer.jdk;

import java.util.Observer;

public class MainTester {

    private static Watched watched;
    private static Observer watcher;

    public static void main(String[] args) {
        watched = new Watched();
        watcher = new Wathcer(watched);

        watched.changeDate("Change First");
        watched.changeDate("Change Tow");
        watched.changeDate("Change Tow");
        watched.changeDate("Change Four");
        watched.changeDate("Change Five");

    }
}
