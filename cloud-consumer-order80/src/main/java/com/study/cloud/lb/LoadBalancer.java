package com.study.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/28 0028 18:21
 */
public interface LoadBalancer {
    /**
     * 获取服务总数
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
