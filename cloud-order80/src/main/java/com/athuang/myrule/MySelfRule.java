package com.athuang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud01
 *
 * @description: 定义负载均衡方法
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-10 15:01
 **/

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        /**
         * 定义为随机
         */
        return new RandomRule();
    }
}
