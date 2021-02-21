package com.athome.design.ocp;

/**
 * 遵循Ocp原则
 */
public class DrawUtil {

    public static void main(String[] args) {
        DrawUtil.drow(new Circle());
        DrawUtil.drow(new Square());
    }

    public static void drow(Sharp sharp) {
        sharp.drow();
    }

}
