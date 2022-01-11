package com.gxitsky.structural.bridge.message;

/**
 * @author gxing
 * @desc 告警类型
 * @date 2021/6/18
 */
public class WarnMessage extends AbstractMessage {

    public WarnMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    void sendMessage(String content) {
        System.out.println("----->告警消息类型");
        super.iMessage.send(content);
    }
}
