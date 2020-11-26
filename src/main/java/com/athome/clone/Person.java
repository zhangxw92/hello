package com.athome.clone;

import java.io.Serializable;

/**
 * @Author zhangxw03
 * @Dat 2020-11-26 10:33
 * @Describe
 */
public class Person implements Serializable, Cloneable {

    private String name;
    private int id;
    private Address address;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        this.address = new Address();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String province, String city) {
        address.province = province;
        address.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("华东", 1);
        //Address address = new Address("北京市", "海淀区");
        //person.setAddress(address);
        person.setAddress("北京市", "海淀区");

        Person p2 = (Person) person.clone();

        System.out.println(person);
        System.out.println(p2);

        System.out.println(person.hashCode());
        System.out.println(p2.hashCode());

        //Address address1 = new Address("北京市", "朝阳区");
        p2.setId(3);
        p2.setName("华西");
        p2.setAddress("北京市", "朝阳区");
        System.out.println(person);
        System.out.println(p2);
        //cc
    }


}
