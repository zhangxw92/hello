package com.athome.design.danyizhize;

/**
 * 单一职责
 */
public class Danyizhiye {

    public void runRoad(String name) {
        System.out.println(name + "在路上跑");
    }

    public void runAir(String name) {
        System.out.println(name + "在天上飞的");
    }

    public void runWater(String name) {
        System.out.println(name + "在水里游");
    }

    public static void main(String[] args) {
        Danyizhiye d = new Danyizhiye();
        d.runRoad("汽车");

        d.runAir("飞机");

        d.runWater("游艇");
    }
}
