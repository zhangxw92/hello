package com.athome.reflection;

import org.omg.CORBA.PERSIST_STORE;

public class Person {

    public Integer age;

    private String name;

    public Person() {

    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    private Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("我是一个人");
    }

    private String showNation(String nation) {
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
