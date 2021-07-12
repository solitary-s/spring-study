package com.aloneness.spring.study.beanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConfig {

    @Bean
    public Hello hello() {
        return new Hello();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
