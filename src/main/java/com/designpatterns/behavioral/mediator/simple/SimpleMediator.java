package com.designpatterns.behavioral.mediator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxing
 * @desc 具体中介者
 * @date 2021/6/21
 */
public class SimpleMediator {

    private static SimpleMediator simpleMediator = new SimpleMediator();

    private SimpleMediator() {
    }

    public static SimpleMediator getInstance() {
        return simpleMediator;
    }

    protected List<SimpleColleague> simpleColleagueList = new ArrayList<>();

    public void register(SimpleColleague simpleColleague) {
        if (!simpleColleagueList.contains(simpleColleague)) {
            simpleColleagueList.add(simpleColleague);
        }
    }

    /**
     * 广播到所有同事
     *
     * @param simpleColleague
     */
    public void relay(SimpleColleague simpleColleague) {
        for (SimpleColleague c : simpleColleagueList) {
            if (!c.equals(simpleColleague)) {
                // 这种方式有点向广播
                c.receive();
            }
        }
    }

    /**
     * 转发到指定同事,同事间联系由中介者维护
     *
     * @param simpleColleague
     */
    void relayToB(SimpleColleague simpleColleague) {
        for (SimpleColleague c : simpleColleagueList) {
            if (c instanceof SimpleConcreteColleagueB) {
                // 这种方式有点向广播
                c.receive();
            }
        }
    }
}
