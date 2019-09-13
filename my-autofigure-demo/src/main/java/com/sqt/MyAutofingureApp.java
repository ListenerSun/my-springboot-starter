package com.sqt;

import com.sqt.bootbean.Listener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-14 0:07
 */
@SpringBootApplication
public class MyAutofingureApp {
    public static void main(String[] args) {
        SpringApplication.run(MyAutofingureApp.class);
    }

    //为了测试 @ConditionalOnBean(Listener.class) 的作用
//    @Bean
//    @ConditionalOnMissingBean(Listener.class)
//    @ConditionalOnProperty(name = "listener.enabled", havingValue = "true", matchIfMissing = true)
//    public Listener listener(){
//        return new Listener();
//    }
}
