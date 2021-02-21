package com.athome.design.yilaidaozhi2;

public class Test {

    public static void main(String[] args) {

        TVopenAndClose tVopenAndClose = new TVopenAndCloseImpl();
        TV tcltv = new TCLTV();
        tVopenAndClose.open(tcltv);
        tVopenAndClose.close(tcltv);
    }
}
