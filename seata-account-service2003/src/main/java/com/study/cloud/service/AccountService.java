package com.study.cloud.service;

import java.math.BigDecimal;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 16:07
 */
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    void decrease(Long userId, BigDecimal money);
}
