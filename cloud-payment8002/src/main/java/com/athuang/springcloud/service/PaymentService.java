package com.athuang.springcloud.service;

import com.athuang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud01
 * @description: 接口
 * @author: Mr.Huang
 * @create: 2022-07-08 15:57
 **/
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}