package com.gxitsky.structural.proxy.static_proxy3;

public class Client {

    public static void main(String[] args) {
        BatchMapper batchMapper = new BatchMapper();
        MapperProxy mapperProxy = new MapperProxy(batchMapper);
        mapperProxy.save();
        System.out.println("------------------------------------");
        mapperProxy.batchSave();
    }

}
