package com.athome.adapter;

/**
 * 通过适配器，将被适配资源转为客户所需要
 */
public class Adapter implements Target {

    public Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    public void output() {
        Integer integer = source.output220();
        int i = integer / 44;
        System.out.println("适配后的到的结果：" + i + "v");
    }
}
