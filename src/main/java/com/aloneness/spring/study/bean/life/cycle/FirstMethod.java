package com.aloneness.spring.study.bean.life.cycle;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 1. 指定初始化和销毁方法
 *
 * @author aloneness
 * @date 2020/6/20
 */
@Configuration
public class FirstMethod {

    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    @Bean
    public ThirdMethod thirdMethod(){
        return new ThirdMethod();
    }
}
