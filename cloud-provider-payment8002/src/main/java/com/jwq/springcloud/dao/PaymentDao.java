package com.jwq.springcloud.dao;

import com.jwq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author jwq
 * @Date 2020/7/20 17:05
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
