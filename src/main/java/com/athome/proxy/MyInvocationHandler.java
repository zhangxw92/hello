package com.athome.proxy;

import com.athome.User;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private UserService userService;

    public MyInvocationHandler() {

    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("111111111111111");
        Object invoke = method.invoke(userService, args);
        System.out.println("222222222222222");
        return invoke;
    }

    @Test
    public void test() {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        UserService userService = new UserServiceImpl();
        myInvocationHandler.setUserService(userService);
        UserService result = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), myInvocationHandler);
        User user = new User();
        user.setAge(11);
        user.setName("北京");
        result.addUser(user);

    }
}
