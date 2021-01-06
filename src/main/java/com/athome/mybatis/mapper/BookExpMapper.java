package com.athome.mybatis.mapper;

import com.athome.pojo.Blog;
import com.athome.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhangxw03
 * @Dat 2020-11-19 11:36
 * @Describe
 */
@Mapper
public interface BookExpMapper {

    void save(Book book);
}
