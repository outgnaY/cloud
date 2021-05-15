package com.sy.example.order.service;

import com.sy.common.core.result.CommonResult;
import com.sy.example.order.model.Order;

public interface OrderService {

    /**
     * 根据订单id获取订单信息
     * @param orderId 订单id
     */
    CommonResult<Order> getOrderByOrderId(String orderId);
}
