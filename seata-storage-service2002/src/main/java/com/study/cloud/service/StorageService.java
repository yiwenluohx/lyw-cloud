package com.study.cloud.service;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 14:56
 */
public interface StorageService {
    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(Long productId, Integer count);
}
