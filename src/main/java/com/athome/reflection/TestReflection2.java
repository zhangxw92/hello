package com.athome.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection2 {

    @Test
    public void test() throws Exception {

        Class<?> clazz = Class.forName("com.athome.reflection.Person");

        Constructor<?> constructor = clazz.getConstructor(Integer.class, String.class);

        Person person = (Person) constructor.newInstance(12, "京东");

        Field name = clazz.getField("age");

        name.set(person, 33);

        Method show = clazz.getMethod("show");
        show.invoke(person);

        System.out.println(person.toString());
    }

    @Test
    public void test2() throws Exception {

        Class<?> clazz = Class.forName("com.athome.reflection.Person");

        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Person person = (Person) constructor.newInstance("京东二号");

        Field filed = clazz.getDeclaredField("name");
        filed.setAccessible(true);
        filed.set(person, "京东三号");

        Method method = clazz.getDeclaredMethod("showNation", String.class);
        method.setAccessible(true);
        Object invoke = method.invoke(person, "中国");

        System.out.println(person);
    }


    @Test
    public void test3() throws Exception {
        Class<Person> personClass = Person.class;
        Class<?> aClass = Class.forName("com.athome.reflection.Person");
        Person p = new Person();
        Class<? extends Person> aClass1 = p.getClass();
        Class<?> aClass2 = TestReflection2.class.getClassLoader().loadClass("com.athome.reflection.Person");

        System.out.println(personClass == aClass);
        System.out.println(personClass == aClass1);
        System.out.println(personClass == aClass2);
    }

}
