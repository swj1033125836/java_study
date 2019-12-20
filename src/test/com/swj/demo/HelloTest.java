package com.swj.demo;

import org.junit.Test;

public class HelloTest {
    @Test
    public void add() {
        long sum = 191;
        Hello hello = new Hello(8);
        long c = hello.add(5,6);
        if(sum == c){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

    @Test
    public void addA() {
        long sum = 191;
        long c = Hello.addA(5,6);
        if(sum == c){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

}
