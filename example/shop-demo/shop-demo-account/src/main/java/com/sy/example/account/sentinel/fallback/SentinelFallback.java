package com.sy.example.account.sentinel.fallback;


import com.sy.common.core.constant.ErrorCode;
import com.sy.common.core.result.CommonResult;
import com.sy.example.account.model.Account;

public class SentinelFallback {
    public static CommonResult<Account> getAccountByUserIdFallback(String userId) {
        return CommonResult.error(ErrorCode.SENTINEL_FALLBACK.getErrorCode(), ErrorCode.SENTINEL_FALLBACK.getErrorMsg(), null);
    }
}
