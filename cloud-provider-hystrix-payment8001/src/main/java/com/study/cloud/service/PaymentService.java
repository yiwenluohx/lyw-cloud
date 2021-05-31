package com.study.cloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/31 0031 11:46
 */
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_OK: " + id + "\t" + "(*￣︶￣)哈哈~";
    }

    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  paymentInfo_TimeOut: " + id + "\t" + "(*￣︶￣)哈哈~ 耗时（秒）"+ timeNumber;
    }
}
