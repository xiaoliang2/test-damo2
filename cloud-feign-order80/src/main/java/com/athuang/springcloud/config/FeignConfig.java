package com.athuang.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud01
 *
 * @description: feign的日志类
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-10 17:20
 **/
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
