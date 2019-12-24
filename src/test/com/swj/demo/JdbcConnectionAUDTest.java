package com.swj.demo;


import org.junit.Test;

import java.sql.SQLException;

public class JdbcConnectionAUDTest {
    @Test
    public void jdbcConnection() throws SQLException, ClassNotFoundException {
        JdbcConnectionAUD jdbcConnectionAUD = new JdbcConnectionAUD();
        int changeRow = 1;
        if(jdbcConnectionAUD.jdbcConnection() == 1){
            System.out.println("TRUE");
        }else {
            System.out.println("ERROR");
        }
    }
}
