package com.gxitsky.structural.bridge.message;

/**
 * @author gxing
 * @desc
 * @date 2021/6/18
 */
public class Client {

    public static void main(String[] args) {
        // 发送SMS正常消息
        IMessage iMessage = new SmsMessage();
        AbstractMessage message = new NomalMessage(iMessage);
        message.sendMessage("消息已发送");
    }
}
