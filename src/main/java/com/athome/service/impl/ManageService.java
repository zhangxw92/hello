package com.athome.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author zhangxw03
 * @Dat 2020-11-15 11:20
 * @Describe
 */
@Service
@Transactional
public class ManageService {
    @Autowired
    private BookServiceImpl bookService;

    public void bugBook() {
        for (int i = 1; i < 3; i++) {
            bookService.buy(i);
        }
    }
}
