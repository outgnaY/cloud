package com.sy.example.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Account {

    /**
     * 主键
     */
    @Getter
    @Setter
    int Id;

    /**
     * 用户id
     */
    @Getter
    @Setter
    String userId;

    /**
     * 余额
     */
    @Getter
    @Setter
    int money;

}
