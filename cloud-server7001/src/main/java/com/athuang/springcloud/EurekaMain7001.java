package com.athuang.springcloud;/**
 * @program: springcloud01
 * @description: 主启动
 * @author: Mr.Huang
 * @create: 2022-07-09 16:53
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud01
 *
 * @description: 主启动
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-09 16:53
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}