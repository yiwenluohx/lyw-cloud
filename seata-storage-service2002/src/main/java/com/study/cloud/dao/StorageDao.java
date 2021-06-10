package com.study.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 14:45
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(@Param("productId")Long productId, @Param("count") Integer count);
}
