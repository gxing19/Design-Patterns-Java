package com.designpatterns.structural.proxy.cglib_dynamic2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.Map;

public class Client {

    public static void main(String[] args) {

        String jsonData = "{id:100,list:[{a:1},{b:2}]";
        //json字符串转map
        Map<String, Object> map = JSON.parseObject(jsonData, new TypeReference<Map<String, Object>>() {
        });

        DynamicBean bean = new DynamicBean(map);
        Object object = bean.getObject();
        System.out.println(JSON.toJSONString(object));
    }

}
