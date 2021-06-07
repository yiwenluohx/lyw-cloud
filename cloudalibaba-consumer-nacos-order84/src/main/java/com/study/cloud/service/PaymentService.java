package com.study.cloud.service;

import com.study.cloud.entities.CommonResult;
import com.study.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/7 0007 18:10
 */
@FeignClient(value = "nacos-payment-provider", fallback = "")
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
