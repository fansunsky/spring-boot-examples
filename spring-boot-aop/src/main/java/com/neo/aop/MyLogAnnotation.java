package com.neo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fanhaoyu
 * @Description: 自定义注解
 * @date 2022/7/25 20:57
 */
//表示次注解可以标注在类和方法上
@Target({ElementType.METHOD, ElementType.TYPE})
//运行时生效
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLogAnnotation {
    //定义一个变量，可以接受参数
    String desc() default " ";
}

