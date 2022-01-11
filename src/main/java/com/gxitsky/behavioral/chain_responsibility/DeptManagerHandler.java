package com.gxitsky.behavioral.chain_responsibility;

import java.util.Map;

/**
 * 具体处理者:部门经理
 */
public class DeptManagerHandler extends AbstractHandler {

    @Override
    public void handleRequest(Object obj) {
        TakeLeave takeLeave = (TakeLeave) obj;
        Map<String, String> statusMap = takeLeave.getStatusMap();
        statusMap.put("DeptManager", "Agree");

        if (takeLeave.getDays() > 7) {
            getNextHandler().handleRequest(takeLeave);
        }
    }
}
