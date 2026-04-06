package com.springboot.learning.Async.AsyncException;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class DefaultExceptionHandler implements AsyncUncaughtExceptionHandler {

    @Override
    public void handleUncaughtException(Throwable ex, Method method, @Nullable Object... params) {
        System.out.println("Error Caught" + ex.getMessage());
    }
}
