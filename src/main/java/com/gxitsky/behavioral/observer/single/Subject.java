package com.gxitsky.behavioral.observer.single;


import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 */
public class Subject {

    private static Subject subject = new Subject();

    // 维护观察者容器
    private List<AbstractObserver> observerList = new ArrayList<>();
    private Object content;

    private Subject() {
    }

    public static Subject getInstance() {
        return subject;
    }


    public Object getContent() {
        return content;
    }

    //状态改变,调用通知观察者方法
    public void someChange(Object content) {
        this.content = content;
        notifyAllObservers();
    }

    public void add(AbstractObserver observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (AbstractObserver observer : observerList) {
            observer.update(content);
        }
    }
}
