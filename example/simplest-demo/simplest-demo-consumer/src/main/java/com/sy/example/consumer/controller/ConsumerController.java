package com.sy.example.consumer.controller;

import com.sy.example.consumer.feign.ProviderFeignClient;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("服务消费者示例")
@RestController
public class ConsumerController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @ApiOperation("feign调用服务提供者接口")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "path", name = "string", value = "字符串", required = true)
    })
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return providerFeignClient.echo(string);
    }
}
