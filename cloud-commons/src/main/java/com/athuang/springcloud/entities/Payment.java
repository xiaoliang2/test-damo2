package com.athuang.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: springcloud01
 *
 * @description: 数据的实体类
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-08 15:25
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
