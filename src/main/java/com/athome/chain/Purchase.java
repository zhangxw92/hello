package com.athome.chain;

public class Purchase {

    //采购申请编号
    private int id;
    //采购金额
    private double sum;

    public Purchase(int id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }

}
