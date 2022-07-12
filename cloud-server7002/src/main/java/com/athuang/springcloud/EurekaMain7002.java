package com.athuang.springcloud;/**
 * @program: springcloud01
 * @description: 主启动
 * @author: Mr.Huang
 * @create: 2022-07-09 17:22
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
 * @create: 2022-07-09 17:22
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
