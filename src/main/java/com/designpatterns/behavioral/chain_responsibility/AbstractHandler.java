package com.designpatterns.behavioral.chain_responsibility;

/**
 * 处理者抽象
 */
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public abstract void handleRequest(Object obj);

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public AbstractHandler setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }
}
