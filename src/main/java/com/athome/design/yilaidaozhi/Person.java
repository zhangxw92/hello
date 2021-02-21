package com.athome.design.yilaidaozhi;

/**
 * 实现这个人接收信息的方法，第一次接收email 第二次迭代增加要支持接收微信消息
 */
public class Person {

    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }

    //1、第一这种方式违反了依赖倒置原则，该方法依赖的是实体类
    //2、增加一个需求，可以接收微信消息，那么只能去重载方法
    //3、解决方式，这个方法依赖接口，发送的消息体是email或者微信都满足
    public void receive(Email email) {
        System.out.println("接受到的信息为：" + email.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "邮件信息！";
    }
}
