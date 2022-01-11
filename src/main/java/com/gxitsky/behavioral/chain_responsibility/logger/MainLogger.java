package com.gxitsky.behavioral.chain_responsibility.logger;

public class MainLogger {

    public static void main(String[] args) {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        errorLogger.logMessage(AbstractLogger.INFO, "this is a info.");
        errorLogger.logMessage(AbstractLogger.DEBUG, "this is a debug.");
        errorLogger.logMessage(AbstractLogger.ERROR, "this is a error.");
    }
}
