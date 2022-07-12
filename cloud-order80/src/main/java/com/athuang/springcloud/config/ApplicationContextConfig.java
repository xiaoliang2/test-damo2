package com.athuang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud01
 *
 * @description:
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-09 14:49
 **/
@Configuration
public class ApplicationContextConfig
{
    @Bean
//    @LoadBalanced    //使用默认的负载均衡机制
    public RestTemplate restTemplate()
    {

        return new RestTemplate();
    }
}
