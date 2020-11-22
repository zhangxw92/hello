package com.athome.factory;

public abstract class Pizz {

    private String name;

    //不同披萨准备原材料不一样，由具体的实现类来实现
    public abstract void prepare();

    public void bake() {
        System.out.println("披萨烘烤...");
    }

    public void cut() {
        System.out.println("披萨切割");
    }

    public void pack() {
        System.out.println("披萨打包");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizz{" +
                "name='" + name + '\'' +
                '}';
    }
}
