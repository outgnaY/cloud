package com.sy.example.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Order {

    /**
     * 主键
     */
    @Getter
    @Setter
    int id;

    /**
     * 订单id
     */
    @Getter
    @Setter
    String orderId;

    /**
     * 用户id
     */
    @Getter
    @Setter
    String userId;

    /**
     * 商品代码
     */
    @Getter
    @Setter
    String commodityCode;

    /**
     * 数量
     */
    @Getter
    @Setter
    int count;

    /**
     * 价格
     */
    @Getter
    @Setter
    int money;
}
