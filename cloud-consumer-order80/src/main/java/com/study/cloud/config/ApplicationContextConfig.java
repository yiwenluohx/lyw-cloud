package com.study.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/26 0026 14:35
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced      //使用自定义负载均衡算法
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
