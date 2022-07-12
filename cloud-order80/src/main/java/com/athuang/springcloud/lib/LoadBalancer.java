package com.athuang.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import javax.xml.ws.Service;
import java.util.List;

/**
 * @program: springcloud01
 * @description: 自己写一个负载均衡算法
 * @author: Mr.Huang
 * @create: 2022-07-10 15:30
 **/
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
