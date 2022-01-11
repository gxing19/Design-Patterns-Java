package com.gxitsky.structural.proxy.jdk_dynamic2;

/**
 * 目标对象
 *
 * @author Rocky
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(Long id, String name) {
        System.out.println("正在保存, id:" + id + ", name:" + name);
    }

}
