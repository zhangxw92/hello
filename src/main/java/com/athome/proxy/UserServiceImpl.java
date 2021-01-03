package com.athome.proxy;

import com.athome.User;

public class UserServiceImpl implements UserService {
    public void addUser(User user) {
        System.out.println("User:" + user.toString());
    }
}
