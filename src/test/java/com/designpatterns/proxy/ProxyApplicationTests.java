package com.designpatterns.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxyApplicationTests {

    @Test
    public void contextLoads() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("url", "user", "password");
        // 3. 获取sql语句的对象Statement
        Statement stmt = connection.createStatement();
        // 4. 执行sql语句，并返回结果
        ResultSet rs = stmt.executeQuery("sql");
    }

}
