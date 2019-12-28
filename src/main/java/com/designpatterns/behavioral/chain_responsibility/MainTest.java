package com.designpatterns.behavioral.chain_responsibility;

import com.alibaba.fastjson.JSON;

public class MainTest {

    public static void main(String[] args) {
        AbstractHandler teamLeaderHandler = new TeamLeaderHandler();
        AbstractHandler deptManagerHandler = new DeptManagerHandler();
        AbstractHandler generalManagerHandler = new GeneralManagerHandler();

        //组装职责链
        teamLeaderHandler.setNextHandler(deptManagerHandler);
        deptManagerHandler.setNextHandler(generalManagerHandler);

        TakeLeave takeLeave = new TakeLeave("Kitty", 8);
        //提交请求
        teamLeaderHandler.handleRequest(takeLeave);

        System.out.println(JSON.toJSONString(takeLeave));
    }
}
