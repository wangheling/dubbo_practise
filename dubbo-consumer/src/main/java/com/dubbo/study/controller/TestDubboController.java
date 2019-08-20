package com.dubbo.study.controller;

import com.dubbo.study.service.ITestDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whl
 * @description
 * @date 2019/08/20 23:22
 */
@RestController
@RequestMapping("dubbo")
public class TestDubboController {

    //引入dubbo服务
    @Reference
    ITestDubboService testDubboService;

    @GetMapping("test")
    public String testDubbo() {
        return testDubboService.testDubbo("test");
    }
}
