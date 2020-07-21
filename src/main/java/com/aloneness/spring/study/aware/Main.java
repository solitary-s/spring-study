package com.aloneness.spring.study.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.aloneness.spring.study.aware");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames.toString());
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println(context.getBean("hello"));
//        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
    }
}
