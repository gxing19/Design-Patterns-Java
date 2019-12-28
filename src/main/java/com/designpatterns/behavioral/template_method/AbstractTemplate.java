package com.designpatterns.behavioral.template_method;

public abstract class AbstractTemplate {

    /**
     * 模板方法的声明和实现
     * 定义轮廓和骨架(调用方法顺序，即逻辑步骤)
     */
    public void templateMethod() {
        doOperation1();

        doOperation2();

        doOperation3();
    }

    /**
     * 基本方法，交由子类实现
     */
    abstract void doOperation1();

    /**
     * 基本方法，交由子类实现
     */
    abstract void doOperation2();

    /**
     * 基本具体方法
     */
    private void doOperation3(){
        System.out.println("doOperation3() .....");
    }

}
