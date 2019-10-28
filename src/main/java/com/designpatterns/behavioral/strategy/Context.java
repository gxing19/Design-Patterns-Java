package com.designpatterns.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Context setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    //持有算法方法
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
