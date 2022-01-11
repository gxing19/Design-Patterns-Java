package com.gxitsky.behavioral.mediator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxing
 * @desc 具体中介者
 * @date 2021/6/21
 */
public class Mediator {

    private static Mediator mediator = new Mediator();

    private Mediator() {
    }

    public static Mediator getInstance() {
        return mediator;
    }

    protected List<Colleague> colleagueList = new ArrayList<>();

    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
        }
    }

    /**
     * 广播到所有同事
     *
     * @param colleague
     */
    public void relay(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (!c.equals(colleague)) {
                // 这种方式有点向广播
                c.receive();
            }
        }
    }

    /**
     * 转发到指定同事,同事间联系由中介者维护
     *
     * @param colleague
     */
    void relayToB(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (c instanceof ConcreteColleagueB) {
                // 这种方式有点向广播
                c.receive();
            }
        }
    }
}
