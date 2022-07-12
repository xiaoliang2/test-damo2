package com.athuang.springcloud;/**
 * @program: springcloud01
 * @description: 主启动
 * @author: Mr.Huang
 * @create: 2022-07-11 14:30
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: springcloud01
 *
 * @description: 主启动
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-11 14:30
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001
{
    public static void main(String[] args)
    {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
