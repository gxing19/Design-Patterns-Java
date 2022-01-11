package com.gxitsky.structural.proxy.static_proxy2;

public class Client {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
		//被代理的目标对象作为代理对象的构造参数传入
        userDao = new UserDaoProxyImpl(userDao);
        userDao.save();
    }
}
