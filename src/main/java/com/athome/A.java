package com.athome;

import javax.print.DocFlavor;

/**
 * @Author zhangxw03
 * @Dat 2020-11-09 13:20
 * @Describe
 */
public class A {

    private String name;
    private B b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A() {
        System.out.println("a created success");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}
