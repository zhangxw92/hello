package com.athome.mybatis.mapper;

import com.athome.pojo.Blog;

/**
 * @Author zhangxw03
 * @Dat 2020-11-19 11:36
 * @Describe
 */
public interface BlogMapper {

    public Blog selectBlog(Integer id);
}
