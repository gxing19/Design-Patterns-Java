package com.gxitsky.behavioral.observer.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebSessionLinstener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("create session");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("destroy session");

    }
}
