package com.study.cloud.controller;

import com.study.cloud.domain.CommonResult;
import com.study.cloud.domain.Order;
import com.study.cloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 13:52
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
