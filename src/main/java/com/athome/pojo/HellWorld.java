package com.athome.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author zhangxw03
 * @Dat 2021-01-12 13:58
 * @Describe 测试bean生命周期
 */
public class HellWorld implements BeanNameAware, BeanFactoryAware, InitializingBean {

    private String name;
    private Integer age;

    public HellWorld() {
        System.out.println("构造方法执行，创建bean对象");
    }


    public void setBeanName(String s) {
        System.out.println("调用setBeanName方法为bean名称赋值");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用setBeanFactory方法设置bean工厂");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet方法");
    }

    public void init() {
        System.out.println("调用init方法");
    }

    public void destroy() {
        System.out.println("调用destroy方法");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("调用setName方法属性赋值");
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("调用setAge方法属性赋值");
    }
}
