package com.athome.design.segregation;

public class B implements TestInterface, TestInterface2 {
    public void test() {
        System.out.println("方法1");
    }

    public void test2() {
        System.out.println("方法2");
    }

    public void test3() {
        System.out.println("方法3");
    }
}
