package com.aloneness.spring.study.transaction;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class A {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void methodA() {
        B b = new B();
        b.methodB();
    }
}
