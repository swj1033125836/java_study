package com.swj.demo;

import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;

public class JdbcSelectNormalizationTest {
    @Test
    public void JdbcSelectNormalization() throws SQLException, ClassNotFoundException {
        JdbcSelectNormalization jdbcSelectNormalization = new JdbcSelectNormalization();

        System.out.println(Arrays.toString(jdbcSelectNormalization.selectUser()));
        String testResult = "FAIL";
        for (int i = 0;i<2000;i++){

            if (jdbcSelectNormalization.selectUser()[i].equals("fjnetinfo")){
                testResult = "PASS";
                break;
            }
        }
        System.out.println(testResult);
    }
}
