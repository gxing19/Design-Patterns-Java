package com.gxitsky.structural.proxy.cglib_dynamic1;

public class Client {

    public static void main(String[] args) {
        // 创建被代理对象
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 创建Cglib自定拦截
        CglibProxyInterceptor cglibProxyInterceptor = new CglibProxyInterceptor(userServiceImpl);
        userServiceImpl = (UserServiceImpl) cglibProxyInterceptor.getInstance();
        userServiceImpl.queryInfo(11);
    }
}
