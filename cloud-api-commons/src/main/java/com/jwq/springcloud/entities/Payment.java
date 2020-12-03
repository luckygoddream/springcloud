package com.jwq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author jwq
 * @Date 2020/7/24 11:03
 */
@Data
@AllArgsConstructor//作用是生成一个带着所有参数的构造函数
@NoArgsConstructor//作用是生成一个无参的构造函数
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
