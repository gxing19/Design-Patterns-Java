package com.gxitsky.structural.bridge.message;

/**
 * @author gxing
 * @desc 微信消息
 * @date 2021/6/18
 */
public class WxMessage implements IMessage {

    @Override
    public void send(String content) {
        System.out.println("----->发送微信消息," + content);
    }
}
