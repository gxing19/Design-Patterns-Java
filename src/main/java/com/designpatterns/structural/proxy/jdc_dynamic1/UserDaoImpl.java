package com.designpatterns.structural.proxy.jdc_dynamic1;

/**
 * 目标对象
 * @author Rocky
 *
 */
public class UserDaoImpl implements UserDao {
	@Override
	public void update(int id, String name) {
		System.out.println("根据ID更新名称,id = " + id + "; name = " + name );
	}
}
