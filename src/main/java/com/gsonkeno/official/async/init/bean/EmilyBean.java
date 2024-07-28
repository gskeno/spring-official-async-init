package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class EmilyBean {
    public EmilyBean() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        log.info("EmilyBean init 耗时 5s, {}", Thread.currentThread().getName());
    }
}
