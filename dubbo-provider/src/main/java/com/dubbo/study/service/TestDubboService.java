package com.dubbo.study.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author whl
 * @description
 * @date 2019/08/20 21:42
 */
/*
 *org.apache.dubbo.config.annotation.Service
 *注意是dubbo的@Service
 */
@Service
public class TestDubboService implements ITestDubboService {

    @Override
    public String testDubbo(String str) {
        return "dubbo test success:" + str;
    }
}
