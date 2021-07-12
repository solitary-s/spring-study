package com.aloneness.spring.study.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);

        Calculator calculator = applicationContext.getBean(Calculator.class);
        calculator.div(4, 2);

    }
}
