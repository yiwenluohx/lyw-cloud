package com.study.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 13:56
 */
@Configuration
@MapperScan({"com.study.cloud.dao"})
public class MyBatisConfig {
}
