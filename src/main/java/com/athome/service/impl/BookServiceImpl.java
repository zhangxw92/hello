package com.athome.service.impl;

import com.athome.dao.AccountDao;
import com.athome.dao.BookDao;
import com.athome.exception.MyException;
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
@Transactional
public class BookServiceImpl {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private BookDao bookDao;


    @Transactional(propagation = Propagation.REQUIRED)
    public void buy(Integer bookId) {
        //查书的数量
        Integer integer = bookDao.get(bookId);
        //书的数量-1
        bookDao.buy(integer, bookId);
        //先查账号的余额
        Integer account = accountDao.getAccount();
        if (account == null || account < 100) {
            throw new MyException("账户余额不足");
        }
        //账号表扣钱
        accountDao.update(account - 100);
    }
}
