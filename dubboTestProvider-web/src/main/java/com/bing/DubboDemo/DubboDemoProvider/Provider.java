package com.bing.DubboDemo.DubboDemoProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {

    public static void main(String[] args) throws IOException {


        /*
        * 初始化spring环境有两种方式：
        * A:tomcat启动自动检测是否有springtypes 类型，此时需要在web.xml配置监听类 监听配置文件 初始化环境
        * B:利用启动类：思想和springboot启动类类似，tomcat中不必配置监听类
        * */
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});

        ac.start();
        System.in.read();

    }
}


