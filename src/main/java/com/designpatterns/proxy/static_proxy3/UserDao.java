package com.designpatterns.proxy.static_proxy3;

/**
 * 目标对象
 * @author Rocky
 *
 */
public class UserDao extends BaseDao {

	public void update() {
		System.out.println("正在更新。。。。");
	}

}
