package com.gsonkeno.official.async.init.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

@Slf4j
public class C {
    private D d;

    public C(D d) throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(3);
        log.info("C 构造器耗时3s, {}", Thread.currentThread().getName());
        this.d = d;
    }



    public void init(){
        d.trigger();
    }
}
