package com.aloneness.spring.study.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean
    public A a(){
        return new A();
    }

}
