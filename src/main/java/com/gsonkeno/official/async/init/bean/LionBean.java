package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class LionBean {

    public LionBean() throws InterruptedException {
        TimeUnit.SECONDS.sleep(7);
        log.info("LionBean init 耗时7s, {}", Thread.currentThread().getName());
    }
}
