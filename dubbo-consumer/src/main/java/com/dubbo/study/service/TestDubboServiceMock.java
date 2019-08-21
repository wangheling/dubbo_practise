package com.dubbo.study.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author whl
 * @description 降级处理
 * @date 2019/08/21 21:35
 */
@Slf4j
public class TestDubboServiceMock implements ITestDubboService {

    @Override
    public String testDubbo(String str) {
        log.error("dubbo-provider异常，服务降级，返回兜底数据");
        return "请稍后再试";
    }
}
