package com.study.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/2 0002 13:49
 */
@RestController
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort:" + serverPort + "\t\n\n configInfo: " + configInfo;
    }
}