package com.springboot.learning.interceptor.afterController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustom {
    String name() default "Name Default";
    int val() default 1;
    int[] arr() default {1, 2};
}
