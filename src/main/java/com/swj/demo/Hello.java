package com.swj.demo;

public class Hello {

    private String swj = "swl\n";
    private int mF = 0;

    public Hello(int f) {
        mF = f;
    }

    public long add(int a, long b) {
        long c = a + b + mF;
        System.out.print(swj);
        return c;
    }

    public static long addA(int a, long b) {
        long c = a + b;
        System.out.print("eee");
        return c;
    }

}
