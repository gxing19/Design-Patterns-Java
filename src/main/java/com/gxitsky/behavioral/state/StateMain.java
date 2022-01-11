package com.gxitsky.behavioral.state;

public class StateMain {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
