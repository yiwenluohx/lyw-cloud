package com.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/7 0007 16:16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}
