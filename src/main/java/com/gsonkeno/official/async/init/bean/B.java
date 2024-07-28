package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
public class B {
    public B() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        log.info("B 构造器耗时5s, {}", Thread.currentThread().getName());
    }

    public void trigger() {
        System.out.println("B trigger");
    }
}
