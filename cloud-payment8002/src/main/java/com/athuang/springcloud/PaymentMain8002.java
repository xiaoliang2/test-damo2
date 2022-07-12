package com.athuang.springcloud;/**
 * @program: springcloud01
 * @description: 主启动
 * @author: Mr.Huang
 * @create: 2022-07-09 17:35
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud01
 *
 * @description: 主启动
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-09 17:35
 **/

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
