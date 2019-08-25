package com.dubbo.study.controller;

import com.dubbo.study.service.ITestDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author whl
 * @description
 * @date 2019/08/20 23:22
 */
@RestController
@RequestMapping("dubbo")
public class TestDubboController {

    /**
     * 引入dubbo服务
     * mock:服务降级,在消费端配置
     * cluster：容错机制
     * <p>
     * 请求超过1ms，则返回mock数据
     */
//    @Reference(timeout = 1, cluster = "failfast", mock = "com.dubbo.study.service.TestDubboServiceMock")
//    ITestDubboService testDubboService;

    /**
     * check：解决服务循环依赖
      */
//    @Reference(check = false, cluster = "failfast", mock = "com.dubbo.study.service.TestDubboServiceMock")
//    ITestDubboService testDubboService;

    @Resource
    private ITestDubboService testDubboService;

    @GetMapping("test")
    public String testDubbo() {
        return testDubboService.testDubbo("test");
    }
}
