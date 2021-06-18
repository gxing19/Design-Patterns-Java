package com.designpatterns.structural.bridge.message;

/**
 * @author gxing
 * @desc 消息抽象(消息类型 : 正常消息, 告警消息)
 * @date 2021/6/18
 */
public abstract class AbstractMessage {

    protected IMessage iMessage;

    public AbstractMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    abstract void sendMessage(String content);
}
