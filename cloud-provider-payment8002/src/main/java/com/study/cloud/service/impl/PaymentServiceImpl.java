package com.study.cloud.service.impl;

import com.study.cloud.dao.PaymentDao;
import com.study.cloud.entities.Payment;
import com.study.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/26 0026 11:04
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
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
