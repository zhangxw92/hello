package com.athome.design.yilaidaozhi2;

public class TVopenAndCloseImpl implements TVopenAndClose {

    public void open(TV tv) {
        System.out.println(tv.play());
    }

    public void close(TV tv) {
        System.out.println(tv.playClose());
    }
}
