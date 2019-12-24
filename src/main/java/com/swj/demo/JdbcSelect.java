package com.swj.demo;

import java.sql.*;

public class JdbcSelect {

    //执行查询
    public String queryData() throws ClassNotFoundException, SQLException {
        /*
        * 1.得到Connection
        * 2.得到Statement，发送select语句
        * 3.对查询返回的“表格”进行解析
        */
        //1.得到连接
        // 1.1准备四大参数
        String deviceClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ams";
        String username = "root";
        String password = "24335526";
        //1.2.加载驱动类
        Class.forName(deviceClassName);
        //1.3.通过剩下的三个参数调用DriverManager的getConnection(),得到连接
        Connection connection = DriverManager.getConnection(url,username,password);
        //2.得到Statement,执行SELECT语句
        //2.1得到Statement对象；Connection的creatStatement()方法
        Statement statement = connection.createStatement();
        //2.2调用Statement的ResultSet rs = executeQuery(String querySql)
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        //3.解析ResultSet
        //使用ResultSet的next()方法移动行光标，返回值为boolean类型
        //3.1

        String student_name = "";
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            student_name = resultSet.getString("user_name");
//            System.out.println(id + "  " + student_name);
        }
        //4.关闭资源：倒关
        resultSet.close();
        statement.close();
        connection.close();
        //必须要关！！！
        return student_name;
    }

}