package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

@Slf4j
public class E {
    @Autowired
    private F f;
    public E() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        log.info("E 构造器耗时3s, {}",
                Thread.currentThread().getName());
    }
    public void init() {
        log.info("E init执行, {}",
                Thread.currentThread().getName());
        f.custom();
    }
}
