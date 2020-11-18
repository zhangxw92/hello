package com.athome.aop;

import org.springframework.stereotype.Component;

/**
 * @Author zhangxw03
 * @Dat 2020-11-13 16:43
 * @Describe
 */
@Component
public class MathImpl implements Math {
    public int add(int i, int j) {
        return i + j;
    }

    public int sub(int i, int j) {
        return i - j;
    }

}
