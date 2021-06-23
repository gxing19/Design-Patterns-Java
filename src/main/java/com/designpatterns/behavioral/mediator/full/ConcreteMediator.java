package com.designpatterns.behavioral.mediator.full;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxing
 * @desc 具体中介者
 * @date 2021/6/21
 */
public class ConcreteMediator extends Mediator {

    protected List<Colleague> colleagueList = new ArrayList<>();

    @Override
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
    @Override
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
    @Override
    void relayToB(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (c instanceof ConcreteColleagueB) {
                // 这种方式有点向广播
                c.receive();
            }
        }
    }
}
