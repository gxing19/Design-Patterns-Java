package com.designpatterns.structural.flyweight.demo2;

import org.springframework.util.CollectionUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 * @author gxing
 * @desc TODO
 * @date 2021/11/3
 */
public class ConnectionPool {
    private static ArrayList<Connection> pools;
    private static String url = "jdbc:mysql://localhost:3306/db_name";
    private static String username = "root";
    private static String password = "123";
    private static String driverClassName = "com.mysql.jdbc.Driver";
    private static int poolSize = 10;

    static {
        cacheConnection();
    }

    public static void cacheConnection() {
        pools = new ArrayList<>(poolSize);
        try {
            Class.forName(driverClassName);
            for (int i = 0; i < poolSize; i++) {
                // 先缓存10个链接
                Connection conn = DriverManager.getConnection(url, username, password);
                pools.add(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        if (CollectionUtils.isEmpty(pools)) {
            cacheConnection();
        }
        Connection connection = pools.get(0);
        pools.remove(connection);
        return connection;
    }

    public synchronized void release(Connection conn) {
        pools.add(conn);
    }
}
