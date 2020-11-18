package com.athome.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhangxw03
 * @Dat 2020-11-13 17:00
 * @Describe
 */
public class TestAop {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Math mathImpl = ct.getBean("mathImpl", Math.class);
//        System.out.println(mathImpl.sub(1, 1));

        HandlerTest handlerTest = ct.getBean("handlerTest", HandlerTest.class);
        handlerTest.test();
    }
}
