package com.gsonkeno.official.async.init.config;

import com.gsonkeno.official.async.init.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@ComponentScan("com.gsonkeno.official.async.init")
public class SpringConfig {
//    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND)
//    public LionBean lionBean() throws InterruptedException {
//        return new LionBean();
//    }
//    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND)
//    public EmilyBean emilyBean() throws InterruptedException {
//        return new EmilyBean();
//    }
//
//    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND, initMethod = "init")
//    public A a() throws InterruptedException {
//        return new A();
//    }
//
//    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND)
//    public B b() throws InterruptedException {
//        return new B();
//    }

//    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND, initMethod = "init")
//    public C c(D d) throws InterruptedException {
//        return new C(d);
//    }
//
//    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND)
//    public D d() throws InterruptedException {
//        return new D();
//    }

    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND,
            initMethod = "init")
    public E e() throws InterruptedException {
        return new E();
    }

    @Bean(bootstrap = Bean.Bootstrap.BACKGROUND,
            initMethod = "init")
    public F f() throws InterruptedException {
        return new F();
    }


    @Bean
    public Executor bootstrapExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.initialize();
        return taskExecutor;
    }
}
