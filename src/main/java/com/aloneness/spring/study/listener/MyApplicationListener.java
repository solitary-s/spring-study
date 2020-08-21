package com.aloneness.spring.study.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event);
        System.out.println(event.getSource());
    }
}
