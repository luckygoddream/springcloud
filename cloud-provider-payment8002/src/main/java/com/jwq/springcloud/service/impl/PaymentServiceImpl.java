package com.jwq.springcloud.service.impl;

import com.jwq.springcloud.dao.PaymentDao;
import com.jwq.springcloud.entities.Payment;
import com.jwq.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jwq
 * @Date 2020/7/20 17:42
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
