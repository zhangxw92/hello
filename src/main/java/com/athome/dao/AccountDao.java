package com.athome.dao;

import com.athome.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @Author zhangxw03
 * @Dat 2020-11-14 16:50
 * @Describe
 */
@Repository
public class AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //查询账户余额
    public Integer getAccount() {
        String sql = "select  id,money from account where id = ?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        Account account = jdbcTemplate.queryForObject(sql, new Object[]{1}, rowMapper);
        if (account != null) {
            return account.getMoney();
        }
        return null;
    }

    //更新账户余额
    public void update(Integer money) {
        String sql = "update account set money=? where id=?";
        jdbcTemplate.update(sql, money, 1);
    }
}
