package com.designpatterns.structural.bridge.message;

/**
 * @author gxing
 * @desc 消息接口(消息渠道 : 微信消息, 短信消息, 邮件消息)
 * @date 2021/6/18
 */
public interface IMessage {

    void send(String content);
}
