package com.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxing
 * @desc 具体中介者
 * @date 2021/6/21
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (c.equals(colleague)) {
                c.receive();
            }
        }
    }
}
