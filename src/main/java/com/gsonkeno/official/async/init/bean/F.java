package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class F {
    private volatile boolean init = false;
    public F() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(5);
        log.info("F 构造器耗时5s, {}", Thread.currentThread().getName());
    }

    public void init() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        log.info("F init 耗时3s, {}", Thread.currentThread().getName());
        init = true;
    }
    public void custom(){
        if (!init){
            throw new RuntimeException("f还未初始化完成");
        }
    }
}
