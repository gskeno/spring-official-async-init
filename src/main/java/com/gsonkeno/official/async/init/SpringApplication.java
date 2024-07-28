package com.gsonkeno.official.async.init;

import com.gsonkeno.official.async.init.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StopWatch;

public class SpringApplication {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
