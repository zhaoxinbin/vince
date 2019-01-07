package com.pactera.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018/9/26.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/top_nav").setViewName("top_nav");
        registry.addViewController("/left_nav").setViewName("left_nav");
        registry.addViewController("/main").setViewName("main");

    }
}
