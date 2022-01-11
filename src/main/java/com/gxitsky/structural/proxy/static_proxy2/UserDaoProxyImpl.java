package com.gxitsky.structural.proxy.static_proxy2;

/**
 * 代理实现
 *
 * @author Rocky
 */
public class UserDaoProxyImpl implements UserDao {

    private UserDao userDao;

    public UserDaoProxyImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 重写被代理的目标对象的方法
     */
    @Override
    public void save() {
        System.out.println("代理增强：  开始保存。。。。");
        userDao.save();
        System.out.println("代理增强：  保存结束。。。。");
    }

}
