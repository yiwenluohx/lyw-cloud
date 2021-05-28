package com.study.cloud;

import com.study.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/26 0026 14:25
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name= "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class) //配置为自定义随机获取服务算法
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
