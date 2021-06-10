package com.study.cloud.dao;

import com.study.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 10:35
 */
@Mapper
public interface OrderDao {

    /**
     * 新建订单
     *
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 修改订单状态，从0改为1
     *
     * @param userId
     * @param status
     * @return
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
