package com.study.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/28 0028 18:25
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }

    public final int getAndIncrement(){
        int current;
        int next;
        do{
           current = this.atomicInteger.get();
           next = current >= 2147483647 ? 0 : current  + 1;
        }while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("....next:" + next);
        return next;
    }
}
