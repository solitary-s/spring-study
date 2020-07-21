package com.aloneness.spring.study.refresh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        A bean = context.getBean(A.class);
        System.out.println(bean);
    }
}
