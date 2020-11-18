package com.athome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhangxw03
 * @Dat 2020-11-09 11:45
 * @Describe
 */
public class Hello {

    private String name;

    public void hello() {
        System.out.println("this is my first Spring!");
        //System.out.println("测试获取属性值" + name);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Hello hello = (Hello) context.getBean("hello");
//        hello.hello();
        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);
    }

    public Hello() {
        System.out.println("hello create success!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
