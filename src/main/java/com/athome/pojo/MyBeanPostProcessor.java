package com.athome.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @Author zhangxw03
 * @Dat 2021-01-12 14:36
 * @Describe
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("调用bean容器的后置处理器postProcessBeforeInitialization");
        return null;
    }

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("调用bean容器的后置处理器postProcessAfterInitialization");
        return null;
    }
}
