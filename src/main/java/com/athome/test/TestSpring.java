package com.athome.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.athome.Hello;
import com.athome.pojo.HellWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhangxw03
 * @Dat 2020-11-11 9:41
 * @Describe
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
        HellWorld dataSource = ct.getBean("helloWorld", HellWorld.class);
        System.out.println(dataSource);
    }
}
