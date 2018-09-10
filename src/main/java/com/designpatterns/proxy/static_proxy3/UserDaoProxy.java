package com.designpatterns.proxy.static_proxy3;

/**
 * 代理对象
 *
 * @author Rocky
 */
public class UserDaoProxy extends BaseDao {

    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("代理增强：  开始保存。。。。");
        userDao.save();
        System.out.println("代理增强：  保存结束。。。。");
    }

    public void update() {
        System.out.println("代理增强：  开始更新。。。。");
        userDao.update();
        System.out.println("代理增强：  更新结束。。。。");
    }
}
