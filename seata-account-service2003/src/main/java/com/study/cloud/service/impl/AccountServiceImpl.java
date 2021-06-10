package com.study.cloud.service.impl;

import com.study.cloud.dao.AccountDao;
import com.study.cloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 16:10
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("----->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒线程
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        accountDao.decrease(userId, money);
        LOGGER.info("----->account-service中扣减账户余额结束");
    }
}
