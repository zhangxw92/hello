package com.athome.service.impl;

import com.athome.dao.AccountDao;
import com.athome.dao.BookDao;
import com.athome.exception.MyException;
import com.athome.mybatis.mapper.BlogExpMapper;
import com.athome.pojo.Blog;
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


    @Transactional
    public void save(Blog blog) throws MyException {

        blogExpMapper.save(blog);

        throw new RuntimeException("回滚");
    }
}
