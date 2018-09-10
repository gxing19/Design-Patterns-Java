package com.designpatterns.proxy.static_proxy2;

public class MainMethod {

    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
		//被代理的目标对象作为代理对象的构造参数传入
        UserDaoProxyImpl userDaoProxyImpl = new UserDaoProxyImpl(userDaoImpl);
        userDaoProxyImpl.save();
    }

}
