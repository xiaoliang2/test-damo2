package com.athuang.springcloud.service.impl;

import com.athuang.springcloud.dao.PaymentDao;
import com.athuang.springcloud.entities.Payment;
import com.athuang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: springcloud01
 *
 * @description: service实现类
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-08 15:58
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
