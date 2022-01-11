package com.gxitsky.behavioral.chain_responsibility.logger;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (null != nextLogger) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public AbstractLogger setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
        return this;
    }
}
