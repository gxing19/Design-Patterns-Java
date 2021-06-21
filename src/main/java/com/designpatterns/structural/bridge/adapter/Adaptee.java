package com.designpatterns.structural.bridge.adapter;

/**
 * @author gxing
 * @desc 适配者
 * @date 2021/6/21
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("-----> 适配者业务");
    }
}
