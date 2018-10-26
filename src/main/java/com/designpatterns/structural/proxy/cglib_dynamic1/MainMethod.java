package com.designpatterns.structural.proxy.cglib_dynamic1;

public class MainMethod {

    public static void main(String[] args) {
        //创建目标类对象
        UserService userServiceImpl = new UserService();
        //自定拦截
        CglibInterceptor cglibInterceptor = new CglibInterceptor(userServiceImpl);
        UserService userService = (UserService) cglibInterceptor.getInstance();
        userService.queryInfo(11);
    }
}
