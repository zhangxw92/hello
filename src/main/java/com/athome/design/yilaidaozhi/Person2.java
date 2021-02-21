package com.athome.design.yilaidaozhi;

/**
 * 实现这个人接收信息的方法，第一次接收email 第二次迭代增加要支持接收微信消息
 */
public class Person2 {

    public static void main(String[] args) {
        Person2 p = new Person2();
        p.receive(new Email2());
        p.receive(new weixin());
    }

    public void receive(Ireceiver receiver) {
        System.out.println("接受到的信息为：" + receiver.getInfo2());
    }
}

interface Ireceiver {
    String getInfo2();
}

class Email2 implements Ireceiver {

    public String getInfo2() {
        return "邮件信息";
    }
}

class weixin implements Ireceiver {

    public String getInfo2() {
        return "微信信息";
    }
}
