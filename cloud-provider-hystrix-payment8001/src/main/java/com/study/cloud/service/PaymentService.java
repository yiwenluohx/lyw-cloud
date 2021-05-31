package com.study.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
//        int age = 10 / 0;
//        int timeNumber = 5;
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "" + id + "\t" + "(*￣︶￣)哈哈~ 耗时（秒）";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "  系统繁忙，请稍后再试，id: " + id + "\t" + "o(╥﹏╥)o";
    }
}
