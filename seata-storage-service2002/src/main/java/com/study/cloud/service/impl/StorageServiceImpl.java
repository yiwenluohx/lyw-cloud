package com.study.cloud.service.impl;

import com.study.cloud.dao.StorageDao;
import com.study.cloud.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/10 0010 14:58
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("----->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("----->storage-service中扣减库存结束");
    }
}
