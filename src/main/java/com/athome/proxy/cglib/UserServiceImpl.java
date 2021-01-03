package com.athome.proxy.cglib;

import com.athome.User;
import com.athome.proxy.UserService;

public class UserServiceImpl {
    public final void addUser(User user) {
        System.out.println("User:" + user.toString());
    }
}
