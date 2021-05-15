package com.sy.example.order.service.impl;

import com.sy.common.core.constant.ErrorCode;
import com.sy.common.core.result.CommonResult;
import com.sy.example.order.mapper.OrderMapper;
import com.sy.example.order.model.Order;
import com.sy.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 根据订单id获取订单信息
     * @param orderId 订单id
     */
    @Override
    public CommonResult<Order> getOrderByOrderId(String orderId) {
        Order order = orderMapper.getOrderById(orderId);
        if (order == null) {
            return CommonResult.error(ErrorCode.DATA_NOT_FOUND.getErrorCode(), ErrorCode.DATA_NOT_FOUND.getErrorMsg(), null);
        } else {
            return CommonResult.success(order);
        }
    }
}
