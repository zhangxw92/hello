package com.athome.design.segregation;

public class D implements TestInterface, TestInterface3 {
    public void test() {
        System.out.println("方法1");
    }

    public void test4() {
        System.out.println("方法4");
    }

    public void test5() {
        System.out.println("方法5");
    }
}