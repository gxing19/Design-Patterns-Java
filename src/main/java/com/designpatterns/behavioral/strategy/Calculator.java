package com.designpatterns.behavioral.strategy;

public enum Calculator {
    VIP("vip") {
        @Override
        public double calac(double price) {
            return price * 0.8;
        }
    },
    MVP("mvp") {
        @Override
        public double calac(double price) {
            return price * 0.7;
        }
    },
    COMMON("common") {
        @Override
        public double calac(double price) {
            return price * 0.95;
        }
    };

    private String type;

    Calculator(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Calculator setType(String type) {
        this.type = type;
        return this;
    }

    public abstract double calac(double price);
}
