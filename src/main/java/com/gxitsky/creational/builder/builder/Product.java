package com.gxitsky.creational.builder.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> partList = new ArrayList<>();

    public void add(String part){
        partList.add(part);
    }

    public void show(){
        for (String part : partList) {
            System.out.println("创建产品...... ：" + part);
        }
    }
}
