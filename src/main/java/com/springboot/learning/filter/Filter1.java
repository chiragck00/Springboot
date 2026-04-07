package com.springboot.learning.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest var1, ServletResponse var2, FilterChain var3) throws IOException, ServletException{
        System.out.println("Filter 1 doFilter before logic");
        var3.doFilter(var1, var2);
        System.out.println("Filter 1 doFilter after logic");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
