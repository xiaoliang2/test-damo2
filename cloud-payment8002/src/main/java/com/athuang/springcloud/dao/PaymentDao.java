package com.athuang.springcloud.dao;

import com.athuang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud01
 * @description: dao
 * @author: Mr.Huang
 * @create: 2022-07-08 15:39
 **/
@Mapper  //import org.apache.ibatis.annotations.Mapper;
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
