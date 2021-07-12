package com.aloneness.spring.study.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 3. 使用Bean后置处理器 BeanPostProcessor
 *
 * @author aloneness
 * @date 2020/6/20
 */
public class ThirdMethod implements BeanPostProcessor, InitializingBean {

    /**
     * 初始化后
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + " postProcessAfterInitialization");
        return bean;
    }

    /**
     * 初始化前
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + " postProcessBeforeInitialization");
        return bean;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
}
