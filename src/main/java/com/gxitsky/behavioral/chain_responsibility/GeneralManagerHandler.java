package com.gxitsky.behavioral.chain_responsibility;

import java.util.Map;

/**
 * 具体处理者:总经理
 */
public class GeneralManagerHandler extends AbstractHandler {

    @Override
    public void handleRequest(Object obj) {
        TakeLeave takeLeave = (TakeLeave) obj;
        Map<String, String> statusMap = takeLeave.getStatusMap();
        statusMap.put("GeneralManager", "Agree");
    }
}
