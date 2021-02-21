package com.athome.design.segregation;

/**
 * A类通过引用接口来调用接口的具体实现，
 * 通常在项目中通过byname的方式将bean引入到类中
 */
public class A {

    public void hello(TestInterface testInterface) {
        testInterface.test();
    }

    public void hello2(TestInterface2 testInterface) {
        testInterface.test2();
        testInterface.test3();
    }

    public static void main(String[] args) {
        A a = new A();
        a.hello(new B());
        a.hello2(new B());
    }

}
