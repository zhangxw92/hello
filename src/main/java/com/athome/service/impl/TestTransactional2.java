package com.athome.service.impl;

import com.athome.exception.MyException;
import com.athome.pojo.Blog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransactional2 {

    @Test
    public void getInstance() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlogServiceImpl blogServiceImpl = ctx.getBean("blogServiceImpl", BlogServiceImpl.class);
        System.out.println(blogServiceImpl);
        blogServiceImpl.save();
        // return blogServiceImpl;
    }

//    @Test
//    public void test() throws MyException {
//        BlogServiceImpl instance = getInstance();
//        Blog blog = new Blog();
//        blog.setName("小说");
//        blog.setIdNo("66");
//        instance.save(blog);
//    }
}
