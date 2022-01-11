package com.gxitsky.structural.proxy.jdk_dynamic2;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        UserDao userDao = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),
                new Class[]{UserDao.class},
                new CustomizeInvocationHandler(new UserDaoImpl()));
        userDao.save(100L, "Kitty");

        UserDao userDao1 = new UserDaoImpl();
        UserDaoJdkProxy<UserDao> proxy = new UserDaoJdkProxy<>(userDao1);
        userDao1 = (UserDao) proxy.getProxyObject();
        userDao1.save(100L, "Kitty");
    }
}
