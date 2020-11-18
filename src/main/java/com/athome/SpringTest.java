package com.athome;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhangxw03
 * @Dat 2020-11-09 15:53
 * @Describe
 */
public class SpringTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
        //SpringTest springTest = ct.getBean("springTest", SpringTest.class);
//        User user = ct.getBean("user", User.class);
//        System.out.println(user);
//        User user1 = ct.getBean("user1", User.class);
//        System.out.println(user1);
//        A a = ct.getBean("a", A.class);
//        System.out.println(a);
        User user = ct.getBean("user2", User.class);
        System.out.println(user);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("调用set方法设置属性值");
        this.name = name;
    }

    public SpringTest() {
        System.out.println("调用构造方法");
    }

    public void setBeanName(String s) {
        System.out.println("设置beanName:" + s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用beanFactory方法");
    }

    public void a() {
        System.out.println("初始化方法调用a");
    }

    public void b() {
        System.out.println("bean销毁方法调用b");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean方法调用");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean方法调用");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware方法调用");
    }
}
