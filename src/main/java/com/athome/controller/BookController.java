package com.athome.controller;

import com.athome.service.impl.BookServiceImpl;
import com.athome.service.impl.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author zhangxw03
 * @Dat 2020-11-14 16:49
 * @Describe
 */
@Controller
public class BookController {
    @Autowired
    private BookServiceImpl accountService;
    @Autowired
    private ManageService manageService;

    public void buy2() {
        manageService.bugBook();
    }

    public void buy() {
        accountService.buy(1);
    }
}
