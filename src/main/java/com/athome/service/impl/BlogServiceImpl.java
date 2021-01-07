package com.athome.service.impl;

import com.athome.dao.AccountDao;
import com.athome.dao.BookDao;
import com.athome.exception.MyException;
import com.athome.mybatis.mapper.BlogExpMapper;
import com.athome.pojo.Blog;
import com.athome.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author zhangxw03
 * @Dat 2020-11-14 16:51
 * @Describe
 */
@Service
public class BlogServiceImpl {

    @Autowired
    private BlogExpMapper blogExpMapper;
    @Autowired
    private BookServiceImpl bookService;


    @Transactional(propagation = Propagation.REQUIRED)
    public void save() {

        Blog blog1 = new Blog();
        blog1.setIdNo("123");
        blog1.setName("123");
        blogExpMapper.save(blog1);

        Book book = new Book();
        book.setName("ceshi");
        book.setTotal(10);
        bookService.save(book);

        //int i = 10 / 0;
    }
}
