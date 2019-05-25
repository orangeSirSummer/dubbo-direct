package com.bing.DubboDemo.DubboDemoProvider;

import com.alibaba.dubbo.config.annotation.Service;
import com.bing.DubboDemo.DubboDemoProvider.service.SellGoodsService;


public class SellGoodsImpl implements SellGoodsService {
    @Override
    public String sellGoods() {

        return "SellGoods";
    }
}
