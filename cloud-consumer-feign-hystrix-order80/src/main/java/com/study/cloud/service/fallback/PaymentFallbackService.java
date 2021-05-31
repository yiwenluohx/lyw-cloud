package com.study.cloud.service.fallback;

import com.study.cloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2021/5/31 0031 18:12
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService  fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService  fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
