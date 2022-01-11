package com.gxitsky.behavioral.chain_responsibility;

import java.util.Map;

/**
 * 具体处理者:组长
 */
public class TeamLeaderHandler extends AbstractHandler {

    @Override
    public void handleRequest(Object obj) {
        TakeLeave takeLeave = (TakeLeave) obj;
        Map<String, String> statusMap = takeLeave.getStatusMap();
        statusMap.put("TeamLeader", "Agree");

        if (takeLeave.getDays() > 3) {
            getNextHandler().handleRequest(takeLeave);
        }

    }
}
