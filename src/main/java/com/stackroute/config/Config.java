package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


    @Configuration
    @EnableWebMvc
    @ComponentScan(basePackages = "com.stackroute")
    public class Config {

        @Bean
        public ViewResolver viewResolver() {
            InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setPrefix("/WEB-INF/pages/");
            viewResolver.setSuffix(".jsp");
            return viewResolver;
        }
//        @Bean
//        public User user()
//        {
//            User user1=new User();
//            user1.setName("samaresh");
//            return user1;
//        }
    }

