package com.jwq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author jwq
 * @Date 2020/7/24 11:04
 */
@Data
@AllArgsConstructor//作用是生成一个带着所有参数的构造函数
@NoArgsConstructor//作用是生成一个无参的构造函数
public class CommonResult<T> {
    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    };
}

