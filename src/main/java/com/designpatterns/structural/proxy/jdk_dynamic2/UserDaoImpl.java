package com.designpatterns.structural.proxy.jdk_dynamic2;

/**
 * 目标对象
 * @author Rocky
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("正在保存");
	}

}
