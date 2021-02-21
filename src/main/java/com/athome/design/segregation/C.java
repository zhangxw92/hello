package com.athome.design.segregation;

/**
 * A类通过引用接口来调用接口的具体实现，
 * 通常在项目中通过byname的方式将bean引入到类中
 */
public class C {

    public void hello(TestInterface testInterface) {
        testInterface.test();
    }

    public void hello2(TestInterface3 testInterface) {
        testInterface.test4();
        testInterface.test5();
    }

    public static void main(String[] args) {
        C a = new C();
        a.hello(new D());
        a.hello2(new D());
    }

}
