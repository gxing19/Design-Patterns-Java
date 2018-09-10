package com.designpatterns.proxy.jdk_dynamic2;

import java.lang.reflect.Proxy;

public class MainMethod {

    public static void main(String[] args) {
//		InvocationHandler handler = new ProxyInvocationHandler();
//		UserDao userDao = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(), 
//				new Class[] {UserDao.class}, handler);

//		UserDao userDao = (UserDao) new ProxyClass().getProxyObject(new UserDaoImpl());
//		userDao.save();

//		UserDao userDao = new UserDaoImpl();

        UserDao userDao = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),
                new Class[]{UserDao.class},
                new CustomizeInvocationHandler(new UserDaoImpl()));
        userDao.save();
    }
}
