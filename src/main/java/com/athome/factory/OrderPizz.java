package com.athome.factory;

public class OrderPizz {

    public static void main(String[] args) {
        PizzFactory pizzFactory = new PizzFactory();
        Pizz pizz = pizzFactory.createPizz(4);
        System.out.println(pizz);
    }
}
