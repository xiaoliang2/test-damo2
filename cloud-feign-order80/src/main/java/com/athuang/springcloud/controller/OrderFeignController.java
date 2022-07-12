package com.athuang.springcloud.controller;

import com.athuang.springcloud.entities.CommonResult;
import com.athuang.springcloud.entities.Payment;
import com.athuang.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud01
 *
 * @description: 控制层
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-10 17:03
 **/
@RestController
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }
}
