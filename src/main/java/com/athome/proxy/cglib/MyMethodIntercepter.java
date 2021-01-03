package com.athome.proxy.cglib;

import com.athome.User;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

public class MyMethodIntercepter implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("1111111111111111");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("2222222222222222");
        return invoke;
    }

    @Test
    public void test() {
        User user = new User();
        user.setName("aaaa");
        user.setAge(12);

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MyMethodIntercepter());

        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.addUser(user);
    }
}
