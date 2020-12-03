package com.jwq.springcloud.service;

import com.jwq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author jwq
 * @Date 2020/7/20 17:41
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
