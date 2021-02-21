package com.athome.design.lishitihuan;

public class B extends A {

    //重写了父类方法，违反了里氏替换原则
    public int sum(int a, int b) {
        return a - b;
    }

    //解决的方式为B不要继承A，如果想引用A的方法，聚合、依赖、组合的方式
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.sum(1, 3));
    }
}
