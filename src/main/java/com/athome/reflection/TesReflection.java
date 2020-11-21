package com.athome.reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class TesReflection {

    //new对象，反射创建对象，什么时候会用反射？
    //如何看待反射和封装的两门技术

    @Test
    public void test1() throws Exception {

        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getConstructor(Integer.class, String.class);
        Person tome = constructor.newInstance(10, "Tome");
        System.out.println(tome.toString());

        Field field = clazz.getDeclaredField("age");
        field.set(tome, 23);
        System.out.println(tome.toString());

        Method method = clazz.getDeclaredMethod("show");
        method.invoke(tome);

//        Method method2 = clazz.getDeclaredMethod("showNation", String.class);
//        method2.invoke(tome, "中国");
    }

    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;

        Constructor<Person> cons = clazz.getDeclaredConstructor(String.class);
        cons.setAccessible(true);
        Person jarry = cons.newInstance("Jarry");
        System.out.println(jarry);

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(jarry, "笑笑");
        System.out.println(jarry);

        Method method = clazz.getDeclaredMethod("showNation", String.class);
        method.setAccessible(true);
        method.invoke(jarry, "美国");

    }

    @Test
    public void test3() throws Exception {
        Class<Person> personClass = Person.class;

        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();

        Class<?> aClass1 = Class.forName("com.athome.reflection.Person");

        System.out.println(personClass == aClass);
        System.out.println(aClass == aClass1);

        ClassLoader classLoader = TesReflection.class.getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("com.athome.reflection.Person");
        System.out.println(aClass2);
        System.out.println(personClass == aClass2);

    }

    @Test
    public void test4() {
        ClassLoader classLoader = TesReflection.class.getClassLoader();
        System.out.println(TesReflection.class.getClassLoader());
        System.out.println(classLoader.getParent());

        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);

    }

    @Test
    public void test5() throws IOException {

        //读取配置文件

        Properties properties = new Properties();

        System.out.println(this.getClass().getResource("/db.properties").getPath());
        FileInputStream fileInputStream = new FileInputStream(this.getClass().getResource("/db.properties").getPath());

        properties.load(fileInputStream);

        String property = properties.getProperty("jdbc.username");
        String property1 = properties.getProperty("jdbc.password");
        System.out.println(property + "---" + property1);
    }

    @Test
    public void test6() throws Exception {
        Object instance = getInstance("com.athome.reflection.TesReflection");
        System.out.println(instance);
    }

    public Object getInstance(String path) throws Exception {
        Class<?> aClass = Class.forName(path);
        return aClass.newInstance();
    }
}
