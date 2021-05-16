package com.sy.example.account.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sy.common.core.constant.ErrorCode;
import com.sy.common.core.result.CommonResult;
import com.sy.example.account.mapper.AccountMapper;
import com.sy.example.account.model.Account;
import com.sy.example.account.sentinel.handler.SentinelHandler;
import com.sy.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 根据用户id获取账户信息
     * @param userId 用户id
     */
    @Override
    @SentinelResource(value = "getAccountByUserId", blockHandler = "getAccountByUserIdHandler", blockHandlerClass = SentinelHandler.class)
    public CommonResult<Account> getAccountByUserId(String userId) {
        Account account = accountMapper.getAccountByUserId(userId);
        if (account == null) {
            return CommonResult.error(ErrorCode.DATA_NOT_FOUND.getErrorCode(), ErrorCode.DATA_NOT_FOUND.getErrorMsg(), null);
        } else {
            return CommonResult.success(account);
        }
    }
    

    /**
     * 从用户账户转出
     */
    @Override
    public void debit(String userId, int money) {

    }
}
