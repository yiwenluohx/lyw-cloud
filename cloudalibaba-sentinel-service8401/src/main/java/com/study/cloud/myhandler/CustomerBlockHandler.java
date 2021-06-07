package com.study.cloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.study.cloud.entities.CommonResult;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/6/7 0007 15:06
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义，global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义，global handlerException-----2");
    }
}
