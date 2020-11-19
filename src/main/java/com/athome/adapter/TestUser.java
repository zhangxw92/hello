package com.athome.adapter;

public class TestUser extends Target3 {


//    public void use(Target t) {
//        t.output();
//    }
//
//    public static void main(String[] args) {
//        TestUser t = new TestUser();
//        t.use(new Adapter(new Source()));
//    }


    @Override
    public void a() {
        System.out.println("aaaaaaaa");
    }

    public static void main(String[] args) {
        TestUser t = new TestUser();
        t.a();
    }
}
