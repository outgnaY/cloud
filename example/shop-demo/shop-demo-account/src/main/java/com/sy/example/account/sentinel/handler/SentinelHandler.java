package com.sy.example.account.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sy.common.core.constant.ErrorCode;
import com.sy.common.core.result.CommonResult;
import com.sy.example.account.model.Account;

public class SentinelHandler {
    public static CommonResult<Account> getAccountByUserIdHandler(String userId, BlockException ex) {
        return CommonResult.error(ErrorCode.SENTINEL_BLOCK.getErrorCode(), ErrorCode.SENTINEL_BLOCK.getErrorMsg(), null);
    }
}
