package com.study.cloud.dao;

import com.study.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/26 0026 10:24
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
