package com.sy.example.storage.mapper;

import com.sy.example.storage.model.Storage;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface StorageMapper {

    /**
     * 根据商品代码获取商品信息
     * @param commodityCode 商品代码
     */
    @Select("select id, commodity_code as commodityCode, count from storage_tbl where commodity_code = #{commodityCode}")
    Storage getStorageByCommodityCode(String commodityCode);
}
