package com.sy.example.storage.service;

import com.sy.common.core.result.CommonResult;
import com.sy.example.storage.model.Storage;

public interface StorageService {

    /**
     * 根据商品代码获取商品信息
     * @param commodityCode 商品代码
     */
    CommonResult<Storage> getStorageByCommodityCode(String commodityCode);
}
