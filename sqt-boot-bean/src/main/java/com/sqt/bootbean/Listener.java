package com.sqt.bootbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-13 22:38
 */
@Slf4j
public class Listener implements ApplicationRunner {

    public Listener() {
       log.info("==========>实例化了Listener类");
    }

    public void run(ApplicationArguments args) throws Exception {
        log.info("==========>我是 ListenerSun！");
    }
}
