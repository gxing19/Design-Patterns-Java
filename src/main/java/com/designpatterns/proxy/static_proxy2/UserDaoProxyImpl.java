package com.designpatterns.proxy.static_proxy2;

/**
 * 代理对象
 *
 * @author Rocky
 */
public class UserDaoProxyImpl implements UserDao {

    private UserDaoImpl userDaoImpl;

    public UserDaoProxyImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    /**
     * 重写被代理的目标对象的方法
     */
    @Override
    public void save() {
        System.out.println("代理增强：  开始保存。。。。");
        userDaoImpl.save();
        System.out.println("代理增强：  保存结束。。。。");
    }

}
