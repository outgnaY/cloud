package com.sy.example.storage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Storage {

    /**
     * 主键
     */
    @Getter
    @Setter
    int id;

    /**
     * 商品代码
     */
    @Getter
    @Setter
    String commodityCode;

    /**
     * 剩余存量
     */
    @Getter
    @Setter
    int count;
}
