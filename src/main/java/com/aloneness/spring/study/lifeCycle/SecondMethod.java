package com.aloneness.spring.study.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 2. 通过InitializingBean、DisposableBean接口定义初始化，销毁方法
 *
 * @author aloneness
 * @date 2020/6/20
 */
public class SecondMethod implements InitializingBean, DisposableBean {

    /**
     * 初始化方法
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init ...");
    }

    /**
     * 销毁方法
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy ...");
    }
}
