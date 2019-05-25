package com.bing.DubboDemo.DubboDemoConsumer;


import com.bing.DubboDemo.DubboDemoProvider.service.DemoService;

import com.bing.DubboDemo.DubboDemoProvider.service.SellGoodsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

  /* 注解方式配置远程连接暂时不可用
   @Reference(url="127.0.0.1:20880")
    private DemoService demoService;

    @Reference(url="192.168.6.1:20880")
    private SellGoodsService sellGoods;*/

  private ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubbo-demo-consumer.xml");

    @RequestMapping("/demo")
    public void demo(){
        DemoService demoService = (DemoService)ac.getBean("demoService");
        String helloWorld = demoService.HelloWorld();
        System.out.println(helloWorld);
    }

    @RequestMapping("/sellGoods")
    public void sellGoods(){

        SellGoodsService sellgoodsImpl =(SellGoodsService) ac.getBean("SellGoodsService");

        String sellGoods = sellgoodsImpl.sellGoods();
        System.out.println(sellGoods);

    }


    }

