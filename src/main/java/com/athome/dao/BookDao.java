package com.athome.dao;

import com.athome.pojo.Account;
import com.athome.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @Author zhangxw03
 * @Dat 2020-11-14 17:27
 * @Describe
 */
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer get(Integer bookId) {
        String sql = "select total from book where id = ?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
        Book book = jdbcTemplate.queryForObject(sql, new Object[]{bookId}, rowMapper);
        return book.getTotal();
    }

    public void buy(Integer integer, Integer bookId) {
        String sql = "update book set total=?-1 where id = ?";
        jdbcTemplate.update(sql, new Object[]{integer, bookId});
    }
}
