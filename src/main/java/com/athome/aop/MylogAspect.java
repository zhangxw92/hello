package com.athome.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author zhangxw03
 * @Dat 2020-11-13 16:46
 * @Describe
 */

@Component
@Aspect//标注当前类为切面
public class MylogAspect {

    /**
     * @Before将方法设置为前置通知； 必须设置value，其值为切入点表达式
     * "execution(public int com.athome.aop.MathImpl.add(int ,int )
     * public int->第一个*代表访问修饰符和返回值类型；
     * 第二个*表示包下的所有类
     * add->对应的*表示任何方法
     * ..表示任意参数
     */
    @Before(value = "execution(* com.athome.aop.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("方法名：" + name + ",方法参数：" + Arrays.toString(args));
        System.out.println("执行前置通知...");
    }
}
