package com.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/4 0004 14:46
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
        return "-----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "-----testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        log.info("testD  测试RT");
        return "-----testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE  测试异常比例");
        int age = 10 / 0;
        return "-----testE";
    }

    @GetMapping("/testF")
    public String testF() {
        log.info("testF  测试异常数");
        int age = 10 / 0;
        return "-----testF 测试异常数";
    }
}
