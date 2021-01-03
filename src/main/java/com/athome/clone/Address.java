package com.athome.clone;

/**
 * @Author zhangxw03
 * @Dat 2020-11-26 10:33
 * @Describe
 */
public class Address {

    public String province;

    public String city;

    public Address() {

    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
