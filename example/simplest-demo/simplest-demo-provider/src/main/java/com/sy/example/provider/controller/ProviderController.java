package com.sy.example.provider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("服务生产者示例")
@RestController
public class ProviderController {

    @ApiOperation("服务生产者接口，供服务消费者使用")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "path", name = "string", value = "字符串")
    })
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return string;
    }
}
