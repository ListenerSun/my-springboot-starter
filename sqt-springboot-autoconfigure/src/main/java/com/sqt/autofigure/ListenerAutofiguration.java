package com.sqt.autofigure;

import com.sqt.bootbean.Listener;
import com.sqt.bootbean.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-13 23:30
 */
@Slf4j
@Configuration
//只有项目容器中存在Listener类的时候该配置类才会生效
@ConditionalOnBean(Listener.class)
public class ListenerAutofiguration {

    public ListenerAutofiguration(){
        log.info("==========>实例化 ListenerAutofiguration 类");
    }

//    @Bean
     //容器中不存在 Listener 类时会实例化 Listener 类
//    @ConditionalOnMissingBean(Listener.class)
//    @ConditionalOnProperty(name = "listener.enabled", havingValue = "true", matchIfMissing = true)
//    public Listener listener(){
//        return new Listener();
//    }

    @Bean
    public Test test(){
        return new Test();
    }
}
