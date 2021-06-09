package com.study.cloud.service;

import com.study.cloud.entities.CommonResult;
import com.study.cloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/7 0007 18:14
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回，---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
