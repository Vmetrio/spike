package com.meng.spike.service;

import com.meng.spike.entity.GoodsStore;

public interface GoodsStoreService {
    /**
     * 根据产品编号更新库存
     * @param code
     * @return
     */
    String updateGoodsStore(String code,int count);

    /**
     * 获取库存对象
     * @param code
     * @return
     */
    GoodsStore getGoodsStore(String code);
}
