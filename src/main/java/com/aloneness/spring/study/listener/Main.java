package com.aloneness.spring.study.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.aloneness.spring.study.listener");
        context.publishEvent(new MyApplicationEvent("hello"));
    }
}
