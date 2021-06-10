package com.study.cloud.service.impl;

import com.study.cloud.dao.OrderDao;
import com.study.cloud.domain.Order;
import com.study.cloud.service.AccountService;
import com.study.cloud.service.OrderService;
import com.study.cloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 11:18
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        log.info("--->开始新建订单");
        orderDao.create(order);
        log.info("--->订单微服务开始调用库存，做扣减Count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("--->订单微服务开始调用库存，做扣减end");

        log.info("--->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("--->订单微服务开始调用账户，做扣减end");

        //4.修改订单状态，从0到1,1代表已经完成
        log.info("--->修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("--->修改订单状态结束");
        log.info("--->下订单结束了，O(∩_∩)O哈哈~");
    }
}
