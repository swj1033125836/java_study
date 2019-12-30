package com.swj.demo;

import java.sql.*;

public class JdbcSelectNormalization {
    public String[] selectUser() throws ClassNotFoundException, SQLException {

        Connection connection = null;//定义引用
        Statement statement = null;
        ResultSet resultSet = null;
        String args[] = new String[2000];
        int i = 0;
        try {
            /*
             *一、得到连接
             */
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/ams";
            String userName = "root";
            String passWord = "24335526";

            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, userName, passWord);//实例化

            /*
             *二、创建Statement
             */
            statement = connection.createStatement();
            String sql = "select * from users";
            resultSet = statement.executeQuery(sql);
            /*
             *三、循环遍历resultSet,打印其中数据
             * getString()和getObject()比较通用
             */

//            while (resultSet.next()){
//                args[i] = (resultSet.getString("org_id") +":"+
//                        resultSet.getString("user_id") +":"+ resultSet.getString("user_name"));
//                i++;
//            }
            int count = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()){
                for (int a = 1;a <= count; a++){//遍历列
                    args[i] = resultSet.getString(a);
                    i++;
                }
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            //关闭
            if (resultSet != null)resultSet.close();
            if (statement != null)statement.close();
            if (connection != null)connection.close();
        }
        return args;
    }
}