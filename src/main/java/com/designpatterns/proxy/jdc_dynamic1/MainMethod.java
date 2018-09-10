package com.designpatterns.proxy.jdc_dynamic1;

public class MainMethod {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        UserDao proxy = (UserDao) new JdkProxyObj(userDao).getProxyInstance();

//        System.out.println(proxy.getClass());

        proxy.update(100, "root");
    }
}
