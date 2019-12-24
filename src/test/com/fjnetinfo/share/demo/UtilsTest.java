package com.fjnetinfo.share.demo;

import com.swj.demo.Hello;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

    private Hello mHello = null;

    @Before
    public void setUp() throws Exception {
        mHello = new Hello(6);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void parseData() {
        mHello.add(1,2);
    }
}