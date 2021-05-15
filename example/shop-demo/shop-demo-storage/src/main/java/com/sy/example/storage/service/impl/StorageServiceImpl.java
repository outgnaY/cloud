package com.sy.example.storage.service.impl;

import com.sy.common.core.constant.ErrorCode;
import com.sy.common.core.result.CommonResult;
import com.sy.example.storage.mapper.StorageMapper;
import com.sy.example.storage.model.Storage;
import com.sy.example.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    /**
     * 根据商品代码获取商品信息
     * @param commodityCode 商品代码
     */
    @Override
    public CommonResult<Storage> getStorageByCommodityCode(String commodityCode) {
        Storage storage = storageMapper.getStorageByCommodityCode(commodityCode);
        if (storage == null) {
            return CommonResult.error(ErrorCode.DATA_NOT_FOUND.getErrorCode(), ErrorCode.DATA_NOT_FOUND.getErrorMsg(), null);
        } else {
            return CommonResult.success(storage);
        }
    }

}
