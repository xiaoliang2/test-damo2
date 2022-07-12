package com.athuang.springcloud.service;/**
 * @program: springcloud01
 * @description:
 * @author: Mr.Huang
 * @create: 2022-07-11 13:52
 **/

import org.springframework.stereotype.Component;

/**
 * @program: springcloud01
 *
 * @description:
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-11 13:52
 **/
@Component
public class PaymentFalbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return"服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
