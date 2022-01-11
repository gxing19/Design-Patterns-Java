package com.gxitsky.behavioral.chain_responsibility.logger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger:" + message);
    }
}
