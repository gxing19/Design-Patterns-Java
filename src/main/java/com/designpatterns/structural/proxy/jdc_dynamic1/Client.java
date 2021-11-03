package com.designpatterns.structural.proxy.jdc_dynamic1;

public class Client {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao = (UserDao) new UserDaoJdkProxy(userDao).getProxyInstance();
        userDao.update(100, "root");
    }
}
