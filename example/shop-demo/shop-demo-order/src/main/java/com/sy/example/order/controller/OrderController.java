package com.sy.example.order.controller;

import com.sy.common.core.result.CommonResult;
import com.sy.example.order.model.Order;
import com.sy.example.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("订单服务")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation("根据订单id获取订单信息")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "query", name = "orderId", value = "字符串", required = true)
    })
    @GetMapping("/getOrderByOrderId")
    public CommonResult<Order> getOrderByOrderId(@RequestParam String orderId) {
        return orderService.getOrderByOrderId(orderId);
    }
}
