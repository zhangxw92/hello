package com.athome.factory;

public class PizzFactory {


    public PizzFactory() {

    }

    public Pizz createPizz(Integer type) {

        Pizz pizz = null;
        if (type == 1) {
            pizz = new OriginalPizz();
            pizz.setName("原味");
            pizz.prepare();
            pizz.bake();
            pizz.cut();
            pizz.pack();
            return pizz;
        } else {
            pizz = new BeefPizz();
            pizz.setName("牛肉");
            pizz.prepare();
            pizz.bake();
            pizz.cut();
            pizz.pack();
            return pizz;
        }
    }
}
