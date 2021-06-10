package com.study.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 15:58
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     * @return
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
