package com.athome;

import java.util.List;

/**
 * @Author zhangxw03
 * @Dat 2020-11-09 13:20
 * @Describe
 */
public class B {
    //private A a;

    private String bid;
    private List<String> aas;

    public B() {
        System.out.println("b created success");
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public List<String> getAas() {
        return aas;
    }

    public void setAas(List<String> aas) {
        this.aas = aas;
    }

//    public A getA() {
//        return a;
//    }
//
//    public void setA(A a) {
//        this.a = a;
//    }


    @Override
    public String toString() {
        return "B{" +
                "bid='" + bid + '\'' +
                ", aas=" + aas +
                '}';
    }
}
