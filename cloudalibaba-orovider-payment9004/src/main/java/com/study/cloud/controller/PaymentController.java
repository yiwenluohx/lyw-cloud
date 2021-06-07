package com.study.cloud.controller;

import com.study.cloud.entities.CommonResult;
import com.study.cloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/7 0007 16:07
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static Map<Long, Payment> hashmap = new HashMap<>();

    static {
        hashmap.put(1L, new Payment(1L, "28a8c1e3bc2742d8848569891fb42181"));
        hashmap.put(2L, new Payment(2L, "bba8c1e3bc2742d8848569891ac32182"));
        hashmap.put(3L, new Payment(3L, "6ua8c1e3bc2742d8848569891xt92183"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashmap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "from mysql, serverPort:" + serverPort, payment);
        return result;
    }
}
