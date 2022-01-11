package com.gxitsky.structural.bridge.message;

/**
 * @author gxing
 * @desc 常规类型
 * @date 2021/6/18
 */
public class NomalMessage extends AbstractMessage {

    public NomalMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    void sendMessage(String content) {
        System.out.println("----->正常消息类型");
        super.iMessage.send(content);
    }
}
