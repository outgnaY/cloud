package com.sy.example.order.mapper;

import com.sy.example.order.model.Order;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface OrderMapper {

    /**
     * 根据订单id获取订单信息
     * @param orderId 订单id
     */
    @Select("select id, order_id as orderId, userId, commodity_code as commodityCode, count, money from order_tbl where order_id = #{orderId}")
    Order getOrderById(String orderId);
}
