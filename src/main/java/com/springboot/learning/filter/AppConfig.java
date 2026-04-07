package com.springboot.learning.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    public CustomInterceptor1 customInterceptor1;

    @Autowired
    public CustomInterceptor2 customInterceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor1)
                .addPathPatterns("/api/*")
                .excludePathPatterns("/api/delete");

        registry.addInterceptor(customInterceptor2)
                .addPathPatterns("/api/*")
                .excludePathPatterns("/api/put");
    }

    @Bean
    public FilterRegistrationBean<Filter1> filter1(){
        FilterRegistrationBean<Filter1> filter1 = new FilterRegistrationBean<>();
        filter1.addUrlPatterns("/*");
        filter1.setFilter(new Filter1());
        filter1.setOrder(1);
        return filter1;
    }

    @Bean
    public FilterRegistrationBean<Filter2> filter2(){
        FilterRegistrationBean<Filter2> filter2 = new FilterRegistrationBean<>();
        filter2.addUrlPatterns("/*");
        filter2.setFilter(new Filter2());
        filter2.setOrder(2);
        return filter2;
    }
}
