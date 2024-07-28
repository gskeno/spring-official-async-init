package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

@Slf4j
public class A {

    @Autowired
    private B b;

    public A() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(3);
        log.info("A 构造器耗时3s, {}", Thread.currentThread().getName());
    }

    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void init(){
        b.trigger();
    }
}
