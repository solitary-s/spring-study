package com.aloneness.spring.study.refresh;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class B implements ApplicationContextAware {

    private String name;

    public B(String name) {
        this.name = name;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }
}
