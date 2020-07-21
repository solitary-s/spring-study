package com.aloneness.spring.study.refresh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public B b() {
        return new B("xiaoming");
    }

    @Bean
    public A a() {
        return new A();
    }
}
