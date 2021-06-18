package com.designpatterns.structural.bridge.message;

/**
 * @author gxing
 * @desc
 * @date 2021/6/18
 */
public class EmailMessage implements IMessage {
    @Override
    public void send(String content) {
        System.out.println("----->发送邮件信息," + content);
    }
}
