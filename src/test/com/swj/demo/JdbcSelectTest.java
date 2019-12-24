package com.swj.demo;

import org.junit.Test;

import java.sql.SQLException;

public class JdbcSelectTest {
    @Test
    public void JdbcSelect() throws SQLException, ClassNotFoundException {
        JdbcSelect jdbcSelect = new JdbcSelect();
        System.out.println(jdbcSelect.queryData());
        if (jdbcSelect.queryData().equals("swl123")){
            System.out.println("PASS");
        }else {
            System.out.println("ERROR");
        }
    }
}
