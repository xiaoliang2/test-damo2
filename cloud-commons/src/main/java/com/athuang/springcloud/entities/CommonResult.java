package com.athuang.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springcloud01
 *
 * @description: 传给前端的一个类
 *
 * @author: Mr.Huang
 *
 * @create: 2022-07-08 15:31
 **/
@Data
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T data;

    public CommonResult(Integer code, String message)
    {

        this(code,message,null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
