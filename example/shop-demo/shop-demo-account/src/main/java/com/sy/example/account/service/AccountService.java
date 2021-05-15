package com.sy.example.account.service;

import com.sy.common.core.result.CommonResult;
import com.sy.example.account.model.Account;

public interface AccountService {
    /**
     * 根据用户id获取账户信息
     * @param userId 用户id
     */
    CommonResult<Account> getAccountByUserId(String userId);

    /**
     * 从用户账户转出
     */
    void debit(String userId, int money);
}
