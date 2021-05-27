package com.study.cloud.service;

import com.study.cloud.entities.Payment;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/26 0026 11:03
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
