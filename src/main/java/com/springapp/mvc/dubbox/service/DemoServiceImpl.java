package com.springapp.mvc.dubbox.service;

/**
 * Created by zdsoft on 14-10-27.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        System.out.println("我是生产者");
        return "hello zj---生产者返回数据";
    }
}
