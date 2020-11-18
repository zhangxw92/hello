package com.athome.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.athome.controller.BookController;
import com.athome.dao.BookDao;
import com.athome.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * @Author zhangxw03
 * @Dat 2020-11-14 17:40
 * @Describe
 */
public class TestBook {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookController bookContoller = ct.getBean("bookController", BookController.class);
          bookContoller.buy();
 //       bookContoller.buy2();
//        DruidDataSource dataSource = ct.getBean("dataSource", DruidDataSource.class);
//        System.out.println(dataSource);

//        JdbcTemplate jdbcTemplate = ct.getBean("jdbcTemplate", JdbcTemplate.class);
//        System.out.println(jdbcTemplate);
//        String sql1= "insert into emp values(null,'李四',33)";
//        jdbcTemplate.update(sql1);
//        String sql = "select * from book";
//        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
//        Book book = jdbcTemplate.queryForObject(sql, rowMapper);
//        System.out.println(book.getTotal());
    }
}
