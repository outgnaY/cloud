package com.sy.example.storage.controller;

import com.sy.common.core.result.CommonResult;
import com.sy.example.storage.model.Storage;
import com.sy.example.storage.service.StorageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("库存服务")
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @ApiOperation("根据商品代码获取商品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "commodityCode", value = "字符串", required = true)
    })
    @GetMapping("/getStorageByCommodityCode")
    public CommonResult<Storage> getStorageByCommodityCode(@RequestParam String commodityCode) {
        return storageService.getStorageByCommodityCode(commodityCode);
    }
}
