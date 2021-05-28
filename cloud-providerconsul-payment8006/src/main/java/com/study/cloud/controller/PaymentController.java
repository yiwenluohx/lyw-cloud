package com.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/28 0028 15:10
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentzk(){
        return "springcloud with consul:"+ serverPort + "\t" + UUID.randomUUID().toString();
    }

}
