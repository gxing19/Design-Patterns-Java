package com.designpatterns.proxy.static_proxy3;

public class MainMethod {

    public static void main(String[] args) {
        UserDao userDaoImpl = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDaoImpl);
        userDaoProxy.save();
        System.out.println("------------------------------------");
        userDaoProxy.update();
    }

}
