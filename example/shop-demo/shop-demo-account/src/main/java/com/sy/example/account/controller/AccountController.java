package com.sy.example.account.controller;


import com.sy.common.core.result.CommonResult;
import com.sy.example.account.model.Account;
import com.sy.example.account.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("账户服务")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ApiOperation("根据用户id获取账户信息")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "query", name = "userId", value = "字符串", required = true)
    })
    @GetMapping("/getAccountByUserId")
    public CommonResult<Account> getAccountByUserId(@RequestParam String userId) {
        return accountService.getAccountByUserId(userId);
    }
}
