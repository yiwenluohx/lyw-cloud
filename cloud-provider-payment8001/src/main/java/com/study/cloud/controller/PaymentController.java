package com.study.cloud.controller;

import com.study.cloud.entities.CommonResult;
import com.study.cloud.entities.Payment;
import com.study.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/26 0026 11:09
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int resut = paymentService.create(payment);
        log.info("****插入结果：" + resut);
        if (resut > 0) {
            return new CommonResult(200, "插入成功", resut);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID："+ id, null);
        }
    }
}
