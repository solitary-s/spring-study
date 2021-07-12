package com.aloneness.spring.study.lifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author aloneness
 * @date 2020/6/20
 */
public class Main {
    public static void main(String[] args) {

        /**
         * 单实例
         * Car constructor...
         * Car init...
         * 容器创建完成
         * Car destroy...
         *
         * 多实例
         * 容器创建完成
         * Car constructor...
         * Car init...
         *
         * 单实例：
         *    创建-初始化: 在容器启动的时候创建对象并调用初始化方法初始化，获取Bean实例前已经初始化
         *    销毁: 容器关闭的时候调用销毁方法
         * 多实例：
         *    创建：创建容器，并不会去创建Bean实例，容器创建完成
         *    初始化：获取Bean实例时，才会创建Bean并调用初始化方法
         *    销毁：容器不会管理这个Bean，不会调用销毁方法
         */
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FirstMethod.class);
//        System.out.println("容器创建完成");
//        applicationContext.getBean(Car.class);
//        applicationContext.close();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FirstMethod.class);
        System.out.println("容器创建完成");
//        applicationContext.getBean(ThirdMethod.class);
        applicationContext.close();

    }
}
