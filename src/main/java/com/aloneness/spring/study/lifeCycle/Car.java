package com.aloneness.spring.study.lifeCycle;


/**
 * @author aloneness
 * @date 2020/6/20
 */
public class Car {

    public Car() {
        System.out.println("Car constructor...");
    }

    public void init() {
        System.out.println("Car init...");
    }

    // 销毁
    public void destroy() {
        System.out.println("Car destroy...");
    }
}
