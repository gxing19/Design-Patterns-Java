package com.designpatterns.behavioral.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        /*Context context = new Context();

        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();

        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();*/

        double result = Calculator.MVP.calac(108.33);
        System.out.println(result);

    }
}
