package com.swj.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionAUD {
    public  int  jdbcConnection() throws ClassNotFoundException, SQLException {
        /*
         *jdbc四大参数
         * driverClassName:com.mysql.jdbc.Driver
         * url: jdbd:mysql://localhost:3306/db_Name
         * username: root
         * password:24335526
         */
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ams";
        String jdbc_Usernme = "root";
        String jdbc_password = "24335526";

        //连接数据库
        Connection connection = DriverManager.getConnection(url, jdbc_Usernme, jdbc_password);

        /*
         * 对数据库增删改查
         * 1.通过Connection对象创建Statement
         * >statement语句的发送器，他的功能是向数据库发送SQL语句
         * 2.调用他的int executeUpdate(String sql),他可以发送DML、DDL
         */
        //1.通过Connectio得到Statement
        Statement statement = connection.createStatement();
        //2.使用Statement发送SQL语句
        //2.1插入
        String sql = "INSERT INTO student VALUES('13','zhangsan','student1')";
        int re = statement.executeUpdate(sql);
        System.out.println(re);
        //2.2更新
//        String sql = "UPDATE student SET id='123',name='zhangsan',info='student' WHERE id='1'";
//        int re = statement.executeUpdate(sql);
//        System.out.println(re);

        //2.3删除
//        String sql = "DELETE FROM student";
//        int re = statement.executeUpdate(sql);
//        System.out.println(re);
        return re;
    }
}
