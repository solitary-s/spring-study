package com.aloneness.spring.study.transaction;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class B {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void methodB() {

    }
}
