package com.bing.DubboDemo.DubboDemoProvider;


import com.alibaba.dubbo.config.annotation.Service;
import com.bing.DubboDemo.DubboDemoProvider.service.DemoService;


public class DemoServiceImpl implements DemoService {
    @Override
    public String HelloWorld() {

        return "HelloWorld";
    }
}
