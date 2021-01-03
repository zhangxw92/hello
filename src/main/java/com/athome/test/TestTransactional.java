package com.athome.test;

import com.athome.pojo.Blog;
import com.athome.service.impl.BlogServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransactional {

    public BlogServiceImpl getInstance() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlogServiceImpl blogServiceImpl = ctx.getBean("blogServiceImpl", BlogServiceImpl.class);
        System.out.println(blogServiceImpl);
        return blogServiceImpl;
    }

    @Test
    public void test() {
//        BlogServiceImpl instance = getInstance();
//        Blog blog = new Blog();
//        blog.setName("小说");
//        blog.setIdNo("123");
//        instance.save(blog);
    }
}
