package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class D {
    public D() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        log.info("D 构造器耗时5s, {}", Thread.currentThread().getName());
    }

    public void trigger() {
        System.out.println("D trigger");
    }
}
